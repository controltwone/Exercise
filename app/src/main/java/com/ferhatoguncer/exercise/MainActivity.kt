package com.ferhatoguncer.exercise

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

// arraylerde yeni değer ekleyemiyorum ama listelerde ekleyebiliyorum.
        val myList = arrayListOf<String>("Lars","Kirk")
        println(myList[1])
        myList.add("Lars")// listenin sonuna ekleme
        println(myList[2])
        myList.add(0,"Rob")// istediğim indexe ekleme
        println(myList[0])

        val myArraylist = ArrayList<Int>()
        myArraylist.add(13)
        myArraylist.add(0,23)
        println(myArraylist[0])
        println(myArraylist[1])

        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add(15.5)
        myMixedArrayList.add("Lars")
        myMixedArrayList.add(true)

        println(myMixedArrayList[0])
        println(myMixedArrayList[1])
        println(myMixedArrayList[2])


        //loops -> for ve while
        val myNumArrays = arrayOf(2,4,6,8,10)
        for(num in myNumArrays){
            val value = num/2*10
            println(value)
        }
        //indices
        for(i in myNumArrays.indices){
            val value = myNumArrays[i]/2
            println(value)
        }

        for ( a in 1..9){
            println(a)
        }

        //bu fonksiyon Unit. yani bir şey döndürmüyor.
        fun mySum(a:Int,b:Int){
            println(a+b)
        }
        mySum(18,2)

        fun myMultiply(a:Int,b:Int) : Int{
            return a*b
        }
        val result = myMultiply(3,11)
        println(result)


        //primary consturctor

        class Simpsons(var name : String, var age : Int, var job : String){
            var height = 0 //opsiyonel tanımla. illa sınıfın bu değeri olmasına gerek yok.
            //ama primary constructordaki özellikleri nesne oluşturmak için tanımlamam lazım.
        }

        //------------------------------------1.ders------------------------------------------------------------

        //Değişken oluşturulurken ilk değer ataması yapılmayacaksa değişken tipi belirtilmelidir.

        //inflate gördüğümüz zaman aklımıza  xml ile kodu birbirine bağlayan bir yapı gelsin
        //ViewBinding bi kere tanımlayınca binding. diyince bütün görünümlere ulaşabilirim.

        //Byte, Short, Int, Long
        //değişkenin tipi belirtilmediyse ve değeri Int'ın değer aralığındaysa otomatik Int tipinde oluşturulur.
        //değer Int aralığından daha büyükse otomatik Long veri tipinde oluşturulur.
        //Int 1.10^9

       var myLongNumber = 12L
        println(myLongNumber)



        //if (isCat.not())
        //if (!isCat) aynı ifadeler

//------------------------------------2.ders------------------------------------------------------------

        //ilk ifade string diğeri int ise toplanabilir. tam tersi geçerli değildir.
//------------------------------------3.ders------------------------------------------------------------

        val myArray = arrayOf("zeynep","tugce","ahmet","mehmet")
        for ( i in myArray){
            println(i)
        }

        for ( i in myArray.indices){
            println(i)
        }

        for ( (index,value) in myArray.withIndex()){
            println("Index: $index, value:$value ")
        }

        //extension fonk: Bir classa yeni bir fonksiyon tanımlamayı sağlayan fonkdur.
        fun String.removeFirstLastChar():String = this.substring(1,this.length-1)


        //high-order fun: fonksiyona parametre olarak hem bir fonksiyon çıktıya da bir fonksiyon alan fonksiyonlar.

        fun square (a: Int):Int {
            return a*a
        }

        //lambda func
        val sum : (Int,Int) -> Int = {a,b -> a+b}
        val answer = sum(2,3)//outputs 5 
    }

}