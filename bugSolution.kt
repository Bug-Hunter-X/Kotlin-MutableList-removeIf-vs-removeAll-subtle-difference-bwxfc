fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    // Use removeIf for in-place modification
    list.removeIf { it > 2 }
    println("removeIf: "+list) // Output: [1, 2]

    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    //Use removeAll to create a new list
    val newList = list2.removeAll { it > 2 }
    println("removeAll: "+ list2) //Output: [1,2]
    println("newList: "+newList) // Output: false
    //To get the expected result with removeAll, filter instead
    val filteredList = list2.filter { it <=2 }
    println("filteredList: "+filteredList)// Output: [1, 2]
} 