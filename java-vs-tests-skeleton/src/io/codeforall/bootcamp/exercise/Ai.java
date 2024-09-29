package io.codeforall.bootcamp.exercise;

public class Ai {
    private String creationDate; //Propriedade do tipo String
    private String name; //Propriedade do tipo String

    public Ai(String creationDate, String name) { //Construtor personalizado definindo valores para as propriedades
        this.creationDate = creationDate;
        this.name = name;
    }

    public String getCreationDate() {
        return this.creationDate;
    }

    public String getName() {
        return this.name;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    //doubleArray: Duplicar os valores de um array de inteiros.
    public static int[] doubleArray(int[] arr) {
        int[] doubled = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            doubled[i] = arr[i] * 2;
        }
        return doubled;
    }

    //factorialIterative: Calcular o fatorial de forma iterativa
    public static int factorialIterative(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

    //factorialRecursive: Calcular o fatorial de forma recursiva.
    public static int factorialRecursive(int num) {
        if (num == 0 || num == 1) { //Cond base
            return 1;
        }
        return num * factorialRecursive(num - 1);
    }
    // palindromeReplace: Substituir palavras que são palíndromos em uma string.
    //public String palindromeReplace(){}

    //emailValidator: Retornar uma expressão regular (regex) que valida e-mails.
    //public String emailValidator() {
    //    return "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    //}

}


