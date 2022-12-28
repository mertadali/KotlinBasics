package com.mertadali.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        /* Bu kısım ekranda kullanıcıya herhangi bir şey gösterilmeden önce arkada çalışmaya başlayacak
        olan kısımdır. Kodlarımızı bu kısım içine yazarız. */

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Hello world") // Kotlinde ekrana yazdırma işlemi bu şekilde yapılır ve " ; " kullanımı zorunlu değildir.


        //Variables(Değişkenler)
        // bir değişken tanımlanırken var ifadesiyle birlikte kullanılır bir atama yapılır.

        var x = 5
        var y = 4
        println(x+y)


        // Constants(Sabitler)
        // atanacak değer sabit olsun ve değiştirilmesin istersek " val " kullanırız.

        val Myname = "Mert"
         // name ="jason" bu şekilde mert ifadesini jason yapamayız çünkü mert ifadesi nameye sabit olarak atanmış oldu.

        var myInteger : Int // Defining(tanımlama) işlemini yapıyoruz.

        myInteger = 10 // Initialize(başlatmak) yani ilk değerini atama işlemidir.

        val a : Int = 15 // şeklinde hem tanımlama hem atama kısmıda yapılabilir.


        // Double & Float - Floatla double farkı ise "," den sonra alabilecekleri sayı hacmidir. Daha çok double kullanılır.
        var age : Double
        age = 10.2
        println(age / 7*3)


        // String
        var myString ="Mert Adalı"
        var name = "Mert"
        var surname = "Adalı"
        var fullname = name + surname

        println(name + surname) // Bu şekilde de kotlinde string ifadeleri toplayabiliriz ancak bu birleşik olarak yazdırır.
        println(name + "" +  surname) // Bu şekilde ayrı yazdırır.
        println(fullname)


        //Boolean
        // Boolean da true ya da false sorgusu yapmamıza yarar.
        // <
        // >
        // =
        // <=
        // >=
        // ==
        // !=    şeklindeki ifadeler aslında bizim kontrollerimizdir .

        var myBoolean : Boolean = true
        var isAlive = true

        println(3<5)  // bunun cevabını bize boolean olarak verir.


        // Conversion(Dönüştürme)

        var input  = "10"
        var inputInteger = input.toInt()
        println(inputInteger *2)

        var result = 22
        var resultString = result.toString()
        println(resultString)


        // Arrays(Diziler)

        val myArray = arrayListOf("Mert","Levent","Görkem","Emre","Umut","Efe")
        var s = myArray[1]  // dizinin 1. indexi demektir. Dizilerde indexler sıfırdan başlar.
        println(s)
        myArray[2] = "Görkem Özen"
        myArray.set(1,"Levent Tokalı") // bu şekilde de dizinin 1. indexinde değişiklik yapabiliriz.
        println(myArray[1])

        var arrayMixed = arrayOf("Mert", 22)
         println(arrayMixed[0]) // Bu şekilde de hem string hem integer değelerini bir dizinin içinde tutabilirim.


        // List- ArrayList

        val myFriends = arrayListOf<String>("Levent","Emre")
        myFriends.add("Görkem")
        myFriends.add(3,"Umut")

        val myArrayList = ArrayList<Int>()
        myArrayList.add(100)
        myArrayList.add(1)

        val myMixArrayList = ArrayList<Any>()      // Bu şekilde de gene karışık şekilde kullanabiliriz.
        myMixArrayList.add(22)
        myMixArrayList.add("Mert")
        myMixArrayList.add(true)


        // Set

        val myExampleArray = arrayOf(0,1,2,3,4)
        println("element 1:   ${myExampleArray[0]}") // 1. elementi yazdırabilmesi için dolar işareti koyduk aksi takdirde
        // string gibi okuyacaktı.

        val mySet = setOf<Int>(1,1,2,3)
        println(mySet.size)     // setlerde bunun boyutunu 3 olarak okuyacaktır 1 zaten elemanı olarak kabul eder
       // o yüzden liste kullanmak daha mantıklı olacaktır.

        // For-Each
        mySet.forEach { println(it) }      // her bir elemanı bastırması için it kullandık lamda expression gösterimi olarakta geçer.


        // Map- HashMap bunun kullanımında Key-Value olmalı.

        val fruitArray = arrayOf("Banana","Apple")
        val fruitCaloriesArray = arrayOf(100,150)
        println("${fruitArray[0]} : ${fruitCaloriesArray[0]}")  // şeklinde kullanılabilir ancak diziler arası eşleşmelerde hashmap
        // kullanmak daha mantıklı olacaktır.

        val fruitCaloriesMap = hashMapOf<String,Int>()
        fruitCaloriesMap.put("Banana",100)
        fruitCaloriesMap.put("Apple",150)          // Bu şekilde kullanmak daha mantıklıdır.
        println(fruitCaloriesMap["Apple"])  // index vermek yerine artık anahtar kelime vererek yazdrırıyoruz ve sonucu 100 çıkar.

        val mynewMap = hashMapOf<String,Int>("A" to 1,"B" to 2,"C" to 3)  // bu şekilde de kullanılabilirdi.
        println(mynewMap["C"])

        // Operatörler
        var m = 5
        m = m + 1
        println(m)

        var n = 7


        m++ // m yi 1 arttırır.
        m-- // m yi 1 eksiltir.

        // || veya işaretidir      && ve işaretidir.

         println(n>m && 2>1)  // her iki ifade de doğruysa true çıktısı verir ki bu örnekte öyledir.

           println(n>m && 1>2)  // burada ilk ifade doğruyken ikinci ifade yanlıştır o halde false çıktısı verir.

        // % işareti ise remainder olarak geçer ve mod verir.


        // If kontrolleri

        val myNumberAge = 32
        if (myNumberAge > 35) {
            // süslü parantez açıldığında bir kod bloğu açmış oluruz ve kontrol doğruysa kod bloğundaki kodlar çalışır
               println("35 den büyüktür.")
        }

          else if (myNumberAge>30 && myNumberAge<40){
              println("30 ile 40 aralığındadır.")
            }

         //else{  // yukarıdaki şart sağlanmazsa bunu yap anlamı taşır
            //println("35 den küçüktür")}

        // Switch- When
        // diyelim ki böyle bir else if kullanmak istedik ve daha uzunda olabilirdi daha kolay yol için switch - when kullanılabilir.

        val day = 3
        var dayString = ""

        if (day==1){
            dayString = "Monday"
        }else if (day==2){
            dayString = "Sunday"
        }else if (day==3){
            dayString= "Wednesday"
        }

        when(day){
            1 -> dayString = "Monday"    // gün 1 olduğunda dayString değişkenini mondaye eşitle demek aslında bu.
            2 -> dayString = "Sunday"
            3 -> dayString = "Wednesday"
        }


        // Loops(Döngüler)
        // for loop

        val myArrayOfNumbers = arrayOf(12,15,18,21,24,27,30)
        for (number in myArrayOfNumbers){
            var z = number / 3 *5
            println(z)
        }                // Aslında burada dizimizin elemanlarını sırayla 3 e böl 5 e çarp işlemidir.

        for (b in 0..9){
            println(b)
        }                    // Bu da manuel şekilde forun içinde 0 dan 9 a kadar olan sayıları ekrana bastıracaktır.
                             // Ancak dizilerle çalışmak her zaman daha kolay ve ulaşması daha rahat olacaktır.

        // While Loop

        var j = 1
        while (j<10){
            println(j)
            j = j + 1     // While çalışma mantığı ise verilen şart gerçekleşene kadar döngüyü devam ettir demek.

        }

        // Function(Fonksiyonlar)

        fun test(){    // test adındaki fonkiyon çağırıldığında yapılacak işlemleri kod bloğunda yazıyoruz.
            println("text function")

        }
        test()   // bu şekilde çağırırsak bize testin içinde ki "text function" yazısını çıkarıcak.

        // Input && Return

        fun makeSum(a: Int, b: Int){

            makeSum(10,20)   // Bu fonksiyonu çağırdığımızda Unit ifadesini görürüz bu javada da olan void ile eşdeğerdir.


        }

    }
}