package wa.umiushi.v2.v2_0_0

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class HexAbleTest {
    @Test
    fun `convert byte to hex string`() {
        val fixture = HexAble(byteArrayOf(0x00, 0x1b, 0x63, 0x84.toByte()))
        assertEquals("001B6384", fixture.hex())
    }
}