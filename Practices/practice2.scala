//Desarrollar los siguientes puntos con lenguaje Scala y seguir el Git Flow Básico con su compañero de equipo:


//1. Crea una lista llamada "lista" con los elementos "rojo", "blanco", "negro"
val lista = List("Rojo","Blanco","Negro")

//2. Añadir 5 elementos mas a "lista" "verde" ,"amarillo", "azul", "naranja", "perla"
val updatedList = lista :+ "verde":+"amarillo":+"azul":+ "naranja":+ "perla"


//3. Traer los elementos de "lista" "verde", "amarillo", "azul"
updatedList slice (3, 6)

//4. Crea un arreglo de numero en rango del 1-1000 en pasos de 5 en 5
val arr = Array.range(1,1000,5)

//5. Cuales son los elementos únicos de la lista Lista(1,3,3,4,6,7,3,7) utilice conversión a conjuntos
val Lista = List (1,3,3,4,6,7,3,7)
val unicosLista = Lista.distinct
Lista.toSet

//6. Crea una mapa mutable llamado nombres que contenga los siguiente "Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27"
val nombres = Map(("Jose", 20),("Luis", 24), ("Ana", 23),("Susana", "27"))
//6 a . Imprime todas la llaves del mapa
nombres.keys
println (s"Todas llaves $nombres.keys")
//6 b . Agrega el siguiente valor al mapa("Miguel", 23)

