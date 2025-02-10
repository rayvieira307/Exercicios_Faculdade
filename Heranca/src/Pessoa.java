import java.util.Random;

public class Pessoa {

    private String nome;
    private double codigo_identificador;
    private Random aleatorio;

    public Pessoa(String nome) {
        aleatorio = new Random();
        this.setNome(nome);
        this.codigo_identificador = aleatorio.nextDouble();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCodigoIdentificador (){
        return this.codigo_identificador;
    }

}
