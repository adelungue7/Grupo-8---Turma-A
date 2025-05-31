import java.util.Random;
import java.util.Scanner;

public class CodigoPerdido {

    public static int menu(){
         Scanner input = new Scanner(System.in);
        System.out.println("*--Menu--*");
        System.out.println("Bem Vindo ao jogo O C�DIGO PERDIDO!");
        System.out.println("1-JOGAR\n"
                + "2-INSTRU��ES\n"
                + "3-CR�DITOS\n"
                + "4-SAIR");
        return input.nextInt();
    }
    
    public static void instrucoes(){
        Scanner input = new Scanner(System.in);
        System.out.println("Voc� foi para em um mundo desconhecido gerado pelo seu erro e ser� o respons�vel por consertar\ntudo onde ir� passar por diversos desafios!\n"
                + "Esse � um jogo estilo RPG de texto. Suas respostas\n v�o definir o seu futuro, seja por respostas aos personagens\n ou por escolhas de rotas.\n"
                + "Haver�o desafios envolvendo bin�rios e outras bases a serem convertidas, exemplos:\n"
                + "1-Convers�o de bin�rio para decimal.\n"
                + "Qual o c�digo baseado no n�mero 13 em bin�rio? \n"
                + "Resposta: 1101\n\n"
                + ""
                + "Pressione ENTER para voltar ao Menu!");
        retorno();
    }
    
    public static void creditos()//fun��o que mostra os cr�ditos
    { 
        System.out.println("Jogo desenvolvido por:\nErick Yuji Concei��o\nGustavo Gol�alves Viana\nJo�o Victor Reis Alves\nNathan Ferraz Liberatti\nRafael Adelungue Da Silva");
        System.out.println("Pressione ENTER para voltar ao Menu!");
        retorno();
    }
    public static void retorno(){
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }
    
    public static void desafioAdivinheOBinario() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        // Gera um n�mero decimal entre 1 e 15 (para manter o bin�rio curto)
        int numeroDecimal = random.nextInt(15) + 1; 
        // Converte para bin�rio para saber a resposta correta (usado para valida��o)
        String respostaBinariaCorreta = Integer.toBinaryString(numeroDecimal); 

        System.out.println("\nProfessor Enigma: Prepare-se! Qual � o n�mero " + numeroDecimal + " em bin�rio?");
        System.out.println("Dica: Use a tabela 8 4 2 1 para te ajudar!");
        System.out.print("Sua resposta (apenas 0s e 1s, sem espa�os): ");

        String respostaJogador = input.nextLine().trim(); // L� a resposta e remove espa�os extras

        // Simplifica a valida��o da resposta
        // Adiciona zeros � esquerda se a resposta do jogador for menor que a correta, 
        // por exemplo, se o n�mero � 3 (bin�rio 11) e o jogador digita "11"
        // mas a resposta correta � "0011" ou "011" para padronizar
        while (respostaJogador.length() < respostaBinariaCorreta.length()) {
            respostaJogador = "0" + respostaJogador;
        }

