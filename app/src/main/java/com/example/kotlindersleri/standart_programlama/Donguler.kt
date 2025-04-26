package com.example.kotlindersleri.standart_programlama

fun main() {
    //1.2.3
    // for döngüsü

    for (i in 1..3){//Swift 1...3
        println("Döngü 1 : $i")
    }

    //10 ile 20 arasında çalışsın 5 er 5 er artsın.
    for (x in 10..20 step 5){
        println("Döngü 2 : $x")
    }

    //10 ile 20 arasında çalışsın 5 er 5 er azalsın
    for (x in 20 downTo 10 step 5){
        println("Döngü 3 : $x")
    }

    //1.2.3
    var sayac = 1

    while (sayac<4){
       println("Döngü 4 : $sayac")
       sayac+=1//sayac=sayac+1
    }
//1.2.3.4.5.
    for (i in 1..5){//Swift 1...3
        if (i==3){
            break//döngüyü bitirir.
        }
        println("Döngü 5 : $i")
    }
    //1.2.3.4.5.
    for (i in 1..5){//Swift 1...3
        if (i==3){
            continue//bulundugu adımı atlar.
        }
        println("Döngü 6 : $i")
    }
}