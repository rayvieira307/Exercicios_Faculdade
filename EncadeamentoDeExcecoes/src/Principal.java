public class Principal {
    public static void main(String args[]) {
        OperacaoArray calc = new OperacaoArray();
        char[] op1 = null;
        char[] op2 = null;

        // Tamanho do array reduzido para teste
        int tamanhoArray = 10;  // Use um valor mais razoável para teste, como 1024

        try {
            // Inicializando os arrays com o tamanho especificado
            op1 = new char[tamanhoArray];
            op2 = new char[tamanhoArray];
        } catch (OutOfMemoryError e) {
            Runtime runtime = Runtime.getRuntime();
            System.out.println("Memória insuficiente!");
            System.out.println("A memória total da JVM é " + runtime.totalMemory() + " e o máximo é " + runtime.maxMemory());
            System.out.println("Reconfigure a JVM usando o parâmetro -Xmx<size>. Você precisa de " + (2 * tamanhoArray) + " só para os vetores.");
            System.exit(-1);
        }

        // Concatenando os arrays
        char[] resultado = calc.concatenarArray(op1, op2);

        // Exibindo o resultado (como exemplo)
        System.out.println("Arrays concatenados com sucesso! Tamanho do resultado: " + resultado.length);
    }
}

