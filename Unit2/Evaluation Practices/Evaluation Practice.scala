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

