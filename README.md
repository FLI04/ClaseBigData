# Unit1 Practice 1 
### Desarrollar un algoritmo en scala que calcule el radio de un circulo
```scala
val pi = 3.1416
val circle = pi * math.pow(4, 2) 
println(s"Radio es:  $circle")
```
```sh
val circle: Double = 50.2656
Radio es:  50.2656
```

### Desarrollar un algoritmo en scala que me diga si un numero es par
```scala
if (num %2 == 0){
    println(s"El numero es par:  $num")
 }else{
    println(s"El numero no es par:  $num")}
```
```sh
num: Int = 13
El numero no es par:  13
```
### Dada la variable bird = "tweet", utiliza interpolacion de string para imprimir "Estoy ecribiendo un tweet"

```scala
var bird = "tweet"
println(s"Estoy escribiendo un $bird")
```
```sh
var bird: String = tweet
Estoy escribiendo un tweet
```

### Dada la variable mensaje = "Hola Luke yo soy tu padre!" utiliza slice para extraer la secuencia "Luke"

```scala
var mensaje = "Hola Luke soy tu padre!"
mensaje= mensaje slice (5,9)
println(s"Hola $mensaje")
```
```sh
mensaje: String = Hola Luke soy tu padre!
mensaje: String = Luke
Hola Luke
```
### Cual es la diferencia entre value y una variable en scala?

```scala
println("Una variable es mutable con el tiempo un valor no es mutable y tiene un valor permanente")
```
```sh
Una variable es mutable con el tiempo un valor no es mutable y tiene un valor permanente
```

### Dada la tupla (2,4,5,1,2,3,3.1416,23) regresa el numero 3.1416 

```scala
var myTup = (2,4,5,1,2,3,3.1416,23)
val pi = myTup._7

println(s"Pi = $pi")
```
```sh
myTup: (Int, Int, Int, Int, Int, Int, Double, Int) = (2,4,5,1,2,3,3.1416,23)
pi: Double = 3.1416
Pi = 3.1416
```

# Unit1 Practice 2
### Crea una lista llamada "lista" con los elementos "rojo", "blanco", "negro"

```scala
val lista = List("Rojo","Blanco","Negro")
```
```sh
lista: List[String] = List(Rojo, Blanco, Negro)
```
### Añadir 5 elementos mas a "lista" "verde" ,"amarillo", "azul", "naranja", "perla"

```scala
val updatedList = lista :+ "verde":+"amarillo":+"azul":+ "naranja":+ "perla"
```
```sh
updatedList: List[String] = List(Rojo, Blanco, Negro, verde, amarillo, azul, naranja, perla)
```
### Traer los elementos de "lista" "verde", "amarillo", "azul"

```scala
updatedList slice (3, 6)
```
```sh
res0: List[String] = List(verde, amarillo, azul)
```

### Crea un arreglo de numero en rango del 1-1000 en pasos de 5 en 5

```scala
val arr = Array.range(1,1000,5)
```
```sh
arr: Array[Int] = Array(1, 6, 11, 16, 21, 26, 31, 36, 41, 46, 51, 56, 61, 66, 71, 76, 81, 86, 91, 96, 101, 106, 111, 116, 121, 126, 131, 136, 141, 146, 151, 156, 161, 166, 171, 176, 181, 186, 191, 196, 201, 206, 211, 216, 221, 226, 231, 236, 241, 246, 251, 256, 261, 266, 271, 276, 281, 286, 291, 296, 301, 306, 311, 316, 321, 326, 331, 336, 341, 346, 351, 356, 361, 366, 371, 376, 381, 386, 391, 396, 401, 406, 411, 416, 421, 426, 431, 436, 441, 446, 451, 456, 461, 466, 471, 476, 481, 486, 491, 496, 501, 506, 511, 516, 521, 526, 531, 536, 541, 546, 551, 556, 561, 566, 571, 576, 581, 586, 591, 596, 601, 606, 611, 616, 621, 626, 631, 636, 641, 646, 651, 656, 661, 666, 671, 676, 681, 686, 691, 696, 701, 706, 711, 716, 721, 726, 731, 736, 741, 746, 751, 756, 761, 766, 771, 776, 781, 786, 791,...
```
### Cuales son los elementos únicos de la lista Lista(1,3,3,4,6,7,3,7) utilice conversión a conjuntos

