/*
Implemente uma classe `QuadradoRedimensionavel`, que é _subclasse_ de 
`Quadrado` e implementa a interface `Redimensionavel`. 
Essa classe deve _implementar_  um construtor que recebe o valor de 
`lado` e o transmite para o construtor da __superclasse__.
*/
public class QuadradoRedimensionavel extends Quadrado implements Redimensionavel {
    
    public QuadradoRedimensionavel(double lado) {
        super(double lado);
    }

    public void redimensionar(int percentual) {
        this.lado = (this.lado / 100) * percentual;
    }
}
