import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("Welcome to the Calculator using Kotlin programming language!");

    while(true) {
        print("\nChoose an  Operation: ");
        println("\n1. Addition (+)")
        println("2. Subtraction (-)")
        println("3. Multiplication (*)")
        println("4. Division (/)")
        println("5. Exit")

        print("\nEnter your choice (1-5): ")
        val choice = scanner.nextInt()
        if (choice == 5) {
            println("Exiting the Calculator.")
            break
        }

        print("Enter the First Number: ")
        val num1 = scanner.nextDouble()

        print("Enter the Second Number: ")
        val num2 = scanner.nextDouble()

        val result = when (choice) {
            1 -> num1 + num2
            2 -> num1 - num2
            3 -> num1 * num2
            4 -> if (num2 != 0.0) num1 / num2 else {
                println("Error: Division by zero is now allowed.")
                null
            }
            else -> {
                println("Invalid Choice. Please enter a valid number.")
                null
            }
        }
        if (result != null) {
            println("The result is: $result")
        }
    }
    scanner.close()
}