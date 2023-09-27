package solutions

object BinaryStringSum {
    fun addBinary(firstAddend: String, secondAddend: String): String {
        var i = firstAddend.length - 1
        var j = secondAddend.length - 1
        var carry = 0
        var sum = 0
        val result = StringBuilder()

        while (i >= 0 || j >= 0 || carry == 1) {
            sum = carry
            if (i >= 0) sum = sum + firstAddend[i].code - '0'.code
            if (j >= 0) sum = sum + secondAddend[j].code - '0'.code
            result.append((sum % 2 + '0'.code).toChar())
            carry = sum / 2
            i--
            j--
        }
        return result.reverse().toString()
    }
}