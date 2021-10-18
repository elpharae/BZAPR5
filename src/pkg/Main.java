package pkg;

public class Main {

    // Vytvorte 1D pole1 o velikosti 10 s čísly 1-10
    // Vytvorte 1D pole2 o velikosti 10 s náhodnými čísli 0-10


    // Vytvořte funkce zjistujici minimální hodnotu prvku v poli,
    // sumu a průměru prvků
    // Vypočítané hodnoty vypiště do konzole
    private int max(int[] arr) {
        int result = 0;
        for (int num : arr)
            if (num > result) result = num;
        return result;
    }

    private int min(int[] arr) {
        int result = max(arr);
        for (int num : arr)
            if (num < result) result = num;
        return result;
    }

    private int sum(int[] arr) {
        int result = 0;
        for (int num : arr)
            result += num;
        return result;
    }

    private float avg(int[] arr) {
        return (float) sum(arr) / arr.length;
    }

    // vlozi do pole prvek na pozici x, y
    // zkontroluj, zda se nevklada mimo rozsah pole
    // navratova hodnota = uspesnost vkladani
    private boolean insert(int num, int x, int y, int[][] arr) {
        printArr(arr);

        if (!(x > arr.length || y > arr[0].length || x < 0 || y < 0)) {
            arr[x][y] = num;
            printArr(arr);
            return true;
        } else return false;
    }

    // vypise 2D pole do konzole
    private void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println();
        }
    }

    // vytvořte pole jako symetricke 2D pole
    // naplnte hodnotami násobků čísel
    private int[][] initArr(int size) {
        int[][] arr = new int[size][size];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }
        return arr;
    }

    // Priklad stavu po inicializaci:
    //pole = inicializace(3)
    //vypis(pole)
    // 1    2   3
    // 2    4   8
    // 3    6   9
    private Main() {
        int[] arr = new int[]{1, 5, 9, 2, 43, 1, 7, 23};

        System.out.println(max(arr));
        System.out.println(min(arr));
        System.out.println(sum(arr));
        System.out.println(avg(arr));

        int[][] arr2 = initArr(5);
        printArr(arr2);
        insert(99, 3, 3, arr2);
    }

    public static void main(String[] args) {
        new Main();
    }
}