```scala
val Lista = List (1,3,3,4,6,7,3,7)
val unicosLista = Lista.distinct
Lista.toSet
```
```sh
val Lista: List[Int] = List(1, 3, 3, 4, 6, 7, 3, 7)
val unicosLista: List[Int] = List(1, 3, 4, 6, 7)
val res47: scala.collection.immutable.Set[Int] = HashSet(1, 6, 7, 3, 4)
```

### Crea una mapa mutable llamado nombres que contenga los siguiente "Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27"

```scala
val nombres = Map(("Jose", 20),("Luis", 24), ("Ana", 23),("Susana", "27"))
```
```sh
nombres: scala.collection.immutable.Map[String,Any] = Map(Jose -> 20, Luis -> 24, Ana -> 23, Susana -> 27)
```
#### Imprime todas la llaves del mapa

```scala
nombres.keys
println ("Todas llaves"+ nombres.keys)
```
```sh
val res90: Iterable[String] = Set(Jose, Luis, Ana, Susana)
Todas llavesSet(Jose, Luis, Ana, Susana)
```
#### Agrega el siguiente valor al mapa("Miguel", 23)

```scala
nombres += ("Miguel" -> 23)
println ("Todas llaves"+ nombres.keys)
```
```sh
Todas llavesSet(Ana, Miguel, Luis, Jose, Susana)
```
# Unit1 Practice 3 - Analice y describa el código en la sesión 6.
### Estructura de Ciclo While.

```scala
// importamos la funcion Break.
import util.control.Breaks._

//se declara una variable de tipo int
var x = 0

//condición while, se define un ciclo que mientras x sea menor a cinco se imprimen dos mensajes:
while(x < 5){
    //se imprime el valor actual de x
    println(s"x is currently $x")
    //se imprime la siguiente etiqueta.
    println(s"x is still less then 5, adding 1 to x ")
    //se aumenta en un el valor de la variable "x".
    x = x + 1
})
```
```sh
import util.control.Breaks._
var x: Int = 0
x is currently 0
x is still less then 5, adding 1 to x
x is currently 1
x is still less then 5, adding 1 to x
x is currently 2
x is still less then 5, adding 1 to x
x is currently 3
x is still less then 5, adding 1 to x
x is currently 4
x is still less then 5, adding 1 to x
```
### Estructura de Ciclo While con variable Y

```scala
//Declara variable y =0
var y = 0

//condición while, se define un ciclo que mientras y sea menor a 10 se imprimen dos mensajes y se pone condicion de salida cuando y sea igual a 3
while(y < 10){
    println(s"y is currently $y")
    println(s"y is still less then 10, add 1 to y")
    y = y+1
    if(y==3) break 

}
println(s"Valor final de Y $y")
```
```sh
y: Int = 0
y is currently 0
y is still less then 10, add 1 to y
y is currently 1
y is still less then 10, add 1 to y
y is currently 2
y is still less then 10, add 1 to y
scala.util.control.BreakControl
Valor final de Y 3
```
### Funcion Simple sin valor de retorno

```scala
// Functions 

//Define la funcion "simple" sin argumentos y sin devolver valores "Unit"
def simple(): Unit = {
    //imprime la etiqueta "simple print"
    println("simple print")
}

//se llama la funcion simple()
simple()
```
```sh
def simple(): Unit
simple print
```

### Funcion Suma con retorno de valor entero

```scala
//Define Funcion "adder" con 2 enteros como argumentos y retorna 1 entero como valor
def adder(num1:Int, num2:Int): Int = {

//regresa el resultado de la suma 
    return num1 + num2
}
//se llama la funcion "adder" con 2 valores enteros (5,5)
adder(5, 5)
```
```sh
adder: (num1: Int, num2: Int)Int
res7: Int = 10
```
### Funcion que devuela la concatenacion de "Hello" con el parametro recibido.

```scala
//Define la funcion "greetName" con un parametro String, y regresa un valor String
def greetName(name:String): String={
    //concatena la palabra "Hello"a el parametro recibido
    return s"Hello $name"
}

//declara "fullgreeat" y le asigna el valor devuelto por la funcion "greetName".
val fullgreet = greetName("Mundo Cruel")
println(fullgreet)
```
```sh
def greetName(name: String): String
val fullgreet: String = Hello Mundo Cruel
Hello Mundo Cruel
```

