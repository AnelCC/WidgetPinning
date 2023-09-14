package com.anelcc.widgetpinning.widget

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class WidgetPinnedReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val requestCode = intent.getIntExtra("requestCode", 0)

        if (requestCode == 7)
            Toast.makeText(
                context,
                "Widget pinned to the home screen.",
                Toast.LENGTH_LONG
            ).show()
    }
}