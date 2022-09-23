class Employee constructor( firstName: String = "",
                            lastName: String = "",
                           var number: String? = "" ,
                           var shift: Int = 0) {
    var name: String = ""
    var firstName: String = firstName
        get() = field
        set(value) {
            field = value
            name = "$firstName $lastName"
        }
    var lastName: String = lastName
        get() = field
        set(value) {
            field = value
            name = "$firstName $lastName"
        }


    init {
        println("Employee info for $firstName $lastName has been updated")
    }

    fun printInfo() {
        println(
            "Name: $firstName $lastName" +
                    "\nNumber: $number" +
                    "\nShift: $shift"
        )

    }
    fun printName(){
        println("$firstName $lastName")
    }
}