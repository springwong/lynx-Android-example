package com.lynx.lynxandroidproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.lynx.lynxandroidproject.ui.theme.LynxAndroidProjectTheme
import com.lynx.tasm.LynxView
import com.lynx.tasm.LynxViewBuilder

class LynxActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // load lynx view
        val lynxView = buildLynxView()
        setContentView(lynxView)

        val uri = "main.lynx.bundle";
        lynxView.renderTemplateUrl(uri, "")
    }

    private fun buildLynxView(): LynxView {
        val viewBuilder = LynxViewBuilder()
        viewBuilder.setTemplateProvider(LynxProvider(this))
        return viewBuilder.build(this)
    }
}