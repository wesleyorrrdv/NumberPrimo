fun main() {
    print("Digite um número:")
    val number = readLine()?. toIntOrNull()?:return

    var isPrime = true

    for(i in 2 until number){
        if(number % i == 0){
            isPrime = false
            break
        }
    }
    if(isPrime){
        println("$number é um numero primo." )
    } else{
        println("$number não é um numero primo.")
    }
}