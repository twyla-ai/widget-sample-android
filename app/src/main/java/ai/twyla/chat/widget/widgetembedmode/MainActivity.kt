package ai.twyla.chat.widget.widgetembedmode

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.webkit.ConsoleMessage
import android.webkit.WebChromeClient
import android.webkit.WebView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webview: WebView = findViewById(R.id.widget_view)

        webview.webChromeClient = object : WebChromeClient() {
            override fun onConsoleMessage(consoleMessage: ConsoleMessage): Boolean {
                android.util.Log.e("WebView", consoleMessage.message())
                return true
            }
        }
        webview.settings.javaScriptEnabled = true
        webview.loadUrl("file:///android_asset/index.html")
    }
}
