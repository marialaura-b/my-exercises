package io.codeforall.bootcamp;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

public class Main {
        public static void main(String[] args) {
            Prompt prompt = new Prompt(System.in, System.out);

            // Exibe mensagem de boas-vindas
            System.out.println("Welcome to your first Prompt-View Experience!");
            System.out.println("Insert your login credentials below:");

            // Cria um scanner para o nome de usuário e senha
            TextIO textIO = TextIoFactory.getTextIO();

            // Solicita o nome de usuário
            String username = textIO.newStringInputReader()
                    .withDefaultValue("User")
                    .read("Username:");

            // Solicita a senha (pode ser configurada para ocultar a entrada)
            String password = textIO.newStringInputReader()
                    .withMinLength(1)
                    .withInputMasking(true) // Oculta a senha enquanto é digitada
                    .read("Password:");

            // Mensagem de confirmação de login
            System.out.println("\nLogin Successful!");
            System.out.println("Welcome home, " + username + "!");
        }
}