### Funcion que evalua con true o false si un numero es primo
```scala
//Define Funcion "isPrime" con 1 entero como argumento y retorna booleano como resultado de la condicion si el argumento es numero primo o no
def isPrime(num:Int): Boolean = {
    //Ciclo for para condicion de numero primo
    for(n <- Range(2, num)){
        if(num%n == 0){
            return false
        }
    }
    return true
}
//Imprime true o false para numero primo
println(isPrime(10))
println(isPrime(23))
```
```sh
isPrime: (num: Int)Boolean
false
true
```
### Funcion que recibe una lista de enteros y regresa una lista de enteros.
```scala
val numbers = List(1,2,3,7)

def check(nums:List[Int]): List[Int]={
    return nums
}

println(check(numbers))
```
```sh
val numbers: List[Int] = List(1, 2, 3, 7)
def check(nums: List[Int]): List[Int]
List(1, 2, 3, 7)
```
# Práctica 4 - Implementar Seudocódigo de la serie Fibonacci - Implemente los siguientes seudocódigos de la serie Fibonacci en Scala.


### Algoritmo 1.

```scala
var n = 15

def fib(n:Int): Int =
 {
   if (n<2)
    return n 
   else 
    return fib(n-1)+fib(n-2)
    
 }
println("El numero Fibonacci de " + n + " es: " + fib(n))
```
```sh
var n: Int = 15
def fib(n: Int): Int
El numero Fibonacci de 15 es: 610
```


## Algoritmo 3
```scala
var n = 7

def fib(n:Int): Int =
 {
   var a = 0
   var b = 1
   var c = 0
   var k = 0
   while (k < n)
   {
      c=b+a
      a=b 
      b=c
      k +=1
   }
   return a
    
 }
 
 println("El numero Fibonacci de " + n + " es: " + fib(n))
 ```
```sh
n: Int = 7
fib: (n: Int)Int
El numero Fibonacci de 7 es: 13
```
## Algoritmo 4
```scala
var n = 10

def fib(n:Int): Int =
 {
   var a = 0
   var b = 1
   var k = 0
   while (k < n)
   {
      b+=a
      a=b-a 
      k +=1
   }
   return a
    
 }
 
 println("El numero Fibonacci de " + n + " es: " + fib(n))
 ```
```sh
var n: Int = 10
def fib(n: Int): Int
El numero Fibonacci de 10 es: 55
```

## Algoritmo 5
```scala
var n = 23
var k = 2
def fib(n:Int): Int =
 {
  if (n<2)
    return n
  else
  {
    val vector = Array.range(0,n+2)
    while (k<(n+1))
    {
      vector.update(k,(vector(k-1)+vector(k-2)))
      k+=1
    }
    return(vector(n))
    
  }
 }
 
 println("El numero Fibonacci de " + n + " es: " + fib(n))
 ```
```sh
n: Int = 23
k: Int = 2
fib: (n: Int)Int
El numero Fibonacci de 23 es: 28657
```
# Evaluation Unit 1

## 1.- Comienza una simple sesión Spark.
```scala
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()
 ```
```sh
val args: Array[String] = Array()
Loading Practices\evaluationPractice1.scala...
import org.apache.spark.sql.SparkSession
val spark: org.apache.spark.sql.SparkSession = org.apache.spark.sql.SparkSession@6b1293a5
```
## 2.- Cargue el archivo Netflix Stock CSV en dataframe llamado df, haga que Spark infiera los tipos de datos.
```scala
val df = spark.read.option("header", "true").option("inferSchema","true")csv("Practices/Netflix_2011_2016.csv")
 ```
```sh
val df: org.apache.spark.sql.DataFrame = [Date: date, Open: double ... 5 more fields]
```

## 3. ¿Cuáles son los nombres de las columnas?
```scala
df.printSchema()
 ```
```sh
root
 |-- Date: date (nullable = true)
 |-- Open: double (nullable = true)
 |-- High: double (nullable = true)
 |-- Low: double (nullable = true)
 |-- Close: double (nullable = true)
 |-- Volume: integer (nullable = true)
 |-- Adj Close: double (nullable = true)
 ```

 ## 4. ¿Cómo es el esquema?
```scala
df.printSchema()
 ```
