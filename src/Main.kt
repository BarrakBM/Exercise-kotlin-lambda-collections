// Part 1
// The function have 2 parameters operation and lambda
// the lambda function will take 1 argument in this case String
// and return a Boolean of if it's true or false, however the return type of the lambda is List<String>
// when we apply the lambda function to the list it will return List<String>
// Hence, it will return everything (List<String>) that's true  in our case names starts with A
fun filterNames(names: List<String>, operation: (String) -> Boolean):List<String>{
    return names.filter(operation)
}

// Part 4:
fun customFilter(numbers: List<Int>, filter: (Int) -> Boolean): List<Int>{
    return numbers.filter(filter)
}

// Part 5:
fun processNumbers(numbers: List<Int>, filter: (Int) -> Boolean): List<Int>{
    return numbers.filter(filter)
}

fun main() {
    // Part 1: Lambda with List Transformation
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Part 1: ${numbers.map { it * 2 }}")

    // Part 2: Filtering Strings with Lambda
    val names = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")
    val namesWithA = filterNames(names) { it.contains('A') }
    println("Part 2: $namesWithA") // print final result

    //Part 3: Sorting with Custom Lambda
    val fruits = listOf("apple", "banana", "kiwi", "strawberry", "grape")
    val fruitSortedByLength = fruits.sortedByDescending {it.length}
    println("Part 3: $fruitSortedByLength")

    // Part 4:
    // Creating a variable to reduce code redundancy.
    val numbersList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Part 4: ${customFilter(numbersList){ it > 5 }}")
    println("Part 4: ${customFilter(numbersList){ it % 2 == 0}}")
    println("Part 4: ${customFilter(numbersList){ it % 3 == 0 }}")

    // Part 5: Combining Lambdas
    val processedNums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNums = processNumbers(processedNums){ it % 2 != 0} // filter out the even numbers
    val squaredEvenNums = evenNums.map { it * it }
    println("Part 5: $squaredEvenNums")





}