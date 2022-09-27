package com.elekse.mylibrary

class HistoryBuilder private constructor(
    val token: String?,
    val requestListener: WalletRequestProcessInterface?
) {

    data class Builder(
        var token: String? = null,
        var requestListener: WalletRequestProcessInterface? = null
    ) {

        fun token(token: String) = apply { this.token = token }
        fun requestListener(requestListener: WalletRequestProcessInterface) = apply { this.requestListener = requestListener }
        fun build() = HistoryBuilder(token, requestListener)
    }

    fun showToken(show: Boolean): String? {
        val response = ResponseClass(1)
        requestListener?.isProcessing(response)
        return token
    }

}