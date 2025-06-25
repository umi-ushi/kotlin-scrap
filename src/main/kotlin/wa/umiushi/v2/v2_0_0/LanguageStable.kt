package wa.umiushi.v2.v2_0_0

// ----------------------------------------------------
// Guard Condition
// https://kotlinlang.org/docs/whatsnew21.html?_gl=1%2Ajsfaj6%2A_gcl_au%2AMTE4MzI4NzI3LjE3NTA2OTMyMzU.%2AFPAU%2AMTE4MzI4NzI3LjE3NTA2OTMyMzU.%2A_ga%2ANTMxMjcyMjAxLjE3MzA0MzIwNTI.%2A_ga_9J976DJZ68%2AczE3NTA2OTY5NzgkbzIzJGcxJHQxNzUwNjk3ODY0JGo0MSRsMCRoMA..#guard-conditions-in-when-with-a-subject

sealed interface Food {
    data class Rice(val isDomestic: Boolean) : Food
    object Bread : Food
}

fun guardConditionSample(food: Food) {
    when (food) {
        is Food.Bread -> println("Good")
        is Food.Rice
            if food.isDomestic -> println("Good")

        else -> println("not so Good")
    }
}

// ----------------------------------------------------