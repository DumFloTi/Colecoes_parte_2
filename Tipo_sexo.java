/**
 * Aqui dividimos por grupo de sexo
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Tipo_sexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Criar Array para armazenar os grupos
        ArrayList<Pessoa> grupoMasculino = new ArrayList<>();
        ArrayList<Pessoa> grupoFeminino = new ArrayList<>();

        //Definir o numero de pessoas que temos que dividir em grupos
        System.out.println("Quantas pessoas você quer registrar?");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        //Usei o numero de pessoas para meter num for, a quantidade vai definir o numero de vezes que iremos repetir o processo
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = scanner.nextLine();
            
            //Usei o trim(), para remover os espaçoes em branco, a esquerdo e direita. Tambem usei toUpperCase, para uniformizar os char e facilitar na altura da verificação do sexo
            System.out.println("Digite o sexo da pessoa (Masculino(M)/Feminino(F)) " + (i + 1) + ":");
            String sexo = scanner.nextLine().trim().toUpperCase();

            //Podemos fazer de forma rapida M ou F, mas para precaver, tambem fiz de modo extenso Masculino ou Feminino
            while (!sexo.equals("M") && !sexo.equals("F") && !sexo.equals("MASCULINO") && !sexo.equals("FEMININO")) {
                System.out.println("Entrada inválida. Por favor, digite 'M' para masculino, 'F' para feminino, 'Masculino' ou 'Feminino':");
                sexo = scanner.nextLine().trim().toUpperCase();
            }

            //Nesta parte do processo, fazemos a separação por grupos M - Masculino / F - Feminino
            Pessoa pessoa = new Pessoa(nome, sexo);

            if (sexo.equals("M") || sexo.equals("MASCULINO")) {
                grupoMasculino.add(pessoa);
            } else if (sexo.equals("F") || sexo.equals("FEMININO")) {
                grupoFeminino.add(pessoa);
            }
        }

        scanner.close();

        //Aqui mostramos o resultado final, a separação das pessoas por tipo de sexo, em grupo diferentes
        System.out.println("\nGrupo Masculino:");
        for (Pessoa p : grupoMasculino) {
            System.out.println("Nome: " + p.getNome() + ", Sexo: Masculino");
        }

        System.out.println("\nGrupo Feminino:");
        for (Pessoa p : grupoFeminino) {
            System.out.println("Nome: " + p.getNome() + ", Sexo: Feminino");
        }
    }
}
