import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe seu salario: ");
        double salario = ler.nextDouble();
        System.out.println("");

        if(salario <= 280.00){
            double novsalario = (salario + (0.20*salario));
            System.out.printf("O seu salario anterior era de %2.2f",salario);
            System.out.println("");
            System.out.printf("Voce teve um aumento de 20 por cento");
            System.out.println("");
            System.out.printf("O valor do aumento foi de %2.2f R$",(0.20*salario));
            System.out.println("");
            System.out.printf("O seu novo salario e %2.2f",novsalario);
        }

        if(salario >= 280.01 && salario <= 700.00){
            double novsalario = (salario + (0.15*salario));
            System.out.printf("O seu salario anterior era de %2.2f",salario);
            System.out.println("");
            System.out.printf("Voce teve um aumento de 15 por cento");
            System.out.println("");
            System.out.printf("O valor do aumento foi de %2.2f R$",(0.15*salario));
            System.out.println("");
            System.out.printf("O seu novo salario e %2.2f",novsalario);
        }

        if(salario >= 700.01 && salario <=1500.00){
            double novsalario = (salario + (0.10*salario));
            System.out.printf("O seu salario anterior era de %2.2f",salario);
            System.out.println("");
            System.out.printf("Voce teve um aumento de 10 por cento");
            System.out.println("");
            System.out.printf("O valor do aumento foi de %2.2f R$",(0.10*salario));
            System.out.println("");
            System.out.printf("O seu novo salario e %2.2f",novsalario);
        }

        if(salario >= 1500.01){
            double novsalario = (salario + (0.05*salario));
            System.out.printf("O seu salario anterior era de %2.2f",salario);
            System.out.println("");
            System.out.printf("Voce teve um aumento de 5 por cento");
            System.out.println("");
            System.out.printf("O valor do aumento foi de %2.2f R$",(0.05*salario));
            System.out.println("");
            System.out.printf("O seu novo salario e %2.2f",novsalario);
        }
    }
}
