public class OperacaoArray {

    // Método para concatenar dois arrays de char
    public char[] concatenarArray(char[] op1, char[] op2) {
        int tamnh_res = op1.length + op2.length;
        return copiarArray(op1, op2, tamnh_res);
    }

    // Método privado para realizar a cópia dos arrays
    private char[] copiarArray(char[] op1, char[] op2, int tamnh_res) {
        // Criando o array resultante com o tamanho total calculado
        char[] resultado = new char[tamnh_res];

        // Copiando os elementos de op1 para o array resultado
        System.arraycopy(op1, 0, resultado, 0, op1.length);

        // Copiando os elementos de op2 para o array resultado
        System.arraycopy(op2, 0, resultado, op1.length, op2.length);

        // Retornando o array concatenado
        return resultado;
    }
}
