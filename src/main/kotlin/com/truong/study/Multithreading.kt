package com.truong.study

fun main(args: Array<String>) {
    var thread1= MyThread("Thread 1",1000)
    thread1.start()
    var thread2= MyThread("Thread 2",1000)
    thread2.start()
    var thread3= MyThread("Thread 3",1000)
    thread3.start()
    //thread3.join()
    println(" thread is running")
}

class MyThread():Thread(){
    var delaytime:Long = 1000
    var threadName:String = ""
    constructor(threadName:String,delayTime:Long):this(){
        this.threadName = threadName
        this.delaytime = delayTime
    }


    override fun run() {
        //Write Thread
        var count = 0
        while (count<10){
            println("${this.threadName} count: $count")
            count++
            try{
                Thread.sleep(this.delaytime)
            }
            catch (ex:Exception){
                print(ex.message)
            }

        }

    }
}