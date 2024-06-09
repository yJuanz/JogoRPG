import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ExTeste {

    public static int treino1(){
        boolean acertou = false;
        int tentativas = 0;
        int pontos = 0;
        int teste;
        

        Random aleatorio = new Random();

        List alternativas = new ArrayList();
        alternativas.add("77435");
        alternativas.add("78125");// correta
        alternativas.add("15625");
        alternativas.add("390625");

        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            System.out.println("Qual o resultado de 5^3 . 5^4?");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));

            System.out.print("Escolha uma alternativa: ");
            teste = aleatorio.nextInt(4) + 1;
            String resposta = "";
            switch (teste) {
                case 1:
                    resposta = "a";
                    break;
                case 2:
                    resposta = "b";
                    break;
                case 3:
                    resposta = "c";
                    break;
                case 4:
                    resposta = "d";
                    break;

                default:
                    break;
            }

            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("78125")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("78125")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("78125")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("78125")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!");

            }

        } while (!acertou);
        if(acertou = true){
            System.out.println("\n\nO treino 1 funcionou!!\n\n");
        }else{
            System.out.println("\n\nO treino 1 deu erro!\n\n");
        }

        return pontos;

    }

    public static int potencia1() {
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int tentativas = 0;
        int pontos=0;
        int teste;
        
        Random aleatorio = new Random();

        List alternativas = new ArrayList();
        alternativas.add("156.250");
        alternativas.add("390.625");// correta
        alternativas.add("234.375");
        alternativas.add("312.500");

        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            System.out.println("Sabendo que o valor de 5^7 é 78.125, qual o resultado de 5^8?");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));

            System.out.print("Escolha uma alternativa: ");
            teste = aleatorio.nextInt(4) + 1;
            String resposta = "";
            switch (teste) {
                case 1:
                    resposta = "a";
                    break;
                case 2:
                    resposta = "b";
                    break;
                case 3:
                    resposta = "c";
                    break;
                case 4:
                    resposta = "d";
                    break;

                default:
                    break;
            }

            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("390.625")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("390.625")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("390.625")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("390.625")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!");

            }

        } while (!acertou);
        if(acertou = true){
            System.out.println("\n\nA tarefa 1 funcionou!!\n\n");
        }else{
            System.out.println("\n\nA tarefa 1 deu erro!\n\n");
        }

        return pontos;
    }

    public static int potencia2() {
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int tentativas = 0;
        int pontos=0;
        int teste;
        
        Random aleatorio = new Random();

        List alternativas = new ArrayList();
        alternativas.add("x^6");// correta
        alternativas.add("x^4");
        alternativas.add("x^2");
        alternativas.add("x^10");

        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            System.out.println("Qual o valor da expressão x^8/x^2");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));

            System.out.print("Escolha uma alternativa: ");
            teste = aleatorio.nextInt(4) + 1;
            String resposta = "";
            switch (teste) {
                case 1:
                    resposta = "a";
                    break;
                case 2:
                    resposta = "b";
                    break;
                case 3:
                    resposta = "c";
                    break;
                case 4:
                    resposta = "d";
                    break;

                default:
                    break;
            }


            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("x^6")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("x^6")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("x^6")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("x^6")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!");

            }

        } while (!acertou);
        if(acertou == true){
            System.out.println("\n\nA tarefa 2 funcionou!!\n\n");
        }else{
            System.out.println("\n\nA tarefa 2 deu erro!\n\n");
        }
        return pontos;
    }

    public static int treino2() {
        Scanner entrada = new Scanner(System.in);

        boolean acertou = false;
        int tentativas = 0;
        int pontos = 0;
        int pontosTreino;
        int teste;
        
        Random aleatorio = new Random();

        List alternativas = new ArrayList();
        alternativas.add("2");
        alternativas.add("1");// correta
        alternativas.add("3");
        alternativas.add("4");

        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            System.out.println("Qual o valor da incógnita x que torna a igualdade 8x - 3 = 5 verdadeira?");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));

            System.out.print("Escolha uma alternativa: ");
            teste = aleatorio.nextInt(4) + 1;
            String resposta = "";
            switch (teste) {
                case 1:
                    resposta = "a";
                    break;
                case 2:
                    resposta = "b";
                    break;
                case 3:
                    resposta = "c";
                    break;
                case 4:
                    resposta = "d";
                    break;

                default:
                    break;
            }


            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("1")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("1")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("1")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("1")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!");

            }

        } while (!acertou);
        if (tentativas <= 1) {
            pontosTreino = 100;
            System.out.println("Boa guereirro você acertou de primeira, você ganhou " + pontosTreino + "!");
        } else if (tentativas > 1 && tentativas <= 3) {
            pontosTreino = 50;
        } else {
            pontosTreino = 20;
        }

        pontos += pontosTreino;

        int tentativas2 = 0;
        int pontosTreino2 = 0;
        boolean acertou2 = false;

        List alternativas2 = new ArrayList();
        alternativas2.add("x = 10/4 e x = 2");
        alternativas2.add("x = 5/2 e x = - 1");// correta
        alternativas2.add("x = 20 e x = 4");
        alternativas2.add("x = 15/3 e x = 1");

        do {
            tentativas2 = tentativas2 + 1;
            Collections.shuffle(alternativas2);
            System.out.println("Determine as raízes da equação 2x² - 3x - 5 = 0");
            System.out.println("a) " + alternativas2.get(0));
            System.out.println("b) " + alternativas2.get(1));
            System.out.println("c) " + alternativas2.get(2));
            System.out.println("d) " + alternativas2.get(3));

            System.out.print("Escolha uma alternativa: ");
            teste = aleatorio.nextInt(4) + 1;
            String resposta = "";
            switch (teste) {
                case 1:
                    resposta = "a";
                    break;
                case 2:
                    resposta = "b";
                    break;
                case 3:
                    resposta = "c";
                    break;
                case 4:
                    resposta = "d";
                    break;

                default:
                    break;
            }

            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas2.get(0).equals("x = 5/2 e x = - 1")) {
                        System.out.println("Resposta correta!");
                        acertou2 = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas2.get(1).equals("x = 5/2 e x = - 1")) {
                        System.out.println("Resposta correta!");
                        acertou2 = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas2.get(2).equals("x = 5/2 e x = - 1")) {
                        System.out.println("Resposta correta!");
                        acertou2 = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas2.get(3).equals("x = 5/2 e x = - 1")) {
                        System.out.println("Resposta correta!");
                        acertou2 = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!");

            }

        } while (!acertou2);
        if (tentativas2 <= 1) {
            pontosTreino2 = 100;
            System.out.println("Boa guereirro você acertou de primeira, você ganhou " + pontosTreino2 + "!");
        } else if (tentativas2 > 1 && tentativas2 <= 3) {
            pontosTreino2 = 50;
        } else {
            pontosTreino2 = 20;
        }

        pontos += pontosTreino2;
        System.out.println("Parabéns, você concluiu o treino!!");

        if(acertou == true && acertou2 == true){
            System.out.println("\n\no treino 2 funcionou!!\n\n");
        }else{
            System.out.println("\n\nO treino 2 deu erro!\n\n");
        }
        return pontos;

    }

    public static int equacao1grau() {
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int tentativas = 0;
        int pontos=0;
        int teste;
        
        Random aleatorio = new Random();

        List alternativas = new ArrayList();
        alternativas.add("2");
        alternativas.add("6");// correta
        alternativas.add("3");
        alternativas.add("5");

        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            System.out.println("Qual o valor de x: 3x+4=5x-8");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));

            System.out.print("Escolha uma alternativa: ");
            teste = aleatorio.nextInt(4) + 1;
            String resposta = "";
            switch (teste) {
                case 1:
                    resposta = "a";
                    break;
                case 2:
                    resposta = "b";
                    break;
                case 3:
                    resposta = "c";
                    break;
                case 4:
                    resposta = "d";
                    break;

                default:
                    break;
            }


            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("6")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("6")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("6")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("6")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!");

            }

        } while (!acertou);
        if(acertou == true){
            System.out.println("\n\nA tarefa 3 funcionou!!\n\n");
        }else{
            System.out.println("\n\nA tarefa 3 deu erro!\n\n");
        }
        return pontos;
    }

    public static int equacao2grau() {
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int tentativas = 0;
        int pontos=0;
        int teste;
        
        Random aleatorio = new Random();

        List alternativas = new ArrayList();
        alternativas.add("-5");
        alternativas.add("-4");// correta
        alternativas.add("0");
        alternativas.add("-1");

        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            System.out.println("A soma das soluções da equação x² + 4x - 5 = 0 é igual a:");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));

            System.out.print("Escolha uma alternativa: ");
            teste = aleatorio.nextInt(4) + 1;
            String resposta = "";
            switch (teste) {
                case 1:
                    resposta = "a";
                    break;
                case 2:
                    resposta = "b";
                    break;
                case 3:
                    resposta = "c";
                    break;
                case 4:
                    resposta = "d";
                    break;

                default:
                    break;
            }


            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("-4")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("-4")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("-4")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("-4")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!");

            }

        } while (!acertou);
        if(acertou == true){
            System.out.println("\n\nA tarefa 4 funcionou!!\n\n");
        }else{
            System.out.println("\n\nA tarefa 4 deu erro!\n\n");
        }
        return pontos;
    }

    public static int treino3() {
        Scanner entrada = new Scanner(System.in);

        boolean acertou = false;
        int tentativas = 0;
        int pontos = 0;
        int teste;
        
        Random aleatorio = new Random();

        List alternativas = new ArrayList();
        alternativas.add("-3y² + 16y - 6");
        alternativas.add("-2y² + 16y - 6");// correta
        alternativas.add("-2y² + 10y + 6");
        alternativas.add("-2y² + 12y - 4");

        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            System.out.println("Resolva: (y² + 4y - 5) + (-3y² + 12y - 1):");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));

            System.out.print("Escolha uma alternativa: ");
            teste = aleatorio.nextInt(4) + 1;
            String resposta = "";
            switch (teste) {
                case 1:
                    resposta = "a";
                    break;
                case 2:
                    resposta = "b";
                    break;
                case 3:
                    resposta = "c";
                    break;
                case 4:
                    resposta = "d";
                    break;

                default:
                    break;
            }

            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("-2y² + 16y - 6")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("-2y² + 16y - 6")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("-2y² + 16y - 6")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("-2y² + 16y - 6")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!");

            }

        } while (!acertou);
        if (tentativas <= 1) {
            pontos = 100;
        } else if (tentativas > 1 && tentativas <= 3) {
            pontos = 50;
        } else {
            pontos = 20;
        }
        System.out.println("Parabéns, você concluiu o treino!!");

        if(acertou == true){
            System.out.println("\n\nO treino 3 funcionou!!\n\n");
        }else{
            System.out.println("\n\nO treino 3 deu erro!\n\n");
        }
        return pontos;
    }

    public static int polinomios1() {
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int tentativas = 0;
        int pontos=0;
        int teste;
        
        Random aleatorio = new Random();

        List alternativas = new ArrayList();
        alternativas.add("5");
        alternativas.add("4");// correta
        alternativas.add("3");
        alternativas.add("2");

        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            System.out.println(
                    "Dados os polinômios p(x) = 2x³ + 3x² + 1 e q(x) = 3x² + 5x - 15, a soma p(-2) + q(2) é igual a:");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));

            System.out.print("Escolha uma alternativa: ");
            teste = aleatorio.nextInt(4) + 1;
            String resposta = "";
            switch (teste) {
                case 1:
                    resposta = "a";
                    break;
                case 2:
                    resposta = "b";
                    break;
                case 3:
                    resposta = "c";
                    break;
                case 4:
                    resposta = "d";
                    break;

                default:
                    break;
            }

            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("4")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("4")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("4")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("4")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!");

            }

        } while (!acertou);
        if (tentativas <= 1) {
            pontos = 100;
        } else if (tentativas > 1 && tentativas <= 3) {
            pontos = 50;
        } else {
            pontos = 20;
        }

        if(acertou == true){
            System.out.println("\n\nA tarefa 5 funcionou!!\n\n");
        }else{
            System.out.println("\n\nA tarefa 5 deu erro!\n\n");
        }

        return pontos;
    }

    public static int polinomios2() {
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int tentativas = 0;
        int pontos;
        int teste;
        int resultado =0;
        
        Random aleatorio = new Random();

        List alternativas = new ArrayList();
        alternativas.add("6x³ + 4x² - 3x + 1");
        alternativas.add("6x³ + 12x² - 9x + 3");// correta
        alternativas.add("2x² + 8x² - 5x + 3");
        alternativas.add("12x³ + 3x² - 3x + 1");

        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            System.out.println("O triplo do polinômio 2x³ + 4x² -3x + 1 é:");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));

            System.out.print("Escolha uma alternativa: ");
            teste = aleatorio.nextInt(4) + 1;
            String resposta = "";
            switch (teste) {
                case 1:
                    resposta = "a";
                    break;
                case 2:
                    resposta = "b";
                    break;
                case 3:
                    resposta = "c";
                    break;
                case 4:
                    resposta = "d";
                    break;

                default:
                    break;
            }

            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("6x³ + 12x² - 9x + 3")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("6x³ + 12x² - 9x + 3")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("6x³ + 12x² - 9x + 3")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("6x³ + 12x² - 9x + 3")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!");

            }

        } while (!acertou);
        if (tentativas <= 1) {
            pontos = 100;
        } else if (tentativas > 1 && tentativas <= 3) {
            pontos = 50;
        } else {
            pontos = 20;
        }

        if(acertou == true){
            resultado = 1;
            System.out.println("\n\nA tarefa 6 funcionou!!\n\n");
        }else{
            System.out.println("\n\nA tarefa 6 deu erro!\n\n");
        }
        return resultado;
        
    }

    public static void jogo() {
        int pontos = 100;
        int ex1 = polinomios2();
        pontos = ex1 + pontos;
        System.out.println(ex1);
        System.out.println(pontos);
    }

    public static void main(String[] args) {
        treino1();
        potencia1();
        potencia2();
        treino2();
        equacao1grau();
        equacao2grau();
        treino3();
        polinomios1();
        polinomios2();
    }
}
