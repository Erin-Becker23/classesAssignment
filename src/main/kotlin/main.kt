fun main() {
    val person1 = Employee("John", "Wick", "210-133-1341", 3)
    val person2 = Employee("Pink", "Panther", "555-555-5555", 1)
    val person3 = Employee("Grumpy", "TheCat", "311-343-2424", 2)

    println("--------")
    person1.printInfo()
    println("--------")
    person2.printInfo()
    println("--------")
    person3.printInfo()
    println("~~~~~~~~")


    println("info for ${person3.firstName} ${person3.lastName} has been changed")
    println("~~~~~~~~")
    person3.firstName = "Felix"
    person3.printInfo()


}