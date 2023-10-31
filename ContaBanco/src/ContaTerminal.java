    import java.util.Locale;
    import java.util.Scanner;
    
    public class ContaTerminal {
       public static void main(String[] args){
        try (//criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o número da Agência !");
            String agencia = scanner.next();


            //imprimindo dados obtidos pelo usuario
            System.out.println("Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque");
        }

    }

    }