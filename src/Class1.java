import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 0;

        while (cont < 3){
            System.out.println("Resultados para o aluno:");
            System.out.println("Nome: ");
            var nome = scanner.nextLine();
            System.out.println("Notas:");
            var notas = scanner.nextLine();

            String[] notasString = notas.split(",");

            double nota1 = Double.parseDouble(notasString[0].trim());
            double nota2 = Double.parseDouble(notasString[1].trim());
            double nota3 = Double.parseDouble(notasString[2].trim());
            double media = (nota1 + nota2 + nota3)/3;

            if(media >= 7){
                System.out.println("Parabéns, " + nome + ", você passou direto. Por acaso você programa em Java?");
            } else {
                System.out.println("Você foi reprovado, " + nome + ". Ainda bem que é só simulação, hein?");
                
            }
            cont++;
        }

    }
}