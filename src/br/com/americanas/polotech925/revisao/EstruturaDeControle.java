package br.com.americanas.polotech925.revisao;

public class EstruturaDeControle {


    public static void main(String[] args) {

//
//        if (nota >= 6) {
//            System.out.println("Parabéns, você passou de ano1");
//        } else {
//            if (nota == 0) {
//                System.out.println("Meu deus, que tistreza!");
//            }
//        }

                        // condicao ? verdadeiro : falso
//        String mensagem = nota >= 6 ? "Você passou!" : "Ish, você não passou";

//        System.out.println(mensagem);


        int nota = 1;

        switch(nota) {
            case 0:
                System.out.println("Mds, você tirou 0! :(");
                break;
            case 1:
                System.out.println("Foi quase");
                break;
            case 10:
                System.out.println("Parabéns!");
                break;
            default:
                System.out.println("Valor não contemplado");
        }



    }
}
