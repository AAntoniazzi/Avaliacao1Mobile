/* (a)
Implemente uma classe `Quadrado`, que possui um atributo 
`lado` de tipo `double`. Implemente um construtor que preenche 
o atributo `lado`. Faça com que essa classe __implemente__ a 
interface `Geometria`.
*/
public class Quadrado implements Geometria {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getPerimetro() {
        return 2 * (this.lado + this.lado);
    }

    public double getArea() {
        return this.lado * this.lado;
    }
}
