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
//Algoritmo 4,

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

//Algoritmo 5
