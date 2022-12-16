package br.com.americanas.polotech925.revisao;

public class Arrays {

    public static void main(String[] args) {

        int[] arrayInt = new int[3];

        arrayInt[1] = 5;

        int[] arrayDeclarativo = { 1, 3, 5, 6, 8, 10 };

        int[] arrayTerceiraForma = new int[] {1, 3, 5};

//        for (int i = 0; i < arrayDeclarativo.length; i++) {
//            System.out.println(arrayDeclarativo[i]);
//        }

        int[][] matrizInteiro = new int[2][2];

        matrizInteiro[0][0] = 5;

//        System.out.println(matrizInteiro[0][0]);

//        for (int i = 0; i < matrizInteiro.length; i++) {
//            System.out.println(matrizInteiro[i]);
//        }

        for(int linha = 0; linha < matrizInteiro.length; linha++) {
            for(int coluna = 0; coluna < matrizInteiro[linha].length; coluna++) {
                System.out.print("[" + matrizInteiro[linha][coluna] + "]");
            }
            System.out.println();
        }

    }
}
