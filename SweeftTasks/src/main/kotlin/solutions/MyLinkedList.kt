package solutions

class MyLinkedList {
    private var head: Node? = null
    private var tail: Node? = null
    private var length: Int = 0

    inner class Node(var value: Any?){
        var next: Node? = null
    }

    /* addAtHead მეთოდი სიის თავში - პირველ ელემენტად - ამატებს არგუმენტად გადაწოდებულ მნიშვნელობას  */
    fun addAtHead(value: Any?){
        val h = this.head
        val newNode = Node(value)
        newNode.next = this.head
        head = newNode
        if (h == null) tail = newNode
        this.length++
    }

    /* deleteAtIndex მეთოდი სიიდან შლის არგუმენტად გადაწოდებულ ინდექსზე მყოფ Node-ს */
    fun deleteAtIndex(index: Int) {
        var curr = this.head
        var prev:Node? = null
        var counter = 0
        if (index < 0 || index >= this.length) return
        if (index == 0){
            head = curr!!.next
            this.length--
            return
        }
        while (counter != index){
            prev = curr
            curr = prev!!.next
            counter++
        }
        prev!!.next = curr!!.next
        if (index == length-1) tail = prev
        this.length--
    }

    /*  get მეთოდი აბრუნებს არგუმენტად გადაწოდებულ ინდექსზე მყოფი Node-ის მნიშვნელობას.
    თუ ინდექსი არ არის მართებული აბრუნებს -1ს */
    fun get(index: Int): Any?{
        var h = head
        var counter = 0
        if (index < 0 || index >= this.length) return -1
        while (counter != index){
            h = h!!.next
            counter++
        }
        return h!!.value
    }
}