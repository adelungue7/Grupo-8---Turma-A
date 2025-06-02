import java.util.Random;
import java.util.Scanner;

public class Main {

    // Adiciona uma pausa de 0,5s
    public static void pausa() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static int menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("*--Menu--*");
        System.out.println("Bem Vindo ao jogo O CÓDIGO PERDIDO!");
        System.out.println("1-JOGAR\n"
                + "2-INSTRUÇÕES\n"
                + "3-CRÉDITOS\n"
                + "4-SAIR");
        return input.nextInt();
    }

    public static void instrucoes(){
        Scanner input = new Scanner(System.in);
        System.out.println("Você foi para em um mundo desconhecido gerado pelo seu erro e será o responsável por consertar\ntudo onde irá passar por diversos desafios!\n"
                + "Esse é um jogo estilo RPG de texto. Suas respostas\n vão definir o seu futuro, seja por respostas aos personagens\n ou por escolhas de rotas.\n"
                + "Haverão desafios envolvendo binários e outras bases a serem convertidas, exemplos:\n"
                + "1-Conversão de binário para decimal.\n"
                + "Qual o código baseado no número 13 em binário? \n"
                + "Resposta: 1101\n\n"
                + ""
                + "Pressione ENTER para voltar ao Menu!");
        pausa();
        retorno();
    }

    public static void creditos()//função que mostra os créditos
    {
        System.out.println("Jogo desenvolvido por:\nErick Yuji Conceição\nGustavo Gonçalves Viana\nJoão Vitor Reis Alves\nNathan Ferraz Liberatti\nRafael Adelungue Da Silva");
        pausa();
        System.out.println("Pressione ENTER para voltar ao Menu!");
        retorno();
    }

    public static void retorno(){
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }


    public static int nDecimal() {
        Random random = new Random();

        // Gera um número decimal entre 1 e 15 (para manter o binário curto)
        int n = random.nextInt(15) + 1;

        return n;
    }

    public static String conversaoParaBinario(int numeroDecimal) {

        String binario = Integer.toBinaryString(numeroDecimal);

        return binario;
    }


    public static void desafioAdivinheOBinario(int numeroDecimal, String respostaBinariaCorreta) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nProfessor Enigma: Prepare-se! Qual é o número " + numeroDecimal + " em binário?");
        pausa();
        System.out.println("Dica: Use a tabela 8 4 2 1 para te ajudar!");
        pausa();
        System.out.print("Sua resposta (apenas 0s e 1s, sem espaços): ");

        String respostaJogador = input.nextLine().trim();

        while (respostaJogador.length() < respostaBinariaCorreta.length()) {
            respostaJogador = "0" + respostaJogador;
        }

        if (respostaJogador.equals(respostaBinariaCorreta)) {
            System.out.println("Professor Enigma: MUITO BEM! " + numeroDecimal + " em binário é " + respostaBinariaCorreta + ". Você acertou!");
            pausa();
        } else {
            System.out.println("Professor Enigma: Ops, quase! Não desanime, a prática leva à perfeição!");
            pausa();
        }
    }

    public static void desafioOPoderDoDois() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int numeroDesafio;

        numeroDesafio = random.nextInt(100) + 1;

        boolean poderDois = (numeroDesafio > 0) && ((numeroDesafio & (numeroDesafio - 1)) == 0);

        System.out.println("\nProfessor Enigma: Este número é uma potência de 2? (S/N)");
        pausa();
        System.out.println("Número: " + numeroDesafio);
        System.out.print("Sua resposta: ");

        String respostaJogador = input.nextLine().toUpperCase().trim();

        if ((respostaJogador.equals("S") && poderDois) || (respostaJogador.equals("N") && !poderDois)) {
            System.out.println("Professor Enigma: EXCELENTE! Você acertou! " + numeroDesafio + (poderDois ? " é" : " não é") + " uma potência de 2.");
            pausa();
        } else {
            System.out.println("Professor Enigma: Quase lá! " + numeroDesafio + (poderDois ? " é" : " não é") + " uma potência de 2.");
            pausa();
            System.out.println("Professor Enigma: Lembre-se das potências de 2: 1, 2, 4, 8, 16, 32, 64...");
            pausa();
        }
    }

    public static void desafioBinarioOctal(){
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random ();

        int nuumeroDecimal = aleatorio.nextInt(255)+1;
        String binario = Integer.toBinaryString(nuumeroDecimal);
        String octalCorreto = Integer.toOctalString(nuumeroDecimal);

        System.out.println("\nProfessor Enigma: Agora eu vou deixar você sozinho, é a escolha de um mundo paralelo ou da realidade!");
        pausa();
        System.out.println("Professor Enigma: O universo vai te passar o que é pra ser feito");
        pausa();
        System.out.println("???: Um pedestal surge na sua frente com alguns digitos binários ");
        pausa();
        System.out.println("Professor Enigma: Converta esse código binário em octal e o cofre será aberto!");
        pausa();

        System.out.println("\nNúmero em Binário: " + binario);
        while (true){
            System.out.println("\nDIGITE O NÚMERO EM OCTAL: ");
            String respostaJo = entrada.nextLine().trim();

            if (respostaJo.equals(octalCorreto)){
                System.out.println("\nProfessor Enigma: Você realmente conseguiu, acho que vai poder abrir agora! ");
                pausa();
                break;
            }
            else {
                System.out.println("\nProfessor Enigma: Errado! Tente novamente, pense na conversão de binário para octal");
                pausa();
            }
        }
    }

    public static void desafioHexaTrilha(){
        Scanner entrada = new Scanner (System.in);

        System.out.println("???: Vocês descem por uma trilha que brilha a cada passo e ele deve estar alinhado com a equivalência do decimal para hexa: \n");
        pausa();
        System.out.println("Professor Enigma: Para passar na trilha está muito suave, só dizer qual o valor hexadecimal em decimal!\n ");
        pausa();
        System.out.println("Dica: de 10 a 15 hexadecimal, são letras de A a F.\n");
        pausa();

        int acertos = 0;

        System.out.println("DEC: 15 => HEX: ");
        String ra = entrada.nextLine().toUpperCase();
        if (ra.equals("F")) acertos++;

        System.out.println("DEC: 12 => HEX: ");
        String rb = entrada.nextLine().toUpperCase();
        if (rb.equals("C")) acertos++;

        System.out.println("DEC: 10 => HEX: ");
        String rc = entrada.nextLine().toUpperCase();
        if (rc.equals("A")) acertos++;

        System.out.println("DEC: 14 => HEX: ");
        String rd = entrada.nextLine().toUpperCase();
        if (rd.equals("E")) acertos++;

        System.out.println("DEC: 11 => HEX: ");
        String re = entrada.nextLine().toUpperCase();
        if (re.equals("B")) acertos++;

        System.out.println("DEC: 13 => HEX: ");
        String rf = entrada.nextLine().toUpperCase();
        if (rf.equals("D")) acertos++;

        System.out.println("\nVocê acertou " + acertos + " de 6!\n");
        pausa();

        if (acertos == 6){

            System.out.println("Professor Enigma: Que bom! Você dominou os valores HEXA. A trilha está cada vez mais se abrindo.\n");
            pausa();

        }
        else {
            System.out.println("Professsor Enigma: Não foi dessa vez mas terá outras chances ainda.\n");
            pausa();
        }
    }

    public static void desafioHexafixa() {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("???: Veja bem... Eu vou te mostrar um número em OCTAL.\n" +
                "???: Seu trabalho é me dizer qual é esse número em HEXADECIMAL.\n" +
                "???: Só quem domina os códigos secretos pode atravessar!\n ");
        pausa();

        System.out.println("Professor Enigma: Calma, jovem aventureiro! Vou te ensinar como resolver isso.\n");
        pausa();
        System.out.println("Professor Enigma: Primeiro, pegue o número octal e transforme em decimal.");
        pausa();
        System.out.println("Professor Enigma: Exemplo: 561 em octal = 5×64 + 6×8 + 1×1 = 320 + 48 + 1 = 369.");
        pausa();
        System.out.println("Professor Enigma: E de decimal você transforma em hexadecimal como esse exemplo: " +
                "369 ÷ 16 = 23 → resto 1\n" +
                "23 ÷ 16 = 1 → resto 7\n" +
                "1 ÷ 16 = 0 → resto 1\n ");
        pausa();

        System.out.println("Professor Enigma: Isso é apenas uma dica minha pra você pequeno gafanhoto, agora espere que o desafio vai vir: \n");
        pausa();
        System.out.println("*****5*****\n*****4*****\n*****3*****\n*****2*****\n*****1*****\n\n");
        pausa();

        while (true){
            int numeroDecimal = aleatorio.nextInt(64);
            String numeroOctal = Integer.toOctalString(numeroDecimal);
            String numeroHexa = Integer.toHexString(numeroDecimal).toUpperCase();


            System.out.println("Número em OCTAL: " + numeroOctal);
            System.out.print("\nDigite sua resposta (hexadecimal): ");
            String resposta = entrada.nextLine().trim().toUpperCase();
            if (resposta.equals(numeroHexa)) {
                System.out.println("Porta: Você acertou! A porta se abriu com a chave Hexadecimal\n");
                pausa();
                break;
            } else {
                System.out.println("Porta: Errado! A resposta correta era: " + numeroHexa);
                pausa();
            }
        }

        System.out.println("???: Assim que você entra na nova dimensão, a porta se fecha rapidamente.");
        pausa();
        System.out.println("???: Você se vê em um lugar cheio de números e letras dançando no ar.");
        pausa();
        System.out.println("???: Bem-vindo à dimensão hexadecimal, onde os segredos do universo são revelados.");
        pausa();
        System.out.println("???: Prepare-se para o desafio final, apenas os verdadeiros mestres poderão prosseguir.");
        pausa();
    }


    public static void bossFinalModoFacil() {
        // Implementação do modo fácil do Boss Final
        Scanner input = new Scanner(System.in);

        // --- Desafio 1: Matriz Binária ---
        System.out.println("\nBoss Final: Primeiro desafio! Veja esta matriz binária 3x3:");
        pausa();
        int[][] matriz = {
            {1, 0, 1},
            {0, 1, 0},
            {1, 1, 0}
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        pausa();
        System.out.println("Boss Final: Qual é o valor decimal da soma dos elementos da diagonal principal?");
        pausa();
        int respostaCerta1 = matriz[0][0] + matriz[1][1] + matriz[2][2]; // 1+1+0=2
        int tentativas = 0;
        boolean acertou = false;
        while (tentativas < 2) {
            System.out.print("Sua resposta: ");
            int resposta = input.nextInt();
            if (resposta == respostaCerta1) {
                System.out.println("Boss Final: Muito bem! Você acertou o primeiro desafio!");
                acertou = true;
                break;
            } else {
                tentativas++;
                if (tentativas < 2) {
                    System.out.println("Boss Final: Errou! Tente novamente.");
                }
            }
        }
        if (!acertou) {
            System.out.println("Boss Final: Você falhou duas vezes. Não foi capaz de derrotar o Boss Final!");
            pausa();
            System.out.println("Voltando ao menu...");
            pausa();
            return;
        }

        // --- Desafio 2: Lista de Hexadecimais ---
        System.out.println("\nBoss Final: Segundo desafio! Veja esta lista de números hexadecimais:");
        pausa();
        String[] hexList = {"A", "F", "1C", "B", "10"};
        System.out.print("Lista: ");
        for (String h : hexList) System.out.print(h + " ");
        System.out.println("\nBoss Final: Qual é o valor decimal do maior número da lista?");
        pausa();
        // Encontrar o maior valor decimal
        int maior = 0;
        for (String h : hexList) {
            int val = Integer.parseInt(h, 16);
            if (val > maior) maior = val;
        }
        tentativas = 0;
        acertou = false;
        while (tentativas < 2) {
            System.out.print("Sua resposta: ");
            int resposta = input.nextInt();
            if (resposta == maior) {
                System.out.println("Boss Final: Impressionante! Você acertou o segundo desafio!");
                acertou = true;
                break;
            } else {
                tentativas++;
                if (tentativas < 2) {
                    System.out.println("Boss Final: Errou! Tente novamente.");
                }
            }
        }
        if (!acertou) {
            System.out.println("Boss Final: Você falhou duas vezes. Não foi capaz de derrotar o Boss Final!");
            pausa();
            System.out.println("Voltando ao menu...");
            pausa();
            return;
        }

        // --- Desafio 3: Lógica simples (Octal) ---
        System.out.println("\nBoss Final: Último desafio! Converta o número octal 57 para decimal.");
        pausa();
        int respostaCerta3 = Integer.parseInt("57", 8); // 47
        tentativas = 0;
        acertou = false;
        while (tentativas < 2) {
            System.out.print("Sua resposta: ");
            int resposta = input.nextInt();
            if (resposta == respostaCerta3) {
                System.out.println("Boss Final: Você venceu todos os desafios do modo fácil! Parabéns!");
                acertou = true;
                break;
            } else {
                tentativas++;
                if (tentativas < 2) {
                    System.out.println("Boss Final: Errou! Tente novamente.");
                }
            }
        }
        if (!acertou) {
            System.out.println("Boss Final: Você falhou duas vezes. Não foi capaz de derrotar o Boss Final!");
            pausa();
            System.out.println("Voltando ao menu...");
            pausa();
            return;
        }
    }


    public static void bossFinalModoDificil() {
        // Implementação do modo difícil do Boss Final
        Scanner input = new Scanner(System.in);

        // --- Desafio 1: Matriz Binária ---
        System.out.println("\nBoss Final: Primeiro desafio! Veja esta matriz binária 3x3:");
        pausa();
        int[][] matriz = {
            {1, 0, 1},
            {0, 1, 0},
            {1, 1, 0}
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        pausa();
        System.out.println("Boss Final: Qual é o valor decimal da soma dos elementos da diagonal principal?");
        pausa();
        int respostaCerta1 = matriz[0][0] + matriz[1][1] + matriz[2][2]; // 1+1+0=2
        int tentativas = 0;
        boolean acertou = false;
        while (tentativas < 2) {
            System.out.print("Sua resposta: ");
            int resposta = input.nextInt();
            if (resposta == respostaCerta1) {
                System.out.println("Boss Final: Muito bem! Você acertou o primeiro desafio!");
                acertou = true;
                break;
            } else {
                tentativas++;
                if (tentativas < 2) {
                    System.out.println("Boss Final: Errou! Tente novamente.");
                }
            }
        }
        if (!acertou) {
            System.out.println("Boss Final: Você falhou duas vezes. Não foi capaz de derrotar o Boss Final!");
            pausa();
            System.out.println("Voltando ao menu...");
            pausa();
            return;
        }

        // --- Desafio 2: Lista de Hexadecimais ---
        System.out.println("\nBoss Final: Segundo desafio! Veja esta lista de números hexadecimais:");
        pausa();
        String[] hexList = {"A", "F", "1C", "B", "10"};
        System.out.print("Lista: ");
        for (String h : hexList) System.out.print(h + " ");
        System.out.println("\nBoss Final: Qual é o valor decimal do maior número da lista?");
        pausa();
        // Encontrar o maior valor decimal
        int maior = 0;
        for (String h : hexList) {
            int val = Integer.parseInt(h, 16);
            if (val > maior) maior = val;
        }
        tentativas = 0;
        acertou = false;
        while (tentativas < 2) {
            System.out.print("Sua resposta: ");
            int resposta = input.nextInt();
            if (resposta == maior) {
                System.out.println("Boss Final: Impressionante! Você acertou o segundo desafio!");
                acertou = true;
                break;
            } else {
                tentativas++;
                if (tentativas < 2) {
                    System.out.println("Boss Final: Errou! Tente novamente.");
                }
            }
        }
        if (!acertou) {
            System.out.println("Boss Final: Você falhou duas vezes. Não foi capaz de derrotar o Boss Final!");
            pausa();
            System.out.println("Voltando ao menu...");
            pausa();
            return;
        }

        // --- Desafio 3: Lógica simples (Octal) ---
        System.out.println("\nBoss Final: Último desafio! Converta o número octal 57 para decimal.");
        pausa();
        int respostaCerta3 = Integer.parseInt("57", 8); // 47
        tentativas = 0;
        acertou = false;
        while (tentativas < 2) {
            System.out.print("Sua resposta: ");
            int resposta = input.nextInt();
            if (resposta == respostaCerta3) {
                System.out.println("Boss Final: Você venceu todos os desafios do modo fácil! Parabéns!");
                acertou = true;
                break;
            } else {
                tentativas++;
                if (tentativas < 2) {
                    System.out.println("Boss Final: Errou! Tente novamente.");
                }
            }
        }
        if (!acertou) {
            System.out.println("Boss Final: Você falhou duas vezes. Não foi capaz de derrotar o Boss Final!");
            pausa();
            System.out.println("Voltando ao menu...");
            pausa();
            return;
        }
    }


    public static void mostrarFim() {
        System.out.println(" ______ _____ __  __ ");
        System.out.println("|  ____|_   _|  \\/  |");
        System.out.println("| |__    | | | \\  / |");
        System.out.println("|  __|   | | | |\\/| |");
        System.out.println("| |     _| |_| |  | |");
        System.out.println("|_|    |_____|_|  |_|");
        System.out.println();
        System.out.println();
        pausa();
    }

    // Pausa longa de 10 segundos
    public static void pausaLonga() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void modoEstudo() {
        System.out.println("");
        System.out.println(" __  __  ____  _____   ____    ______  _____ _______ _    _ _____   ____");
        System.out.println("|  \\/  |/ __ \\|  __ \\ / __ \\  |  ____|/ ____|__   __| |  | |  __ \\ / __ \\");
        System.out.println("| \\  / | |  | | |  | | |  | | | |__  | (___    | |  | |  | | |  | | |  | |");
        System.out.println("| |\\/| | |  | | |  | | |  | | |  __|  \\___ \\   | |  | |  | | |  | | |  | |");
        System.out.println("| |  | | |__| | |__| | |__| | | |____ ____) |  | |  | |__| | |__| | |__| |");
        System.out.println("|_|  |_|\\____/|_____/ \\____/  |______|_____/   |_|   \\____/|_____/ \\____/ ");
        System.out.println("");
        System.out.println("");

        System.out.println("AQUI O PROFESSOR ENIGMA VAI TE MOSTRAR AS EXPLICAÇÕES DE TODAS AS QUESTÕES QUE VOCÊ RESPONDEU");
        System.out.println();

        System.out.println("---------------------------------PRIMEIRO EXERCÍCIO---------------------------------");

        System.out.println("O que é o sistema binário?");
        System.out.println("Professor Enigma: Vamos revisar juntos!");
        System.out.println("O sistema binário é a linguagem dos computadores. Ele usa apenas dois símbolos: 0 e 1.");
        System.out.println("Por que isso? Porque máquinas funcionam com dois estados simples: ligado (1) e desligado (0).");
        System.out.println("Tudo - números, letras, imagens, sons - é convertido em combinações de 0s e 1s para que o computador entenda.");
        System.out.println();
        System.out.println("Por exemplo:");
        System.out.println("O número 2, no sistema binário, é 10.");
        System.out.println("O número 3, é 11.");
        System.out.println();
        System.out.println("Professor Enigma: Então lembre-se: entender o binário é o primeiro passo para pensar como as máquinas!");

        System.out.println("");
        System.out.println("");
        pausaLonga();

        System.out.println("---------------------------------PRÓXIMO EXERCÍCIO---------------------------------");
        System.out.println("");

        int nDecimal = 6;
        String respostaBinaria = conversaoParaBinario(nDecimal);

        System.out.println("Lembra do exercício em que você transformou um número decimal em binário? Vamos ver um outro exemplo para entender melhor como isso funciona:");
        System.out.println("Professor Enigma: " + nDecimal + " em binário é " + respostaBinaria + ".");
        System.out.println("Professor Enigma: Vamos entender:");
        System.out.println("Cada posição representa um valor. Se o número for maior ou igual ao valor, colocamos 1; se for menor, colocamos 0.");
        System.out.println("Depois, somamos os valores que têm 1 para conferir o total.");
        System.out.println("Usamos a tabela abaixo para converter números decimais em binário:\n");
        System.out.println("Tabela: 128 64 32 16 8 4 2 1");
        System.out.println("Binário: 0   0  0  0 0 1 1 0\n");
        System.out.println("Soma: 4 + 2 + 0 = 6 --> Resultado: 00000110\n");
        System.out.println("Professor Enigma: Praticando, isso fica fácil!");

        System.out.println("");
        System.out.println("");
        pausaLonga();

        System.out.println("---------------------------------PRÓXIMO EXERCÍCIO---------------------------------");
        System.out.println("");

        System.out.println("O que são potências de 2?");
        System.out.println("São números que crescem dobrando:");
        System.out.println("1, 2, 4, 8, 16, 32, 64...\n");

        System.out.println("Como saber se um número é potência de 2?");
        System.out.println("1. Está na lista? Então sim.");
        System.out.println("2. Dá para dividir por 2 até chegar em 1 sem sobrar nada? Então sim.");
        System.out.println("   Ex: 32 → 16 → 8 → 4 → 2 → 1 → Sim");
        System.out.println("   Ex: 30 → 15 → 7.5 → Não");
        System.out.println("3. Você chegou nele dobrando 1? Então sim.\n");

        System.out.println("Exemplo:");
        System.out.println("Imagine caixas com moedas mágicas.");
        System.out.println("Só funcionam se tiverem potência de 2 moedas.");
        System.out.println("Você precisa dizer sim ou não para cada número que aparecer.");
        System.out.println("");
        System.out.println("");
        pausaLonga();

        System.out.println("---------------------------------PRÓXIMO EXERCÍCIO---------------------------------");
        System.out.println("");

        System.out.println("\"345 na base 8... quanto isso vale na base 10?\"\n");

        System.out.println("Para resolver, você precisa usar a fórmula abaixo:");
        System.out.println("Cada dígito é (8 elevado à sua posição, da direita para a esquerda).");
        System.out.println("345₈ = 3×8² + 4×8¹ + 5×8⁰");
        System.out.println("     = 3×64 + 4×8 + 5×1");
        System.out.println("      = 192 + 32 + 5 = 229\n");
        pausaLonga();

        System.out.println("---------------------------------PRÓXIMO EXERCÍCIO---------------------------------");
        System.out.println("");

        System.out.println("Como resolver um exercício de conversão de binário para octal:");
        System.out.println("Separe o número binário em grupos de 3 dígitos, começando da direita para a esquerda.\n");
        System.out.println("Se faltar dígitos no início, complete com zeros à esquerda para formar os grupos.\n");
        System.out.println("Converta cada grupo de 3 dígitos binários para decimal.\n");
        System.out.println("Isso porque cada grupo representa exatamente um dígito no sistema octal.\n");
        System.out.println("Junte os dígitos decimais obtidos na mesma ordem para formar o número octal.\n");

        System.out.println("Exemplo prático:");
        System.out.println("Converter o binário 1101011 para octal:\n");

        System.out.println("Separe em grupos de 3 (da direita pra esquerda):");
        System.out.println("1 101 011 > complete com zeros: 001 101 011\n");

        System.out.println("Converta cada grupo para decimal:\n");
        System.out.println("001 = 1");
        System.out.println("101 = 5");
        System.out.println("011 = 3\n");

        System.out.println("Junte os dígitos:");
        System.out.println("Resultado octal: 153\n");

        System.out.println("Conclusão:");
        System.out.println("Para converter de binário para octal:");
        System.out.println("Agrupe em trios > Converta para decimal > Junte os valores");
        System.out.println("");
        System.out.println("");
        pausaLonga();

        System.out.println("---------------------------------PRÓXIMO EXERCÍCIO---------------------------------");
        System.out.println("");

        System.out.println("COMO RESOLVER O DESAFIO DA CHAVE HEXADECIMAL\n");
        System.out.println("O sistema hexadecimal é um sistema de base 16.");
        System.out.println("Ele usa os números de 0 a 9 e depois as letras de A a F:");
        System.out.println("A = 10, B = 11, C = 12, D = 13, E = 14, F = 15\n");

        System.out.println("CONVERSÕES IMPORTANTES:\n");

        System.out.println("1. Decimal → Hexadecimal:");
        System.out.println("- Divida o número por 16 e anote o resto.");
        System.out.println("- Continue dividindo o quociente até ele ser 0.");
        System.out.println("- Depois, leia os restos de baixo para cima.");
        System.out.println("Exemplo: 26 ÷ 16 = 1 (resto 10 → A), 1 ÷ 16 = 0 (resto 1)");
        System.out.println("Resultado: 1A\n");

        System.out.println("2. Hexadecimal → Decimal:");
        System.out.println("- Multiplique cada dígito pela potência de 16 conforme a posição.");
        System.out.println("Exemplo: 1A = (1 × 16¹) + (10 × 16⁰) = 16 + 10 = 26\n");

        System.out.println("Dica: Sempre lembre que:");
        System.out.println("A = 10, B = 11, C = 12, D = 13, E = 14, F = 15\n");
        System.out.println("");
        System.out.println("");
        pausaLonga();

        System.out.println("---------------------------------PRÓXIMO EXERCÍCIO---------------------------------");
        System.out.println("");
        System.out.println("DESAFIO HEXAFIXA\n");
        System.out.println("Neste desafio, você precisa aplicar o que aprendeu sobre o sistema hexadecimal.");
        System.out.println("Pode ser necessário converter números entre decimal e hexadecimal ou identificar valores equivalentes.");
        System.out.println("Lembre-se que no sistema hexadecimal:");
        System.out.println("- A = 10, B = 11, C = 12, D = 13, E = 14, F = 15");
        System.out.println("- A base é 16, então cada posição representa uma potência de 16\n");

        System.out.println("EXEMPLO DE CONVERSÃO:\n");
        System.out.println("Hexadecimal para Decimal:");
        System.out.println("- Exemplo: 2F = (2 × 16¹) + (15 × 16⁰) = 32 + 15 = 47\n");

        System.out.println("Decimal para Hexadecimal:");
        System.out.println("- Exemplo: 47 ÷ 16 = 2 (resto 15 → F), 2 ÷ 16 = 0 (resto 2)");
        System.out.println("- Resultado: 2F\n");

        System.out.println("Dica:");
        System.out.println("Mantenha a tabela de conversão em mente e pense em cada posição como uma potência de 16.");
        System.out.println("Assim, você decifra os códigos e avança na jornada!\n");
        System.out.println("");
        System.out.println("");
        pausaLonga();

        System.out.println("---------------------------------PRÓXIMO EXERCÍCIO---------------------------------");
        System.out.println("");
        System.out.println("DESAFIO FINAL: O BOSS DAS BASES NUMÉRICAS\n");
        System.out.println("Chegou a hora do desafio supremo! Aqui você vai precisar dominar três sistemas numéricos fundamentais:");
        System.out.println("- Binário (base 2): usa apenas os dígitos 0 e 1");
        System.out.println("- Octal (base 8): usa os dígitos de 0 a 7");
        System.out.println("- Hexadecimal (base 16): usa os dígitos de 0 a 9 e as letras A a F (A=10 até F=15)\n");

        System.out.println(" EXEMPLOS RÁPIDOS:\n");
        System.out.println("Decimal 10 > Binário: 1010");
        System.out.println("Decimal 64 > Octal: 100");
        System.out.println("Decimal 255 > Hexadecimal: FF");
        System.out.println("Hexadecimal 1A > Decimal: (1 × 16) + 10 = 26\n");

        System.out.println(" Dica Final:");
        System.out.println("Pense com calma. Use a lógica. Lembre-se da base de cada sistema.");
        System.out.println("");
        System.out.println("");
    }


    public static String perguntaInicio() {
        Scanner input = new Scanner(System.in);

        String resposta = "";

        System.out.println("Professor Enigma: Vamos começar com a primeira pergunta: O que é o sistema binário?\n\n");
        System.out.println("Escolha do jogador: \nA. São gêneros!\nB. São sistemas que usam apenas dois dígitos: 1 e 1,0.\nC. São sistemas que usam apenas dois dígitos: 0 e 1.");

        while(true) {
            System.out.println("Digite sua resposta (A/B/C): ");
            resposta = input.next().toUpperCase();

            if (resposta.equals("A") || resposta.equals("B") || resposta.equals("C")) { //garante que o jogador digite apenas esses tres caracteres
                break;
            } else {
                System.out.println("Resposta inválida. Por favor, digite A, B ou C");
            }
        }
        return resposta;
    }


    public static String inicio(){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int numero;//Receber números da tabela
        String nome;//Receber o nome do jogador


        System.out.println("Digite o nome que você deseja: ");
        nome = input.next();

        System.out.println("#--- Lore ---#\n");
        System.out.println("???: Você é mais uma pessoa comum nesse mundo que chamamos de lugar pra viver...\n\n" +
                "???: Um dia você estava fazendo o que sempre fazia, quando nota um e-mail estranho...\n\n" +
                nome + ": Esse arquivo tá em um tipo diferente, .@#0. Estranho, será que é algum jogo crackeado? Vou abrir.\n\n" +
                "???: Você abre o arquivo e vê...\n\n" +
                nome + ": Um monte de zeros e uns???? Que negócio nada a ver.\n\n" +
                "???: Você decide digitar algo...\n\n" +
                nome + ": E se eu digitar 0???\n\n" +
                "???: Um caderno ao seu lado desaparece.\n\n" +
                nome + ": Nem, NEM A PAU, EU SOU UM MANIPULADOR DE REALIDADE?\n\n" +
                "???: Você brinca com a realidade até que...\n\n" +
                nome + ": E se eu apertar o dois??\n\n" +
                "???: Eu desisto... MAS VOCÊ QUEBROU A REALIDADE!\n\n" +
                "Professor Enigma: Agora você está neste mundo para consertar o que fez.\n\n" +
                nome + ": Que lugar é esse?\n\n" +
                "Professor Enigma: Esse mundo mantém a realidade funcionando. Vamos consertar as falhas nas bases numéricas.\n\n" +
                nome + ": Binário? Octal? Hexa-o-quê?\n\n" +
                "Professor Enigma: Vou te ensinar tudo.\n\n");
        pausa();

        String resposta = perguntaInicio(); // Função para chamar a pergunta


        if (resposta.equals("C")) {
            System.out.println("Professor Enigma: Inacreditável, você sabe disso! Meus parabéns, você sobreviveria aqui!");
            pausa();
            System.out.println("\nProfessor Enigma: Muito bem, agora preste atenção!");
            pausa();
        } else {
            System.out.println("Resposta incorreta.");
            pausa();
        }

        System.out.println("Professor Enigma: O sistema binário é composto por dígitos chamados bits. Cada bit pode ser 0 ou 1.");
        pausa();
        System.out.println("Professor Enigma: Mas o segredo está nas posições! Cada posição vale o dobro da anterior: 1, 2, 4, 8, 16, 32...");
        pausa();
        System.out.println("Professor Enigma: Isso porque cada posição representa uma **potência de 2**.");
        pausa();
        System.out.println("\nProfessor Enigma: Veja este exemplo com o número 5:");
        pausa();

        System.out.println("Decimal: 5 --> Como chegamos a isso?");
        pausa();
        System.out.println("Resposta: 5 = 4 + 1 --> Ou seja: 2² + 2?");
        pausa();
        System.out.println("Tabela:    8  4  2  1");
        System.out.println("Binário:   0  1  0  1 --> Resultado final: 0101\n");
        pausa();

        System.out.println("Professor Enigma: Viu como é simples? O bit vale 1 quando usamos a potência de 2, e 0 quando não usamos.");
        pausa();

        System.out.println("\nProfessor Enigma: Crie uma tabela dos números em base 2 (de 1 até 1024). Vamos testar!\n\n");
        pausa();

        for (int i = 0; i < 11; i++) {
            System.out.print(nome + ", digite um número da tabela binária: ");
            numero = input.nextInt();

            if (numero == 1 || numero == 2 || numero == 4 || numero == 8 ||
                    numero == 16 || numero == 32 || numero == 64 ||
                    numero == 128 || numero == 256 || numero == 512 || numero == 1024) {
                System.out.println("Número válido! Boa!");
                pausa();
            } else {
                System.out.println("Número inválido! Tente novamente.");
                pausa();
                i--;
            }
        }

        System.out.println("\nProfessor Enigma: Excelente. Esses são os **poderes do 2** ? com eles, você pode representar qualquer número!");
        pausa();
        System.out.println("Professor Enigma: Veja, quanto é 13 em binário?\n");
        pausa();

        System.out.println("Tabela: 1024 512 256 128 64 32 16 8 4 2 1");
        System.out.println("Binário:  0   0   0   0   0  0  0 1 1 0 1");
        System.out.println("Soma: 8 + 4 + 1 = 13 --> Resultado: 00000001101\n\n");
        pausa();

        System.out.println("Professor Enigma: Agora sim, estamos prontos para os verdadeiros desafios.");
        pausa();

        int n = nDecimal();
        String binario = conversaoParaBinario(n);
        desafioAdivinheOBinario(n, binario);

        desafioOPoderDoDois();

        System.out.println("\nProfessor Enigma: MAGNÍFICO, " + nome + "! Você realmente pegou o jeito do binário.");
        pausa();
        System.out.println("Professor Enigma: Com esse conhecimento, você está pronto para o próximo passo.");
        pausa();

        System.out.println("\n" + nome + ": Uau! Conseguimos! Achei que ia ficar preso no '0' e '1' para sempre.");
        pausa();
        System.out.println(nome + ": Então, qual é a próxima falha na realidade que precisamos consertar?");
        pausa();

        System.out.println("\nProfessor Enigma: O sistema binário é a chave para os computadores, mas há outros desafios à frente.");
        pausa();
        System.out.println("Professor Enigma: Prepare-se! Nosso próximo destino é o **Cofre Octal**. Lá, novas falhas na realidade nos aguardam!");
        pausa();
        System.out.println("Professor Enigma: Você está pronto para desvendar os segredos de base 8?");
        pausa();
        System.out.println("Digite 'SIM' para continuar ou 'NÃO' para esperar:");
        // Lê a resposta do jogador
        String resposta2 = input.next().toUpperCase();

        if (resposta2.equals("SIM")) {
            System.out.println("\nProfessor Enigma: Excelente! A aventura continua! Rumo ao Cofre Octal!");
            pausa();
        } else {
            System.out.println("\nProfessor Enigma: Entendo. Precisamos ter certeza de que você está preparado.");
            pausa();
            System.out.println("Professor Enigma: Volte quando estiver pronto para enfrentar o Cofre Octal.");
            pausa();
            System.out.println("Pressione ENTER para continuar!");
            input.nextLine();
        }

        return nome;
    }


    public static void cofreoctal(String nome){
        Scanner entrada = new Scanner (System.in);
        System.out.println("\n*****COFRE OCTAL*****\n");
        pausa();
        System.out.println("???: Depois de você dominar o binário, vocês seguem por um longo corredor feito de luzes que piscam em sequÊncia...0...1...0...1");
        pausa();
        System.out.println("???: As paredes são feitas de dados, códigos binários que fluem como água. Grandes quadros aparecem e tem algo escrito neles.\n");
        pausa();

        System.out.println(nome + ": Professor, posso ver aquele quadro?\n");
        pausa();
        System.out.println("Professor Enigma: Claro! Ele mostra o sistema octal. Ele usa apenas os números de 0 a 7. Sendo assim um sistema de base 8\n");
        pausa();
        System.out.println(nome + ": Base 8? Vai me dizer que tem outro universo de números agora?\n");
        pausa();
        System.out.println("Professor Enigma: Isso mesmo pequeno gafanhoto! Eu posso te dar um exemplo:\n\n");
        pausa();

        System.out.println("Professor Enigma: Você sabe como funciona o sistema decimal né?");
        pausa();
        System.out.println("Professor Enigma: Só pra resumir, o sistema decimal trabalha por casas, cada casa vale 10x mais que o próximo");
        pausa();
        System.out.println("Professor Enigma: Então com o número 345, o 3 vale 300 (centena), o 4 vale 40 (decimal) e o 5 vale 5 (unidade)");
        pausa();
        System.out.println("Professor Enigma: Então 345 = 3×10² + 4×10¹ + 5×10⁰");
        pausa();
        System.out.println("Professor Enigma: No octal é a mesma lógica só muda que é por 8, então para fazer uma conversão de octal para decimal só mudar o 10 pelo 8\n\n");
        pausa();

        System.out.println(nome+ ": Acho que estou pegando o jeito ein, tu só vai ficar me explicando?\n");
        pausa();
        System.out.println("Professor Enigma: Já tá sabendo muito é?\n");
        pausa();

        System.out.println("Então eu te pergunto, qual é o resultado da conversão do número 345₈(na base8) em decimal (na base10)?");
        System.out.println("A) 227₁₀\nB) 229₁₀\nC) 137₈");
        System.out.println("DIGITE SUA RESPOSTA(sem espaço):  ");
        String respostaoc = entrada.nextLine().toLowerCase();

        if(respostaoc.equals("b")){
            System.out.println("\nProfessor Enigma: Pelo visto o aprendiz está bem demais..........\n");
            pausa();
        }
        else{
            System.out.println("\nProfessor Enigma: O problema é que tu se acha muito, mas tem uma solução..........\n");
            pausa();
        }

        System.out.println("???: Assim que o Professor disse essas palavras, as luzes começam a piscar. O corredor que era fluido e calmo começa a tremer.\n");
        pausa();
        System.out.println("???: BOOOOOOOM! \n");
        pausa();
        System.out.println("Professor Enigma: O corredor está fechando e o tempo está quebrando!");
        pausa();
        System.out.println("???: Linhas de códigos se soltam das paredes, o chão começa a se desfazer.\n");
        pausa();
        System.out.println("Professor Enigma: CORRA! Antes que tudo se acabe!\n");
        pausa();
        System.out.println("???: Começam a correr entre destroços digitais e no fim do corredor surge uma luz forte - ");
        pausa();
        System.out.println("???: Um cofre flutuante que está cheio de fios por volta\n");
        pausa();
        System.out.println("Professor Enigma: Ali! O COFRE OCTAL! ELE GUARDA O EQUILÍBRIO DO SISTEMA.\n");
        pausa();
        System.out.println("???: O cofre é octagonal, com uma frase: 'A sabedoria de oito controla o tempo' ");
        pausa();
        System.out.println("???: O chão grita, o ar vibra\n");
        pausa();
        System.out.println("Professor Enigma: Só tem uma chance, fazendo o desafio que eles vão dar!");
        pausa();
        System.out.println("???: Surge uma mensagem em letras flutuantes: 'SOMENTE QUEM DOMINA O BINÁRIO PODE ABRIR O CAMINHO' \n");
        pausa();
        System.out.println(nome + ": VISH E AGORA? LLKKKKKKKKKKKK\n");
        pausa();
        System.out.println("Professor Enigma: Seu desafio octal é com binário, você não aprendeu tudo? Só acerta isso e estabiliza tudo.\n");
        pausa();
        System.out.println(nome + ": Mas a conversão eu não aprendi!\n");
        pausa();
        System.out.println("Professor Enigma: Bom, eu só vou te explicar porque nesse universo você não vai ter outra chance, então vou te ajudar.\n");
        pausa();
        System.out.println("Professor Enigma: Cada grupo de três bits representa um digito octal. Simples assim!");
        pausa();
        System.out.println("Professor Enigma: Pegue os números binários da direita pra esquerda, em grupos de três.");
        pausa();
        System.out.println("Professor Enigma: Por exemplo o binário 110010 se dividem em 110 e 010");
        pausa();
        System.out.println("Professor Enigma: Binário: ---8---4---2---1");
        pausa();
        System.out.println("Professor Enigma:     6  = ---0---1---1---0");
        pausa();
        System.out.println("Professor Enigma:     2  = ---0---0---1---0");
        pausa();
        System.out.println("Professor Enigma: Então a conversão de binário 110010 para octal seria 62\n");
        pausa();

        desafioBinarioOctal();

        System.out.println("\nProfessor Enigma: Agora que você desbloqueou essa parte..........\n");
        pausa();
        System.out.println("???: BOOOOOOOM!\n");
        pausa();
        System.out.println("Professor Enigma: QUE BARULHO FOI ESSE?\n");
        pausa();
        System.out.println("???: Um portal começa se abrir com simbolos estranhos, letras e números. A realidade já está se reconfigurando\n");
        pausa();
        System.out.println(nome + ": Professor, o que está acontecendo? Não tô entendendo mais nada\n");
        pausa();
        System.out.println("Professor Enigma: Será que tá vindo a próxima fase?\n");
        pausa();
        System.out.println("???: Estão sendo sugados para outra dimensão!\n");
        pausa();
        System.out.println("Professor Enigma: OLha só! A parte HEXADECIMAL já está por vir. Por lá tem CHAVES que te levam próximo da realidade!\n\n");
        pausa();
        System.out.println("Professor Enigma: Tem certeza de que quer mergulhar nesse lugar? (SIM/NÃO)");

        System.out.println("\nJogador: ");
        String resposta4 = entrada.next().toUpperCase();
        if (resposta4.equals("SIM")) {
            System.out.println("\nProfessor Enigma: Excelente! A aventura continua! Rumo a Chave Hexadecimal!");
            pausa();
        }
        else {
            System.out.println("\nProfessor Enigma: Entendo. Precisamos ter certeza de que você está preparado.");
            pausa();
            System.out.println("Professor Enigma: Você pode retornar ao menu para rever seus conhecimentos ou descansar.");
            pausa();
            menu();
        }
    }


    public static void chavehexadecimal(String nome){
        Scanner entrada = new Scanner (System.in);
        System.out.println("\n\n*****CHAVE HEXADECIMAL*****\n\n");
        pausa();
        System.out.println(nome + ": Não tenho escolha, quero encarar isso tudo de frente!\n");
        pausa();

        System.out.println("???: Você sente como se tivesse sendo desmontado em dados... e usado de outro jeito.");
        pausa();
        System.out.println("???: Quando abre os olhos está em um vale com silêncio e escuridão. " +
                "Rochas flutuando como se o tempo tivesse parado");
        pausa();
        System.out.println("???: De longe já se vê uma torre formada por códigos piscantes: Com letras de A a F e números embaralhados.\n");
        pausa();

        System.out.println("Professor Enigma: Seja bem vindo á Margem dos Digitos. Aqui,tudo é mantido pelo sistema hexadecimal.\n");
        pausa();
        System.out.println(nome + ": Porque tem letras voando?\n");
        pausa();

        System.out.println("Professor Enigma: Porque aqui, os números não terminam no 9. Depois dele, vem o A, depois o B, até o F. ");
        System.out.println("Professor Enigma: A = 10, B = 11 até F = 15, sendo uma base de 16.");
        System.out.println("Professor Enigma: Na base decimal, contamos: 0, 1, 2.. até 9. Aqui é: 0, 1, 2... 9, A, B, C, D, E, F.\n");
        pausa();

        System.out.println("???: Um tremor começa a sacudir o vale. Do céu, uma estrela de código cai bem na frente, abrindo uma cratera de luz.\n");
        pausa();
        System.out.println("Professor Enigma: Um caminho foi revelado, vamos seguir e ver o que é.\n");
        pausa();

        desafioHexaTrilha();

        System.out.println("\n???: Ao final da trilha tem uma porta com '2F' escrito nela.");
        pausa();
        System.out.println("\nProfessor Enigma: Olha.... O número 2F em Hexadecimal, sabe o que significa?");
        pausa();
        System.out.println("Professor Enigma: Em decimal, 2F significa (2x16)+15 = 47.\n");
        pausa();
        System.out.println(nome + ": Então quer dizer que isso é pra esconder números né?.\n");
        pausa();
        System.out.println("Professor Enigma: Ou pra compactá-los. Hexadecimal é bastante usado na computação pra representar bastante valores com poucos digitos.");
        pausa();

        System.out.println("Professor Enigma: Vamos praticar um pouco. Converta agora o número hexadecimal '3C' para decimal. Mostre-me que está pronto!\n");
        pausa();
        System.out.println("???: Você para por um instante. '3C'... você se lembra da explicação do Professor: cada dígito vale algo diferente...");
        pausa();
        System.out.println("???: C é 12, então (3 * 16) + 12...");
        pausa();

        System.out.println("\nQual é o valor decimal de '3C'?");
        System.out.println("A) 48");
        System.out.println("B) 60");
        System.out.println("C) 45");
        System.out.println("D) 72");
        System.out.print("\nSua resposta (A, B, C ou D): ");
        String resp = entrada.nextLine().toUpperCase();

        if (resp.equals("B")){
            System.out.println("Excelente garoto, isso porque era um teste surpresa.\n");
            pausa();
        }
        else {
            System.out.println("Você errou mas não tem problema, o que importa é o desafio final!\n");
            pausa();
        }


        System.out.println("???: De repente, a terra treme levemente. O solo à frente se parte, revelando uma enorme porta metálica cravada em uma rocha negra.");
        pausa();
        System.out.println("???: A porta emite um som metálico e diz em voz baixa.");
        pausa();
        System.out.println("???: 'APENAS QUEM DOMINA MINHA LINGUAGEM PODE SEGUIR'.\n");
        pausa();
        System.out.println("Professor Enigma: Cada resposta correta nos aproximou desse momento. A porta reconheceu seu avanço.\n");
        pausa();
        System.out.println("???: A porta diz: 'Quem conseguir o desafio que eu propor, vai ter a chave hexadecimal para me desbloquear!\n.");

        desafioHexafixa();

        System.out.println(nome + ": Não acredito que consegui desbloquear essa parte\n");
        pausa();
        System.out.println("Professor Enigma: Realmente, seus conhecimentos estão cada vez melhores.");
        pausa();
        System.out.println("Professor Enigma: Está destrancada, você não vai abrir a porta não?");
        pausa();
        System.out.println("Professor Enigma: Vai ver o que tem atrás dela? (SIM/NÃO)");

        System.out.println("\nJogador: ");
        String resposta4 = entrada.next().toUpperCase();
        if (resposta4.equals("SIM")) {
            System.out.println("\nProfessor Enigma: Excelente! Vamos descobrir juntos!");
            pausa();
        }
        else {
            System.out.println("\nProfessor Enigma: Entendo. Precisamos ter certeza de que você está preparado.");
            pausa();
            System.out.println("Professor Enigma: Você pode retornar ao menu para rever seus conhecimentos ou descansar.");
            pausa();
            menu();
        }
    }



    public static void bossfinal(String nome){
        Scanner input = new Scanner(System.in);

        System.out.println("\nProfessor Enigma: Parabéns, " + nome + "! Você chegou ao final da jornada!\n\n"
                + "Professor Enigma: Mas cuidado, o Boss Final está à sua espera!\n\nEle é o mestre das bases numéricas e não vai facilitar!\n\n"
                + "Prepare-se para o desafio final, onde suas habilidades em binário, octal e hexadecimal serão testadas ao máximo!\n\nBoa sorte, " + nome + "!" + " Você vai precisar!\n");
        pausa();

        System.out.println("Pressione ENTER para enfrentar o Boss Final!");
        input.nextLine();

        System.out.println("Você se aproxima do Boss Final, que está cercado por números e símbolos de todas as bases numéricas.\n\n"
                + "Boss Final: Bem-vindo, " + nome + "! Você chegou longe, mas agora terá que provar seu valor!\n\n"
                + "Boss Final: Responda corretamente às minhas perguntas e você poderá salvar a realidade!\n\n"
                + "Boss Final: Mas cuidado, uma resposta errada e você será derrotado!\n\n"
                + "Boss Final: Vamos começar!\n\n");
        pausa();

        System.out.println("Você quer enfrentar o boss no modo fácil ou difícil? (Digite '0' para fácil ou '1' para difícil)");

        int dificuldade = input.nextInt();

        while (dificuldade < 0 || dificuldade > 1) {
            System.out.println("Opção inválida! Digite '0' para fácil ou '1' para difícil.");
            dificuldade = input.nextInt();
        }
        if (dificuldade == 0) {
            System.out.println("Você escolheu o modo fácil! Boa sorte!");
            pausa();
            bossFinalModoFacil();

        } else if (dificuldade == 1) {
            System.out.println("Você escolheu o modo difícil! Prepare-se para um verdadeiro desafio!");
            pausa();
            bossFinalModoDificil();
        }

        System.out.println("Parabéns, " + nome + "! Você derrotou o Boss Final e salvou a realidade!\n\n"
                + "Professor Enigma: Você provou ser um verdadeiro mestre das bases numéricas!\n\n"
                + "Professor Enigma: Com seu conhecimento, você restaurou a ordem no mundo e consertou o que estava quebrado!\n\n"
                + "Professor Enigma: Agora você pode voltar para casa, mas lembre-se, o conhecimento é a chave para tudo!\n\n"
                + "Professor Enigma: Obrigado por jogar, " + nome + "! Até a próxima aventura!\n\n");
        pausa();

        mostrarFim();

        System.out.println("Pressione ENTER para ir ao Modo Estudo!");
        input.nextLine(); // Consome o ENTER pendente do nextInt()
        input.nextLine(); // Aguarda o ENTER real do usuário
        System.out.println("Indo para o MODO ESTUDO");
        pausa();
    }



    public static void main(String[] args) {

        int opcao;
        do{
            opcao = menu();
            switch (opcao){
                case 1:
                    String nome = inicio();
                    cofreoctal(nome);
                    chavehexadecimal(nome);
                    bossfinal(nome);
                    modoEstudo();
                    break;
                case 2:
                    instrucoes();
                    break;
                case 3:
                    creditos();
                    break;
                case 4:
                    System.out.println("Até LOGO! Saindo...");
            }
        }while(opcao != 4);
    }
}