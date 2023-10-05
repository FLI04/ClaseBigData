// importamos la funcion Break.
import util.control.Breaks._

//se declara una variable de tipo int
var x = 0

//condición while, se define un ciclo que mientras x sea menor a cinco se imprimen dos mensajes:
while(x < 5){
    //se imprime el valor actual de x:
    println(s"x is currently $x")
    //se imprime la siguiente etiqueta.
    println(s"x is still less then 5, adding 1 to x ")
    //se aumenta en un el valor de la variable "x".
    x = x + 1
}

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

// Functions 

//Define la funcion "simple" sin argumentos y sin devolver valores "Unit"
def simple(): Unit = {
    //imprime la etiqueta "simple print"
    println("simple print")
}

//se llama la funcion simple()
simple()

//Define Funcion "adder" con 2 enteros como argumentos y retorna 1 entero como valor
def adder(num1:Int, num2:Int): Int = {

//regresa el resultado de la suma 
    return num1 + num2
}
//se llama la funcion "adder" con 2 valores enteros (5,5)
adder(5, 5)

//Define la funcion "greetName" con un parametro String, y regresa un valor String
def greetName(name:String): String={
    //concatena la palabra "Hello"a el parametro recibido
    return s"Hello $name"
}

//declara "fullgreeat" y le asigna el valor devuelto por la funcion "greetName".
val fullgreet = greetName("Mundo Cruel")
println(fullgreet)

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

