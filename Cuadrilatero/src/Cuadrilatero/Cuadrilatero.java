
package Cuadrilatero;

/**
 *
 * @author diana
 */
public class Cuadrilatero {
    private float lado1;
    private float lado2;

    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatero(float lado1) {
        this.lado1 = lado1;
        this.lado2 = lado1;
    }
    
    public float getPerimetro(){
        return (float)(2* (lado1+lado2));
    }
    
    public float getArea(){
        return (float)(lado1*lado2);
    }
}
