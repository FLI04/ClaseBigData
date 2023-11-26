mport org.apache.spark.ml.classification.MultilayerPerceptronClassifier 
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
val data  = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("iris.csv")

// Desplega el nombre de columnas
data.columns

//Imprime Schema
data.printSchema()

//Imprime los primeros 5 renglones
data.head(5)

//Describe el tipo 
data.describe().show()

//Determina las columnas que sera las salidas como features
val assembler = new VectorAssembler().setInputCols(Array("sepal_length", "sepal_width", "petal_length", "petal_width")).setOutputCol("features")

//Separa los datos que se usaran como features
val features = assembler.transform(data)

//Transforma los datos label categoricos a numericos
val indexerLabel = new StringIndexer().setInputCol("species").setOutputCol("indexedLabel").fit(features)

//Transforma los datos features categoricos a numericos con limitante de 4
val indexerFeatures = new VectorIndexer().setInputCol("features").setOutputCol("indexedFeatures").setMaxCategories(4)

//Se crean los arreglos que seran usados para training y test 70% y 30%
val Array(training, test) = features.randomSplit(Array(0.7, 0.3), seed = 12345)

//Se crean las capas
val layers = Array[Int](4,6,2,3)

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
