package com.example.cooking

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this, "b327eef0700b4e403ab4bfd77f49c901")
    }
}