
import java.util.Scanner;
import java.util.Random;

public class Main{

    public static void main(String[] args){
       
        //Criando o leitor do teclado
        Scanner scan = new Scanner(System.in);

        Random rnd = new Random();

        String nome;
        String opcao; 
        int numeroUsuario;
        int numeroComputador;
        int soma;

        System.out.println("Digite seu nome:");
        nome = scan.nextLine();

        System.out.println("Ola "+nome+"! Quer jogar par ou impar?(S/N)");
        opcao = scan.nextLine();

        while(opcao.equals("S")){

        System.out.println(opcao);

        System.out.println("Digite um numero de 1 a 10:");
        numeroUsuario = scan.nextInt();

        System.out.println("Voce digitou "+numeroUsuario+"");
        if(numeroUsuario >= 1 && numeroUsuario <=10){
            System.out.println("Ok...");

            //gerando um numero aleatorio para o computador
            numeroComputador = rnd.nextInt(10)+1;
            soma = numeroUsuario + numeroComputador;

            System.out.println("NumeroComputador "+numeroComputador+" Soma:"+soma);

            if(soma % 2 == 0){
                System.out.println("O "+nome+" ganhou!!!");
            }else{
                System.out.println("O computador ganhou!!!");
            }

        }else{
            System.out.println("Numero invalido...");
        }

        System.out.println("Quer jogar outra partida(S/N)");
        opcao = scan.nextLine();
     }
    }
}
