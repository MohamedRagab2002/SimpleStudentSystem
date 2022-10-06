
val studentsNames = arrayListOf<String>()
val studentsScores = arrayListOf<Double>()
var studentsNumber = 0
var totalScore : Double = 0.0
var AverageScore : Double = 0.0
var higherScore : Double = -1.0
var indexStudentOfHighScore = 0

fun main(args : Array<String>) {
    println("Please Enter Students Numbers")
    studentsNumber = readLine()!!.toInt()
    registerStudent()
    println("------------------")
    studentsNamesAndScores()
    println("------------------")
    calculateTheAverageScore()
    println("------------------")
    getTheHigherScore()
}


 fun registerStudent() {
     for(i in 1..studentsNumber){
         println("Please Enter Student $i Name")
         studentsNames.add(readLine().toString())
         println("Please Enter Student $i Score :")
         studentsScores.add(readLine()!!.toDouble())
     }
 }


 fun studentsNamesAndScores(){
   for (i in 0..studentsScores.lastIndex) {
       println("${studentsNames[i]} got : ${studentsScores[i]}")
   }
 }


 fun calculateTheAverageScore(){
     for(i in 0..studentsScores.lastIndex) {
         totalScore += studentsScores[i]
     }
     AverageScore = totalScore / studentsNumber
     println("The Average Score of class is : $AverageScore")

 }

 fun getTheHigherScore() {
     for (i in 0..studentsScores.lastIndex) {
         if (studentsScores[i] > higherScore) {
             higherScore = studentsScores[i]
             indexStudentOfHighScore = i
         }
     }
     println("${studentsNames[indexStudentOfHighScore]} got Highest Score : $higherScore")
 }