```sh
root
 |-- Date: date (nullable = true)
 |-- Open: double (nullable = true)
 |-- High: double (nullable = true)
 |-- Low: double (nullable = true)
 |-- Close: double (nullable = true)
 |-- Volume: integer (nullable = true)
 |-- Adj Close: double (nullable = true)
 ```
## 5. Imprime las primeras 5 renglones.
```scala
df.head(5)
 ```
```sh
scala> df.head(5)
res2: Array[org.apache.spark.sql.Row] = Array([2011-10-24,119.100002,120.28000300000001,115.100004,118.839996,120460200,16.977142], [2011-10-25,74.899999,79.390001,74.249997,77.370002,315541800,11.052857000000001], [2011-10-26,78.73,81.420001,75.399997,79.400002,148733900,11.342857], [2011-10-27,82.179998,82.71999699999999,79.249998,80.86000200000001,71190000,11.551428999999999], [2011-10-28,80.280002,84.660002,79.599999,84.14000300000001,57769600,12.02])
 ```
## // 6. Usa el método describe () para aprender sobre el DataFrame.
```scala
df.describe().show()
 ```
```sh
+-------+------------------+------------------+------------------+------------------+--------------------+------------------+
|summary|              Open|              High|               Low|             Close|              Volume|         Adj Close|
+-------+------------------+------------------+------------------+------------------+--------------------+------------------+
|  count|              1259|              1259|              1259|              1259|                1259|              1259|
|   mean|230.39351086656092|233.97320872915006|226.80127876251044|  230.522453845909|2.5634836060365368E7|55.610540036536875|
| stddev|164.37456353264244| 165.9705082667129| 162.6506358235739|164.40918905512854| 2.306312683388607E7|35.186669331525486|
|    min|         53.990001|         55.480001|             52.81|              53.8|             3531300|          7.685714|
|    max|        708.900017|        716.159996|        697.569984|        707.610001|           315541800|        130.929993|
+-------+------------------+------------------+------------------+------------------+--------------------+------------------+
 ```
 ## 7. Crea un nuevo Dataframe a partir del df creado anteriormente llamdo “HVRatio” para crear una columna nueva llamada “HV Ratio” que es la relación que existe
//  entre el precio de la columna “High” frente a la columna “Volumen” de acciones negociadas por un día. Hint - es una operación
```scala
val HVRatio = df.withColumn("HV Ratio", $"Volume" / $"High")
HVRatio.show()
```
```sh
val HVRatio: org.apache.spark.sql.DataFrame = [Date: date, Open: double ... 6 more fields]
+----------+-----------------+------------------+----------+-----------------+---------+------------------+------------------+
|      Date|             Open|              High|       Low|            Close|   Volume|         Adj Close|          HV Ratio|
+----------+-----------------+------------------+----------+-----------------+---------+------------------+------------------+
|2011-10-24|       119.100002|120.28000300000001|115.100004|       118.839996|120460200|         16.977142|1001498.1459553172|
|2011-10-25|        74.899999|         79.390001| 74.249997|        77.370002|315541800|11.052857000000001|3974578.6122360677|
|2011-10-26|            78.73|         81.420001| 75.399997|        79.400002|148733900|         11.342857|1826748.9335943388|
|2011-10-27|        82.179998| 82.71999699999999| 79.249998|80.86000200000001| 71190000|11.551428999999999| 860614.1511344592|
|2011-10-28|        80.280002|         84.660002| 79.599999|84.14000300000001| 57769600|             12.02| 682371.8241820972|
|2011-10-31|83.63999799999999|         84.090002| 81.450002|        82.080003| 39653600|         11.725715|471561.41107001045|
|2011-11-01|        80.109998|         80.999998|     78.74|        80.089997| 33016200|         11.441428|407607.41747178807|
|2011-11-02|        80.709998|         84.400002| 80.109998|        83.389999| 41384000|         11.912857|490331.74193526676|
|2011-11-03|        84.130003|         92.600003| 81.800003|        92.290003| 94685500|13.184285999999998|1022521.5651450896|
|2011-11-04|91.46999699999999| 92.89000300000001| 87.749999|        90.019998| 84483700|             12.86| 909502.6081547225|
|2011-11-07|             91.0|         93.839998| 89.979997|        90.830003| 47485200|         12.975715|506023.02868761786|
|2011-11-08|91.22999899999999|         92.600003| 89.650002|        90.470001| 31906000|         12.924286| 344557.2242584053|
|2011-11-09|        89.000001|         90.440001| 87.999998|        88.049999| 28756000|         12.578571|317956.65283108526|
|2011-11-10|        89.290001| 90.29999699999999| 84.839999|85.11999899999999| 39614400|             12.16| 438697.6889932788|
|2011-11-11|        85.899997|         87.949997|      83.7|        87.749999| 38140200|         12.535714| 433657.7748831532|
|2011-11-14|        87.989998|              88.1|     85.45|        85.719999| 21811300|         12.245714|247574.34733257664|
|2011-11-15|            85.15|         87.050003| 84.499998|        86.279999| 21372400|         12.325714| 245518.6589712122|
|2011-11-16|        86.460003|         86.460003| 80.890002|        81.180002| 34560400|11.597142999999999| 399727.0275366518|
|2011-11-17|            80.77|         80.999998| 75.789999|        76.460001| 52823400|         10.922857| 652140.7568429816|
|2011-11-18|             76.7|         78.999999| 76.039998|        78.059998| 34729100|         11.151428|439608.86632416287|
+----------+-----------------+------------------+----------+-----------------+---------+------------------+------------------+
```
 ## 8. ¿Qué día tuvo el pico más alto en la columna “Open”?
