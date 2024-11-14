package com.example.enumeration

enum class TypeChambre(val PrixParNuit:Int){
    SIMPLE(100),
    DOUBLE(150),
    SUITE(300)
}

enum class EtatReservation(val description : String){
    CONFIRME("Reservation confirme et pret a l'arrivee"),
    EN_ATTENT("Reservation en attent"),
    ANNULLE("Reservation annullee"),
    ARRIVEE("Le client est arrive a l'hotel")
}

data class Chambre(
    val type: TypeChambre,
    val numero : Int,
){
    fun afficherDetails(){
        println("Type: $type - Numero: $numero Prix: ${type.PrixParNuit}")
    }
}

data class Reservation(
    val chambre: TypeChambre,
    val clientNom : String,
    val nuite : Int,
    val etat: EtatReservation
){
    fun calculerTotal(): Int {
        return nuite * chambre.PrixParNuit
    }

    fun afficherDetail() {
        val prixTotal = calculerTotal()
        println("Client: $clientNom - Type de chambre: $chambre - Etat: ${etat.description} - Prix total: $prixTotal MAD")
    }
}

data class Client(
    val nom : String,
    val email : String
){
    fun Afficher_Deteils(){
        println("Nom: $nom - Email: $email")
    }
}

fun main(){
    val ch1 = Chambre(TypeChambre.SIMPLE, 3)
    val ch2 = Chambre(TypeChambre.DOUBLE, 8)
    val ch3 = Chambre(TypeChambre.SUITE, 8)

    val res1 = Reservation(TypeChambre.SIMPLE , "Zouhair" , 2 , EtatReservation.ARRIVEE)
    val res2 = Reservation(TypeChambre.DOUBLE , "Elhaj" , 8 , EtatReservation.CONFIRME)
    val res3 = Reservation(TypeChambre.SUITE , "Mohammad" , 5 , EtatReservation.ANNULLE)

    val cl1 = Client("zouhair" , "zouhair@email.com")
    val cl2 = Client("elhaj" , "elhaj@email.com")
    val cl3 = Client("mohamad" , "mohamad@email.com")


    res1.afficherDetail()
    res2.afficherDetail()
    res3.afficherDetail()


    res1.calculerTotal()
    res2.calculerTotal()
    res3.calculerTotal()
}