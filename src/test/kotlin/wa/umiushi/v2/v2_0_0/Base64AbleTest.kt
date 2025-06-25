package wa.umiushi.v2.v2_0_0

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Base64AbleTest {

    private val data = byteArrayOf(0xfb.toByte(), 0xff.toByte(), 0x0f.toByte())

    @Test
    fun `convert byte to base64 string`() {
        val fixture = Base64Able(data)
        assertEquals("+/8P", fixture.encode())
    }

    @Test
    fun `convert byte to base64 url safety string`() {
        val fixture = Base64Able(data)
        assertEquals("-_8P", fixture.encodeUrlSafe())
    }
}