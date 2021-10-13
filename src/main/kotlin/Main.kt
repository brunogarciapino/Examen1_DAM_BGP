package examen1


// #####################################
// DEFINICIÓN DEL CUERPO DEL PROGRAMA
// #####################################

fun main() {
    var entrada: String// Declaración de variables
    var listaEntrada: List<String>// Aqui tienes que definir las variables que se utilizan
    val miNombre: String = ("Bruno García Pino")
    var edad: Byte
    var mes: Byte
    // Leo desde teclado la edad del alumno y el mes acutal
    println("Introduzca la configuración del programa en este formato: <edadDelAlumno>,  <mesActual>")
    entrada = readLine() ?: ""
    listaEntrada = entrada.split(",")
    // Linea Inicial de programa
    println("*".repeat(80))
    println("PROGRAMA DE GENERACIÓN DE TABLAS: $miNombre")

    // Linea inicio cabecera
    println("_".repeat(80))

    if (listaEntrada.size != 2) //Compruebo el tamaño de la lista, si es != 2, finaliza el programa
    {
        println("La entrada no es correcta")
        println("_".repeat(80))
    } else { // Sino, leo edad y mes. Asigno -1 si hay error en la lectura.
        edad = try {
            listaEntrada[0].trim().toByte()
        } catch (_: Exception) {
            -1
        }
        mes = try {
            listaEntrada[1].trim().toByte()
        } catch (_: Exception) {
            -1
        }

        if ((edad <= 0) || (mes <= 0)) // Si alguno es menor que -1, finaliza el programa1
        {
            println("La entrada no es correcta")
            println("_".repeat(80))
        } else //Sino, continuo
            if (mes >= 13) { // Si el mes es mayor o igual que 13, finaliza el programa1
                println("Mes: $mes. El mes es erroneo.")
                println("_".repeat(80))
            } else //Sino, continuo
                if ((edad < 6) || (edad > 12)) // Si la edad es menor que 6 o mayor que 12, finaliza el programa1
                {
                    println("Edad: $edad. No se contempla esta edad.")
                    println("_".repeat(80))
                } else //Sino, continuo
                {

                    when (edad) {  // Es para clasificar las edades, decir si es par o impar y la tabla
                        in 10..12 -> {
                            println("Edad: $edad, Estás en el rango del [10-12]")
                            if (mes % 2 == 0) {
                                println("Mes: $mes. El mes es par, corresponden las tablas siguientes")
                            } else {
                                println("Mes: $mes. El mes es impar, corresponden las tablas siguientes")
                            }
                            println("\nTabla del 11\n***********")
                            tablaDeMultiplicar(11)
                            println("\nTabla del 12\n***********")
                            tablaDeMultiplicar(12)
                            println("\nTabla del 13\n***********")
                            tablaDeMultiplicar(13)
                        }
                        in 6..8 -> {
                            println("Edad: $edad, Estás dentro del rango del [6-8]")
                            if (mes % 2 == 0) {
                                println("Mes: $mes. El mes es par, corresponden las tablas siguientes")
                                println("\nTabla del 2\n***********")
                                tablaDeMultiplicar(2)
                                println("\nTabla del 4\n***********")
                                tablaDeMultiplicar(4)
                            } else {
                                println("Mes: $mes. El mes es impar, corresponden las tablas siguientes")
                                println("\nTabla del 7\n***********")
                                tablaDeMultiplicar(7)
                                println("\nTabla del 9\n***********")
                                tablaDeMultiplicar(9)
                            }

                        }
                        in 8..10 -> {
                            println("Edad: $edad, Estás dentro del rango del [8-10]")
                            if (mes % 2 == 0) {
                                println("Mes: $mes. El mes es par, corresponden las tablas siguientes")
                                println("\nTabla del 6\n***********")
                                tablaDeMultiplicar(6)
                                println("\nTabla del 8\n***********")
                                tablaDeMultiplicar(8)
                                println("\nTabla del 10\n***********")
                                tablaDeMultiplicar(10)
                            } else {
                                println("Mes: $mes. El mes es impar, corresponden las tablas siguientes")
                                println("\nTabla del 1\n**********")
                                tablaDeMultiplicar(1)
                                println("\nTabla del 3\n***********")
                                tablaDeMultiplicar(3)
                                println("\nTabla del 5\n***********")
                                tablaDeMultiplicar(5)
                            }
                        }
                        else -> println("No tienes los años requeridos")
                    }
                            //Edad: 8. El alumno está dentro del rango [6-8]
                            //Mes: 12. El mes es par, corresponden las tablas siguientes: {2,4}
                            println("La edad es $edad y el mes es $mes")
                    }
                } // Linea final cabecera
        println("_".repeat(80))
    }
private fun tablaDeMultiplicar(num: Int) { //Función de las tablas de multiplicar
    for (i in 1..10) {
        val product = num * i
        println("$num * $i = $product")
    }
}