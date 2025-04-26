package com.example.kotlindersleri.nesne_tabanli_programlama

fun main (){
//   val sonuc = 5.carp(2)
//    println(sonuc)
val sonuc = 5 carp 2
    println(sonuc)

}

// başka dsyalarda erişmek için main dışında

infix fun Int.carp(sayi:Int) : Int{
    return this * sayi // this(int) dışardan gelecek degeri temsil ediyor.
}