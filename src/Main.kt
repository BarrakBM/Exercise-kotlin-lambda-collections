// Part 1
// The function have 2 parameters operation and lambda
// the lambda function will take 1 argument in this case String
// and return a Boolean of if it's true or false, however the return type of the lambda is List<String>
// when we apply the lambda function to the list it will return List<String>
// Hence, it will return everything (List<String>) that's true  in our case names starts with A
fun filterNames(names: List<String>, operation: (String) -> Boolean):List<String>{
    return names.filter(operation)
}

fun main() {
    // Part 1: Lambda with List Transformation
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Part 1: ${numbers.map { it * 2 }}")

    // Part 2: Filtering Strings with Lambda
    val names = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")
    val namesWithA = filterNames(names) { it.contains('A') }
    println(namesWithA) // print final result
}