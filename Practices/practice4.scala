/*Práctica 6 - Implementar Seudocódigo de la serie Fibonacci
Implemente los siguientes seudocódigos de la serie Fibonacci en Scala de la liga proporcionada:*/


//Algoritmo 1,
var n = 15

def fib(n:Int): Int =
 {
   if (n<2)
    return n 
   else 
    return fib(n-1)+fib(n-2)
    
 }
println("El numero Fibonacci de " + n + " es: " + fib(n))
//Algoritmo 3,

//Algoritmo 4,

//Algoritmo 5
