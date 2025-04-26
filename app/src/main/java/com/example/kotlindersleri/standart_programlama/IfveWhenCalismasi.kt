package com.example.kotlindersleri.standart_programlama

fun main() {
    val yas = 17

    println(yas >= 18)
    if (yas >= 18) {//true
        println("Reşitsiniz")
    } else {
        println("Reşit değilsiniz")
    }

    //Mülakatlarda Çıkabilir....

    val ka = "admin"
    val s = 123456
    val sayi = 10

    if (ka == "admin" && s == 123456) {//&&and demek . true true ise çalışır diger durumlarda false.
        println("Hoşgeldiniz")
    } else {
        println("Hatalı giriş")

    }

    if(sayi== 9||sayi==10){//False ise false . diger durumlarda true.
        println("Sayi 9 veya 10dur")
    }else{
        println("Sayi 9 veya 10 değildir")
    }

    //When , Diger dillerde Switch olarak bilinir.

    val number = 5
    when (number) {
        1 -> println("Sayı 1")
        2 -> println("Sayı 2")
        else -> println("Tanımlanmayan sayı")
    }
    //break kullanıma gerek yok kotlin gibi modern dillerde.



}