```scala
val maxOpenRow = df.sort(desc("OPEN")).select("Date", "OPEN").head()

```
```sh
val maxOpenRow: org.apache.spark.sql.Row = [2015-07-14,708.900017]
```

 ## 9. ¿Cuál es el significado de la columna Cerrar “Close” en el contexto de información financiera, explíquelo no hay que codificar nada?

```sh
Es el ultimo precio de la accion registrado en la jornada.
```
 ## 10. ¿Cuál es el máximo y mínimo de la columna “Volumen”?
```scala

df.select(max("Volume"),min("Volume")).show()

```
```sh
+-----------+-----------+
|max(Volume)|min(Volume)|
+-----------+-----------+
|  315541800|    3531300|
+-----------+-----------+

```
 ## 11. ¿Cuál es el máximo y mínimo de la columna “Volumen”?

 ### a. ¿Cuántos días fue la columna “Close” inferior a $ 600?
```scala   
        df.filter($"Close"<600).count()

```
```sh

val res24: Long = 1218

```
 ### b. ¿Qué porcentaje del tiempo fue la columna “High” mayor que $ 500?
```scala   
        (df.filter($"High">500).count()*1.0/df.count())*100

```
```sh

val res36: Double = 4.924543288324067

```

 ### c. ¿Cuál es la correlación de Pearson entre columna “High” y la columna “Volumen”?
```scala   
        df.select(corr($"High", $"Volume")).show()
```
```sh
scala> df.select(corr($"High", $"Volume")).show()
+--------------------+
|  corr(High, Volume)|
+--------------------+
|-0.20960233287942157|
+--------------------+

```

 ### d. ¿Cuál es el máximo de la columna “High” por año?
```scala   
        val df2 = df.withColumn("Year", year(df("Date")))
        df2.groupBy("Year").max("High").show() 
```
```sh
scala>  val df2 = df.withColumn("Year", year(df("Date")))
df2: org.apache.spark.sql.DataFrame = [Date: date, Open: double ... 6 more fields]

scala>  df2.groupBy("Year").max("High").show()
+----+------------------+
|Year|         max(High)|
+----+------------------+
|2015|        716.159996|
|2013|        389.159988|
|2014|        489.290024|
|2012|        133.429996|
|2016|129.28999299999998|
|2011|120.28000300000001|
+----+------------------+
```

 ### e. ¿Cuál es el promedio de la columna “Close” para cada mes del calendario?
```scala   
        val df3 = df2.withColumn("Month", month(df("Date")))
        df3.groupBy("Month").avg("Close").show()
```
```sh
scala> val df3 = df2.withColumn("Month", month(df("Date")))
df3: org.apache.spark.sql.DataFrame = [Date: date, Open: double ... 7 more fields]

scala>    df3.groupBy("Month").avg("Close").show()
+-----+------------------+
|Month|        avg(Close)|
+-----+------------------+
|   12| 199.3700942358491|
|    1|212.22613874257422|
|    6| 295.1597153490566|
|    3| 249.5825228971963|
|    5|264.37037614150944|
|    9|206.09598121568627|
|    4|246.97514271428562|
|    8|195.25599892727263|
|    7|243.64747528037387|
|   10|205.93297300900903|
|   11| 194.3172275445545|
|    2| 254.1954634020619|
+-----+------------------+
```

