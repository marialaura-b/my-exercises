public class ClosestNeighbours {
    public static void main(String[] args) {

        int[] numbers = {0, 5, 1209, 6, 2, 111, 112, 33};

        int diff = Integer.MAX_VALUE;
        int[] neighbours = new int[2];

        for (int i = 0; i < numbers.length - 1; i++) {
            int sub = Math.abs(numbers[i] - numbers[i + 1]);
            if (sub < diff) {
                diff = sub;
                neighbours[0] = numbers[i];
                neighbours[1] = numbers[i + 1];
            }
            System.out.println(neighbours[0] + "e" + neighbours[1]);
        }
    }
}