package com.example.testsda

import SSLConnect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch {
            val url = "https://exam.toeic.co.kr/receipt/examSchList.php"
            val ssl = SSLConnect()
            ssl.postHttps(url, 1000, 1000)
            val doc = Jsoup.connect(url).get()
            val text = doc.select(".table_data tr td").text()
            val mutableList = mutableListOf<String>()

            text.split(" ").forEach {
                mutableList.add(it)
                Log.d("all", it)
            }

            Log.d("test", mutableList[1]) // 471회 날짜 (+28 할때마다 +1회)
            Log.d("test", mutableList[29])
            Log.d("test", mutableList[57])

            for (i in 1..mutableList.size step 28) { // 1부터 시작, 28씩 건너뜀 (순서는 1, 29, 57...)
                Log.d("testt", mutableList[i])
            }

        }

    }
}