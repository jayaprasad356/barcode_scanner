package com.vibame.barcodescanner.extension

import androidx.appcompat.app.AppCompatActivity
import com.vibame.barcodescanner.feature.common.dialog.ErrorDialogFragment

fun AppCompatActivity.showError(error: Throwable?) {
    val errorDialog =
        ErrorDialogFragment.newInstance(
            this,
            error
        )
    errorDialog.show(supportFragmentManager, "")
}