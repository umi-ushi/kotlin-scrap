package wa.umiushi.v2.v2_0_0

// Hex Format
// https://kotlinlang.org/docs/whatsnew22.html?_gl=1%2Ajsfaj6%2A_gcl_au%2AMTE4MzI4NzI3LjE3NTA2OTMyMzU.%2AFPAU%2AMTE4MzI4NzI3LjE3NTA2OTMyMzU.%2A_ga%2ANTMxMjcyMjAxLjE3MzA0MzIwNTI.%2A_ga_9J976DJZ68%2AczE3NTA2OTY5NzgkbzIzJGcxJHQxNzUwNjk3ODY0JGo0MSRsMCRoMA..#stable-hexadecimal-parsing-and-formatting-with-the-hexformat-api

class HexAble(private val value: ByteArray) {
    // https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.text/-hex-format/
    private val format = HexFormat {
        upperCase = true
    }

    fun hex() = value.toHexString(format)
}