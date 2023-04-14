import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            String nome, classe, familia;

            System.out.println("Digite o nome do seu animal : ");
            nome = sc.next();
            System.out.println("Digite a classe do seu animal : ");
            classe = sc.next();
            System.out.println("Digite a família do seu animal : ");
            familia = sc.next();

            Animal pikachu = new Animal(nome, classe, familia);

            while (pikachu.isEstado()) {
                System.out.println("O que você quer fazer com o seu animal? ([1]Comer, [2]Correr, [3]Dormir, [4]Morrer)");
                int opcao = sc.nextInt();

                if (opcao == 1) {
                    pikachu.Comer();
                }
                if (opcao == 2) {
                    pikachu.Correr();
                }
                if (opcao == 3) {
                    pikachu.Dormir();
                }
                if (opcao == 4) {
                    pikachu.Morrer();
                }
            }

            System.out.println("Você quer criar outro bichinho? ([y] ou [n])");
            String novo = sc.next();

            if (novo.equals("n")) {
                continuar = false;
            }
        }

        System.out.println("Fim do programa.");
    }
}
