package com.truong.study

class TestClasses
{
    var id:String?=null
    var name:String?=null
    var classes:String?=null
    var dob:String?=null

    private constructor(id:String, name:String, dob:String,classes: String){
        this.id = id
        this.name = name
        this.classes = classes
        this.dob = dob
    }
    private constructor(){
        println("instance is created")
    }
    //singleton in kotlin
    companion object{
        val instance:TestClasses by lazy {TestClasses()}
    }
    fun GetStudent():String{
        return "Student Name: $name"
        //return "Student ID: $id \nStudent name: $name \nStudent DoB: ${dob} \nStudent classes: $classes"
    }
}
fun main()
{
    val student1 = TestClasses.instance
    student1.name = "Agien"
    println(student1.GetStudent())
    val student2 = TestClasses.instance
    student2.name = "Neigaa"
    println(student2.GetStudent())
    println("after change student 2. name")
    println(student1.GetStudent())
}