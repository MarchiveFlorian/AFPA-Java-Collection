package fr.afpa;

import java.util.Stack;

public class StackApp 
{
    public static void main( String[] args )
    {   

        //Ressources au choix:
        //https://www.jmdoudoux.fr/java/dej/chap-collections.htm#collections-5
        //https://www.tutorjoes.in/Java_example_programs/create_a_stack_using_stack_collection_in_java
        //https://www.youtube.com/watch?v=KInG04mAjO0


        // TODO Instanciez une nouvelle Stack sur le theme de votre choix
        Stack < String > stack = new Stack < String > ();


        //TODO Ajoutez des valeurs dans votre stack
		stack.push("Red");
		stack.push("Green");
		stack.push("Blue");
		stack.push("Yellow");
		stack.push("Orange");


        //TODO Affichez votre stack
        System.out.println(stack);


    }
}
