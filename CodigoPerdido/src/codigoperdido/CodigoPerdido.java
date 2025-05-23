package codigoperdido;

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
    
    public static void creditos(){
        System.out.println("Jogo desenvolvido por:...");
        System.out.println("Pressione ENTER para voltar ao Menu!");
        retorno();
    }
    public static void retorno(){
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }
    
    public static void inicio(){
        Scanner input = new Scanner(System.in);
        String resposta;
        int numero;

        System.out.println("#--- Lore ---#\n");
        System.out.println("???: Você é mais uma pessoa comum nesse mundo que chamamos de lugar pra viver...\n\n" +
                "???: Um dia você estava fazendo o que sempre fazia, quando nota um e-mail estranho...\n\n" +
                "Jogador: Esse arquivo tá em um tipo diferente, .@#0. Estranho, será que é algum jogo crackeado? Vou abrir.\n\n" +
                "???: Você abre o arquivo e vê...\n\n" +
                "Jogador: Um monte de zeros e uns???? Que negócio nada a ver.\n\n" +
                "???: Você decide digitar algo...\n\n" +
                "Jogador: E se eu digitar 0???\n\n" +
                "???: Um caderno ao seu lado desaparece.\n\n" +
                "Jogador: Nem, NEM A PAU, EU SOU UM MANIPULADOR DE REALIDADE?\n\n" +
                "???: Você brinca com a realidade até que...\n\n" +
                "Jogador: E se eu apertar o dois??\n\n" +
                "???: Eu desisto... MAS VOCÊ QUEBROU A REALIDADE!\n\n" +
                "Professor Enigma: Agora você está neste mundo para consertar o que fez.\n\n" +
                "Jogador: Que lugar é esse?\n\n" +
                "Professor Enigma: Esse mundo mantém a realidade funcionando. Vamos consertar as falhas nas bases numéricas.\n\n" +
                "Jogador: Binário? Octal? Hexa-o-quê?\n\n" +
                "Professor Enigma: Vou te ensinar tudo.\n\n");

        System.out.println("Professor Enigma: Vamos começar com a primeira pergunta: O que é o sistema binário?\n\n");
        System.out.println("Escolha do jogador: \nA. São gêneros!\nB. São sistemas que usam apenas dois dígitos: 1 e 1,0.\nC. São sistemas que usam apenas dois dígitos: 0 e 1.");
        System.out.print("Digite sua resposta (A/B/C): ");
        resposta = input.nextLine().toUpperCase();

        if (resposta.equals("C")) {
            System.out.println("Professor Enigma: Inacreditável, você sabe disso! Meus parabéns, você sobreviveria aqui!");
        } else if (resposta.equals("B")) {
            System.out.println("Professor Enigma: QUASE! O sistema binário usa apenas 0 e 1, mas vejo que tem alguma noção.");
        } else {
            System.out.println("Professor Enigma: Deus tenha piedade de nós. A resposta correta é: 0 e 1.");
        }

        System.out.println("\nProfessor Enigma: Esses dígitos são chamados de bits. Cada posição representa uma potência de 2.\n");
        System.out.println("Crie uma tabela dos números em base 2 (de 1 até 1024). Vamos testar!\n\n");

        for (int i = 0; i < 11; i++) {
            System.out.print("Jogador, digite um número da tabela binária: ");
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

        System.out.println("\nProfessor Enigma: Muito bem. Esses números serão a chave para sobreviver.\n\n" +
                "Quando lhe for dado um número decimal, você deve convertê-lo para binário somando os valores da tabela.\n\n");

        System.out.println("Professor Enigma: Veja, quanto é 13 em binário?\n\n");
        System.out.println("Tabela: 1024 512 256 128 64 32 16 8 4 2 1");
        System.out.println("Binário:  0     0   0   0   0  0   0  1 1 0 1");
        System.out.println("Soma: 8 + 4 + 1 = 13 --> Resultado: 00000001101\n\n");

        System.out.println("Professor Enigma: Agora sim, estamos prontos para os verdadeiros desafios.");
    }
    
    public static void main(String[] args) {
        int opcao;
     do{
        opcao = menu();
        switch (opcao){
         case 1:
            inicio();
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
    

