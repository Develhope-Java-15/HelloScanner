import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!"); 

        Scanner consoleInput = new Scanner(System.in);

        while(true) {
            System.out.print("Inserisci una frase: ");
            String sentence = consoleInput.nextLine(); 
            System.out.println("Hai inserito: " + sentence);
            if(sentence.equals("exit")) {
                break;
            }
        }

        consoleInput.close();
    }
}