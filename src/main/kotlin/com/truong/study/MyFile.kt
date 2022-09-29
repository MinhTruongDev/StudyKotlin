package com.truong.study

import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main(args: Array<String>) {
    println("1. Read file\n2. Write file")
    print("Choose what you want to do: ")
    var input:Int = readLine()!!.toInt()

    when(input){
        1-> ReadFromFile()
        2->{
            print("Type something to write to file: ")
            var str:String = readLine()!!.toString()
            WriteToFile(str)
        }
    }
}

fun WriteToFile(str:String)
{
    try{
        var fileOut = FileWriter("test.txt",true)// FileWriter("test.txt",true) if u don't want function to override content
        fileOut.write(str +"\n")
        fileOut.close()
        print("Data is saved")
    }
    catch (ex:Exception){
        println(ex.message)
    }
}

fun ReadFromFile(){
    try {
        var fileIn = FileReader("test.txt")
        var character:Int?
        do{
            character=fileIn.read()
            print(character.toChar())
        }while (character!=-1)
    }
    catch (ex:Exception){
        println(ex.message)
    }
}