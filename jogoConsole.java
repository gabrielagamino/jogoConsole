import java.util.Scanner;

public class jogoConsole {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Você está prestes a travar uma batalha pela sua vida contra um monstro que tem três vezes o seu tamanho.\nEle possui garras enormes e você tem a sua espada e uma mochila com alguns curativos. O que você faz?\n1 - Espadada\n2 - Xinga\n3 - Tenta conversar\n4 - Corre\nDigite o número da ação:");
        int resposta = leitor.nextInt();
        if (resposta == 1) {
            System.out.println("Acertou um golpe na canela. O Monstro fica bravo e revida com sua garra.\nVocê está sangrando no abdomen. O que você faz?\n1 - Curativo\n2 - Pede tempo\n3 - Disfere outro golpe\n4 - Xinga\nDigite o número da ação:");
            resposta = leitor.nextInt();
            if (resposta == 1){
                System.out.println("Você parou no meio da batalha para pegar um curativo na sua mochila.\nO monstro não é bobo. Ele pega você enquanto estava distraído e parte seu tronco ao meio.\nSua morte foi dolorosa, mas - pelo menos - foi rápida.");
            }
            else if (resposta == 2){
                System.out.println("O monstro aceita o tempo. Você faz um curativo no seu ferimento\ne está pronto para mais um embate. O que você faz?\n1 - Corre\n2 - Disfere outro golpe\n3 - Xinga\n4 - Desafia o monstro em algo menos violento\nDigite o número da ação:");
                resposta = leitor.nextInt();
                if (resposta == 1){
                    System.out.println("Seu ferimento começa a sangrar mais uma vez quando você dispara.\nO monstro o alcança e você vê que sua hora chegou.\nVocê morreu.");
                }
                else if (resposta == 2) {
                    System.out.println("Sua força de vontade é maior do que tudo. Você consegue disferir mais um golpe de espada no monstro,\nque lhe dá um arranhão no rosto e cai ao chão. O que você faz?\n1 - Disfere o golpe final\n2 - Tem piedade\n3 - Corre\n4 - Pede tempo\nDigite o número da ação:");
                    resposta = leitor.nextInt();
                    if (resposta == 1) {
                        System.out.println("Você reuniu toda a sua força e concentração.\nSeus cabelos começam a voar do nada e você fica loiro por algum motivo que não entende.\nVocê acerta o monstro em cheio. Ele está no chão, sem vida. Você venceu a batalha.");
                    }
                    else if (resposta == 2) {
                        System.out.println("Você tem piedade daquela criatura ao chão.\nVocê dá o seu discurso sobre ser herói e dá as costas para o monstro.\nNesse momento ele lhe atinge por trás e você morre.\nUm monstro não é chamado de monstro por acaso.");
                    }
                    else if(resposta == 3) {
                        System.out.println("Você  aproveita que o monstro está caído e começa a correr.\nO monstro machucado é lento demais para lhe alcançar.\nUm bom guerreiro sabe quando é necessário fugir.");
                    }
                    else if (resposta == 4) {
                        System.out.println("O monstro já deu tempo antes e não quer dar tempo novamente,\npois está de saco cheio dessa pataquada. Ele levanta e lhe acerta com a garra mais uma vez\ne você morre.");
                    }
                    else {
                        System.out.println("Resposta inválida.");
                    }
                }
                else if (resposta == 3) {
                    System.out.println("O monstro ficou furioso com seus xingamentos, principalmente quando envolveu a mãe.\nEle lhe dispere um golpe com força, fazendo-o cair.\nCom isso, o monstro lhe pega e quebra cada um de seus ossos.\nVocê teve uma morte lenta dolorosa.");
                }
                else if (resposta == 4) {
                    System.out.println("Você aproveita que ainda estão em tempo e sugere para o monstro\nque decidam essa batalha de forma menos violenta,\ncomo um jogo. O que você sugere?\n1 - Damas\n2 - Xadrez\n3 - Jokempo\n4 - Par ou ímpar\nDigite o número da ação:");
                    resposta = leitor.nextInt();
                    if (resposta == 1){
                        System.out.println("O monstro não sabe jogar Damas e fica furioso com a ideia.\nEle lhe golpeia na cabeça forte demais... tudo fica escuro. Você morreu.");
                    }
                    else if (resposta == 2) {
                        System.out.println("O monstro é um grande apreciador de xadrez!\nVocês jogam uma partida e você vence. Parabéns!\nAlgumas batalhas são vencidas com inteligência.");
                    }
                    else if (resposta == 3) {
                        System.out.println("O monstro não faz ideia do que você está falando.\nEle acha que você está xingando e golpeia na cabeça forte demais... tudo fica escuro.\nVocê morreu.");
                    }
                    else if (resposta == 4) {
                        System.out.println("O monstro não gosta de par ou ímpar porque ele sempre perde.\nEle fica furioso com a ideia  e lhe golpeia na cabeça forte demais... tudo fica escuro.\nVocê morreu.");
                    }
                    else {
                        System.out.println("Resposta inválida.");
                    }
                }
                else {
                    System.out.println("Resposta inválida.");
                }
            }
            else if (resposta == 3){
                System.out.println("Sua força de vontade é maior do que tudo.\nVocê consegue disferir mais um golpe de espada no monstro,\nque cai ao chão. O que você faz?\n1 - Disfere o golpe final\n2 - Tem piedade\n3 - Corre\n4 - Pede tempo\nDigite o número da ação:");
                resposta = leitor.nextInt();
            }
            else if (resposta == 4){
                System.out.println("O monstro ficou furioso com seus xingamentos, principalmente quando envolveu a mãe.\nEle lhe dispere um golpe com força, fazendo-o cair.\nCom isso, o monstro lhe pega e quebra cada um de seus ossos.\nVocê teve uma morte lenta dolorosa.");
            }
            else {
                System.out.println("Resposta inválida.");
            }
        }
        else if (resposta == 2) {
            System.out.println("O monstro ficou furioso com seus xingamentos,\nprincipalmente quando envolveu a mãe.\nEle lhe dispere um golpe com força, fazendo-o cair. Com isso, o monstro lhe pega e quebra cada um de seus ossos.\nVocê teve uma morte lenta dolorosa.");
        }
        else if (resposta == 3) {
            System.out.println("Você tenta conversar com o monstro,\nperguntando se isso tudo é realmente necessário.\nEle parece te ouvir atentamente. O que você faz?\n1 - Corre\n2 - Conversa\n3 - Espadada\n4 - Xinga\nDigite o número da ação:");
            resposta = leitor.nextInt();
            if (resposta == 1){
                System.out.println("Você correu. O monstro é lento demais para alcançá-lo.\nEle não entendeu o que aconteceu aqui.\nMas parece que não morrer é uma vitória também.");
            }
            else if (resposta == 2) {
                System.out.println("Vocês chegam à conclusão de que não há motivo para brigas.\nAfinal, humanos e monstros podem ser grandes amigos.\nEle lhe convida para um chá e você aceita.");
            }
            else if (resposta == 3) {
                System.out.println("Você aproveitou que o monstro estava pensativo e desferiu um golpe com sua espada.\nO monstro está furioso. O que você faz?\n1 - Xinga\n2 - Conversa\n3 - Espadada\n4 - Par ou ímpar\nDigite o número da ação:");
                resposta = leitor.nextInt();
                if (resposta == 1){
                    System.out.println("O monstro ficou furioso com seus xingamentos,\nprincipalmente quando envolveu a mãe.\nEle lhe dispere um golpe com força, fazendo-o cair.\nCom isso, o monstro lhe pega e quebra cada um de seus ossos.\nVocê teve uma morte lenta dolorosa.");
                }
                else if (resposta == 2){
                    System.out.println("O monstro não vai cair na sua conversinha uma segunda vez.\nEle ignora o que você diz e avança em sua direção.\nVocê morre com uma pancada na cabeça.");
                }
                else if (resposta == 3){
                    System.out.println("O monstro está furioso e vem com tudo para cima de você.\nEle o golpeia várias vezes seguidas e você só sente dor. Você morreu.");
                }
                else if (resposta == 4){
                    System.out.println("O monstro foi pego de surpresa com essa. Ele não gosta de par ou ímpar.\nMas, no calor do momento, agiu sem pensar. O que você coloca?\n1 - Par\n2 - Ímpar\nDigite o número da ação:");
                    resposta = leitor.nextInt();
                    if (resposta == 1){
                        System.out.println("Você venceu. O monstro fica irritado, pois sempre perde no par ou ímpar,\nmas aceita a derrota. Você venceu, mas foi na sorte. ");
                    }
                    else if (resposta == 2) {
                        System.out.println("Você perdeu. O monstro sorri. Você morre.");
                    }
                    else {
                        System.out.println("Resposta inválida.");
                    }
                }
                else {
                    System.out.println("Resposta inválida.");
                }
            }
            else if (resposta == 4) {
                System.out.println("O monstro ficou furioso com seus xingamentos, principalmente quando envolveu a mãe.\nEle lhe dispere um golpe com força, fazendo-o cair.\nCom isso, o monstro lhe pega e quebra cada um de seus ossos.\nVocê teve uma morte lenta dolorosa.");
            }
            else {
                System.out.println("Resposta inválida.");
            }
        }
        else if (resposta == 4) {
            System.out.println("Você correu. O monstro é lento demais para alcançá-lo.\nAlgumas batalhas são vencidas sem brandir a espada.\nUm bom guerreiro sabe quando é necessário fugir.");
        }
        else{
            System.out.println("Resposta inválida.");
        }
    }
}




