package jogorpg;


import java.util.*;
import java.util.concurrent.TimeUnit;


public class PIJogoRPG {


    //ajuste a velocidade dos caracteres impressos
    static int temp_dialog = 60,  temp_narrativa = 20;
    
    //Função para as mensagens serem digitadas devagar
    public static void Escreva(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);
        }
    }

    //Menu completo do jogo
    static void menu() throws Exception {
        Scanner entrada = new Scanner(System.in);
        int escolha_opcao;
        int pontos = 0;

        //Um loop para o jogo continuar rodando até que a pessoa aperte para sair
        do {
            Escreva("\n++========================++", TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\n....: Math Adventure :.... \n1 - Jogar\n2 - Instruções\n3 - Créditos\n4 - Sair\n", TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("++========================++\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha_opcao = entrada.nextInt();

            if (escolha_opcao == 1) {
                jogo();
                pontos += capitulo1();
                pontos += capitulo2();
                pontos += capitulo3();
                Escreva("Viajante: Me diga seu nome jogador!\n", TimeUnit.MILLISECONDS, temp_narrativa);
                String nomeJogador = entrada.next();
                Escreva("Parabéns " + nomeJogador + " sua pontuação foi: " + pontos, TimeUnit.MILLISECONDS, temp_narrativa);
                

            } else if (escolha_opcao == 2) {
                instrucoes();

            } else if (escolha_opcao == 3) {
                creditos();

            } else if (escolha_opcao == 4) {
                Escreva("Viajante: Não seja fraco, volte e conquiste o mundo!\n", TimeUnit.MILLISECONDS, temp_dialog);

            } else {
                Escreva("hm... essa opção não conheço, mas escolha alguma correspondente:\n", TimeUnit.MILLISECONDS, temp_narrativa);
            }

        } while (escolha_opcao != 4);

        
    }

    //Perguntas do jogo
    //treino sobre potenciação (easter egg)
    public static int treino1() throws Exception{
        Scanner entrada = new Scanner(System.in);
        Escreva("Boa Ace, agora você vai aprender um pouco sobre potenciação para conseguir a sua primeira jóia!\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

        Escreva("A potenciação é uma operação matemática. Utilizamos a potenciação para indicar multiplicações consecutivas de um mesmo fator. Por exemplo,\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("3^5 representa 5 multiplicações do número 3, o que resulta em 243. Dizemos que 3 é a base, 5 é o expoente e 243 é a potência.\n", TimeUnit.MILLISECONDS, temp_narrativa);

        Escreva("Principais propriedades da potenciação:\nx^m . x^n = x^m+n\nx^m / x^n = x^m-n\n(x^m)^n = x^m.n\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

        Escreva("Agora teste o seu conhecimento com um exemplo:\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

        boolean acertou = false;
        int tentativas = 0;
        int pontos;

        List alternativas = new ArrayList();
        alternativas.add("77435");
        alternativas.add("78125");//correta
        alternativas.add("15625");
        alternativas.add("390625");


        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            Escreva("Qual o resultado de 5^3 . 5^4?\n",TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\na) " + alternativas.get(0),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nb) " + alternativas.get(1),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nc) " + alternativas.get(2),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nd) " + alternativas.get(3),TimeUnit.MILLISECONDS, temp_narrativa);

            Escreva("\n\nEscolha uma alternativa: \n", TimeUnit.MILLISECONDS, temp_narrativa);
            String resposta = entrada.next();


            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("78125")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("78125")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("78125")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("78125")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                default:
                    Escreva("Escolha inválida!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);


            }

        } while (!acertou);
        if (tentativas <= 1) {
            pontos = 100;
            Escreva("Você ganhou \n" + pontos + " pontos!\n",TimeUnit.MILLISECONDS, temp_narrativa);
        } else if (tentativas > 1 && tentativas <= 3) {
            pontos = 50;
        } else {
            pontos = 20;
        }
        Escreva("Parabéns, você concluiu o treino!!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);

        return pontos;

    }

    //Primeiro desafio sobre potência
    public static int potencia1() throws Exception {
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int tentativas = 0;
        int pontos;

        List alternativas = new ArrayList();
        alternativas.add("156.250");
        alternativas.add("390.625");//correta
        alternativas.add("234.375");
        alternativas.add("312.500");


        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            Escreva("***ACERTE A QUESTÃO PARA EFETUAR O ATAQUE***\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("Sabendo que o valor de 5^7 é 78.125, qual o resultado de 5^8?\n",TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\na) " + alternativas.get(0),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nb) " + alternativas.get(1),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nc) " + alternativas.get(2),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nd) " + alternativas.get(3),TimeUnit.MILLISECONDS, temp_narrativa);

            Escreva("\n\nEscolha uma alternativa: \n",TimeUnit.MILLISECONDS, temp_narrativa);
            String resposta = entrada.next();


            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("390.625")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("390.625")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("390.625")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("390.625")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                default:
                    Escreva("Escolha inválida!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);


            }

        } while (!acertou);
        if (tentativas <= 1) {
            pontos = 100;
            Escreva("Você ganhou " + pontos + " pontos!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
        } else if (tentativas > 1 && tentativas <= 3) {
            pontos = 50;
        } else {
            pontos = 20;
        }


        return pontos;
    }

    //Segundo desafio sobre potência
    public static int potencia2() throws Exception {
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int tentativas = 0;
        int pontos;

        List alternativas = new ArrayList();
        alternativas.add("x^6");//correta
        alternativas.add("x^4");
        alternativas.add("x^2");
        alternativas.add("x^10");


        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            Escreva("***ACERTE A QUESTÃO PARA EFETUAR O ATAQUE***\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("Qual o valor da expressão x^8/x^2?\n",TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\na) " + alternativas.get(0),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nb) " + alternativas.get(1),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nc) " + alternativas.get(2),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nd) " + alternativas.get(3),TimeUnit.MILLISECONDS, temp_narrativa);

            System.out.print("\n\nEscolha uma alternativa: \n");
            String resposta = entrada.next();


            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("x^6")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("x^6")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("x^6")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("x^6")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                default:
                    Escreva("Escolha inválida!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);


            }

        } while (!acertou);
        if (tentativas <= 1) {
            pontos = 100;
            Escreva("Você ganhou " + pontos + " pontos!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
        } else if (tentativas > 1 && tentativas <= 3) {
            pontos = 50;
        } else {
            pontos = 20;
        }
        return pontos;
    }

    //treino sobre equações de 1 e 2 grau (easter egg)
    public static int treino2() throws Exception{
        Scanner entrada = new Scanner(System.in);
        Escreva("Equações de 1 grau: \n",TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("As equações de primeiro grau são sentenças matemáticas que estabelecem relações de igualdade entre termos conhecidos e desconhecidos.\n\nRepresentadas sob a forma: ax+b = 0\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("O objetivo de resolver uma equação de primeiro grau é descobrir o valor desconhecido, ou seja,\nencontrar o valor da incógnita que torna a igualdade verdadeira.\nPara isso, deve-se isolar os elementos desconhecidos em um dos lados do sinal de igual e os valores constantes do outro lado.\nContudo, é importante observar que a mudança de posição desses elementos deve ser feita de forma que a igualdade continue sendo verdadeira.\nQuando um termo da equação mudar de lado do sinal de igual, devemos inverter a operação. \nAssim, se tiver multiplicando, passará dividindo, se tiver somando passará subtraindo e vice-versa.\n",TimeUnit.MILLISECONDS, temp_narrativa);

        Escreva("\nAgora teste o seu conhecimento com um exemplo:\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

        boolean acertou = false;
        int tentativas = 0;
        int pontos = 0;
        int pontosTreino;

        List alternativas = new ArrayList();
        alternativas.add("2");
        alternativas.add("1");//correta
        alternativas.add("3");
        alternativas.add("4");


        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            Escreva("Qual o valor da incógnita x que torna a igualdade 8x - 3 = 5 verdadeira?\n",TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\na) " + alternativas.get(0),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nb) " + alternativas.get(1),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nc) " + alternativas.get(2),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nd) " + alternativas.get(3),TimeUnit.MILLISECONDS, temp_narrativa);

            System.out.print("\n\nEscolha uma alternativa: \n");
            String resposta = entrada.next();


            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("1")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("1")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("1")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("1")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                default:
                    Escreva("Escolha inválida!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);


            }

        } while (!acertou);
        if (tentativas <= 1) {
            pontosTreino = 100;
            Escreva("Você ganhou " + pontosTreino + " pontos!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
        } else if (tentativas > 1 && tentativas <= 3) {
            pontosTreino = 50;
        } else {
            pontosTreino = 20;
        }


        pontos += pontosTreino;

        System.out.println();
        Escreva("Equações de 2 grau: \n",TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("A equação do segundo grau recebe esse nome porque é uma equação polinomial cujo termo de maior grau está elevado ao quadrado.\nTambém chamada de equação quadrática, é representada por:\r\n" + //
                "\r\n" + //
                "ax² + bx + c = 0\r\n" + //
                "\r\n" + //
                "Numa equação do 2º grau, o x é a incógnita e representa um valor desconhecido. Já as letras a, b e c são chamadas coeficientes da equação.\n",TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Resolver uma equação de segundo grau, significa determinar os valores reais de x, que tornam a equação verdadeira. Esses valores são denominados raízes da equação.\n",TimeUnit.MILLISECONDS, temp_narrativa);

        Escreva("\nAgora teste o seu conhecimento com um exemplo:\n\n",TimeUnit.MILLISECONDS, temp_narrativa);

        int tentativas2 = 0;
        int pontosTreino2 = 0;
        boolean acertou2= false;

        List alternativas2 = new ArrayList();
        alternativas2.add("x = 10/4 e x = 2");
        alternativas2.add("x = 5/2 e x = - 1");//correta
        alternativas2.add("x = 20 e x = 4");
        alternativas2.add("x = 15/3 e x = 1");


        do {
            tentativas2 = tentativas2 + 1;
            Collections.shuffle(alternativas2);
            Escreva("Determine as raízes da equação 2x² - 3x - 5 = 0\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\na) " + alternativas2.get(0),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nb) " + alternativas2.get(1),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nc) " + alternativas2.get(2),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nd) " + alternativas2.get(3),TimeUnit.MILLISECONDS, temp_narrativa);

            System.out.print("\n\nEscolha uma alternativa: \n");
            String resposta = entrada.next();


            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas2.get(0).equals("x = 5/2 e x = - 1")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou2 = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas2.get(1).equals("x = 5/2 e x = - 1")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou2 = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas2.get(2).equals("x = 5/2 e x = - 1")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou2 = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas2.get(3).equals("x = 5/2 e x = - 1")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou2 = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                default:
                    Escreva("Escolha inválida!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);


            }

        } while (!acertou2);
        if (tentativas2 <= 1) {
            pontosTreino2 = 100;
            Escreva("Você ganhou " + pontosTreino2 + " pontos!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
        } else if (tentativas2 > 1 && tentativas2 <= 3) {
            pontosTreino2 = 50;
        } else {
            pontosTreino2 = 20;
        }


        pontos += pontosTreino2;
        Escreva("Parabéns, você concluiu o treino!!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
        return pontos;

    }

    //Desafio sobre equação de 1 grau
    public static int equacao1grau() throws Exception {
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int tentativas = 0;
        int pontos;

        List alternativas = new ArrayList();
        alternativas.add("2");
        alternativas.add("6");//correta
        alternativas.add("3");
        alternativas.add("5");


        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            Escreva("***ACERTE A QUESTÃO PARA EFETUAR O ATAQUE***\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("Qual o valor de x: 3x+4=5x-8?\n",TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\na) " + alternativas.get(0),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nb) " + alternativas.get(1),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nc) " + alternativas.get(2),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nd) " + alternativas.get(3),TimeUnit.MILLISECONDS, temp_narrativa);

            Escreva("\n\nEscolha uma alternativa: \n",TimeUnit.MILLISECONDS, temp_narrativa);
            String resposta = entrada.next();


            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("6")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("6\n")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("6")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("6")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                default:
                    Escreva("Escolha inválida!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);


            }

        } while (!acertou);
        if (tentativas <= 1) {
            pontos = 100;
        } else if (tentativas > 1 && tentativas <= 3) {
            pontos = 50;
        } else {
            pontos = 20;
        }
        return pontos;
    }

    //Desafio sobre equação de 2 grau
    public static int equacao2grau() throws Exception {
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int tentativas = 0;
        int pontos;

        List alternativas = new ArrayList();
        alternativas.add("-5");
        alternativas.add("-4");//correta
        alternativas.add("0");
        alternativas.add("-1");


        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            Escreva("***ACERTE A QUESTÃO PARA EFETUAR O ATAQUE***\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("A soma das soluções da equação x² + 4x - 5 = 0 é igual a:\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\na) " + alternativas.get(0),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nb) " + alternativas.get(1),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nc) " + alternativas.get(2),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nd) " + alternativas.get(3),TimeUnit.MILLISECONDS, temp_narrativa);

            System.out.print("\n\nEscolha uma alternativa: \n");
            String resposta = entrada.next();


            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("-4")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("-4")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("-4")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("-4")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                default:
                    Escreva("Escolha inválida!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);


            }

        } while (!acertou);
        if (tentativas <= 1) {
            pontos = 100;
        } else if (tentativas > 1 && tentativas <= 3) {
            pontos = 50;
        } else {
            pontos = 20;
        }
        return pontos;
    }

    //treino sobre Polinômios (easter egg)
    public static int treino3()throws Exception{
        Scanner entrada = new Scanner(System.in);
        Escreva("***ACERTE A QUESTÃO PARA EFETUAR O ATAQUE***\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Polinômios: ",TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Um polinômio é uma expressão matemática formada por uma soma de termos, onde cada termo é composto por um número (chamado coeficiente) multiplicado por uma variável (geralmente x) elevada a uma potência não negativa (um número inteiro).\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Exemplo: \n(2x² + 3x + 1) + (x² - 2x + 4) = 3x² + x + 5\n\n",TimeUnit.MILLISECONDS, temp_narrativa);


        Escreva("Agora teste o seu conhecimento com um exemplo:\n\n", TimeUnit.MILLISECONDS, temp_narrativa);


        boolean acertou = false;
        int tentativas = 0;
        int pontos;

        List alternativas = new ArrayList();
        alternativas.add("-3y² + 16y - 6");
        alternativas.add("-2y² + 16y - 6");//correta
        alternativas.add("-2y² + 10y + 6");
        alternativas.add("-2y² + 12y - 4");


        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            Escreva("Resolva: (y² + 4y - 5) + (-3y² + 12y - 1):\n",TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\na) " + alternativas.get(0),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nb) " + alternativas.get(1),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nc) " + alternativas.get(2),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nd) " + alternativas.get(3),TimeUnit.MILLISECONDS, temp_narrativa);

            System.out.print("\n\nEscolha uma alternativa: \n");
            String resposta = entrada.next();


            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("-2y² + 16y - 6")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("-2y² + 16y - 6")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("-2y² + 16y - 6")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("-2y² + 16y - 6")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                default:
                    Escreva("Escolha inválida!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);


            }

        } while (!acertou);
        if (tentativas <= 1) {
            pontos = 100;
        } else if (tentativas > 1 && tentativas <= 3) {
            pontos = 50;
        } else {
            pontos = 20;
        }
        return pontos;
    }

    //Primeiro desafio sobre polinômios
    public static int polinomios1() throws Exception{
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int tentativas = 0;
        int pontos;

        List alternativas = new ArrayList();
        alternativas.add("5");
        alternativas.add("4");//correta
        alternativas.add("3");
        alternativas.add("2");


        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            Escreva("***ACERTE A QUESTÃO PARA EFETUAR O ATAQUE***\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("Dados os polinômios p(x) = 2x³ + 3x² + 1 e q(x) = 3x² + 5x - 15, a soma p(-2) + q(2) é igual a:\n",TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\na) " + alternativas.get(0),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nb) " + alternativas.get(1),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nc) " + alternativas.get(2),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nd) " + alternativas.get(3),TimeUnit.MILLISECONDS, temp_narrativa);

            System.out.print("\n\nEscolha uma alternativa: \n");
            String resposta = entrada.next();


            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("4")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("4")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("4")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("4")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                default:
                    Escreva("Escolha inválida!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);


            }

        } while (!acertou);
        if (tentativas <= 1) {
            pontos = 100;
        } else if (tentativas > 1 && tentativas <= 3) {
            pontos = 50;
        } else {
            pontos = 20;
        }
        return pontos;
    }

    //Primeiro desafio sobre polinômios
    public static int polinomios2() throws Exception {
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int tentativas = 0;
        int pontos;

        List alternativas = new ArrayList();
        alternativas.add("6x³ + 4x² - 3x + 1");
        alternativas.add("6x³ + 12x² - 9x + 3");//correta
        alternativas.add("2x² + 8x² - 5x + 3");
        alternativas.add("12x³ + 3x² - 3x + 1");


        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            Escreva("***ACERTE A QUESTÃO PARA EFETUAR O ATAQUE***\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("O triplo do polinômio 2x³ + 4x² -3x + 1 é:\n",TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\na) " + alternativas.get(0),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nb) " + alternativas.get(1),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nc) " + alternativas.get(2),TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\nd) " + alternativas.get(3),TimeUnit.MILLISECONDS, temp_narrativa);

            System.out.print("\n\nEscolha uma alternativa: \n");
            String resposta = entrada.next();


            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("6x³ + 12x² - 9x + 3")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("6x³ + 12x² - 9x + 3")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("6x³ + 12x² - 9x + 3")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("6x³ + 12x² - 9x + 3")) {
                        Escreva("Resposta correta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                        acertou = true;
                    } else {
                        Escreva("Resposta incorreta!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    break;
                default:
                    Escreva("Escolha inválida!\n\n",TimeUnit.MILLISECONDS, temp_narrativa);


            }

        } while (!acertou);
        if (tentativas <= 1) {
            pontos = 100;
        } else if (tentativas > 1 && tentativas <= 3) {
            pontos = 50;
        } else {
            pontos = 20;
        }
        return pontos;
    }


    // Início da história do jogo.
    static void jogo() throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println();
        Escreva("Viajante: Espera... Quem é você? Não, vou tentar adivinhar...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Devo chamá-lo de Ace? hmmm... Jovem Ace, um ótimo nome para um guerreiro como você!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Mas não se deixe enganar só pelo elogio... os desafios serão grandes! você irá precisar de coragem!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Não fique com medo, um guerreiro não desiste fácil!\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolha_opcao;
        //Decisão de certeza do jogador
        do {
            Escreva("\nSe sente preparado?\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("1 - Medo? Eu? Jamais!\n2 - Não estou confiante, desisto!\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha_opcao = entrada.nextInt();

            switch (escolha_opcao) {
                case 1:
                    Escreva("Viajante: Hahaha, jovem e destemido, não esperava menos de um grande guerreiro!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                case 2:
                    Escreva("Viajante: Atitude de um derrotado!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    menu();
                    break;
                default:
                    Escreva("Não conheço essa opção... Escolha outra!\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    break;
            }
        } while (escolha_opcao != 1 && escolha_opcao != 2);

        int escolha;
        //Contador de palmadas
        int contador = 1;

        Escreva("Viajante: VAI PRECISAR DE SORTE NESSA JORNADA!!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Ei Ace, acorde seu preguiçoso!!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: argh... Deixe eu continuar descansando pai...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: ACEEEEEE, por que você é tão preguiçoso???\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Na sua idade eu já desbravava o mundo!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);

        do {
            Escreva("Você vai querer levantar?\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("1- Sim\n2- Não\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    Escreva("Ace: argh... que saco, eu vou me levantar!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;

                case 2:
                    Escreva("Mãe: ACEEEEEE, EU VOU TE BATEEEEEEEEER!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Após Ace levar umas palmadas, ele entendeu que precisava se levantar...\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    Escreva("Ace apanhou " + contador++ + " vez (s).\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    //Caso atinja 3 ou mais palmadas
                    if (contador >= 3) {
                        Escreva("Ace: Paraaa...! irei levantar... argh!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    }
            }
        } while (escolha != 1);

        Escreva("Ace levanta como qualquer dia normal...\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("\nPai: Ace, venha ajudar seu velho na forja! Eu estou velho.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: E também quero te contar uma história passada de gerações...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolha2;
        int escolha_forja;

        do {
            Escreva("Você vai querer ouvir a história do seu velho??\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

            Escreva("1- Mas é claro! Jamais negaria!\n2- Não parece ser muito atraente...\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha2 = entrada.nextInt();

            switch (escolha2) {
                case 1:
                    Escreva("Ace: Estou indo pai, no mínimo essa história tem que ser interessante... :p\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;

                case 2:
                    Escreva("Ace: Estou cansado e não estou muito interessado nessa história...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Pai: Cansado? Não faz nada e esta cansado...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Pai: Você já viu alguém trabalhando com forja antes?\n\n", TimeUnit.MILLISECONDS, temp_dialog);

                    Escreva("1 - Claro! Você mexe com isso todo dia!\n2 - Não, parece sem graça...\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    escolha_forja = entrada.nextInt();

                    if (escolha_forja == 1) {
                        Escreva("Pai: Todo conhecimento é válido! Então deixa eu te ensinar mais um pouco...\n", TimeUnit.MILLISECONDS, temp_dialog);

                    } else if (escolha_forja == 2) {
                        Escreva("Pai: Sem graça? venha comigo! Sem graça é ficar procrastinando!!\n", TimeUnit.MILLISECONDS, temp_dialog);

                    } else {
                        Escreva("Não conheço essa opção... Escolha outra!\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    }
            }
        } while (escolha2 != 1);

        Escreva("Pai: Seu avô me contava uma história mitologica quando eu era pequeno...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Há muito tempo, em um reino distante, existiam três jóias mágicas de fortalecimento\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Diziam as lendas que essas pedras eram presentes dos deuses, concedidas aos mortais como uma prova de sua " +
                "confiança e habilidade para moldar o destino.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Cada pedra fica protegida por um ancião, e para conquista-lá, é necessário derrotá-lo...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Eu tinha medo e por isso nunca quis procurar saber mais dessa história...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Venha, vou te ensinar a forjar uma espada!\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolha_historia;

        do {
            Escreva("\n1 - Mas é só isso a história? me conta mais sobre os detalhes!\n2 - Essa história parece mentira..\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha_historia = entrada.nextInt();

            switch (escolha_historia) {
                case 1:
                    Escreva("Pai: As pedras possuem cores, cada cor representa um nível de dificuldade...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Pai: É impossível derrotar os anciões sem o devido conhecimento sobre eles...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                case 2:
                    Escreva("Pai: Hahaha, Ace, Ace, até a mais maluca das histórias podem se tornar verdade, se você acreditar nela\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Pai: E quem sabe... Você pode ser o primeiro à torna-lá real, vou te convencer !\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace: Eu quero ver você tentar... \n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
            }
        } while (escolha_historia != 1 && escolha_historia != 2);

        Escreva("Pai: Como eu já havia dito, existem três jóias perdidas, cada uma delas se encontram em lugares distintos do reino de Math Adventure...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Há um ancião guardião protegendo-as de malfeitores nos locais...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: A primeira jóia, regida por um fulgor azul, representa a sabedoria. Quem a possuísse adquirirá uma vasta sabedoria sobre o mundo.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Mas ela é guardada por um ancião chamado Ragnar, cuja sabedoria está além dos limites humanos.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolha_opcao2;

        do {
            Escreva("Acha que consegue encarar?\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("1- Claro, mas...\n2- Não...\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha_opcao2 = entrada.nextInt();

            if (escolha_opcao2 == 1) {
                Escreva("Ace: Se a sabedoria dele está além dos limites humanos, como conseguiremos derrotar-lo?\n\n", TimeUnit.MILLISECONDS, temp_dialog);

            } else if (escolha_opcao2 == 2) {
                Escreva("Ace: Eu estou realmente assustado que possa existir algo assim!\n\n", TimeUnit.MILLISECONDS, temp_dialog);

            } else {
                Escreva("\nNão conheço essa opção... Escolha outra!\n", TimeUnit.MILLISECONDS, temp_narrativa);
            }

        } while (escolha_opcao2 != 1 && escolha_opcao2 != 2);

        Escreva("Pai: São questões que só enfrentando-o para conseguir tais respostas.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Isso é só o começo de uma jornada complicada e desafiadora!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Eu quero que você venha me ajudar a confeccionar a sua espada! Presente para você.\n\n", TimeUnit.MILLISECONDS, temp_dialog);

        Escreva("SUA ESPADA SERÁ UMA ALEATÓRIA:\n", TimeUnit.MILLISECONDS, temp_narrativa);

        // Vetor para exibir as opções de espadas e obter a escolha aleatória
        String[] espadas = {"Espada longa de aço", "Espada curta de ferro", "Katana Samurai", "Espada medieval"};
        //Para fazer ficar aleatório
        Random rand = new Random();

        int indiceEspadaForjada = rand.nextInt(espadas.length);
        String espadaForjada = espadas[indiceEspadaForjada];

        // Retorna a espada escolhida com base no índice
        Escreva("RECEBA A: " + espadaForjada+".", TimeUnit.MILLISECONDS, temp_narrativa);

        int escolha_3;
        do {
            Escreva("\n\nPai: Pois bem! Após a criação de sua espada quero que você vá atrás das jóias pela honra de nossa família!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("1 - Mas parece muito perigoso...\n2 - Já nasci pronto!\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha_3 = entrada.nextInt();

            switch (escolha_3) {
                case 1:
                    Escreva("Ace: Eu sou muito novo para enfrentar esse tipo de desafio! argh\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Pai: Na vida precisamos enfrentar desafios para um bem maior...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Pai: Esta jornada fará você ficar mais sábio, corajoso e forte...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Pai: Você irá me dar muito orgulho indo ...\n\n", TimeUnit.MILLISECONDS, temp_dialog);

                case 2:
                    Escreva("Ace: Mas como vou ter as instruções certas?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
            }
        } while (escolha_3 != 1 && escolha_3 != 2);

        Escreva("Pai: O VIAJANTE (pássaro) é quem pode te instruir em tudo o que precisa, deixarei você nas mãos dele...!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Sabendo que você quer dar orgulho para o seu pai, siga minhas instruções!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Ao norte de Math adventure, é onde a Jóia da sabedoria está sendo guardada por Ragnar, você precisará tomar muitos cuidados..\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Será necessário muita estratégia e conhecimento para derrota-lo, já que você possui uma espada básica!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Vá em busca da jóia e eu te darei mais instruções...\n\n", TimeUnit.MILLISECONDS, temp_dialog);

    }

    static int capitulo1() throws Exception {
        //Capitulo 1
        Scanner entrada = new Scanner(System.in);
        int pontos = 0;
        //Início da caçada a jóia da sabedoria
        Escreva("++== A JÓIA DA SABEDORIA ==+\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("***ACE VAI EM DIREÇÃO AO NORTE, ATRÁS DA PEDRA DA SABEDORIA***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Ei, viajante... Estou chegando próximo de algo diferente do que eu já havia visto antes!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Me parece um covil, estou na direção certa?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Não se assuste Ace, será necessário entrar dentro deste covil para que possa pegar a jóia.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ACE APÓS ENTRAR NO COVIL, ENCONTRA-SE DE CARA COM RAGNAR TIRANDO UMA SONECA...AAUF***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        int escolha_entrar;

        do {
            Escreva("1 - Pegar a jóia escondido enquanto Ragnar dorme.\n2 - Derrotar Ragnar enquanto dorme.\n", TimeUnit.MILLISECONDS, temp_dialog);
            escolha_entrar = entrada.nextInt();

            if (escolha_entrar == 1) {
                Escreva("Ace: Nunca imaginei estar em um lugar desses, preciso de coragem.\n", TimeUnit.MILLISECONDS, temp_dialog);
                Escreva("Ace: Vou no estilo furtivo, Ragnar não parece fazer acordos...*Risos\n\n", TimeUnit.MILLISECONDS, temp_dialog);
            } else if (escolha_entrar == 2) {
                Escreva("Ace: Enquanto ele dorme é minha melhor oportunidade de derrotá-lo.\n", TimeUnit.MILLISECONDS, temp_dialog);
                Escreva("Ace: Vou no estilo furtivo, Ragnar não parece fazer acordos...rs\n\n", TimeUnit.MILLISECONDS, temp_dialog);
            } else {
                Escreva("hm... essa opção não conheço, mas escolha alguma correspondente:\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
            }
        } while (escolha_entrar != 1 && escolha_entrar != 2);
        Escreva("Viajante: Ace, você precisa ser rápido, pois ele pode acordar a qualquer momento...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ACE FICA MUITO APREENSIVO E ACELERA O PASSO NO ESTILO FURTIVO***\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("***ESTAVA COM TANTO MEDO QUE NÃO OLHOU AO SEU REDOR... TROPEÇOU E CAIU..PUFFFF***\n", TimeUnit.MILLISECONDS, temp_narrativa);
        int escolha_medo;

        do {
            Escreva("***RAGNAR ACORDA FURIOSO COM O EXTREMO BARULHO FEITO POR ACE E VAI EM DIREÇÃO À ELE***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("1 - Correr como se não ouvesse o amanhã.\n2 - Enfrentar Ragnar.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha_medo = entrada.nextInt();

            if (escolha_medo > 0 && escolha_medo <= 2) {
                switch (escolha_medo) {
                    case 1:
                        Escreva("Ace Corre desesperadamente e novamente cai..PUFFF\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                        break;
                    case 2:
                        Escreva(" ", TimeUnit.MILLISECONDS, temp_narrativa);
                        break;
                }
            } else {
                Escreva("hm... essa opção não conheço, mas escolha alguma correspondente:\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
            }
        } while (escolha_medo != 1 && escolha_medo != 2);

        Escreva("Viajante: Você será obrigado a derrotar Ragnar agora!!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Necessário usar o seu pouco conhecimento em matématica para concluir a missão!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Derrote Ragnar agora!!!!!!!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ACERTANDO OS CÁLCULOS DE PRIMEIRA, SUA PONTUAÇÃO SERÁ A MAIS ALTA E O ATAQUE TAMBÉM***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("DESEJA FAZER UM TREINO ANTES?\n\n" , TimeUnit.MILLISECONDS, temp_narrativa);
        int escolhaTreino1;

        do {
            Escreva("1 - Sim.\n2 - Não.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolhaTreino1 = entrada.nextInt();

            switch (escolhaTreino1){
                case 1:
                    treino1();
                    break;
                case 2:
                    Escreva("***ENTÃO VAMOS DIRETO PARA O QUE INTERESSA!***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
            }
        } while (escolhaTreino1 != 1 && escolhaTreino1 != 2);
        pontos += potencia1();

        Escreva("Viajante: Boa Ace!!!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***RAGNAR CAI DESACORDADO***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Viajante??? Será que consegui derrotá-lo de primeira???\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Ele não se mexe, não achei que seria fácil assim...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Agora posso pegar a jóia tranquilamente..UFFSS\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ACE VAI EM DIREÇÃO A JÓIA SEM SE PREOCUPAR***\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("***QUANDO ACE ESTAVA PRÓXIMO, RAGNAR ACORDA E O ATACA, IMPULSIONANDO-O PARA LONGE DA JÓIA***\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("***ACE FICA DESACORDADO POR UM MOMENTO***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Viajante: Ace!!!! Acorda, O Ragnar ainda esta de pé... Muito mais furioso, acerte a próxima questão para finaliza-lo!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ACE SEM FORÇAS SE LEVANTA E TENTA SEU ÚLTIMO ATAQUE***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

        pontos += potencia2();

        Escreva("Viajante: Essa foi por pouco... aparentemente estava fácil...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Creio que os próximos desafios ficarão mais difíceis\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Agora pegue a jóia da sabedoria, levaremos conosco...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Você vai precisar forjar essa jóia em sua espada, para que consiga derrotar o próximo ancião!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolha;
        int contador = 1;

        do {
            Escreva("COMO DESEJA FORJAR SUA ESPADA?\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("1 - Forjar igual seu pai ensinou.\n2 - Forjar de qualquer jeito.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    Escreva("Ace: É... Forjar como meu pai ensinou, é o melhor método!!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace: Muita eficiência na hora de forjar...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("***PROCESSO DE FORJAMENTO CONCLUÍDO COM SUCESSO!!***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    break;

                case 2:
                    Escreva("***PROCESSO DE FORJAMENTO FALHOU!***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    Escreva("Ace: Eu vou tentar novamente, esse método funciona também!! Grrr...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace forjou " + contador++ + " vez (s) e falhou.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    if (contador == 3) {
                        Escreva("***A JÓIA VAI SE DESFAZER SE CONTINUAR FORJANDO NESSE MÉTODO***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    if (contador >= 5)
                        Escreva("***A ESPADA NÃO VAI SERVIR MAIS CASO CONTINUE...***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
            }
        } while (escolha != 1);

        Escreva("Viajante: Essa espada faz parte de você agora, jamais à perca!!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Caso caia nas mãos de pessoas erradas, causará grandes problemas....\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Com essa jóia fincada em sua espada, a sabedoria te perseguirá!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Verdade, me sinto mais sábio e confiante!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Meu pai sentirá orgulho quando eu retornar dessa jornada!\n\n", TimeUnit.MILLISECONDS, temp_dialog);

        return pontos;

    }


    public static int capitulo2() throws Exception {
        Scanner entrada = new Scanner(System.in);
        int pontos = 0;
        int escolha;

        Escreva("++== A JÓIA DA CORAGEM ==+\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Viajante: Recebi uma notícia que seu pai não está muito bem de saúde...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Caso queira dar orgulho para ele através desse feito, precisamos ir para a próxima etapa rápidamente!\n\n", TimeUnit.MILLISECONDS, temp_dialog);

        do {
            Escreva("1 - Como assim?! Ele estava tão bem...\n2 - Quanto tempo de vida ele tem? Vou terminar essa jornada antes!!\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    Escreva("Viajante: Infelizmente seu pai já é um senhor de idade...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Ele esta passando por uns problemas de saúde graves e esta debilitado...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace: Quanto tempo de vida ele tem? Preciso honra-lo!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;

                case 2:
                    Escreva(" ", TimeUnit.MILLISECONDS, temp_narrativa);
                    break;
            }
        } while (escolha != 1 && escolha != 2);

        Escreva("Viajante: Seu pai tem 3 dias de vida apenas...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Só isso?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Sim, infelizmente...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Você vai precisar usar sua sabedoria para enfrentar tudo isso...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Vamos em busca da Jóia da Coragem para encorajá-lo concluir a jornada contra o tempo!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolhaSeguir;

        do {
            Escreva("1 - Agora desânimei de seguir em frente...\n2 - Me conta mais sobre a história dessa jóia...\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolhaSeguir = entrada.nextInt();

            switch (escolhaSeguir) {
                case 1:
                    Escreva("Viajante: Lembra do que seu pai te disse?\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Ele quer ser honrado por você...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Mesmo diante destas circunstâncias que vem ocorrendo...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: É necessário sabedoria para lidar, pois caso você desista, será só mais um derrotado!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Você precisa seguir em frente!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;

                case 2:
                    Escreva(" ", TimeUnit.MILLISECONDS, temp_narrativa);
                    break;
            }
        } while (escolhaSeguir != 2);

        Escreva("Viajante: A jóia da coragem possuí um brilho amarelo e expele uma aura de valentia...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Aquele que a possuir, encontrará coragem infinita.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Capaz de enfrentar os desafios mais temíveis sem recuar.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Protegido por um ancião chamado Orex, que acredita na justiça e no poder do heroísmo!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Grande história... Mas eu não tenho muito tempo...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Me diga para onde devo ir!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Esta jóia esta protegida no leste subterraneo\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Será necessário muito empenho para percorrer este percurso\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Utilizarei da minha sabedoria para chegar lá!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***DIA 1 DE 3***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        int escolhaCaminho;

        do {
            Escreva("DESEJA IR POR QUAL CAMINHO?", TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\n1 - Mais difícil.\n2 - Mais fácil.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolhaCaminho = entrada.nextInt();

            switch (escolhaCaminho) {
                case 1:
                    Escreva("Viajante: Talvez essa não seja a melhor escolha...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace: Por que?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Percorrer pelo caminho mais difícil fará você se desgastar mais,\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Estará muito mais cansado, sem contar que é mais longe...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace: É... Você tem razão! Não tenho tempo para percorrer caminhos mais longos, necessito achar outro jeito!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;

                case 2:
                    Escreva("Ace: Preciso que me guie para encontrar o caminho mais rápido, meu tempo esta contado...\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    break;
            }
        } while (escolhaCaminho != 1 && escolhaCaminho != 2);

        Escreva("Viajante: Conheço uma trilha considera perigosa...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Mas é a alternativa mais rápida e fácil que você vai ter!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Não tenho outra escolha a não ser esta? Af...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ACE LEVOU UM BOM TEMPO PARA CHEGAR PRÓXIMO AO DESTINO...\n\n***", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Mesmo pelo caminho mais rápido, estou exausto, preciso descansar...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolhaDescanso;

        do {
            Escreva("1 - Descansar.\n2 - Continuar mesmo assim.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolhaDescanso = entrada.nextInt();

            switch (escolhaDescanso) {
                case 1:
                    Escreva("Viajante: Tem certeza que deseja descansar?\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: O tempo é curto, lembra do seu prósito aqui!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Você terá muito tempo para descansar quando terminar a jornada!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;

                case 2:
                    Escreva("Ace: Utilizarei da minha sabedoria para seguir em frente, meu propósito é maior!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
            }
        } while (escolhaDescanso != 1 && escolhaDescanso != 2);

        Escreva("***ACE CHEGA NA ENTRADA DO SUBTERRANEO***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: É escuro assim mesmo? Não sei se quero entrar...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Mas sinto que não estou sendo sábio o suficiente para tomar decisões...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Coloque na sua cabeça apenas o propósito de tudo isso que esta acontecendo! Não irei repetir novamente!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Pense positivo e tudo dará certo!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Vou entrar e terminar o que eu vim fazer!! Grr\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ACE ENTRA NO SUBTERRANEO E FICA SURPRESO***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Como assim o ancião não está aqui protegendo-a?\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Serei o mais breve dessa vez, para não levantar muitas suspeitas...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ACE APÓS PEGAR A JÓIA DA CORAGEM...***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Viajante: Cuidado Ace, tem alguém na saída! Me parece estranho\n\n", TimeUnit.MILLISECONDS, temp_dialog);

        do {
            Escreva("1 - Se esconder.\n2 - Averiguar o que esta acontecendo.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolhaDescanso = entrada.nextInt();

            switch (escolhaDescanso) {
                case 1:
                    Escreva("Viajante: Onde vai se esconder aqui?\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Acha mesmo que o Orex não conhece todos os cantos deste subterraneo?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace: Mas minha sabedoria é maior que a dele, jamais me pegará aqui!! *Risos\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;

                case 2:
                    Escreva("Ace: Mesmo com medo, vou em frente, sinto que é a escolha mais sábia!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
            }
        } while (escolhaDescanso != 1 && escolhaDescanso != 2);

        Escreva("***ANTES DE ACE TENTAR FAZER ALGO, OREX ENTRA RÁPIDAMENTE E O PEGA***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: O que eu faço agora??? Me ajuda!!!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Use sua sabedoria para lidar com este momento!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ACE PENSA NO QUE FAZER***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Já sei!!!! utilizarei o ataque da equação!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolhaTreinoEquacao;

        do {
            Escreva("DESEJA FAZER UM TREINO ANTES?\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("1 - Sim.\n2 - Não.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolhaTreinoEquacao = entrada.nextInt();

            switch (escolhaTreinoEquacao) {
                case 1:
                treino2();
                    break;

                case 2:
                    Escreva(" ", TimeUnit.MILLISECONDS, temp_narrativa);
                    break;
            }
        } while (escolhaTreinoEquacao != 1 && escolhaTreinoEquacao != 2);

        pontos += equacao1grau();

        Escreva("Viajante: Bom ataque!!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Porém ele permanece de pé...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***OREX AVANÇA COM FÚRIA PARA CIMA DO ACE FAZENDO A TERRA TREMER***\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("***ACE E OREX ENTRAM EM UM DUELO DE ATAQUES***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: O que eu faço viajante?? Me dê uma ideia!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***A BATALHA PROSSEGUIU, OREX NÃO DAVA SINAIS DE FRAQUEZA...***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Viajante: O sábio aqui é você, se concentre e use a espada da sabedoria!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Estou ficando cansado, não consigo derrotá-lo.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Não vou desistir fácil, essa é pelo meu pai!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ACE COM UM GOLPE HABILIDOSO ATRAIU OREX PARA PERTO DE UM POÇO DEIXANDO-O SEM SAÍDA***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Diga suas últimas palavras... Xeque-mate!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***GOLPE FINALIZADOR***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

        pontos += equacao2grau();

        Escreva("Viajante: Sempre acreditei em você, assim como seu pai!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Agora vamos embora, pois aparentemente o Orex tem aliados...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Não irá querer enfrenta-los né?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Obviamente não, esqueceu que agora eu sou um grande sábio com essa espada?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Só preciso forjar mais essa nova jóia! *Risos\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Faço isso quando acharmos um lugar seguro!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ACE ENCONTRA UM LUGAR SEGURO...***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Não serei teimoso dessa vez, irei forjar a jóia em minha espada como meu pai ensinou!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Aliás, que saudades pai! :(\n\n", TimeUnit.MILLISECONDS, temp_dialog);


        return pontos;
    }

    public static int capitulo3() throws Exception {
        Scanner entrada = new Scanner(System.in);
        int pontos = 0;

        Escreva("++== A JÓIA DA FORÇA ==+\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("***DIA 2 DE 3***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Viajante: Nosso próximo destino será o leste.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Lá é um local de muitas neves e será nessário roupas quentes.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Você precisa achar algo para se agasalhar...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Já tenho uma ideia!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Caçarei animais para arrancar o couro e fazer um casaco.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ACE PASSA O DIA INTEIRO CAÇANDO***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Tenho duas opções, um veado ou um urso...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Use sua sabedoria\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolhaEsperta;

        do {
            Escreva("1 - Sabedoria (Veado).\n2 - Coragem (Urso).\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolhaEsperta = entrada.nextInt();

            switch (escolhaEsperta) {
                case 1:
                    Escreva("Viajante: Essa é uma boa escolha, presa fácil!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace: Usarei minha sabedoria para chegar mais próximo em silencio!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace: Receba o poderoso ataque da minha espada!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("***COM APENAS UM GOLPE, O VEADO VAI A ÓBITO***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    Escreva("Ace: Além de sábio, parece que estou mais forte! *Risos\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Vamos! Leva o veado, precisamos ir para um local mais seguro.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;

                case 2:
                    Escreva("Viajante: Tem certeza? Está escolha não me parece sábia...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Não faça as coisas por impulso ace...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace: Relaxa, minha coragem está acima de qualquer medo!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("***ACE TENTA SE APROXIMAR DO URSO***\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    Escreva("***URSO PERCEBE SUA PRESENÇA, FICA FURIOSO E PARTE PARA CIMA***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    Escreva("Ace: Talvez não seria uma boa ideia mesmo!!!!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Agora você precisa usar sua sabedoria.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("***ACE E URSO ENTRAM EM UMA BATALHA FRENÉTICA***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    Escreva("Ace: Estou muito machucado e o urso não fica cansado...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Pensa Ace...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace: Usarei um ataque secreto!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    treino3();
                    Escreva("***MESMO MUITO MACHUCADO, ACE FINALIZA O URSO***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    Escreva("Viajante: Boa Ace, estava na hora de usar sua sabedoria de verdade.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace: Vamos! preciso me tratar, estou muito ferido...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Mas antes, tire o couro do Urso.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
            }
        } while (escolhaEsperta != 1 && escolhaEsperta != 2);

        Escreva("***ACE TRATA O COURO E FAZ UM CASACO***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Depois de tudo que aconteceu, eu ainda não sei nada sobre a próxima jóia...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Vamos! No caminho eu conto, pois você já perdeu o dia 2 inteiro caçando animais...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Vamos o mais rápido possível, não tenho muito tempo.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***A CAMINHO DA NEVE NO LESTE***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Viajante: A terceira jóia... É a jóia da força.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Possuí um brilho com um tom avermelhado radiante, irradiando uma energia poderosa.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Aquele que a possuir, será agraciado com uma força sobre-humana,\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Capaz de mover montanhas e resistir aos mais terríveis perigos.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Esta pedra é mantida pelo ancião Corvus, pelo nome já da para saber que é um corvo né?\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Ele jura proteger o Leste de qualquer ameça que se aproximar.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Esse aparenta ser o ancião mais difícil até agora, como vou enfrentar alguém que voa?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: O sábio aqui é você. *Risos\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Mas chegando lá, você terá uma surpresa!!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Acho que falei demais... Estamos chegando já.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***DIA 3 DE 3***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Estou ouvindo um barulho de passáro, o que será isso?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Estamos chegando casa vez mais perto, fique preparado!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***A TODO MOMENTO ACE ESTA SENDO OBSERVADO***\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("***CORVUS PASSA VOANDO PERTO DE ACE E RASGA SEU ROSTO***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        int escolhaAtaque;

        do {
            Escreva("1 - Jogar a espada no Corvus\n2 - Aguardar o melhor momento\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolhaAtaque = entrada.nextInt();

            switch (escolhaAtaque) {
                case 1:
                    Escreva("***ACE ERRA A ESPADA***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    Escreva("Viajante: Você não era o sábio?\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Como pode fazer uma burrada dessa!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: O que você vai fazer sem espada?!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace: Deixa comigo que o sábio sou eu!!\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    Escreva("Viajante: Você é sábio só com a espada Ace!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace: Então o que me resta é correr atrás dela...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("***ENQUANTO ACE CORRE ATRÁS DA ESPADA, CORVUS VÊ A OPORTUNIDADE DE FAZER SEUS ATAQUES VOADORES***\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    Escreva("***ACE MESMO MACHUCADO, RECUPERA SUA ESPADA***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    break;

                case 2:
                    Escreva("\n", TimeUnit.MILLISECONDS, temp_dialog);

            }
        } while (escolhaAtaque != 1 && escolhaAtaque != 2);

        Escreva("Ace: Agora estou esperto, me camuflarei debaixo da neve!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Talvez Corvus não seja tão besta assim Ace.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Dessa vez  preciso que confie em mim, vou aguardar o melhor momento de ataque!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***CORVUS FICA SOBREVOANDO TODA A ÁREA SEM ACHAR ACE***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Isso, continue sobrevoando, quando estiver próximo, entrarei em ação!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***CORVUS PASSA PRÓXIMO A ACE***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Essa é minha hora de fazer a espada brilhar!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);

        pontos += polinomios1();

        Escreva("***ACE JOGA SUA ESPADA E ACERTA EM CHEIO CORVUS, FAZENDO-O CAIR***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Viajante: Boa Ace!!! Nem eu espera por uma jogada ensaiada dessa.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Vou atrás da jóia, antes que Corvus levante.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Aqui é muito grande, preciso pensar em um lugar onde seja mais provável estar a jóia\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: No ninho do Corvus é a maior chance de encontrar.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Então já estou próximo...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***CORVUS PERCEBE QUE ACE ESTÁ PRÓXIMO DE PEGAR A JÓIA E VOA NOVAMENTE PARA ATACAR***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Você não irá conseguir me intervir Corvus, a minha coragem está acima de tudo!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***CORVUS COM SUAS GARRAS RASGA SEU CASACO E TAMBÉM A PELE DE ACE***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Não deveria ter feito isso!\n\n", TimeUnit.MILLISECONDS, temp_dialog);

        do {
            Escreva("1 - Jogar a espada no Corvus.\n2 - Tentar chegar até a jóia mesmo machucado.\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolhaEsperta = entrada.nextInt();

            switch (escolhaEsperta) {
                case 1:
                    pontos += polinomios2();
                    break;

                case 2:
                    Escreva("Ace: Preciso honrar meu pai, vou até o final!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("***CORVUS VÊ A BRAVURA DE ACE E CONTINUA O ATACANDO***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    Escreva("Viajante: Ace faça uma escolha sábia, derrote ele!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace: Não tenho força mais, mas tentarei!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);

                    pontos += polinomios2();
                    Escreva("Viajante: Em cheio Ace!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("***CORVUS E ACE CAEM SEM VIDA, O FRIO FOI TÃO INTENSO QUE CONGELOU OS 2 INSTATÂNEO***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    Escreva("Viajante: Ace!!!!!!!!! Nãooooooo!!!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("***A ESPADA CAIU AO LADO DA JÓIA DA FORÇA E JUNTANDO AS 3 JÓIAS, HOUVE UMA EXPLOSÃO DESTRUINDO TUDO E TODOS!***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    
                    break;
            }
        } while (escolhaEsperta != 1 && escolhaEsperta != 2);

        Escreva("***MESMO ACERTANDO EM CHEIO, CORVUS NÃO CAI***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Como assim??? ImpossÍvel!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Ace, se escode!!\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Viajante: Essa foi a surpresa que eu disse!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ESPADA DE ACE CAI AO LADO DA JÓIA DA FORÇA***\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("***JUNTANDO AS 3, HOUVE UMA GRANDE EXPLOSÃO DESTRUINDO TUDO AO REDOR, INCLUSIVE CORVUS***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Como assim eu ainda estou vivo??\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: A espada está conectada diretamente a você, jamais ela te mataria!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: estou tão machucado, mas preciso encontrar com meu pai!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***FINAL DIA 3***\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("***ACE CHEGA EM CASA E SE DEPARA COM SEU PAI EM ESTADO CRÍTICO.***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Pai, eu consegui, olha!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ACE MOSTRA A ESPADA COM AS 3 JÓIAS FORJADAS EM SUA ESPADA***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Pai: Eu sempre acreditei que você conseguiria! Não há nada que o esforço não vença! Meu orgulho!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***PAI SUSPIRA E DESCANSA ETERNAMENTE***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Essa foi especialmente para você...Pai!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ACE DESDE ENTÃO DESTRÓI MONSTROS POR TODO O MUNDO***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        return pontos;
    }


    //Instruções do jogo
    static void instrucoes() throws Exception {
        Escreva("\n\n++== Introdução ao Jogo ==++\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Bem-vindo ao Math Adventure, um mundo de coragem, sabedoria e força. Neste jogo RPG,\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("você embarcará em uma jornada épica para encontrar e reunir as três Jóias de fortalecimento: a Pedra da\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Sabedoria, a Jóia da Coragem e a Jóia da Força. Cada Jóia é guardada por poderosos desafios\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("e inimigos, e só os mais bravos heróis conseguirão restaurar a harmonia e prosperidade ao reino.", TimeUnit.MILLISECONDS, temp_narrativa);

        Escreva("\n\n++== Objetivo do Jogo ==++\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("O objetivo principal do jogo é encontrar as três Jóias e uni-las em sua espada para seu fortalecimento.\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Para isso, você precisará explorar diferentes partes do reino, resolver contas matemáticas, lutar contra\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("inimigos, e superar desafios mortais acumulando pontuação no final.", TimeUnit.MILLISECONDS, temp_narrativa);

        Escreva("\n\n++== Exploração do Reino ==++\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("O reino de Math Adventure é vasto e cheio de locais misteriosos e perigosos. Você precisará explorar\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("florestas densas, montanhas traiçoeiras, cidades antigas e masmorras escuras.", TimeUnit.MILLISECONDS, temp_narrativa);

        Escreva("\n\n++== Tipos de Missões ==++\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Jóia da Sabedoria (AZUL): Relacionado diretamente com cálculos de Potenciação.\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Jóia da Coragem (AMARELA): Relacionado diretamente com cálculos de Equações.\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Jóia da Força (VERMELHA): Relacionado diretamente com cálculos de Polinômios.", TimeUnit.MILLISECONDS, temp_narrativa);

        Escreva("\n\n++== Combate ==++\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("O combate é uma parte essencial do jogo. Enfrente os anciões acertando cálculos matemáticos, sendo necessário habilidades e estratégias.", TimeUnit.MILLISECONDS, temp_narrativa);

        Escreva("\n\n++== Conclusão ==++\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Encontre e reúna as Jóias perdidas do fortalecimento para restaurar a paz e a harmonia no reino. Sua sabedoria,\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("coragem e força serão testadas a cada passo da jornada.\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

    }

    //Função para os créditos do jogo
    static void creditos() throws Exception {
        Escreva("\n\n++== DESENVOLVEDORES ==++\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("++== Juan Batista ==++\n++== Allan Sampaio ==++\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
    }

    //Main do jogo aonde chama a função do menu e dentro do menu é aonde tudo acontece
    public static void main(String[] args) throws Exception {
        menu();
    }
}

