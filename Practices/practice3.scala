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
