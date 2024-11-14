package com.example.enumeration

enum class TypeVoiture(val tarif : Double){
    ECONOMIQUE(300.0),
    INTERMEDIAIRE(450.0),
    SUV(600.0),
    LUXE(1000.0);

    fun tarifJournalier():Double{
        return tarif
    }
}

data class Voiture(
    val id : Int,
    val marque : String,
    val modele : String,
    val type: TypeVoiture
)

data class Location(
    val voiture: Voiture,
    val jourLocation : Int
){
    fun CalculerToatal():Double{
        return jourLocation * voiture.type.tarif
    }

    fun afficherDetails(){
        val prix = CalculerToatal()
        println("Nombre de jour: $jourLocation - Type de voiture: ${voiture.type} - Tarif: ${voiture.type.tarif} - Prix Total: $prix Dh\n")
    }
}

fun main(){
    val v1 = Voiture(1 , "BMW" , "M5" , TypeVoiture.SUV)
    val v2 = Voiture(2 , "Mercedes-Benz" , "Maibach" , TypeVoiture.LUXE)
    val v3 = Voiture(3 , "Audi" , "A7" , TypeVoiture.INTERMEDIAIRE)
    val v4 = Voiture(4 , "Dacia" , "Logan" , TypeVoiture.ECONOMIQUE)

    val l1 = Location(v1 , 2)
    val l2 = Location(v2 , 5)
    val l3 = Location(v3 , 3)
    val l4 = Location(v4 , 9)

    l1.afficherDetails()
    l2.afficherDetails()
    l3.afficherDetails()
    l4.afficherDetails()
}