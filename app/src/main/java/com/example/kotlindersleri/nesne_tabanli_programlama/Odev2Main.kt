package com.example.kotlindersleri.nesne_tabanli_programlama


fun main() {
    // 1. Sıcaklık dönüşümü testi
    val celsius = 25.0
    val fahrenheit = celsiusToFahrenheit(celsius)
    println("$celsius derece Fahrenheit olarak: $fahrenheit")

    // 2. Dikdörtgen çevresi testi
    val length = 10.0
    val width = 5.0
    val perimeter = rectanglePerimeter(length, width)
    println("Dikdörtgenin çevresi: $perimeter")

    // 3. Faktoriyel hesaplama testi
    val number = 5
    val fact = factorial(number)
    println("$number sayısının faktoriyeli: $fact")

    // 4. 'a' harfi sayısı testi
    val word = "Ankara"
    val countA = countLetterA(word)
    println("\"$word\" kelimesinde 'a' harfi sayısı: $countA")

// 1. Soru: Kenar sayısına göre iç açılar toplamı hesapla
    val kenarSayisi = 5
    val aciToplami = icAciToplami(kenarSayisi)
    println("$kenarSayisi kenarlı bir çokgenin iç açılar toplamı: $aciToplami derece")

    // 2. Soru: Gün sayısına göre maaş hesapla
    val gunSayisi = 22
    val maas = maasHesapla(gunSayisi)
    println("$gunSayisi gün çalışan bir kişinin maaşı: $maas TL")

    // 3. Soru: Kota miktarına göre ücret hesapla
    val kotaGb = 70
    val kotaUcreti = kotaUcretiHesapla(kotaGb)
    println("$kotaGb GB internet kullanan bir kişinin ödemesi gereken ücret: $kotaUcreti TL")
}

// 1. Sıcaklığı Fahrenheit'a çeviren fonksiyon
fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 1.8 + 32
}

// 2. Dikdörtgenin çevresini hesaplayan fonksiyon
fun rectanglePerimeter(length: Double, width: Double): Double {
    return 2 * (length + width)
}

// 3. Sayının faktoriyelini hesaplayan fonksiyon
fun factorial(number: Int): Long {
    var result = 1L
    for (i in 1..number) {
        result *= i
    }
    return result
}

// 4. 'a' harfi sayısını bulan fonksiyon
fun countLetterA(word: String): Int {
    return word.count { it == 'a' || it == 'A' }
}

// 1. Fonksiyon
fun icAciToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

// 2. Fonksiyon
fun maasHesapla(gunSayisi: Int): Int {
    val toplamSaat = gunSayisi * 8
    return if (toplamSaat <= 160) {
        toplamSaat * 10
    } else {
        val mesaiSaati = toplamSaat - 160
        (160 * 10) + (mesaiSaati * 20)
    }
}

// 3. Fonksiyon
fun kotaUcretiHesapla(kotaGb: Int): Int {
    return if (kotaGb <= 50) {
        100
    } else {
        val asimGb = kotaGb - 50
        100 + (asimGb * 4)
    }
}