# Unit2 Practice 1 LINEAR REGRESSION EXERCISE
### Import LinearRegression
```scala
import org.apache.spark.ml.regression.LinearRegression
import org.apache.spark.sql.SparkSession
```
```sh
scala> import org.apache.spark.ml.regression.LinearRegression
import org.apache.spark.ml.regression.LinearRegression

scala> import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.SparkSession
```
### Opcional: Utilice el siguiente codigo para configurar errores
```scala
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)
```
```sh
scala> import org.apache.log4j._
import org.apache.log4j._
scala> Logger.getLogger("org").setLevel(Level.ERROR)
```

### Inicie una simple Sesion Spark
```scala
val spark = SparkSession.builder().getOrCreate()
```
```sh
scala> val spark = SparkSession.builder().getOrCreate()
spark: org.apache.spark.sql.SparkSession = org.apache.spark.sql.SparkSession@60a0f09f
```

### Utilice Spark para el archivo csv Clean-Ecommerce 
```scala
val data  = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("Clean-Ecommerce.csv")
```
```sh
scala> val data  = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("Clean-Ecommerce.csv")
data: org.apache.spark.sql.DataFrame = [Email: string, Avatar: string ... 5 more fields]
```
### Imprima el schema en el DataFrame
```scala
data.printSchema()
```
```sh
scala> data.printSchema()
root
 |-- Email: string (nullable = true)
 |-- Avatar: string (nullable = true)
 |-- Avg Session Length: double (nullable = true)
 |-- Time on App: double (nullable = true)
 |-- Time on Website: double (nullable = true)
 |-- Length of Membership: double (nullable = true)
 |-- Yearly Amount Spent: double (nullable = true)
```
### Imprima un renglon de ejemplo del DataFrane.
```scala
data.head(1)
```
```sh
scala> data.head(1)
res2: Array[org.apache.spark.sql.Row] = Array([mstephenson@fernandez.com,Violet,34.49726772511229,12.65565114916675,39.57766801952616,4.0826206329529615,587.9510539684005])
```
### Transforme el data frame para que tome la forma de ("label","features")
### Importe VectorAssembler y Vectors
```scala
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
```
```sh
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
```

### Renombre la columna Yearly Amount Spent como "label", Tambien de los datos tome solo la columa numerica, Deje todo esto como un nuevo DataFrame que se llame df
```scala
data.columns
val df = data.select(data("Yearly Amount Spent").as("label"), $"Avg Session Length", $"Time on App", $"Time on Website", $"Length of Membership")
```
```sh
val res3: Array[String] = Array(Email, Avatar, Avg Session Length, Time on App, Time on Website, Length of Membership, Yearly Amount Spent)
val df: org.apache.spark.sql.DataFrame = [label: double, Avg Session Length: double ... 3 more fields]
```

### Utilice el objeto VectorAssembler para convertir la columnas de entradas del df, a una sola columna de salida de un arreglo llamado  "features", Configure las columnas de entrada de donde se supone que leemos los valores, Llamar a esto nuevo assambler.
```scala
val assembler = new VectorAssembler().setInputCols(Array("Avg Session Length", "Time on App", "Time on Website", "Length of Membership")).setOutputCol("features")
```
```sh
val assembler: org.apache.spark.ml.feature.VectorAssembler = VectorAssembler: uid=vecAssembler_115df6a50100, handleInvalid=error, numInputCols=4
```

### Utilice el assembler para transform nuestro DataFrame a dos columnas: label and features
```scala
val output = assembler.transform(df).select($"label", $"features")
```
```sh
val output: org.apache.spark.sql.DataFrame = [label: double, features: vector]
```

### Crear un objeto para modelo de regresion linea.
```scala
var lr = new LinearRegression()
```
```sh
scala> var lr = new LinearRegression()
lr: org.apache.spark.ml.regression.LinearRegression = linReg_06172a1924ab
```

