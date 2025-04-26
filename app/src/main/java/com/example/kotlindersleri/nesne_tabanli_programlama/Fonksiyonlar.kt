package com.example.kotlindersleri.nesne_tabanli_programlama

class Fonksiyonlar {
    //void-sadece işlem yapan.

    fun selamla1() {
        //Swift-func olarak tanımlanır.
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }

    // return: hem işlem yapan hem veri transferi yapan
    fun selamla2(): String {
        val sonuc = "Merhaba Ahmet"
        return sonuc

    }

    //parametre - ihtiyaca göre kullanım
    fun selamla3(isim: String) {
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }
//Overloading (Mülakatlarda seviliyor)
    // Bir sınıf içerisinde aynı isimde fonk tekrar tekrar kullanmak.


    fun topla(sayi1: Int, sayi2: Int) {
        println("İki sayının toplamı : ${sayi1 + sayi2}")
    }

    fun topla(sayi1: Double, sayi2: Double)  {
        println("İki sayının toplamı : ${sayi1 + sayi2}")
    }

    fun topla(sayi1: Int, sayi2: Int , isim:String) {
        println("İki sayının toplamı : ${sayi1 + sayi2} - İşlem yapan : $isim")
    }

}