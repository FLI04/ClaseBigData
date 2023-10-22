// 1. Comienza una simple sesión Spark
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()

//2. Cargue el archivo Netflix Stock CSV en dataframe llamado df, haga que Spark infiera los tipos de datos.
val df = spark.read.option("header", "true").option("inferSchema","true")csv("Practices/Netflix_2011_2016.csv")


// 3. ¿Cuáles son los nombres de las columnas?
df.printSchema()

//4. ¿Cómo es el esquema?
df.printSchema()
