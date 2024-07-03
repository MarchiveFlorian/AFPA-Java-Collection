package fr.afpa;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {

        // Ressources :
        // https://www.jmdoudoux.fr/java/dej/chap-collections.htm#collections-5 -> crtl + F : 14.6.7.1. L'interface java.util.Deque
        // https://codegym.cc/fr/groups/posts/fr.828.pile-java
        // https://www.youtube.com/watch?v=KInG04mAjO0

        // TODO Instanciez une nouvelle Stack(Pile) sur le theme de votre choix
        Stack<String> stack = new Stack<String>();

        // TODO Ajoutez des valeurs dans votre stack
        stack.push("Red");
        stack.push("Green");
        stack.push("Blue");
        stack.push("Yellow");
        stack.push("Orange");
        // stack.addLast("White")

        // TODO Ajoutez une valeur au début de la stack
        stack.addFirst("Black");
        // stack.offerFirst();

        // TODO Affichez votre stack
        System.out.println("Voici les éléments de notre Stack: " + stack);

        // TODO Supprimez l'élément du dessus de votre stack
        System.out.println("Suppression de l'élément du dessus");
        stack.pop();
        // stack.removeLast();

        // TODO Affichez l'élément du dessus de votre stack
        System.out.println("Affichage de l'élément du dessus: " + stack.peek());
        // System.out.println(stack.getLast());

        // TODO Supprimez le premier élément de votre stack
        System.out.println("Suppression du premier élément");
        stack.removeFirst();

        // TODO Affichez le premier élément de votre stack
        System.out.println("Affichage du premier élément: " + stack.getFirst());
       
        // TODO Cherchez et affichez la position d'un de vos éléments (la valeur
        // indiquera la position de l'élément par rapport au dessus de la stack)
        System.out.println("L'élément est en " + stack.search("Blue") + "eme position par rapport au dessus de la Stack");   


        // TODO Vérifiez si votre stack est vide 
        System.out.println("La Stack est vide?: " + stack.isEmpty());

        // TODO Supprimez tous les éléments de votre stack
        System.out.println("Suppression de tous les élements de notre Stack");
        stack.clear();

        // TODO Refaites la vérification
        System.out.println("La Stack est vide? :" + stack.isEmpty());

    }
}
