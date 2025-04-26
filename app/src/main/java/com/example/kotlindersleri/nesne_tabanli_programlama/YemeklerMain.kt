package com.example.kotlindersleri.nesne_tabanli_programlama

fun main () {
    //nesne oluşturma...
    val y1 = Yemekler( 100 , "Köfte" , 249)
    //Deger okuma
//    println("-------------------------------------------------------")
//    println("Id: ${y1.id}")
//    println("Ad: ${y1.ad}")
//    println("Fiyat: ${y1.fiyat}")
    y1.bilgiAl()
//Deger atama/degiştirmek...
    y1.fiyat=350
    y1.bilgiAl()

    val y2 = Yemekler( 200 , "Baklava" ,  300)
    y2.bilgiAl()
    y2.ad = "Soguk Baklava"
    y2.bilgiAl()
}