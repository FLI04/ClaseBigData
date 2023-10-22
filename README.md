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
