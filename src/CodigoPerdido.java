import java.util.Random;
import java.util.Scanner;

public class CodigoPerdido {

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
        System.out.println("Jogo desenvolvido por:\nErick Yuji Conceição\nGustavo Golçalves Viana\nJoão Victor Reis Alves\nNathan Ferraz Liberatti\nRafael Adelungue Da Silva");
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
        // Gera um número decimal entre 1 e 15 (para manter o binário curto)
        int numeroDecimal = random.nextInt(15) + 1; 
        // Converte para binário para saber a resposta correta (usado para validação)
        String respostaBinariaCorreta = Integer.toBinaryString(numeroDecimal); 

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
            System.out.println("Professor Enigma: Ops, quase! A resposta correta para " + numeroDecimal + " em binário é " + respostaBinariaCorreta + ".");
            System.out.println("Professor Enigma: Não desanime, a prática leva à perfeição!");
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

        System.out.println("Professor Enigma: Vamos começar com a primeira pergunta: O que é o sistema binário?\n\n");
        System.out.println("Escolha do jogador: \nA. São gêneros!\nB. São sistemas que usam apenas dois dígitos: 1 e 1,0.\nC. São sistemas que usam apenas dois dígitos: 0 e 1.");
        System.out.println("Digite sua resposta (A/B/C): ");
        String resposta = input.next().toUpperCase();

        if (resposta.equals("C")) {
        System.out.println("Professor Enigma: Inacreditável, você sabe disso! Meus parabéns, você sobreviveria aqui!");
        }   
        else if (resposta.equals("B")) {
        System.out.println("Professor Enigma: QUASE! O sistema binário usa apenas 0 e 1, mas vejo que tem alguma noção.");
        }   
        else {
        System.out.println("Professor Enigma: Deus tenha piedade de nós. A resposta correta é: 0 e 1.");
        }

        System.out.println("\nProfessor Enigma: Muito bem, agora preste atenção!");
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
            } 
        else {
        System.out.println("Número inválido! Tente novamente.");
        i--; // Repete a tentativa
            }
        }

        System.out.println("\nProfessor Enigma: Excelente. Esses são os **poderes do 2** ? com eles, você pode representar qualquer número!");
        System.out.println("Professor Enigma: Veja, quanto é 13 em binário?\n");

        System.out.println("Tabela: 1024 512 256 128 64 32 16 8 4 2 1");
        System.out.println("Binário:  0     0   0   0   0  0   0  1 1 0 1");
        System.out.println("Soma: 8 + 4 + 1 = 13 --> Resultado: 00000001101\n\n");

        System.out.println("Professor Enigma: Agora sim, estamos prontos para os verdadeiros desafios.");

        desafioAdivinheOBinario();
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
            } 
        else {
        System.out.println("\nProfessor Enigma: Entendo. Precisamos ter certeza de que você está preparado.");
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
        
        System.out.println("Pressione ENTER para voltar ao Menu!");
        input.nextLine(); // Aguarda o jogador pressionar ENTER
        System.out.println("Voltando ao Menu...");
        menu(); // Chama a função que exibe o menu principal
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
             System.out.println("Até LOGO! Saindo...");
        }
     }while(opcao != 4);
    }
}
    