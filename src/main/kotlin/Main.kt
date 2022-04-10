import java.lang.NumberFormatException

fun main() {

    while (true) {
        print("Введите количество лайков (для выхода введите end): ")

        val input = readLine()

        if (input.equals("end", ignoreCase = true)) {
            println("Bye")
            break
        }

        try {
            val likes = input?.toUInt() ?: return

            val likesCount = likes.toInt()

            if (likesCount % 100 != 11 && likesCount % 10 == 1) {
                println("Ваш пост понравился $likesCount человеку")
            } else if (likesCount.toInt() == 0) {
                println("Пока лайков нет")
            } else {
                println("Ваш пост понравился $likesCount людям")
            }

        } catch (e: NumberFormatException) {
            println("неверный ввод")
        }
    }
}