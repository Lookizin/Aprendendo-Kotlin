/// Programa para ver se estou com sono
fun main() {
    firstQuestion()
}
fun firstQuestion() {
    println("Qual é o seu nome?")
    val pergunta: String? = readLine()
    if (pergunta.isNullOrEmpty() || !pergunta.all { it.isLetter() || it.isWhitespace()}) {
        println("Digitar somente letras.")
        firstQuestion()
    } else {
        println("Prazer em te conhecer ${pergunta}" + ", vamos ver se você tem boas noites de sono.")
            secondQuestion()
    }
}
fun secondQuestion() {
        println("Dormiu quantas horas hoje?")
        val segundaPergunta: Int? = readLine()?.toIntOrNull()

        if (segundaPergunta != null && segundaPergunta < 8) {
            println("Está dormindo muito pouco cara, vai dormir")
        } else if (segundaPergunta != null) {
            println("Está dormindo certinho, parabéns.")
        } else {
            println("ERRO - Digitar somente a quantidade de horas")
            secondQuestion()
        }
    }


