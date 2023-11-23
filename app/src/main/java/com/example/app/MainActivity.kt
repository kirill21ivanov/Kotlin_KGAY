package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    // здесь можно добавить переменный дефолдные
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        setContentView(R.layout.activity_main) //  в это случае "R" означает ресурс, то есть папку res
    }

    override fun onStart() {  //  Вызывавет функцию
        Log.d("Bag","Функция Старт")
        super.onStart()
    }

    override fun onResume() {  //  Показывает для пользователя
        super.onResume()
    }

    override fun onPause() {  //  Когда пользователь сворачивает приложение
        super.onPause()
    }

    override fun onStop() {  //  Остановка
        super.onStop()
    }

    override fun onRestart() {  //  Вход после сворачивания приложения
        super.onRestart()
    }

    override fun onDestroy() { //  Полный выход из программы (Очистка памяти)
        super.onDestroy()
    }
}
