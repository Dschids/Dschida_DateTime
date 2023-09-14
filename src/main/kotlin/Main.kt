import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import kotlin.math.abs

fun main(args: Array<String>) {
    // set formatting for the date
    val formatter = DateTimeFormatter.ofPattern("MM.dd.yyyy")
    var today = LocalDate.now()
    // last full moon date
    val lastfull: LocalDate = LocalDate.of(2023,8,30)
    var daysfromlast = abs(today.until(lastfull, ChronoUnit.DAYS))
    println(daysfromlast)
    var daystonextfull = 30-daysfromlast
    println(daystonextfull)
    // formatting everything
    var nextfull = today.plusDays(daystonextfull)
    var nextfullformatted = nextfull.format(formatter)
    var todayformatted = today.format(formatter)
    var lastfullformatted = lastfull.format(formatter)
    // print out formatted lastfull, today, nextfull and daystonext
    println("Today is $todayformatted")
    println("The last full moon was on $lastfullformatted")
    println("The next full moon is on $nextfullformatted")
    println("You have $daystonextfull days to get ready")

}