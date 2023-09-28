// Assessment 1/Practica 1

//1. Desarrollar un algoritmo en scala que calcule el radio de un circulo
val pi = 3.1416
val circle = pi * math.pow(4, 2) 
println(s"Radio es:  $circle")

//2. Desarrollar un algoritmo en scala que me diga si un numero es par

val num = 13

if (num %2 == 0){
    println(s"El numero es par:  $num")
 }else{
    println(s"El numero no es par:  $num")}

//3. Dada la variable bird = "tweet", utiliza interpolacion de string para
//   imprimir "Estoy ecribiendo un tweet"

var bird = "tweet"
println(s"Estoy escribiendo un $bird")

//4. Dada la variable mensaje = "Hola Luke yo soy tu padre!" utiliza slice para extraer la
//   secuencia "Luke"

var mensaje = "Hola Luke soy tu padre!"
mensaje= mensaje slice (5,9)
println(s"Hola $mensaje")

//5. Cual es la diferencia entre value y una variable en scala?
//6. Dada la tupla (2,4,5,1,2,3,3.1416,23) regresa el numero 3.1416 



