import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Tecnico t1 = new Tecnico("Dorival Júnior", "Brasileiro", 1962);
        Tecnico t2 = new Tecnico("Abel Ferreira", "Português", 1978);

        Time time1 = new Time("Flamengo", "Rio de Janeiro", 1895);
        time1.escalarTecnico(t1);

        Time time2 = new Time("Palmeiras", "São Paulo", 1914);
        time2.escalarTecnico(t2);

        System.out.println(time1);
        System.out.println(time2);

        Tecnico t3 = new Tecnico("Tite", "Brasileiro", 1961);
        time1.escalarTecnico(t3);

        System.out.println("Após a troca:");
        System.out.println(time1);
        System.out.println(time2);

        Scanner leitor = new Scanner(System.in);
        Time time3 = criarTime(leitor);
        System.out.println(time3);
    }

    public static Tecnico criarTecnico(Scanner leitor) {
        System.out.println("  -- Dados do Técnico --");

        System.out.print("  Nome: ");
        String nome = leitor.nextLine();

        System.out.print("  Nacionalidade: ");
        String nacionalidade = leitor.nextLine();

        System.out.print("  Ano de Nascimento: ");
        int anoNascimento = leitor.nextInt();
        leitor.nextLine();

        return new Tecnico(nome, nacionalidade, anoNascimento);
    }

    public static Time criarTime(Scanner leitor) {
        System.out.println("-- Dados do Time --");

        System.out.print("Nome: ");
        String nome = leitor.nextLine();

        System.out.print("Cidade: ");
        String cidade = leitor.nextLine();

        System.out.print("Ano de Fundação: ");
        int anoFundacao = leitor.nextInt();
        leitor.nextLine();

        Time time = new Time(nome, cidade, anoFundacao);

        Tecnico tecnico = criarTecnico(leitor);
        time.escalarTecnico(tecnico);

        return time;
    }
}
