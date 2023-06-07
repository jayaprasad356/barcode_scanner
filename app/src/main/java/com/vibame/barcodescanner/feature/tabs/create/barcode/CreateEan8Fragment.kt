package com.vibame.barcodescanner.feature.tabs.create.barcode

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import com.vibame.barcodescanner.R
import com.vibame.barcodescanner.extension.textString
import com.vibame.barcodescanner.feature.tabs.create.BaseCreateBarcodeFragment
import com.vibame.barcodescanner.model.schema.Other
import com.vibame.barcodescanner.model.schema.Schema
import kotlinx.android.synthetic.main.fragment_create_ean_8.*

class CreateEan8Fragment : BaseCreateBarcodeFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_create_ean_8, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        edit_text.requestFocus()
        edit_text.addTextChangedListener {
            parentActivity.isCreateBarcodeButtonEnabled = edit_text.text.length == 7
        }
    }

    override fun getBarcodeSchema(): Schema {
        return Other(edit_text.textString)
    }
}