package com.example.kotlindersleri.degiskenler

fun main (){
    var id = 1
    var ad = "Mont"
    var resim = "mont.png"
    var fiyat = 4500
    var puan = 4.7
    var stokDurum = true

    val sehir ="Bursa"
    println(sehir) //Ödev1

    println("Ürün id: $id")
    println("Ad: $ad")
    println("Resim: $resim")
    println("Puan: $fiyat")
    println("Fiyat: $puan   ")
    println("Stok durum: $stokDurum")


    // Sabitler - Constant

    var sayi = 30
    sayi = 100
    println(sayi)
    //val - sabit demektir.üzerinde bir degişiklik olmayacaktır.

    val numara = 50
    println(numara)

    var f = 10
    println(f)
    f=70

    // tür dönüşümü
    // Sayısaldan metine , metinden sayısala dönüşüm en önemlisidir.
    // toDouble() , toFloat() , toLong() , toInt() , toShort() , toByte() , toChar()
    // 1 - Sayısaldan sayısala dönüşüm.
    val d = 89.56
    val i = 34
    val sonuc1 = d.toInt()
    val sonuc2 = i.toDouble()
    println(sonuc1)
    println(sonuc2)

    // 2-Sayısaldan metine dönüşüm

    var x = 85
    val sonuc3= x.toString()//"85
    println(sonuc3)


    //3-Metinden sayısala dönüşüm
    val yazi = "48"
    val sonuc4=yazi.toIntOrNull()
    println(sonuc4)

    if(sonuc4 != null){
        println(sonuc4)
    }else{
        println("Sonuç null'dur")
    }


}