        if (respostaJogador.equals(respostaBinariaCorreta)) {
            System.out.println("Professor Enigma: MUITO BEM! " + numeroDecimal + " em bin�rio � " + respostaBinariaCorreta + ". Voc� acertou!");
        } else {
            System.out.println("Professor Enigma: Ops, quase! A resposta correta para " + numeroDecimal + " em bin�rio � " + respostaBinariaCorreta + ".");
            System.out.println("Professor Enigma: N�o desanime, a pr�tica leva � perfei��o!");
        }
    }
    
    public static void desafioOPoderDoDois() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int numeroDesafio;
        
        // Gera um n�mero entre 1 e 100 para o desafio
        numeroDesafio = random.nextInt(100) + 1; 
        
        // Verifica se o n�mero � uma pot�ncia de 2
        // Uma pot�ncia de 2 (maior que zero) tem apenas um '1' em sua representa��o bin�ria.
        // Por exemplo: 4 (100), 8 (1000). (numero & (numero - 1)) == 0 � um truque para verificar isso.
        boolean poderDois = (numeroDesafio > 0) && ((numeroDesafio & (numeroDesafio - 1)) == 0);

        System.out.println("\nProfessor Enigma: Este n�mero � uma pot�ncia de 2? (S/N)");
        System.out.println("N�mero: " + numeroDesafio);
        System.out.print("Sua resposta: ");

        String respostaJogador = input.nextLine().toUpperCase().trim(); // L� a resposta e converte para mai�scula

        if ((respostaJogador.equals("S") && poderDois) || (respostaJogador.equals("N") && !poderDois)) {
            System.out.println("Professor Enigma: EXCELENTE! Voc� acertou! " + numeroDesafio + (poderDois ? " �" : " n�o �") + " uma pot�ncia de 2.");
        } else {
            System.out.println("Professor Enigma: Quase l�! " + numeroDesafio + (poderDois ? " �" : " n�o �") + " uma pot�ncia de 2.");
            System.out.println("Professor Enigma: Lembre-se das pot�ncias de 2: 1, 2, 4, 8, 16, 32, 64...");
        }
    }

    public static void bossFinalModoFacil() {
        // Implementa��o do modo f�cil do Boss Final
    }

    public static void bossFinalModoDificil() {
        // Implementa��o do modo dif�cil do Boss Final
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

    
    public static String inicio(){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int numero;//Receber n�meros da tabela
        String nome;//Receber o nome do jogador
       
        
        System.out.println("Digite o nome que voc� deseja: ");
        nome = input.next();

        System.out.println("#--- Lore ---#\n");
        System.out.println("???: Voc� � mais uma pessoa comum nesse mundo que chamamos de lugar pra viver...\n\n" +
        "???: Um dia voc� estava fazendo o que sempre fazia, quando nota um e-mail estranho...\n\n" +
        nome + ": Esse arquivo t� em um tipo diferente, .@#0. Estranho, ser� que � algum jogo crackeado? Vou abrir.\n\n" +
        "???: Voc� abre o arquivo e v�...\n\n" +
        nome + ": Um monte de zeros e uns???? Que neg�cio nada a ver.\n\n" +
        "???: Voc� decide digitar algo...\n\n" +
        nome + ": E se eu digitar 0???\n\n" +
        "???: Um caderno ao seu lado desaparece.\n\n" +
        nome + ": Nem, NEM A PAU, EU SOU UM MANIPULADOR DE REALIDADE?\n\n" +
        "???: Voc� brinca com a realidade at� que...\n\n" +
        nome + ": E se eu apertar o dois??\n\n" +
        "???: Eu desisto... MAS VOC� QUEBROU A REALIDADE!\n\n" +
        "Professor Enigma: Agora voc� est� neste mundo para consertar o que fez.\n\n" +
        nome + ": Que lugar � esse?\n\n" +
        "Professor Enigma: Esse mundo mant�m a realidade funcionando. Vamos consertar as falhas nas bases num�ricas.\n\n" +
        nome + ": Bin�rio? Octal? Hexa-o-qu�?\n\n" +
        "Professor Enigma: Vou te ensinar tudo.\n\n");

        System.out.println("Professor Enigma: Vamos come�ar com a primeira pergunta: O que � o sistema bin�rio?\n\n");
        System.out.println("Escolha do jogador: \nA. S�o g�neros!\nB. S�o sistemas que usam apenas dois d�gitos: 1 e 1,0.\nC. S�o sistemas que usam apenas dois d�gitos: 0 e 1.");
        System.out.println("Digite sua resposta (A/B/C): ");
        String resposta = input.next().toUpperCase();

        if (resposta.equals("C")) {
        System.out.println("Professor Enigma: Inacredit�vel, voc� sabe disso! Meus parab�ns, voc� sobreviveria aqui!");
        }   
        else if (resposta.equals("B")) {
        System.out.println("Professor Enigma: QUASE! O sistema bin�rio usa apenas 0 e 1, mas vejo que tem alguma no��o.");
        }   
        else {
        System.out.println("Professor Enigma: Deus tenha piedade de n�s. A resposta correta �: 0 e 1.");
        }

        System.out.println("\nProfessor Enigma: Muito bem, agora preste aten��o!");
        System.out.println("Professor Enigma: O sistema bin�rio � composto por d�gitos chamados bits. Cada bit pode ser 0 ou 1.");
        System.out.println("Professor Enigma: Mas o segredo est� nas posi��es! Cada posi��o vale o dobro da anterior: 1, 2, 4, 8, 16, 32...");
        System.out.println("Professor Enigma: Isso porque cada posi��o representa uma **pot�ncia de 2**.");
        System.out.println("\nProfessor Enigma: Veja este exemplo com o n�mero 5:");

        System.out.println("Decimal: 5 --> Como chegamos a isso?");
        System.out.println("Resposta: 5 = 4 + 1 --> Ou seja: 2� + 2?");
        System.out.println("Tabela:    8  4  2  1");
        System.out.println("Bin�rio:   0  1  0  1 --> Resultado final: 0101\n");

        System.out.println("Professor Enigma: Viu como � simples? O bit vale 1 quando usamos a pot�ncia de 2, e 0 quando n�o usamos.");

        System.out.println("\nProfessor Enigma: Crie uma tabela dos n�meros em base 2 (de 1 at� 1024). Vamos testar!\n\n");

        for (int i = 0; i < 11; i++) {
        System.out.print(nome + ", digite um n�mero da tabela bin�ria: ");
        numero = input.nextInt();

        if (numero == 1 || numero == 2 || numero == 4 || numero == 8 ||
        numero == 16 || numero == 32 || numero == 64 ||
        numero == 128 || numero == 256 || numero == 512 || numero == 1024) {
        System.out.println("N�mero v�lido! Boa!");
            } 
        else {
        System.out.println("N�mero inv�lido! Tente novamente.");
        i--; // Repete a tentativa
            }
        }

        System.out.println("\nProfessor Enigma: Excelente. Esses s�o os **poderes do 2** ? com eles, voc� pode representar qualquer n�mero!");
        System.out.println("Professor Enigma: Veja, quanto � 13 em bin�rio?\n");

        System.out.println("Tabela: 1024 512 256 128 64 32 16 8 4 2 1");
        System.out.println("Bin�rio:  0     0   0   0   0  0   0  1 1 0 1");
        System.out.println("Soma: 8 + 4 + 1 = 13 --> Resultado: 00000001101\n\n");

        System.out.println("Professor Enigma: Agora sim, estamos prontos para os verdadeiros desafios.");

        desafioAdivinheOBinario();
        desafioOPoderDoDois();

        System.out.println("\nProfessor Enigma: MAGN�FICO, " + nome + "! Voc� realmente pegou o jeito do bin�rio.");
        System.out.println("Professor Enigma: Com esse conhecimento, voc� est� pronto para o pr�ximo passo.");

        System.out.println("\n" + nome + ": Uau! Conseguimos! Achei que ia ficar preso no '0' e '1' para sempre.");
        System.out.println(nome + ": Ent�o, qual � a pr�xima falha na realidade que precisamos consertar?");

        System.out.println("\nProfessor Enigma: O sistema bin�rio � a chave para os computadores, mas h� outros desafios � frente.");
        System.out.println("Professor Enigma: Prepare-se! Nosso pr�ximo destino � o **Cofre Octal**. L�, novas falhas na realidade nos aguardam!");
        System.out.println("Professor Enigma: Voc� est� pronto para desvendar os segredos de base 8?");
        System.out.println("Digite 'SIM' para continuar ou 'N�O' para esperar:");
        // L� a resposta do jogador
        String resposta2 = input.next().toUpperCase();
        if (resposta2.equals("SIM")) {
        System.out.println("\nProfessor Enigma: Excelente! A aventura continua! Rumo ao Cofre Octal!");
        // Chame aqui a fun��o que inicia o desafio Octal
        // Ex: iniciarDesafioOctal(input, nome);
            } 
        else {
        System.out.println("\nProfessor Enigma: Entendo. Precisamos ter certeza de que voc� est� preparado.");
        System.out.println("Professor Enigma: Volte quando estiver pronto para enfrentar o Cofre Octal.");
        // espera o jogador pressionar ENTER para continuar o jogo
        System.out.println("Pressione ENTER para continuar!");
        input.nextLine(); // Aguarda o jogador pressionar ENTER
            }

        return nome;
    }
    
    public static void cofreoctal(String nome){
        
    }
    
    public static void chavehexadecimal(String nome){
        
    }
    
    public static void bossfinal(String nome){
        Scanner input = new Scanner(System.in);

        System.out.println("\nProfessor Enigma: Parab�ns, " + nome + "! Voc� chegou ao final da jornada!\n\n"
        + "Professor Enigma: Mas cuidado, o Boss Final est� � sua espera!\n\nEle � o mestre das bases num�ricas e n�o vai facilitar!\n\n"
        + "Prepare-se para o desafio final, onde suas habilidades em bin�rio, octal e hexadecimal ser�o testadas ao m�ximo!\n\nBoa sorte, " + nome + "!" + " Voc� vai precisar!\n");
        
        System.out.println("Pressione ENTER para enfrentar o Boss Final!");
        input.nextLine(); // Aguarda o jogador pressionar ENTER
        
        System.out.println("Voc� se aproxima do Boss Final, que est� cercado por n�meros e s�mbolos de todas as bases num�ricas.\n\n"
        + "Boss Final: Bem-vindo, " + nome + "! Voc� chegou longe, mas agora ter� que provar seu valor!\n\n"
        + "Boss Final: Responda corretamente �s minhas perguntas e voc� poder� salvar a realidade!\n\n"
        + "Boss Final: Mas cuidado, uma resposta errada e voc� ser� derrotado!\n\n"
        + "Boss Final: Vamos come�ar!\n\n");
        
        System.out.println("Voc� quer enfrentar o boss no modo f�cil ou dif�cil? (Digite '0' para f�cil ou '1' para dif�cil)");
        int dificuldade = input.nextInt();
        while (dificuldade < 0 || dificuldade > 1) {
            System.out.println("Op��o inv�lida! Digite '0' para f�cil ou '1' para dif�cil.");
            dificuldade = input.nextInt();
        }
        if (dificuldade == 0) {
            System.out.println("Voc� escolheu o modo f�cil! Boa sorte!");
            bossFinalModoFacil();
            
        } else if (dificuldade == 1) {
            System.out.println("Voc� escolheu o modo dif�cil! Prepare-se para um verdadeiro desafio!");
            bossFinalModoDificil();
        }

        System.out.println("Parab�ns, " + nome + "! Voc� derrotou o Boss Final e salvou a realidade!\n\n"
        + "Professor Enigma: Voc� provou ser um verdadeiro mestre das bases num�ricas!\n\n"
        + "Professor Enigma: Com seu conhecimento, voc� restaurou a ordem no mundo e consertou o que estava quebrado!\n\n"
        + "Professor Enigma: Agora voc� pode voltar para casa, mas lembre-se, o conhecimento � a chave para tudo!\n\n"
        + "Professor Enigma: Obrigado por jogar, " + nome + "! At� a pr�xima aventura!\n\n");
        
        mostrarFim(); // Chama a fun��o que exibe a mensagem de parab�ns
        
        System.out.println("Pressione ENTER para voltar ao Menu!");
        input.nextLine(); // Aguarda o jogador pressionar ENTER
        System.out.println("Voltando ao Menu...");
        menu(); // Chama a fun��o que exibe o menu principal
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
            break;
         case 2:
             instrucoes();
             break;
         case 3:
             creditos();
             break;
         case 4:
             System.out.println("At� LOGO! Saindo...");
        }
     }while(opcao != 4);
    }
}
    