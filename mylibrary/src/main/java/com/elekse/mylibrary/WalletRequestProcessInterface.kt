package com.elekse.mylibrary

import android.text.BoringLayout

interface WalletRequestProcessInterface {
    fun response(text: String): String {
        return text
    }

    fun isProcessing(response: ResponseClass)

}