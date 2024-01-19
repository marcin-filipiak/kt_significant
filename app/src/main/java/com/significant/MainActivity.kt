package com.significant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: WebView = findViewById(R.id.WebView)

        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true

        webView.webViewClient = WebViewClient()

        //skalowanie zawartosci
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true


        //złapanie przycisku na interface
        val button_seu = findViewById<Button>(R.id.button_seu)
        val button_spl = findViewById<Button>(R.id.button_spl)

        //domyslnie zaladowany polski
        webView.loadUrl("https://awiacja.imgw.pl/dane_cbpl/SWC_PL_EPWA.GIF")

        //significant polski
        button_spl.setOnClickListener(View.OnClickListener {
            webView.loadUrl("https://awiacja.imgw.pl/dane_cbpl/SWC_PL_EPWA.GIF")
        })

        //significant europejski
        button_seu.setOnClickListener(View.OnClickListener {
            webView.loadUrl("https://awiacja.imgw.pl/dane_cbpl/PGDE14_EGRR.PNG")
        })

    }
}