import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner entrada;
    private static long res = 0;
    private static long fat = 0;

    public static void main ( String args [ ] ) {
        long num = 0;
        entrada = new Scanner ( System.in );
        do {
            System.out.println ( "Entre com um numero inteiro ou \"-1\" para sair: " );
            try {
                num = lerEntrada ( entrada );
            } catch ( ErroValidacao erro ) {
                System.out.println ( "Entrada inválida!" );
                System.out.println ( "Causa: " + erro.getCause ( ) );
                erro.printStackTrace( System.out );
                System.exit ( -1 );
            }
            if ( num == -1 )
                System.exit ( 0 );
            else
                try {
                    System.out.println ( "O fatorial de " + num + " eh: " + calcularFatorial( num ) );
                } catch ( ErroValidacao erro ) {
                    erro.printStackTrace( System.out );
                }
        } while ( num >= 0 );
    }
    private static long lerEntrada ( Scanner entrada ) throws ErroValidacao {
        try {
            return entrada.nextLong();
        } catch ( InputMismatchException erro_entrada ) {
            ErroValidacao erro = new ErroValidacao ( "A entrada " + entrada.next() + " nao eh um numero inteiro!" );
            erro.atribuirCausa ( erro_entrada );
            throw erro;
        }
    }
    private static long calcularFatorial ( long num ) throws ErroValidacao {
        if ( num > 0 ) {
            res = calcularFatorial ( num - 1 );
            fat = num * res;
            if ( ( fat / res ) != num ) {
                throw new ErroValidacao ( "Overflow! Estouro de pilha");
            }
            else
                return fat;
        }
        else
            return 1;
    }
}




/*
Teste sem as validacoes
import java.util.Scanner;

public class Main {
    private static Scanner entrada;
    private static long res = 0;
    private static long fat = 0;

    public static void main(String args[]) {
        long num = 0;
        entrada = new Scanner(System.in);
        do {
            System.out.println("Entre com um numero inteiro ou \"-1\" para sair: ");
            num = entrada.nextLong(); // Não há validação de entrada aqui.
            if (num == -1)
                System.exit(0);
            else {
                System.out.println("O fatorial de " + num + " eh: " + calcularFatorial(num));
            }
        } while (num >= 0);
    }

    private static long calcularFatorial(long num) {
        if (num > 0) {
            res = calcularFatorial(num - 1);
            fat = num * res;
            // Este trecho lida com o "overflow" na multiplicação (isso pode ocorrer em números grandes)
            if ((fat / res) != num) {
                System.out.println("Overflow! Estouro de pilha");
                System.exit(-1);
            } else
                return fat;
        } else
            return 1;
        return num;
    }
}
*/
