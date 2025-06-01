import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main {

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
        retorno();
    }

    public static void creditos()//função que mostra os créditos
    {
        System.out.println("Jogo desenvolvido por:\nErick Yuji Conceição\nGustavo Gonçalves Viana\nJoão Vitor Reis Alves\nNathan Ferraz Liberatti\nRafael Adelungue Da Silva");
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

        // Converte para binário para saber a resposta correta (usado para validação)
        //respostaBinariaCorreta = Integer.toBinaryString(numeroDecimal);

        System.out.println("\nProfessor Enigma: Prepare-se! Qual é o número " + numeroDecimal + " em binário?");
        System.out.println("Dica: Use a tabela 8 4 2 1 para te ajudar!");
        System.out.print("Sua resposta (apenas 0s e 1s, sem espaços): ");

        String respostaJogador = input.nextLine().trim(); // Lê a resposta e remove espaços extras

        // Simplifica a validação da resposta
        // Adiciona zeros à esquerda se a resposta do jogador for menor que a correta,
        // por exemplo, se o número é 3 (binário 11) e o jogador digita "11"
        // mas a resposta correta é "0011" ou "011" para padronizar
        while (respostaJogador.length() < respostaBinariaCorreta.length()) {
            respostaJogador = "0" + respostaJogador;
        }

        if (respostaJogador.equals(respostaBinariaCorreta)) {
            System.out.println("Professor Enigma: MUITO BEM! " + numeroDecimal + " em binário é " + respostaBinariaCorreta + ". Você acertou!");
        } else {
            System.out.println("Professor Enigma: Ops, quase! Não desanime, a prática leva à perfeição!");
        }
    }


    public static void desafioOPoderDoDois() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int numeroDesafio;

        // Gera um número entre 1 e 100 para o desafio
        numeroDesafio = random.nextInt(100) + 1;

        // Verifica se o número é uma potência de 2
        // Uma potência de 2 (maior que zero) tem apenas um '1' em sua representação binária.
        // Por exemplo: 4 (100), 8 (1000). (numero & (numero - 1)) == 0 é um truque para verificar isso.
        boolean poderDois = (numeroDesafio > 0) && ((numeroDesafio & (numeroDesafio - 1)) == 0);

        System.out.println("\nProfessor Enigma: Este número é uma potência de 2? (S/N)");
        System.out.println("Número: " + numeroDesafio);
        System.out.print("Sua resposta: ");

        String respostaJogador = input.nextLine().toUpperCase().trim(); // Lê a resposta e converte para maiúscula

        if ((respostaJogador.equals("S") && poderDois) || (respostaJogador.equals("N") && !poderDois)) {
            System.out.println("Professor Enigma: EXCELENTE! Você acertou! " + numeroDesafio + (poderDois ? " é" : " não é") + " uma potência de 2.");
        } else {
            System.out.println("Professor Enigma: Quase lá! " + numeroDesafio + (poderDois ? " é" : " não é") + " uma potência de 2.");
            System.out.println("Professor Enigma: Lembre-se das potências de 2: 1, 2, 4, 8, 16, 32, 64...");
        }
    }

    public static void desafioBinarioOctal(){
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random ();

        int nuumeroDecimal = aleatorio.nextInt(255)+1;
        String binario = Integer.toBinaryString(nuumeroDecimal);
        String octalCorreto = Integer.toOctalString(nuumeroDecimal);

        System.out.println("\nProfessor Enigma: Agora eu vou deixar você sozinho, é a escolha de um mundo paralelo ou da realidade!");
        System.out.println("Professor Enigma: O universo vai te passar o que é pra ser feito");
        System.out.println("???: Um pedestal surge na sua frente com alguns digitos binários ");
        System.out.println("Professor Enigma: Converta esse código binário em octal e o cofre será aberto!");


        System.out.println("\nNúmero em Binário: " + binario);
        while (true){
            System.out.println("\nDIGITE O NÚMERO EM OCTAL: ");
            String respostaJo = entrada.nextLine().trim();

            if (respostaJo.equals(octalCorreto)){
                System.out.println("\nProfessor Enigma: Você realmente conseguiu, acho que vai poder abrir agora! ");
                break;
            }
            else {
                System.out.println("\nProfessor Enigma: Errado! Tente novamente, pense na conversão de binário para octal");
            }
        }
    }


    public static void desafioHexaTrilha(){
        Scanner entrada = new Scanner (System.in);

        System.out.println("???: Vocês descem por uma trilha que brilha a cada passo e ele deve estar alinhado com a equivalência do decimal para hexa: \n");
        System.out.println("Professor Enigma: Para passar na trilha está muito suave, só dizer qual o valor hexadecimal em decimal!\n ");
        System.out.println("Dica: de 10 a 15 hexadecimal, são letras de A a F.\n");

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

        if (acertos == 6){

            System.out.println("Professor Enigma: Que bom! Você dominou os valores HEXA. A trilha está cada vez mais se abrindo.\n");

        }
        else {
            System.out.println("Professsor Enigma: Não foi dessa vez mas terá outras chances ainda.\n");
        }
    }

    public static void desafioHexafixa() {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("???: Veja bem... Eu vou te mostrar um número em OCTAL.\n" +
                "???: Seu trabalho é me dizer qual é esse número em HEXADECIMAL.\n" +
                "???: Só quem domina os códigos secretos pode atravessar!\n ");

        System.out.println("Professor Enigma: Calma, jovem aventureiro! Vou te ensinar como resolver isso.\n");
        System.out.println("Professor Enigma: Primeiro, pegue o número octal e transforme em decimal.");
        System.out.println("Professor Enigma: Exemplo: 561 em octal = 5×64 + 6×8 + 1×1 = 320 + 48 + 1 = 369.");
        System.out.println("Professor Enigma: E de decimal você transforma em hexadecimal como esse exemplo: " +
                "369 ÷ 16 = 23 → resto 1\n" +
                "23 ÷ 16 = 1 → resto 7\n" +
                "1 ÷ 16 = 0 → resto 1\n ");

        System.out.println("Professor Enigma: Isso é apenas uma dica minha pra você pequeno gafanhoto, agora espere que o desafio vai vir: \n");
        System.out.println("*****5*****\n*****4*****\n*****3*****\n*****2*****\n*****1*****\n\n");

        while (true){
            int numeroDecimal = aleatorio.nextInt(64);
            String numeroOctal = Integer.toOctalString(numeroDecimal);
            String numeroHexa = Integer.toHexString(numeroDecimal).toUpperCase();


            System.out.println("Número em OCTAL: " + numeroOctal);
            System.out.print("\nDigite sua resposta (hexadecimal): ");
            String resposta = entrada.nextLine().trim().toUpperCase();
            if (resposta.equals(numeroHexa)) {
                System.out.println("Porta: Você acertou! A porta se abriu com a chave Hexadecimal\n");
                break;
            } else {
                System.out.println("Porta: Errado! A resposta correta era: " + numeroHexa);
            }
        }





    }


    public static void bossFinalModoFacil() {
        // Implementação do modo fácil do Boss Final
    }


    public static void bossFinalModoDificil() {
        // Implementação do modo difícil do Boss Final
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


        //System.out.println("Aqui o professor Enigma vai te mostrar as explicações de todas as questões que você respondeu");
        System.out.println("AQUI O PROFESSOR ENIGMA VAI TE MOSTRAR AS EXPLICAÇÕES DE TODAS AS QUESTOÕES QUE VOCÊ RESPONDEU");
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
        System.out.println("---------------------------------PRÓXIMO EXERCÍCIO---------------------------------");

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


        String resposta = perguntaInicio(); // Função para chamar a pergunta


        if (resposta.equals("C")) {
            System.out.println("Professor Enigma: Inacreditável, você sabe disso! Meus parabéns, você sobreviveria aqui!");
            System.out.println("\nProfessor Enigma: Muito bem, agora preste atenção!");
        } else {
            System.out.println("Resposta incorreta."); //depois é explicado no modo estudo
        }


        System.out.println("Professor Enigma: O sistema binário é composto por dígitos chamados bits. Cada bit pode ser 0 ou 1.");
        System.out.println("Professor Enigma: Mas o segredo está nas posições! Cada posição vale o dobro da anterior: 1, 2, 4, 8, 16, 32...");
        System.out.println("Professor Enigma: Isso porque cada posição representa uma **potência de 2**.");
        System.out.println("\nProfessor Enigma: Veja este exemplo com o número 5:");

        System.out.println("Decimal: 5 --> Como chegamos a isso?");
        System.out.println("Resposta: 5 = 4 + 1 --> Ou seja: 2² + 2?");
        System.out.println("Tabela:    8  4  2  1");
        System.out.println("Binário:   0  1  0  1 --> Resultado final: 0101\n");

        System.out.println("Professor Enigma: Viu como é simples? O bit vale 1 quando usamos a potência de 2, e 0 quando não usamos.");

        System.out.println("\nProfessor Enigma: Crie uma tabela dos números em base 2 (de 1 até 1024). Vamos testar!\n\n");

        for (int i = 0; i < 11; i++) {
            System.out.print(nome + ", digite um número da tabela binária: ");
            numero = input.nextInt();

            if (numero == 1 || numero == 2 || numero == 4 || numero == 8 ||
                    numero == 16 || numero == 32 || numero == 64 ||
                    numero == 128 || numero == 256 || numero == 512 || numero == 1024) {
                System.out.println("Número válido! Boa!");
            } else {
                System.out.println("Número inválido! Tente novamente.");
                i--; // Repete a tentativa
            }
        }

        System.out.println("\nProfessor Enigma: Excelente. Esses são os **poderes do 2** ? com eles, você pode representar qualquer número!");
        System.out.println("Professor Enigma: Veja, quanto é 13 em binário?\n");

        System.out.println("Tabela: 1024 512 256 128 64 32 16 8 4 2 1");
        System.out.println("Binário:  0   0   0   0   0  0  0 1 1 0 1");
        System.out.println("Soma: 8 + 4 + 1 = 13 --> Resultado: 00000001101\n\n");

        System.out.println("Professor Enigma: Agora sim, estamos prontos para os verdadeiros desafios.");

        int n = nDecimal();
        String binario = conversaoParaBinario(n);
        desafioAdivinheOBinario(n, binario);

        desafioOPoderDoDois();


        System.out.println("\nProfessor Enigma: MAGNÍFICO, " + nome + "! Você realmente pegou o jeito do binário.");
        System.out.println("Professor Enigma: Com esse conhecimento, você está pronto para o próximo passo.");

        System.out.println("\n" + nome + ": Uau! Conseguimos! Achei que ia ficar preso no '0' e '1' para sempre.");
        System.out.println(nome + ": Então, qual é a próxima falha na realidade que precisamos consertar?");

        System.out.println("\nProfessor Enigma: O sistema binário é a chave para os computadores, mas há outros desafios à frente.");
        System.out.println("Professor Enigma: Prepare-se! Nosso próximo destino é o **Cofre Octal**. Lá, novas falhas na realidade nos aguardam!");
        System.out.println("Professor Enigma: Você está pronto para desvendar os segredos de base 8?");
        System.out.println("Digite 'SIM' para continuar ou 'NÃO' para esperar:");
        // Lê a resposta do jogador
        String resposta2 = input.next().toUpperCase();

        if (resposta2.equals("SIM")) {
            System.out.println("\nProfessor Enigma: Excelente! A aventura continua! Rumo ao Cofre Octal!");
            // Chame aqui a função que inicia o desafio Octal
            // Ex: iniciarDesafioOctal(input, nome);
        } else {
            System.out.println("\nProfessor Enigma: Entendo. Precisamos ter certeza de que você está preparado.");
            System.out.println("Professor Enigma: Volte quando estiver pronto para enfrentar o Cofre Octal.");
            // espera o jogador pressionar ENTER para continuar o jogo
            System.out.println("Pressione ENTER para continuar!");
            input.nextLine(); // Aguarda o jogador pressionar ENTER
        }

        return nome;
    }


    public static void cofreoctal(String nome){
        Scanner entrada = new Scanner (System.in);
        System.out.println("\n*****COFRE OCTAL*****\n");
        System.out.println("???: Depois de você dominar o binário, vocês seguem por um longo corredor feito de luzes que piscam em sequÊncia...0...1...0...1");
        System.out.println("???: As paredes são feitas de dados, códigos binários que fluem como água. Grandes quadros aparecem e tem algo escrito neles.\n");

        System.out.println(nome + ": Professor, posso ver aquele quadro?\n");
        System.out.println("Professor Enigma: Claro! Ele mostra o sistema octal. Ele usa apenas os números de 0 a 7. Sendo assim um sistema de base 8\n");
        System.out.println(nome + ": Base 8? Vai me dizer que tem outro universo de números agora?\n");
        System.out.println("Professor Enigma: Isso mesmo pequeno gafanhoto! Eu posso te dar um exemplo:\n\n");

        System.out.println("Professor Enigma: Você sabe como funciona o sistema decimal né?");
        System.out.println("Professor Enigma: Só pra resumir, o sistema decimal trabalha por casas, cada casa vale 10x mais que o próximo");
        System.out.println("Professor Enigma: Então com o número 345, o 3 vale 300 (centena), o 4 vale 40 (decimal) e o 5 vale 5 (unidade)");
        System.out.println("Professor Enigma: Então 345 = 3×10² + 4×10¹ + 5×10⁰");
        System.out.println("Professor Enigma: No octal é a mesma lógica só muda que é por 8, então para fazer uma conversão de octal para decimal só mudar o 10 pelo 8\n\n");

        System.out.println(nome+ ": Acho que estou pegando o jeito ein, tu só vai ficar me explicando?\n");
        System.out.println("Professor Enigma: Já tá sabendo muito é?\n");

        System.out.println("Então eu te pergunto, qual é o resultado da conversão do número 345₈(na base8) em decimal (na base10)?");
        System.out.println("A) 227₁₀\nB) 229₁₀\nC) 137₈");
        System.out.println("DIGITE SUA RESPOSTA(sem espaço):  ");
        String respostaoc = entrada.nextLine().toLowerCase();

        if(respostaoc.equals("b")){
            System.out.println("\nProfessor Enigma: Pelo visto o aprendiz está bem demais..........\n");
        }
        else{
            System.out.println("\nProfessor Enigma: O problema é que tu se acha muito, mas tem uma solução..........\n");
        }

        System.out.println("???: Assim que o Professor disse essas palavras, as luzes começam a piscar. O corredor que era fluido e calmo começa a tremer.\n");
        System.out.println("???: BOOOOOOOM! \n");
        System.out.println("Professor Enigma: O corredor está fechando e o tempo está quebrando!\n");
        System.out.println("???: Linhas de códigos se soltam das paredes, o chão começa a se desfazer.\n");
        System.out.println("Professor Enigma: CORRA! Antes que tudo se acabe!\n");
        System.out.println("???: Começam a correr entre destroços digitais e no fim do corredor surge uma luz forte - ");
        System.out.println("???: Um cofre flutuante que está cheio de fios por volta\n");
        System.out.println("Professor Enigma: Ali! O COFRE OCTAL! ELE GUARDA O EQUILÍBRIO DO SISTEMA.\n");
        System.out.println("???: O cofre é octagonal, com uma frase: 'A sabedoria de oito controla o tempo' ");
        System.out.println("???: O chão grita, o ar vibra\n");
        System.out.println("Professor Enigma: Só tem uma chance, fazendo o desafio que eles vão dar!\n" );
        System.out.println("???: Surge uma mensagem em letras flutuantes: 'SOMENTE QUEM DOMINA O BINÁRIO PODE ABRIR O CAMINHO' \n");
        System.out.println(nome + ": VISH E AGORA? LLKKKKKKKKKKKK\n");
        System.out.println("Professor Enigma: Seu desafio octal é com binário, você não aprendeu tudo? Só acerta isso e estabiliza tudo.\n");
        System.out.println(nome + ": Mas a conversão eu não aprendi!\n");
        System.out.println("Professor Enigma: Bom, eu só vou te explicar porque nesse universo você não vai ter outra chance, então vou te ajudar.\n");
        System.out.println("Professor Enigma: Cada grupo de três bits representa um digito octal. Simples assim!");
        System.out.println("Professor Enigma: Pegue os números binários da direita pra esquerda, em grupos de três.");
        System.out.println("Professor Enigma: Por exemplo o binário 110010 se dividem em 110 e 010");
        System.out.println("Professor Enigma: Binário: ---8---4---2---1");
        System.out.println("Professor Enigma:     6  = ---0---1---1---0");
        System.out.println("Professor Enigma:     2  = ---0---0---1---0");
        System.out.println("Professor Enigma: Então a conversão de binário 110010 para octal seria 62\n");

        desafioBinarioOctal();

        System.out.println("\nProfessor Enigma: Agora que você desbloqueou essa parte..........\n");
        System.out.println("???: BOOOOOOOM!\n");
        System.out.println("Professor Enigma: QUE BARULHO FOI ESSE?\n");
        System.out.println("???: Um portal começa se abrir com simbolos estranhos, letras e números. A realidade já está se reconfigurando\n");
        System.out.println(nome + ": Professor, o que está acontecendo? Não tô entendendo mais nada\n");
        System.out.println("Professor Enigma: Será que tá vindo a próxima fase?\n");
        System.out.println("???: Estão sendo sugados para outra dimensão!\n");
        System.out.println("Professor Enigma: OLha só! A parte HEXADECIMAL já está por vir. Por lá tem CHAVES que te levam próximo da realidade!\n\n");
        System.out.println("Professor Enigma: Tem certeza de que quer mergulhar nesse lugar? (SIM/NÃO)");

        System.out.println("\nJogador: ");
        String resposta4 = entrada.next().toUpperCase();
        if (resposta4.equals("SIM")) {
            System.out.println("\nProfessor Enigma: Excelente! A aventura continua! Rumo a Chave Hexadecimal!");
        }
        else {
            System.out.println("\nProfessor Enigma: Entendo. Precisamos ter certeza de que você está preparado.");
            System.out.println("Professor Enigma: Você pode retornar ao menu para rever seus conhecimentos ou descansar.");
            menu();
        }
    }


    public static void chavehexadecimal(String nome){
        Scanner entrada = new Scanner (System.in);
        System.out.println("\n\n*****CHAVE HEXADECIMAL*****\n\n");
        System.out.println(nome + ": Não tenho escolha, quero encarar isso tudo de frente!\n");

        System.out.println("???: Você sente como se tivesse sendo desmontado em dados... e usado de outro jeito.");
        System.out.println("???: Quando abre os olhos está em um vale com silêncio e escuridão. " +
                "Rochas flutuando como se o tempo tivesse parado");
        System.out.println("???: De longe já se vê uma torre formada por códigos piscantes: Com letras de A a F e números embaralhados.\n");

        System.out.println("Professor Enigma: Seja bem vindo á Margem dos Digitos. Aqui,tudo é mantido pelo sistema hexadecimal.\n");
        System.out.println(nome + ": Porque tem letras voando?\n");

        System.out.println("Professor Enigma: Porque aqui, os números não terminam no 9. Depois dele, vem o A, depois o B, até o F. ");
        System.out.println("Professor Enigma: A = 10, B = 11 até F = 15, sendo uma base de 16.");
        System.out.println("Professor Enigma: Na base decimal, contamos: 0, 1, 2.. até 9. Aqui é: 0, 1, 2... 9, A, B, C, D, E, F.\n");

        System.out.println("???: Um tremor começa a sacudir o vale. Do céu, uma estrela de código cai bem na frente, abrindo uma cratera de luz.\n");
        System.out.println("Professor Enigma: Um caminho foi revelado, vamos seguir e ver o que é.\n");

        desafioHexaTrilha();

        System.out.println("\n???: Ao final da trilha tem uma porta com '2F' escrito nela.");
        System.out.println("\nProfessor Enigma: Olha.... O número 2F em Hexadecimal, sabe o que significa?");
        System.out.println("Professor Enigma: Em decimal, 2F significa (2x16)+15 = 47.\n");
        System.out.println(nome + ": Então quer dizer que isso é pra esconder números né?.\n");
        System.out.println("Professor Enigma: Ou pra compactá-los. Hexadecimal é bastante usado na computação pra representar bastante valores com poucos digitos.");

        System.out.println("Professor Enigma: Vamos praticar um pouco. Converta agora o número hexadecimal '3C' para decimal. Mostre-me que está pronto!\n");
        System.out.println("???: Você para por um instante. '3C'... você se lembra da explicação do Professor: cada dígito vale algo diferente...");
        System.out.println("???: C é 12, então (3 * 16) + 12...");

        System.out.println("\nQual é o valor decimal de '3C'?");
        System.out.println("A) 48");
        System.out.println("B) 60");
        System.out.println("C) 45");
        System.out.println("D) 72");
        System.out.print("\nSua resposta (A, B, C ou D): ");
        String resp = entrada.nextLine().toUpperCase();

        if (resp.equals("B")){
            System.out.println("Excelente garoto, isso porque era um teste surpresa.\n");
        }
        else {
            System.out.println("Você errou mas não tem problema, o que importa é o desafio final!\n");
        }


        System.out.println("???: De repente, a terra treme levemente. O solo à frente se parte, revelando uma enorme porta metálica cravada em uma rocha negra.");
        System.out.println("???: A porta emite um som metálico e diz em voz baixa.");
        System.out.println("???: 'APENAS QUEM DOMINA MINHA LINGUAGEM PODE SEGUIR'.\n");
        System.out.println("Professor Enigma: Cada resposta correta nos aproximou desse momento. A porta reconheceu seu avanço.\n");
        System.out.println("???: A porta diz: 'Quem conseguir o desafio que eu propor, vai ter a chave hexadecimal para me desbloquear!\n.");

        desafioHexafixa();

        System.out.println(nome + ": Não acredito que consegui desbloquear essa parte\n");
        System.out.println("Professor Enigma: Realmente, seus conhecimentos estão cada vez melhores.");
        System.out.println("Professor Enigma: Está destrancada, você não vai abrir a porta não?");
        System.out.println("Professor Enigma: Vai ver o que tem atrás dela? (SIM/NÃO)");

        System.out.println("\nJogador: ");
        String resposta4 = entrada.next().toUpperCase();
        if (resposta4.equals("SIM")) {
            System.out.println("\nProfessor Enigma: Excelente! Vamos descobrir juntos!");
        }
        else {
            System.out.println("\nProfessor Enigma: Entendo. Precisamos ter certeza de que você está preparado.");
            System.out.println("Professor Enigma: Você pode retornar ao menu para rever seus conhecimentos ou descansar.");
            menu();
        }




    }



    public static void bossfinal(String nome){
        Scanner input = new Scanner(System.in);

        System.out.println("\nProfessor Enigma: Parabéns, " + nome + "! Você chegou ao final da jornada!\n\n"
                + "Professor Enigma: Mas cuidado, o Boss Final está à sua espera!\n\nEle é o mestre das bases numéricas e não vai facilitar!\n\n"
                + "Prepare-se para o desafio final, onde suas habilidades em binário, octal e hexadecimal serão testadas ao máximo!\n\nBoa sorte, " + nome + "!" + " Você vai precisar!\n");

        System.out.println("Pressione ENTER para enfrentar o Boss Final!");
        input.nextLine(); // Aguarda o jogador pressionar ENTER

        System.out.println("Você se aproxima do Boss Final, que está cercado por números e símbolos de todas as bases numéricas.\n\n"
                + "Boss Final: Bem-vindo, " + nome + "! Você chegou longe, mas agora terá que provar seu valor!\n\n"
                + "Boss Final: Responda corretamente às minhas perguntas e você poderá salvar a realidade!\n\n"
                + "Boss Final: Mas cuidado, uma resposta errada e você será derrotado!\n\n"
                + "Boss Final: Vamos começar!\n\n");

        System.out.println("Você quer enfrentar o boss no modo fácil ou difícil? (Digite '0' para fácil ou '1' para difícil)");

        int dificuldade = input.nextInt();

        while (dificuldade < 0 || dificuldade > 1) {
            System.out.println("Opção inválida! Digite '0' para fácil ou '1' para difícil.");
            dificuldade = input.nextInt();
        }
        if (dificuldade == 0) {
            System.out.println("Você escolheu o modo fácil! Boa sorte!");
            bossFinalModoFacil();

        } else if (dificuldade == 1) {
            System.out.println("Você escolheu o modo difícil! Prepare-se para um verdadeiro desafio!");
            bossFinalModoDificil();
        }

        System.out.println("Parabéns, " + nome + "! Você derrotou o Boss Final e salvou a realidade!\n\n"
                + "Professor Enigma: Você provou ser um verdadeiro mestre das bases numéricas!\n\n"
                + "Professor Enigma: Com seu conhecimento, você restaurou a ordem no mundo e consertou o que estava quebrado!\n\n"
                + "Professor Enigma: Agora você pode voltar para casa, mas lembre-se, o conhecimento é a chave para tudo!\n\n"
                + "Professor Enigma: Obrigado por jogar, " + nome + "! Até a próxima aventura!\n\n");

        mostrarFim(); // Chama a função que exibe a mensagem de parabéns

        System.out.println("Pressione ENTER para ir ao Modo Estudo!");
        input.nextLine(); // Aguarda o jogador pressionar ENTER
        System.out.println("Indo para o MODO ESTUDO");
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