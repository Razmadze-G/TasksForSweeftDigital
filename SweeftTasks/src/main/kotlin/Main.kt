import solutions.*

fun main() {
    println(Coins.minSplit(137))

    println(SingleNumber.singleNumber(intArrayOf(4, 6, 3, 7, 6, 4, 7)))
    println(SingleNumber.singleNumberUsingMap(intArrayOf(4, 6, 3, 7, 6, 4, 7)))

    println(Contains.notContains(intArrayOf(1, 2, 3, 5)))

    println(Stairs.countVariants(8))

    println(BinaryStringSum.addBinary("10101", "110"))

    val list = MyLinkedList()
    list.addAtHead(1)
    list.addAtHead(2)
    list.addAtHead(3)
    list.addAtHead(4)
    list.deleteAtIndex(1)
    println(list.get(0))
    println(list.get(1))
    println(list.get(2))
}