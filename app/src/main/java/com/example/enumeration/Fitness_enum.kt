package com.example.enumeration

enum class TypeCours(val description : String, val duree : String , val tarif : Int){
    YOGA("Cour de relaxtion et flexibilite" , "60 min" , 400),
    PILATES("Cours de renforcement musculaire" , "50 min" , 350),
    CARDIO("Cours pour ameliorer l'endurence" , "45 min" , 300),
    MUSCULATION("Cours de renforcement avec poids" , "40min" , 450),
    ZUMBA("Cours de danse et fitness" , "55 min" , 380);

    fun afficherDescription():String{
        return description
    }

    fun tarifMensuel():Int{
        return tarif
    }
}

data class Utilisateur(
    val id : Int,
    val nom : String,
    val coursReserves : MutableList<TypeCours>
){
    val limiter = 5
    fun ajouterCours(cours: TypeCours){
        if (coursReserves.size > limiter){
            println("La limite de cours réservés a été atteinte. Vous ne pouvez pas ajouter plus de cours.")
        }else{
            coursReserves.add(cours)
        }
    }

    fun supprimerCours(cours: TypeCours){
        coursReserves.remove(cours)
    }

    fun afficherCoursReserves() {
        coursReserves.forEach { cours ->
            println("Cours: ${cours.name} - Description: ${cours.description} - Durée: ${cours.duree} - Tarif: ${cours.tarif}")
        }
    }

    fun calculerTotal():Int{
        return coursReserves.sumOf { it.tarifMensuel() }
    }
}

fun main(){
    val user1 = Utilisateur(1 , "zouhair" , mutableListOf())

    user1.ajouterCours(TypeCours.YOGA)
    user1.ajouterCours(TypeCours.PILATES)
    user1.ajouterCours(TypeCours.CARDIO)
    user1.ajouterCours(TypeCours.MUSCULATION)
    user1.ajouterCours(TypeCours.ZUMBA)

    println("Prix total: ${user1.calculerTotal()}")

    user1.afficherCoursReserves()
}