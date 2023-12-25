package com.example.affirmationsapp

import android.content.Context
import com.example.affirmationsapp.adapter.ItemAdapter
import com.example.affirmationsapp.model.Affirmation
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock


class AffirmationsAdapterTests {
    private val context = mock(Context::class.java)

    @Test
    fun adapter_size() {
        val data = listOf(
            Affirmation(R.string.affirmation2, R.drawable.image2),
            Affirmation(R.string.affirmation5, R.drawable.image5),
        )
        val adapter = ItemAdapter(context, data)
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}
