package br.com.americanas.polotech925.revisao;

public class EstruturasDeRepeticao {

    public static void main(String[] args) {

        //do while, while, for

        boolean isVerdade = true;

//        while(isVerdade) {
//            System.out.println("Dentro do while");
//
//            isVerdade = false;
//        }

//        do {
//            System.out.println("DENTRO DO DO");
//        } while (true);

        int arrayInteiros[] = { 1, 2, 3, 5, 7, 10, 22};

        for(int i = 0; i < arrayInteiros.length; i++) {
            System.out.println(arrayInteiros[i]);
        }

        String[] arrayUsuarios = new String[10];
        for(int i = 0; i < arrayUsuarios.length; i++) {
            if (arrayUsuarios[i] == null) {
                arrayUsuarios[i] = "Novo usuário";
                break;
            }
        }

        for (int elemento : arrayInteiros) {
            if (elemento == 5) {
                continue;
            }
            System.out.println(elemento);
        }



    }

}
