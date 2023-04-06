import java.util.Scanner;

public class jogoConsole {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println(PerguntasERespostas.perguntaInicial);
        int resposta = leitor.nextInt();
        if (resposta == 1) {
            System.out.println(PerguntasERespostas.perEResp1);
            resposta = leitor.nextInt();
            if (resposta == 1){
                System.out.println(PerguntasERespostas.perEResp2);
            }
            else if (resposta == 2){
                System.out.println(PerguntasERespostas.perEResp3);
                resposta = leitor.nextInt();
                if (resposta == 1){
                    System.out.println(PerguntasERespostas.perEResp4);
                }
                else if (resposta == 2) {
                    System.out.println(PerguntasERespostas.perEResp5);
                    resposta = leitor.nextInt();
                    if (resposta == 1) {
                        System.out.println(PerguntasERespostas.perEResp6);
                    }
                    else if (resposta == 2) {
                        System.out.println(PerguntasERespostas.perEResp7);
                    }
                    else if(resposta == 3) {
                        System.out.println(PerguntasERespostas.perEResp8);
                    }
                    else if (resposta == 4) {
                        System.out.println(PerguntasERespostas.perEResp9);
                    }
                    else {
                        System.out.println(PerguntasERespostas.inv);
                    }
                }
                else if (resposta == 3) {
                    System.out.println(PerguntasERespostas.morteXing);
                }
                else if (resposta == 4) {
                    System.out.println(PerguntasERespostas.perEResp10);
                    resposta = leitor.nextInt();
                    if (resposta == 1){
                        System.out.println(PerguntasERespostas.perEResp11);
                    }
                    else if (resposta == 2) {
                        System.out.println(PerguntasERespostas.perEResp12);
                    }
                    else if (resposta == 3) {
                        System.out.println(PerguntasERespostas.perEResp13);
                    }
                    else if (resposta == 4) {
                        System.out.println(PerguntasERespostas.perEResp14);
                    }
                    else {
                        System.out.println(PerguntasERespostas.inv);
                    }
                }
                else {
                    System.out.println(PerguntasERespostas.inv);
                }
            }
            else if (resposta == 3){
                System.out.println(PerguntasERespostas.perEResp15);
                resposta = leitor.nextInt();
            }
            else if (resposta == 4){
                System.out.println(PerguntasERespostas.morteXing);
            }
            else {
                System.out.println(PerguntasERespostas.inv);
            }
        }
        else if (resposta == 2) {
            System.out.println(PerguntasERespostas.morteXing);
        }
        else if (resposta == 3) {
            System.out.println(PerguntasERespostas.perEResp16);
            resposta = leitor.nextInt();
            if (resposta == 1){
                System.out.println(PerguntasERespostas.perEResp17);
            }
            else if (resposta == 2) {
                System.out.println(PerguntasERespostas.perEResp18);
            }
            else if (resposta == 3) {
                System.out.println(PerguntasERespostas.perEResp19);
                resposta = leitor.nextInt();
                if (resposta == 1){
                    System.out.println(PerguntasERespostas.morteXing);
                }
                else if (resposta == 2){
                    System.out.println(PerguntasERespostas.perEResp20);
                }
                else if (resposta == 3){
                    System.out.println(PerguntasERespostas.perEResp21);
                }
                else if (resposta == 4){
                    System.out.println(PerguntasERespostas.perEResp22);
                    resposta = leitor.nextInt();
                    if (resposta == 1){
                        System.out.println(PerguntasERespostas.perEResp23);
                    }
                    else if (resposta == 2) {
                        System.out.println(PerguntasERespostas.perEResp24);
                    }
                    else {
                        System.out.println(PerguntasERespostas.inv);
                    }
                }
                else {
                    System.out.println(PerguntasERespostas.inv);
                }
            }
            else if (resposta == 4) {
                System.out.println(PerguntasERespostas.morteXing);
            }
            else {
                System.out.println(PerguntasERespostas.inv);
            }
        }
        else if (resposta == 4) {
            System.out.println(PerguntasERespostas.perEResp25);
        }
        else{
            System.out.println(PerguntasERespostas.inv);
        }
    }
}
