// 1. Comienza una simple sesión Spark
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()

// 2. Cargue el archivo Netflix Stock CSV en dataframe llamado df, haga que Spark infiera los tipos de datos.
val df = spark.read.option("header", "true").option("inferSchema","true")csv("Practices/Netflix_2011_2016.csv")


// 3. ¿Cuáles son los nombres de las columnas?
df.printSchema()

//4. ¿Cómo es el esquema?
df.printSchema()

// 5. Imprime las primeras 5 renglones.
df.head(5)

// 6. Usa el método describe () para aprender sobre el DataFrame.
df.describe().show()

//7. Crea un nuevo Dataframe a partir del df creado anteriormente llamdo “HVRatio” para crear una columna nueva llamada “HV Ratio” que es la relación que existe
//  entre el precio de la columna “High” frente a la columna “Volumen” de acciones negociadas por un día. Hint - es una operación

val HVRatio = df.withColumn("HV Ratio", $"Volume" / $"High")
HVRatio.show()