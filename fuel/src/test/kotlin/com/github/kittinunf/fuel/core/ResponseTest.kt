package com.github.kittinunf.fuel.core

import com.github.kittinunf.fuel.BaseTestCase
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import java.net.URL
import org.hamcrest.CoreMatchers.`is` as isEqualTo

class ResponseTest : BaseTestCase() {
    @Test
    fun responseHasHeaderGetter() {
        val response = Response(
            url = URL("https://test.fuel.com"),
            headers = Headers.from(Headers.CONTENT_TYPE to "image/png")
        )

        assertThat(response[Headers.CONTENT_TYPE].lastOrNull(), isEqualTo("image/png"))
    }

    @Test
    fun responseHasHeader() {
        val response = Response(
            url = URL("https://test.fuel.com"),
            headers = Headers.from(Headers.CONTENT_TYPE to "image/png")
        )

        assertThat(response.header(Headers.CONTENT_TYPE).lastOrNull(), isEqualTo("image/png"))
    }
}