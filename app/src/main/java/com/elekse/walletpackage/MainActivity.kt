package com.elekse.walletpackage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elekse.mylibrary.HistoryBuilder
import com.elekse.mylibrary.ResponseClass
import com.elekse.mylibrary.WalletRequestProcessInterface

class MainActivity : AppCompatActivity(), WalletRequestProcessInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val historyBuilder = HistoryBuilder.Builder()
            .token("sjhdfakdfhkaf")
            .requestListener(this)
            .build()

        println("Token - " + historyBuilder.showToken(true))
    }

    override fun isProcessing(response: ResponseClass) {
        println("IsProcessing - $response")
    }
}