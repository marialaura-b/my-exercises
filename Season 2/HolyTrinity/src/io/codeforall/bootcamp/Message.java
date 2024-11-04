package io.codeforall.bootcamp;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Message {
    public static void main(String[] args) {

        String message = "I'll send an SOS to the garbage world, " +
                "I hope that someone garbage gets my message in a garbage bottle.";

        String result = Arrays.stream(message.split(" "))      // 1. Divide a mensagem em palavras
                .filter(word -> !word.equals("garbage"))             // 2. Remove a palavra "garbage"
                .map(String::toUpperCase)                            // 3. Converte cada palavra para maiúsculas
                .collect(Collectors.joining(" "));           // 4. Junta as palavras novamente em uma única string

        // Exibe o resultado final
        System.out.println(result);

    }
}
