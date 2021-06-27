package subtask1

import java.util.*

fun main(){
    DateFormatter().toTextDay("29","2","2017")
}

class DateFormatter {
    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        val calendar = GregorianCalendar(year.toInt(), month.toInt()-1,day.toInt())
        println(calendar.get(Calendar.DAY_OF_WEEK))
        return ""
    }
}