###  Ajuste el modelo para los datos y llame a este modelo lrModelo
```scala
var lrModelo = lr.fit(output)
```
```sh
scala> var lrModelo = lr.fit(output)
23/11/20 15:17:06 WARN Instrumentation: [959d57c4] regParam is zero, which might cause numerical instability and overfitting.
lrModelo: org.apache.spark.ml.regression.LinearRegressionModel = LinearRegressionModel: uid=linReg_06172a1924ab, numFeatures=4
```

### Imprima the  coefficients y intercept para la regresion lineal
```scala
lrModelo.coefficients
lrModelo.intercept
```
```sh
scala> lrModelo.coefficients
res19: org.apache.spark.ml.linalg.Vector = [25.734271084670716,38.709153810828816,0.43673883558514964,61.57732375487594]

scala> lrModelo.intercept
res20: Double = -1051.5942552990748
```

### Resuma el modelo sobre el conjunto de entrenamiento imprima la salida de algunas metricas!,Utilize metodo .summary de nuestro  modelo para crear un objeto llamado trainingSummary Muestre los valores de residuals, el RMSE, el MSE, y tambien el R^2 .
```scala
val trainingSummary = lrModelo.summary

trainingSummary.residuals.show()
trainingSummary.rootMeanSquaredError
trainingSummary.meanSquaredError
trainingSummary.r2
```
```sh
scala> val trainingSummary = lrModelo.summary
trainingSummary: org.apache.spark.ml.regression.LinearRegressionTrainingSummary = org.apache.spark.ml.regression.LinearRegressionTrainingSummary@626519ef

scala>

scala> trainingSummary.residuals.show()
+-------------------+
|          residuals|
+-------------------+
| -6.788234090018818|
| 11.841128565326073|
| -17.65262700858966|
| 11.454889631178617|
| 7.7833824373080915|
|-1.8347332184773677|
|  4.620232401352382|
| -8.526545950978175|
| 11.012210896516763|
|-13.828032682158891|
| -16.04456458615175|
|  8.786634365463442|
| 10.425717191807507|
| 12.161293785003522|
|  9.989313714461446|
| 10.626662732649379|
|  20.15641408428496|
|-3.7708446586326545|
| -4.129505481591934|
|  9.206694655890487|
+-------------------+
only showing top 20 rows


scala> trainingSummary.rootMeanSquaredError
res30: Double = 9.923256785022229

scala> trainingSummary.meanSquaredError
res31: Double = 98.47102522148971

scala> trainingSummary.r2
res32: Double = 0.9843155370226727
```
# Unit2 Practice 2 LINEAR LogisticRegression EXERCISE
### Import LogisticRegression, SparkSession and Logger libraries, Create a Spark Session, load dataset "advertising.csv" into data & print Schema
```scala
import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.sql.SparkSession

import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)

val spark = SparkSession.builder().getOrCreate()

val data  = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("advertising.csv")

data.printSchema()
```
```sh
import org.apache.log4j._
val spark: org.apache.spark.sql.SparkSession = org.apache.spark.sql.SparkSession@16a58368
val data: org.apache.spark.sql.DataFrame = [Daily Time Spent on Site: double, Age: int ... 8 more fields]
root
 |-- Daily Time Spent on Site: double (nullable = true)
 |-- Age: integer (nullable = true)
 |-- Area Income: double (nullable = true)
 |-- Daily Internet Usage: double (nullable = true)
 |-- Ad Topic Line: string (nullable = true)
 |-- City: string (nullable = true)
 |-- Male: integer (nullable = true)
 |-- Country: string (nullable = true)
 |-- Timestamp: timestamp (nullable = true)
 |-- Clicked on Ad: integer (nullable = true)
```

### Despliega datos e imprime un renglon como ejemplo
```scala
data.head(1)

val colnames = data.columns
val firstrow = data.head(1)(0)
println("\n")
println("Example data row")
for(ind <- Range(1, colnames.length)){
    println(colnames(ind))
    println(firstrow(ind))
    println("\n")
}

```
```sh
scala> data.head(1)
res6: Array[org.apache.spark.sql.Row] = Array([68.95,35,61833.9,256.09,Cloned 5thgeneration orchestration,Wrightburgh,0,Tunisia,2016-03-27 00:53:11.0,0])

scala>

scala> val colnames = data.columns
colnames: Array[String] = Array(Daily Time Spent on Site, Age, Area Income, Daily Internet Usage, Ad Topic Line, City, Male, Country, Timestamp, Clicked on Ad)

scala> val firstrow = data.head(1)(0)
firstrow: org.apache.spark.sql.Row = [68.95,35,61833.9,256.09,Cloned 5thgeneration orchestration,Wrightburgh,0,Tunisia,2016-03-27 00:53:11.0,0]

scala> println("\n")



scala> println("Example data row")
Example data row

scala> for(ind <- Range(1, colnames.length)){
     |     println(colnames(ind))
     |     println(firstrow(ind))
     |     println("\n")
     | }
Age
35


Area Income
61833.9


Daily Internet Usage
256.09


Ad Topic Line
Cloned 5thgeneration orchestration


City
Wrightburgh


Male
0


Country
Tunisia


Timestamp
2016-03-27 00:53:11.0


Clicked on Ad
0
```

