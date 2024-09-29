import io.codeforall.bootcamp.exercise.Ai;

public class Playground {
        public static void main(String[] args){
            Ai ai = new Ai("05-02-1992", "Maria Laura"); //Instanciar

            // doubleArray
            int[] arr = {5, 6, 7, 9, 21};
            int[] doubledArr = ai.doubleArray(arr);
            System.out.print("Array duplicado: ");
            for (int num : doubledArr) {
                System.out.print(num + " ");
            }

            //System.out.println();

            // factorialIterative
            int factorialIter = ai.factorialIterative(7);
            System.out.println("Fatorial iterativo de 7: " + factorialIter);

            // Teste do metodo factorialRecursive
            int factorialRec = ai.factorialRecursive(7);
            System.out.println("Fatorial recursivo de 7: " + factorialRec);

            // palindromeReplace

            // emailValidator
    }
}
