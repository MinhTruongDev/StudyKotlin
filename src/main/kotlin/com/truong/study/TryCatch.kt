package com.truong.study

import java.lang.Exception

fun main(args: Array<String>){

    try{
        print("Enter number: ")
        var number:Int = readLine()!!.toInt()
        var Div = 100/number
        print("Div: $Div")
    }
    catch (ex:Exception)
    {
        println(ex.message)
    }
    println("app is done")
}