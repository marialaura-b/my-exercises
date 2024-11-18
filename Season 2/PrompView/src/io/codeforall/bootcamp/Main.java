package io.codeforall.bootcamp;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Prompt prompt = new Prompt(System.in, System.out);
            String[] options = new String[]{"opção1", "opção2", "opção3"};

            MenuInputScanner menuInputScanner = new MenuInputScanner(options);
            //MenuInputScanner.setMessage("OK");
            //MenuInputScanner.setError("NOK");

            while(true) {

                int answer = prompt.getUserInput(menuInputScanner);
                switch (answer){
                    case 1:
                        System.out.println("1");
                        break;
                    case 2:
                        System.out.println("2");
                        break;
                    case 3:
                        System.out.println("3");
                        break;
                }
            }

            /*System.out.println("Welcome to your first Prompt-View Experience!");
            System.out.println("Insert your login credentials below:");


            // create a menu with those options and set the message
            Scanner scanner = new Scanner(System.in);
            System.out.println("Username:");
            String name = scanner.nextLine();

            // Exibe o nome digitado
            System.out.println("Olá, " + name + "!");

            PasswordInputScanner question2 = new PasswordInputScanner();
            System.out.println("Password:");
            String password = question2.getUserInput(scanner);


            // Mensagem de confirmação de login
            System.out.println("\nLogin Successful!");
            System.out.println("Welcome home, " + name + "!");*/
        }
}