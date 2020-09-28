/**
* Uma classe que mantém as informações sobre um círculo.
*/
public class Circulo
{
    // Os campos.
    private double raio = 1.0;
    private String cor = "vermelho";
    
    // Construtores
    public Circulo() { }
    public Circulo(double raio) {
        this.raio = raio;
    }

    /* (a)
    Adicione à classe um _construtor_ que permita criar um `Circulo` com 
    dois marâmetros: um `double` para o `raio` e um `String` para `cor`. 
    Use a assinatura abaixo como base:
    */
    public Circulo(double raio, String cor) {
        // escreva aqui sua resposta
        this.raio = raio;
        this.cor = cor;
    }

    // Métodos de acesso
    public double getRaio() {
        return raio;
    }

    /* (c)
    Um aluno escreveu o seguinte código para a classe `Circulo`:
    */
    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", cor=" + cor + "]";
    }
    // O que a palavra `@Override` indica? Por que ela foi colocada neste método da classe?
    // Resposta: Serve para garantir que a função abaixo ira sobrescrever um método ao invés de criar outro;
    // Foi colocada para sobrescrever o metodo toString nativo
}