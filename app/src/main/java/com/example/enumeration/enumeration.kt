package com.example.enumeration

// Enumération pour les types de plats
enum class TypePlat{
    ENTREE,
    PLAT_PRINCIPAL,
    DESSERT,
    BOISSON
}

// Enumération pour les états des commandes avec une description
enum class EtatCommande(val description: String) {
    EN_PREPARATION("La commande est en cours de préparation."),
    PRETE("La commande est prête."),
    SERVIE("La commande a été servie."),
    ANNULEE("La commande a été annulée.");

    // Méthode pour afficher la description de l'état
    fun afficherDescription() {
        println("État de la commande : $description")
    }
}

// Classe Commande
class Commande(val typePlat: TypePlat, var etat: EtatCommande) {
    // Méthode pour afficher les détails de la commande
    fun afficherDetails() {
        println("Type de plat : $typePlat")
        etat.afficherDescription()
    }
}

// Fonction principale pour tester
fun main() {
    /* Création de quelques commandes avec différents types et états
    val commande1 = Commande(TypePlat.PLAT_PRINCIPAL, EtatCommande.EN_PREPARATION)
    val commande2 = Commande(TypePlat.DESSERT, EtatCommande.PRETE)
    val commande3 = Commande(TypePlat.BOISSON, EtatCommande.SERVIE)
    val commande4 = Commande(TypePlat.ENTREE, EtatCommande.ANNULEE)

    // Affichage des détails de chaque commande
    println("Détails de la commande 1 :")
    commande1.afficherDetails()
    println("\nDétails de la commande 2 :")
    commande2.afficherDetails()
    println("\nDétails de la commande 3 :")
    commande3.afficherDetails()
    println("\nDétails de la commande 4 :")
    commande4.afficherDetails() */

    val t1 = TypePlat.ENTREE

    val ec = EtatCommande.PRETE



    println(ec.description)


}