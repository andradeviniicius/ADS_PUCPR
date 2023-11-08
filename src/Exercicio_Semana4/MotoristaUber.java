package Exercicio_Semana4;

public class MotoristaUber {

    String nome;
    int idMotorista;

    Carro carro;

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }

    public int getIdMotorista() {
        return idMotorista;
    }

    public String getNome() {
        return nome;
    }
}
