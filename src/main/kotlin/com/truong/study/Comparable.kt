package com.truong.study

// Created by Phan Minh Truong at 29/09/2022
class Person(var name:String, var age:Int):Comparable<Person>{


    override fun compareTo(other: Person): Int {
       return this.age - other.age
    }


}



fun main(args: Array<String>)
{
    var listOfNames = ArrayList<Person>()
    listOfNames.add(Person("Bgien",19))
    listOfNames.add(Person("Geigaa",65))
    listOfNames.add(Person("Anourt",24))

    println("before sorted")
    for (person in listOfNames)
    {
        println("Name: "+ person.name)
        println("Age: "+ person.age)
    }
    println("after sorted")

    //Sort list by Int
    listOfNames.sort()

    //Sort list by String. https://stackoverflow.com/questions/53351465/sort-array-by-alphabet-using-kotlin
    //listOfNames.sortBy { it.name?.toString() }

    for (person in listOfNames)
    {
        println("Name: "+ person.name)
        println("Age: "+ person.age)
    }


}