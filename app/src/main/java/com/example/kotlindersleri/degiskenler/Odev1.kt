package com.example.kotlindersleri.degiskenler

class Odev1 {
    // Kişisel Bilgiler
    val sehir: String = "İstanbul"
    val ulke: String = "Türkiye"
    val telefon: String = "+905551112233"
    val postaKodu: String = "38000"
    val email: String = "ornek@example.com"
    val meslek: String = "Yazılım Geliştirici"
    val dogumGunu: String = "1990-05-10"
    val medeniDurum: String = "Bekar"
    val musteriAdi: String = "Ahmet Yılmaz"

    // Finans ve Ödeme
    val bakiye: Double = 2500.75
    val maas: Double = 18000.0
    val odemeTarihi: String = "2025-04-22"
    val odeme: Double = 350.50
    val indirimMiktari: Int = 15 // yüzde
    val kuponSuresi: String = "3 gün"
    val kuponKodu: String = "INDIRIM50"
    val faturaAdresi: String = "Atatürk Mah. No:10 Kadıköy / İstanbul"

    // Ürün ve Stok
    val stokMiktari: Int = 150
    val siparisAdeti: Int = 3
    val urunAdi: String = "Bluetooth Kulaklık"
    val urunYorum: String = "Çok kaliteli bir ürün."
    val urunPuani: Double = 4.7

    // Kitap ve Yayın
    val kitapAdi: String = "Suç ve Ceza"
    val yayinlamaTarihi: String = "2020-09-15"

    // Konum ve Yer
    val enlem: Double = 41.0082
    val boylam: Double = 28.9784
    val sokakAdi: String = "İnönü Caddesi"
    val odaSayisi: Int = 2
    val faturaAdres: String = "Beşiktaş, İstanbul"

    // Taşıtlar ve Modeller
    val arabaModeli: String = "Toyota Corolla"
    val telefonModeli: String = "Galaxy S23"

    // Müzik ve Medya
    val muzikAdi: String = "Gülpembe"
    val videoSuresi: String = "02:45"
    val resimAdi: String = "manzara.jpg"
    val dosyaFormati: String = "JPEG"

    // Marka ve Renk
    val marka: String = "Samsung"
    val renk: String = "Mavi"
    val renkKodu: String = "#0000FF"

    // Ekran ve Ağırlık
    val ekranBoyutu: Double = 6.4 // inç
    val agirlik: Double = 0.25 // kilogram

    // Tatil ve Tarihler
    val ulusalGun: String = "29 Ekim"
    val tatilGunu: String = "1 Ocak"
    val rezervasyonTarihi: String = "2025-06-10"

    // Ulaşım
    val otobusHatti: String = "34BZ"
    val kalanDakika: Int = 8

    // Takip ve Kupon
    val takipKodu: String = "TR123456789"

    // Yemek
    val yemekFiyati: Double = 120.0

    fun bilgileriYazdir() {
        // Ekrana Yazdır
        println("Müşteri Adı: $musteriAdi")
        println("Şehir: $sehir, Ülke: $ulke")
        println("Telefon: $telefon, Email: $email")
        println("Meslek: $meslek")
        println("Doğum Günü: $dogumGunu, Medeni Durum: $medeniDurum")
        println("Bakiye: $bakiye TL, Maaş: $maas TL")
        println("Ürün Adı: $urunAdi, Ürün Puanı: $urunPuani")
        println("Kitap Adı: $kitapAdi, Yayınlama Tarihi: $yayinlamaTarihi")
        println("Araba Modeli: $arabaModeli")
        println("Müzik Adı: $muzikAdi, Video Süresi: $videoSuresi")
        println("Marka: $marka, Renk: $renk ($renkKodu)")
        println("Telefon Modeli: $telefonModeli, Ekran Boyutu: $ekranBoyutu inç")
        println("Ulusal Gün: $ulusalGun, Tatil Günü: $tatilGunu")
        println("Otobüs Hattı: $otobusHatti, Kalan Dakika: $kalanDakika")
        println("Takip Kodu: $takipKodu, Kupon Kodu: $kuponKodu")
        println("Fatura Adresi: $faturaAdresi")
        println("Enlem: $enlem, Boylam: $boylam")
        println("Yemek Fiyatı: $yemekFiyati TL")
    }
}