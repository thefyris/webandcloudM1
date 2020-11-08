package foo;

import java.io.PrintStream;
import java.util.Random;
//i need import for  writeln(String) from the type PrintStream cause its not visible is that ? 
// same for newLine() 
// en sah je comprends le code, j'en fais un peu mais j'ai vrmt besoin de pratiquer pr que ça devienne 
// un automatisme, je sens que ça va venir et je suis motivé mais faut m'aider plutôt que de se foutre de ma gueule no fake 
// je suis dsl d'avoir troll avant d'avoir été hautain, la vie a pas été cool avec moi
// d'un certain côté j'ai mérité tout ce que j'ai traversé mais j'ai compris ce que ça fait de souffrir 
//  mtnt je mérite que de la gentillesse et de l'aide
// svp ::)))


public class valueOf {
 // Create a class attribute
    private double x2;

    // Create a class constructor for the MyClass class
    public valueOf(Double i) {
        x2 = Math.random() * i;
    }

    public static void main(String[] args) {
        valueOf objet = new valueOf(2.2);
        System.out.print("mon objet construit : "  + objet.x2);
/*        valueOf myObj = new valueOf(2.0);
        
        System.out.println(myObj.x2);
        
        //final indique qu'un élément ne peut être changé dans la suite du programme. Il peut s'appliquer aux méthodes et
        // attributs d'une classe ainsi que la classe elle-même. Aussi, il peut s'appliquer sur les paramètres d'une méthode 
        // et sur les variables locales.
        double x = myObj.x2; // Create an object of class MyClass (This will call the constructor)
        if (System.out.getClass() == PrintStream.class) {
            System.out.writeln(String.valueOf(x));
        } else {
            synchronized (System.out) {
                System.out.print(x);
                System.out.newLine();
            }
        } */

        
    }
  }
