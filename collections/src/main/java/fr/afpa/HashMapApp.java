package fr.afpa;

//TODO Faites l'import de java HashMap
import java.util.HashMap;

public class HashMapApp {
    public static void main(String[] args) {

        // Ressources :
        // https://www.youtube.com/watch?v=I9aBP0xm-lE
        // https://www.w3schools.com/java/java_hashmap.asp
        // https://www.jmdoudoux.fr/java/dej/chap-collections.htm#collections-5

        // TODO Instanciez une nouvelle HashMap sur le theme de votre choix
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // TODO Ajoutez des paires clé/valeur à votre HashMap - au moins 5 paires
        capitalCities.put("Angleterre", "Londres");
        capitalCities.put("France", "Paris");
        capitalCities.put("Allemagne", "Berlin");
        capitalCities.put("Espagne", "Madrid");
        capitalCities.put("Italie", "Rome");

        // TODO Récupérez la valeur d'une de vos paires
        System.out.println("La valeur récupérée est: " + capitalCities.get("Allemagne"));

        // TODO Vérifiez si une de vos clés est contenue dans la collection
        System.out.println("La clé en paramètre est présente: " + capitalCities.containsKey("Italie"));

        // TODO Vérifiez si une de vos valeurs est contenue dans la collection
        System.out.println("La valeur en paramètre est présente: " + capitalCities.containsValue("Londres"));

        // TODO Ajoutez une paire clé/valeur à votre HashMap
        System.out.println("Ajout d'une nouvelle paire clé/valeur");
        capitalCities.put("Belgique", "Bruxelles");

        // TODO Utilisez une méthode pour trouver le nombre de paires (la longueur de
        // votre HashMap) et affichez la en console
        System.out.println("Nombre de paires clé/valeur: " + capitalCities.size());

        // TODO Affichez toutes les clés de votre HashMap (avec une boucle for each & avec une méthode de HashMap)
        System.out.println("Voici les clés de notre HashMap: ");
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        System.out.println(capitalCities.keySet());

        // TODO Affichez toutes les valeurs de votre HashMap (avec une boucle for each & avec une méthode de HashMap)
        System.out.println("Voici les valeurs de notre HashMap: ");
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        System.out.println(capitalCities.values());

        // TODO Affichez toutes les clés/valeurs de votre HashMap (avec une boucle for each & avec une méthode de HashMap)
        System.out.println("Voici les paires de notre HashMap: ");
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

        System.out.println(capitalCities.entrySet());

        // TODO Supprimez une de vos paires
        System.out.println("Suppression d'une de nos paires");
        capitalCities.remove("Espagne");

        // TODO Vérifiez si votre HashMap est vide
        System.out.println("La Hashmap est vide? :" + capitalCities.isEmpty());

        // TODO Supprimez tous les éléments de votre HashMap
        System.out.println("Suppression de tous les élements de notre HashMap");
        capitalCities.clear();

        // TODO Refaites la vérification
        System.out.println("La Hashmap est vide? :" + capitalCities.isEmpty());

    }
}
