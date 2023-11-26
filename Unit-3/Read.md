# Unit3 Final Proyect
## Comparación del rendimiento del  algoritmo de machine learning Multilayer Perceptron Classifier cambiando el seed de aleatoridad en la fase de separación de datos (randomSplit) 10 veces.

### Run 1 - Seed 12345
```scala
import org.apache.spark.ml.classification.MultilayerPerceptronClassifier 
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator 
import org.apache.spark.ml.feature.IndexToString 
import org.apache.spark.ml.feature.StringIndexer 
import org.apache.spark.ml.feature.VectorIndexer 
import org.apache.spark.ml.feature.VectorAssembler 
import org.apache.spark.ml.Pipeline
import org.apache.spark.sql.SparkSession

// Opcional: Utilice el siguiente codigo para configurar errores
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)

// Inicie una simple Sesion Spark
val spark = SparkSession.builder().getOrCreate()

// Utilice Spark para el archivo csv Clean-Ecommerce .
val data  = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("bank-full2.csv")

// Desplega el nombre de columnas
data.columns

//Imprime Schema
data.printSchema()

//Imprime los primeros 5 renglones
data.head(5)

//Describe el tipo 
data.describe().show()

//Determina las columnas que sera las salidas como features
val assembler = new VectorAssembler().setInputCols(Array("age","job","marital","education","default","balance","housing","loan","day","month","duration","campaign","pdays","previous")).setOutputCol("features")

//Separa los datos que se usaran como features
val features = assembler.transform(data)

//Transforma los datos label categoricos a numericos
val indexerLabel = new StringIndexer().setInputCol("y").setOutputCol("indexedLabel").fit(features)

//Transforma los datos features categoricos a numericos con limitante de 4
val indexerFeatures = new VectorIndexer().setInputCol("features").setOutputCol("indexedFeatures").setMaxCategories(14)

//Se crean los arreglos que seran usados para training y test 70% y 30%
val Array(training, test) = features.randomSplit(Array(0.7, 0.3), seed = 12345) // vuelta 1

//Se crean las capas
val layers = Array[Int](14,6,2,2)

//Se crea la estructura del modelo Multilayer Perceptron.
val trainer = new MultilayerPerceptronClassifier().setLayers(layers).setLabelCol("indexedLabel").setFeaturesCol("indexedFeatures").setBlockSize(128).setSeed(1234).setMaxIter(100)

//Convierte de numerico a categoricos los datos "Prediction"
val converterLabel = new IndexToString().setInputCol("prediction").setOutputCol("predictedLabel").setLabels(indexerLabel.labels)

//Mete los datos a la tuberia
val pipeline = new Pipeline().setStages(Array(indexerLabel, indexerFeatures, trainer, converterLabel))

//Entrena el modelo
val model = pipeline.fit(training)

//Evalua el modelo
val results = model.transform(test)

//Imprime los primeros 20 resultados
results.show()

//seleccciona las metricas a evaluar
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("indexedLabel").setPredictionCol("prediction").setMetricName("accuracy")

//determina la precision del modelo
val accuracy = evaluator.evaluate(results)

//Imprime la presicion
 println(s"Accuracy = ${accuracy}")
```
```sh
import org.apache.spark.ml.classification.MultilayerPerceptronClassifier 
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator 
import org.apache.spark.ml.feature.IndexToString 
import org.apache.spark.ml.feature.StringIndexer 
import org.apache.spark.ml.feature.VectorIndexer 
import org.apache.spark.ml.feature.VectorAssembler 
import org.apache.spark.ml.Pipeline
import org.apache.spark.sql.SparkSession

import org.apache.log4j._

val spark: org.apache.spark.sql.SparkSession = org.apache.spark.sql.SparkSession@29f28e5d

val data: org.apache.spark.sql.DataFrame = [age: int, job: int ... 13 more fields]

val res1: Array[String] = Array(age, job, marital, education, default, balance, housing, loan, day, month, duration, campaign, pdays, previous, y)

root
 |-- age: integer (nullable = true)
 |-- job: integer (nullable = true)
 |-- marital: integer (nullable = true)
 |-- education: integer (nullable = true)
 |-- default: integer (nullable = true)
 |-- balance: integer (nullable = true)
 |-- housing: integer (nullable = true)
 |-- loan: integer (nullable = true)
 |-- day: integer (nullable = true)
 |-- month: integer (nullable = true)
 |-- duration: integer (nullable = true)
 |-- campaign: integer (nullable = true)
 |-- pdays: integer (nullable = true)
 |-- previous: integer (nullable = true)
 |-- y: integer (nullable = true)

val res3: Array[org.apache.spark.sql.Row] = Array([58,0,0,0,0,2143,1,0,5,1,261,1,-1,0,0], [44,1,1,1,0,29,1,0,5,1,151,1,-1,0,0], [33,2,0,1,0,2,1,1,5,1,76,1,-1,0,0], [47,3,0,4,0,1506,1,0,5,1,92,1,-1,0,0], [33,4,1,4,0,1,0,0,5,1,198,1,-1,0,0])

+-------+------------------+------------------+------------------+------------------+--------------------+------------------+------------------+-------------------+-----------------+------------------+-----------------+-----------------+------------------+------------------+-------------------+
|summary|               age|               job|           marital|         education|             default|           balance|           housing|               loan|              day|             month|         duration|         campaign|             pdays|          previous|                  y|
+-------+------------------+------------------+------------------+------------------+--------------------+------------------+------------------+-------------------+-----------------+------------------+-----------------+-----------------+------------------+------------------+-------------------+
|  count|             45211|             45211|             45211|             45211|               45211|             45211|             45211|              45211|            45211|             45211|            45211|            45211|             45211|             45211|              45211|
|   mean| 40.93621021432837| 3.526133020725045|0.6284090155050762|1.1320917475835526|0.018026586450200173|1362.2720576850766|0.5558381809736569|0.16022649355245405|15.80641879188693| 3.940722390568667|258.1630797814691|2.763840658246887| 40.19782796222158|0.5803233726305546|0.11698480458295547|
| stddev|10.618762040975405|3.0983433930692805| 0.961539440002365|1.1191872671645307|  0.1330489390167441|3044.7658291685257|0.4968778102619627| 0.3668200383232984|8.322476153044594|3.1797410024151826|257.5278122651706|3.098020883279192|100.12874599059828| 2.303441044931218|0.32140573261566385|
|    min|                18|                 0|                 0|                 0|                   0|             -8019|                 0|                  0|                1|                 1|                0|                1|                -1|                 0|                  0|
|    max|                95|                11|                 3|                 4|                   1|            102127|                 1|                  1|               31|                12|             4918|               63|               871|               275|                  1|
+-------+------------------+------------------+------------------+------------------+--------------------+------------------+------------------+-------------------+-----------------+------------------+-----------------+-----------------+------------------+------------------+-------------------+

val assembler: org.apache.spark.ml.feature.VectorAssembler = VectorAssembler: uid=vecAssembler_7d8132e8186f, handleInvalid=error, numInputCols=14

val features: org.apache.spark.sql.DataFrame = [age: int, job: int ... 14 more fields]

val indexerLabel: org.apache.spark.ml.feature.StringIndexerModel = StringIndexerModel: uid=strIdx_b262d4139b79, handleInvalid=error

val indexerFeatures: org.apache.spark.ml.feature.VectorIndexer = vecIdx_7616a88f0409

val training: org.apache.spark.sql.Dataset[org.apache.spark.sql.Row] = [age: int, job: int ... 14 more fields]
val test: org.apache.spark.sql.Dataset[org.apache.spark.sql.Row] = [age: int, job: int ... 14 more fields]

val layers: Array[Int] = Array(14, 6, 2, 2)

val trainer: org.apache.spark.ml.classification.MultilayerPerceptronClassifier = mlpc_4d0e43a04775

val converterLabel: org.apache.spark.ml.feature.IndexToString = idxToStr_70f249ef93bb

val pipeline: org.apache.spark.ml.Pipeline = pipeline_f8b0de7a6456

val model: org.apache.spark.ml.PipelineModel = pipeline_f8b0de7a6456

val results: org.apache.spark.sql.DataFrame = [age: int, job: int ... 20 more fields]

+---+---+-------+---------+-------+-------+-------+----+---+-----+--------+--------+-----+--------+---+--------------------+------------+--------------------+--------------------+--------------------+----------+--------------+
|age|job|marital|education|default|balance|housing|loan|day|month|duration|campaign|pdays|previous|  y|            features|indexedLabel|     indexedFeatures|       rawPrediction|         probability|prediction|predictedLabel|
+---+---+-------+---------+-------+-------+-------+----+---+-----+--------+--------+-----+--------+---+--------------------+------------+--------------------+--------------------+--------------------+----------+--------------+
| 18| 11|      1|        4|      0|     35|      0|   0| 21|    4|     104|       2|   -1|       0|  0|[18.0,11.0,1.0,4....|         0.0|[18.0,11.0,1.0,3....|[2.93651364567485...|[0.95448697450254...|       0.0|             0|
| 19| 11|      1|        1|      0|     55|      0|   0|  6|    5|      89|       2|  193|       1|  0|[19.0,11.0,1.0,1....|         0.0|[19.0,11.0,1.0,1....|[1.85878225434301...|[0.79485028280410...|       0.0|             0|
| 19| 11|      1|        1|      0|    302|      0|   0| 16|    3|     205|       1|   -1|       0|  1|[19.0,11.0,1.0,1....|         1.0|[19.0,11.0,1.0,1....|[2.58089187361780...|[0.90631318838788...|       0.0|             0|
| 19| 11|      1|        1|      0|    526|      0|   0| 14|    7|     122|       3|   -1|       0|  0|[19.0,11.0,1.0,1....|         0.0|[19.0,11.0,1.0,1....|[2.58331763076204...|[0.90661720028113...|       0.0|             0|
| 19| 11|      1|        1|      0|    527|      0|   0|  4|   12|     154|       3|   -1|       0|  0|[19.0,11.0,1.0,1....|         0.0|[19.0,11.0,1.0,1....|[2.43999571379849...|[0.88707865962521...|       0.0|             0|
| 19| 11|      1|        3|      0|      0|      0|   0|  4|    1|      72|       4|   -1|       0|  0|[19.0,11.0,1.0,3....|         0.0|[19.0,11.0,1.0,2....|[2.93651362441583...|[0.95448697309767...|       0.0|             0|
| 19| 11|      1|        3|      0|    608|      0|   0| 12|    1|     236|       1|  180|       2|  1|[19.0,11.0,1.0,3....|         1.0|[19.0,11.0,1.0,2....|[1.62023314767180...|[0.70095788530070...|       0.0|             0|
| 20|  3|      0|        3|      0|   -172|      1|   1| 19|    1|     238|       3|   -1|       0|  0|[20.0,3.0,0.0,3.0...|         0.0|[20.0,3.0,0.0,2.0...|[2.93628727926658...|[0.95447197521895...|       0.0|             0|
| 20|  3|      1|        1|      0|    423|      1|   0| 16|   11|     498|       1|   -1|       0|  1|[20.0,3.0,1.0,1.0...|         1.0|[20.0,3.0,1.0,1.0...|[1.62023314753912...|[0.70095788526096...|       0.0|             0|
| 20| 11|      1|        1|      0|    162|      0|   0| 25|    1|     106|       2|   -1|       0|  0|[20.0,11.0,1.0,1....|         0.0|[20.0,11.0,1.0,1....|[4.24032612674076...|[0.99275139342196...|       0.0|             0|
| 20| 11|      1|        1|      0|    291|      0|   0| 11|    1|     172|       5|  371|       5|  0|[20.0,11.0,1.0,1....|         0.0|[20.0,11.0,1.0,1....|[1.22031666170872...|[0.56774454465603...|       0.0|             0|
| 20| 11|      1|        3|      0|      0|      0|   0|  1|    9|     143|       5|   91|       8|  0|[20.0,11.0,1.0,3....|         0.0|[20.0,11.0,1.0,2....|[1.85878325409751...|[0.79485056343748...|       0.0|             0|
| 20| 11|      1|        4|      0|    179|      0|   0| 25|   10|     196|       3|  182|       3|  0|[20.0,11.0,1.0,4....|         0.0|[20.0,11.0,1.0,3....|[1.22054588584105...|[0.56783683786340...|       0.0|             0|
| 20| 11|      1|        4|      0|    479|      0|   0| 11|   12|     158|       2|   -1|       0|  0|[20.0,11.0,1.0,4....|         0.0|[20.0,11.0,1.0,3....|[2.57646864798630...|[0.90575656639623...|       0.0|             0|
| 20| 11|      1|        4|      0|    829|      0|   0|  9|    3|     253|       2|   -1|       0|  1|[20.0,11.0,1.0,4....|         1.0|[20.0,11.0,1.0,3....|[1.85249908442932...|[0.76752656576784...|       0.0|             0|
| 20| 11|      1|        4|      0|   4137|      1|   0| 16|   11|      55|       2|   -1|       0|  0|[20.0,11.0,1.0,4....|         0.0|[20.0,11.0,1.0,3....|[4.58176026819254...|[0.99552765077802...|       0.0|             0|
| 21|  0|      1|        0|      0|    243|      0|   1| 17|    2|     181|       2|   -1|       0|  0|[21.0,0.0,1.0,0.0...|         0.0|[21.0,0.0,1.0,0.0...|[2.58334825985870...|[0.90662132510110...|       0.0|             0|
| 21|  0|      1|        1|      0|    691|      0|   0| 13|    4|     219|       1|  101|       2|  0|[21.0,0.0,1.0,1.0...|         0.0|[21.0,0.0,1.0,1.0...|[1.62023314767180...|[0.70095788530070...|       0.0|             0|
| 21|  3|      1|        1|      0|    614|      1|   0| 13|    1|     243|       3|   -1|       0|  0|[21.0,3.0,1.0,1.0...|         0.0|[21.0,3.0,1.0,1.0...|[2.57428182233070...|[0.90548028663295...|       0.0|             0|
| 21|  3|      1|        1|      0|    820|      1|   0| 27|    2|     302|       2|   -1|       0|  0|[21.0,3.0,1.0,1.0...|         0.0|[21.0,3.0,1.0,1.0...|[2.56182778967014...|[0.90389306473127...|       0.0|             0|
+---+---+-------+---------+-------+-------+-------+----+---+-----+--------+--------+-----+--------+---+--------------------+------------+--------------------+--------------------+--------------------+----------+--------------+
only showing top 20 rows

val evaluator: org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator = MulticlassClassificationEvaluator: uid=mcEval_ef94e9a2a1e2, metricName=accuracy, metricLabel=0.0, beta=1.0, eps=1.0E-15

val accuracy: Double = 0.882258064516129

Accuracy = 0.882258064516129
```