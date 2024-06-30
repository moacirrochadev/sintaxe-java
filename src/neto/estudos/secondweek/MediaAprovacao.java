package neto.estudos.secondweek;
public class MediaAprovacao {
    public static void main(String[] args) {
        double nota1 = 6.7;
        double nota2 = 5.3;
        double media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("APROVADO por média!");
        } else if (media < 6) {
            System.out.println("O aluno foi REPROVADO!");
        }
    }
}
