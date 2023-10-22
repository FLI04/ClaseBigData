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

// 7. Crea un nuevo Dataframe a partir del df creado anteriormente llamdo “HVRatio” para crear una columna nueva llamada “HV Ratio” que es la relación que existe
//  entre el precio de la columna “High” frente a la columna “Volumen” de acciones negociadas por un día. Hint - es una operación

val HVRatio = df.withColumn("HV Ratio", $"Volume" / $"High")
HVRatio.show()

// 8. ¿Qué día tuvo el pico más alto en la columna “Open”?

df.select(max("OPEN")).show()

// 10. ¿Cuál es el máximo y mínimo de la columna “Volumen”?

df.select(max("Volume"),min("Volume")).show()

// 11. Con Sintaxis Scala/Spark $ conteste lo siguiente:
//   a) ¿Cuántos días fue la columna “Close” inferior a $ 600?
        df.filter($"Close"<600).count()
//   b) ¿Qué porcentaje del tiempo fue la columna “High” mayor que $ 500?
        (df.filter($"High">500).count()*1.0/df.count())*100

//   c) ¿Cuál es la correlación de Pearson entre columna “High” y la columna “Volumen”?
        df.select(corr($"High", $"Volume")).show()
