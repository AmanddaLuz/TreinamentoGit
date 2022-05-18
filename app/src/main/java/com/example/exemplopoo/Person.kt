package com.example.exemplopoo

interface Acao{
    fun subtrair()
    fun somar () = 2 + 2

    fun andar(status: String): String{
        return status
    }
}
open class Person(var firstName:String, var secondName: String): Acao{
    constructor(firstName: String): this("", "")
    var idade: Int = 0
    override fun subtrair() {
        TODO("Not yet implemented")
    }
}

open class Student(nome:String, sobrenome: String, idade: Int) : Person(nome, sobrenome), Acao{

    constructor(name: String, secondName: String) : this("", "", 0)


}

fun main(){
    var student1 = Student("", "")
    student1.firstName = "Maria"
    student1.secondName = "Joaõ"
    student1.idade = 12

    println("O Student chama-se: ${student1.firstName +" "+ student1.secondName}, tem ${student1.idade} anos" +
            " e está: ${student1.andar("Correndo")} e somou ${student1.somar()}")


    var estudante1 = Estudante()
    estudante1.nome = "Amanda"
    estudante1.idade = 30
    estudante1.qtdMaterias = 10



    println("O estudante chama-se ${estudante1.nome} tem ${estudante1.idade} anos e ${estudante1.qtdMaterias} " +
            "matérias.\n O estudante fez a seguinte soma ${estudante1.somarNumeros(22, 10)}")

}

// classe pai
open class Pessoa{

    //Atributos
    var nome: String? = null
    var sobrenome: String? = null
    var idade: Int? = 0

    //construtor vazio
    constructor()

    //construtor com parâmetros
    constructor( nome: String, sobrenome: String, idade: Int){
        this.nome = nome
        this.sobrenome = sobrenome
        this.idade = idade
    }
}

//classe filho
class Estudante: Pessoa, Somar{

    //Atributos
    var qtdAulas: Int? = 0
    var qtdMaterias: Int? = 0



    constructor(): super()

    constructor(nome: String, sobrenome: String, idade: Int): super(nome, sobrenome, idade)

    constructor(nome: String, sobrenome: String, idade: Int, qtdAulas: Int, qtdMaterias: Int): super(nome, sobrenome, idade)
}

interface Somar{

    fun somarNumeros(){

    }
    fun somarNumeros(num1: Int, num2:Int): Int {
        var operacao = num1 + num2
        return operacao
        //println("A soma de $num1 + $num2 = ${num1 + num2}")
    }
    fun somarNumeros(num1: Int, num2: Int, num3: Int){
        println("A soma de $num1 + $num2 + $num3 = ${num1 + num2 + num3}")
    }
}














