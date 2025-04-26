package com.example.kotlindersleri.nesne_tabanli_programlama

 data class Yemekler (var id:Int,var ad:String,var fiyat:Int) {
     //Constructor-İnit fonksiyonu
     //bu sınıftan nesne oluştugunda çalışsın.
     init {
         println("****** Nesne Oluştu ******")
     }
    fun bilgiAl(){
        println("------------------------------")
        println("Id: ${id}")
        println("Ad: ${ad}")
        println("Fiyat: ${fiyat}")
    }
    //this : Bulundugu sınıfı temsil eder..//Swift dilinde self.
    //super : Kalıtım ile bir üst sıınıfı temsil eder.
//data claas veritabanı çalışma
}