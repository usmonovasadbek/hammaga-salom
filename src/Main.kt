import java.util.Scanner

fun main() {
    var list = ArrayList<odam>()
    var input = Scanner(System.`in`)

    while (true){
        println("1-> qo'shish; 2-> shunchaki ko'rish; 3-alifbo tartibida korish'")
        when(input.nextInt()){
            1->{
                println("Odam ismi:")
                val  name = input.nextLine()
                    println("Yoshi")
                val yosh = input.nextInt()
                val odam = odam(name,yosh)
                list.add(odam)
                println("saqlandi")

            }
            2->{
                for (odam in list){
                    println(odam)

                }
            }
            3->{
                for (ch in 'A'..'Z' ){
                    for (odam in list){
                        if (odam.name[0]==ch){
                            println(odam)
                        }
                    }
                }
            }
        }
    }
}
data class odam(var  name: String,var age:Int)