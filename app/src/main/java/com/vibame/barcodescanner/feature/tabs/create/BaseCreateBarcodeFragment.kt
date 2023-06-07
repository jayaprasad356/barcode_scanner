package com.vibame.barcodescanner.feature.tabs.create

import androidx.fragment.app.Fragment
import com.vibame.barcodescanner.extension.*
import com.vibame.barcodescanner.model.Contact
import com.vibame.barcodescanner.model.schema.Other
import com.vibame.barcodescanner.model.schema.Schema

abstract class BaseCreateBarcodeFragment : Fragment() {
    protected val parentActivity by unsafeLazy { requireActivity() as CreateBarcodeActivity }

    open val latitude: Double? = null
    open val longitude: Double? = null

    open fun getBarcodeSchema(): Schema = Other("")
    open fun showPhone(phone: String) {}
    open fun showContact(contact: Contact) {}
    open fun showLocation(latitude: Double?, longitude: Double?) {}
}