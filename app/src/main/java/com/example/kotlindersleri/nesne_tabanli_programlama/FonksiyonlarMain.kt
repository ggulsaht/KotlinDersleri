package com.example.kotlindersleri.nesne_tabanli_programlama

fun main (){
    val f = Fonksiyonlar()

    // void = unit
    f.selamla1()
    // return
    val gelenSonuc = f.selamla2()
    println("Gelen Sonuç : $gelenSonuc")

    //Parametre
    f.selamla3("Gülşah")

    f.topla(10,20,"Gülşah")

}