### Se crea nueva columna llamada "Hour" de la hora de la columna "Timestamp"
### Se crea un nuevo Dataframe llamado "logregdata", con "Clicked on Ad" como "label" y las siguientes columnas para "features": "Daily Time Spent on Site","Age","Area Income","Daily Internet Usage","Timestamp","Male"
```scala
val timedata = data.withColumn("Hour",hour(data("Timestamp")))

val logregdata = timedata.select(data("Clicked on Ad").as("label"), $"Daily Time Spent on Site", $"Age", $"Area Income", $"Daily Internet Usage", $"Hour", $"Male")
```
```sh
scala> val timedata = data.withColumn("Hour",hour(data("Timestamp")))
timedata: org.apache.spark.sql.DataFrame = [Daily Time Spent on Site: double, Age: int ... 9 more fields]

scala> val logregdata = timedata.select(data("Clicked on Ad").as("label"), $"Daily Time Spent on Site", $"Age", $"Area Income", $"Daily Internet Usage", $"Hour", $"Male")
logregdata: org.apache.spark.sql.DataFrame = [label: int, Daily Time Spent on Site: double ... 5 more fields]
```
### Cree un nuevo objeto VectorAssembler llamado "assembler" para los features
```scala
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors

val assembler = (new VectorAssembler()
                  .setInputCols(Array("Daily Time Spent on Site", "Age","Area Income","Daily Internet Usage","Hour","Male"))
                  .setOutputCol("features"))
```
```sh
scala> import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.feature.VectorAssembler


scala> import org.apache.spark.ml.linalg.Vectors
import org.apache.spark.ml.linalg.Vectors

scala> val assembler = (new VectorAssembler()
     |                   .setInputCols(Array("Daily Time Spent on Site", "Age","Area Income","Daily Internet Usage","Hour","Male"))
     |                   .setOutputCol("features"))
assembler: org.apache.spark.ml.feature.VectorAssembler = VectorAssembler: uid=vecAssembler_a24189aef859, handleInvalid=error, numInputCols=6

```

### Se crean arreglos "training & test" usando radomSplit con los 70 y 30 por ciento respectivamente
```scala
val Array(training, test) = logregdata.randomSplit(Array(0.7, 0.3), seed = 12345)
```
```sh
scala> val Array(training, test) = logregdata.randomSplit(Array(0.7, 0.3), seed = 12345)
training: org.apache.spark.sql.Dataset[org.apache.spark.sql.Row] = [label: int, Daily Time Spent on Site: double ... 5 more fields]
test: org.apache.spark.sql.Dataset[org.apache.spark.sql.Row] = [label: int, Daily Time Spent on Site: double ... 5 more fields]

```

### Se importa el libreria para crear el objeto "pipeline", se crea el modelo de logisticRegression "lr"
### Se entrena "pipeline" con "training" y se almacenan los resultados en "model"; se comprueba modelo "model" con test.
```scala
import org.apache.spark.ml.Pipeline

val lr = new LogisticRegression()

val pipeline = new Pipeline().setStages(Array(assembler, lr))

val model = pipeline.fit(training)

val results = model.transform(test)

```
```sh
import org.apache.spark.ml.Pipeline

val lr: org.apache.spark.ml.classification.LogisticRegression = logreg_51f26008df0a

val pipeline: org.apache.spark.ml.Pipeline = pipeline_974abdabbda7

val model: org.apache.spark.ml.PipelineModel = pipeline_974abdabbda7

val results: org.apache.spark.sql.DataFrame = [label: int, Daily Time Spent on Site: double ... 9 more fields]
```