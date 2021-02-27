package clases;
/**
*Clase publica circulo
*Calcula el area de un rectagulo
*@author: FOC
*@version: curso20/21
*@see <a href="https://www.foc.es/" /> Web del centro </a>
*/
public class Rectangulo extends Figura{
    
    private double base;
    private double altura;
	/*
	* metodo que calcula el area del rectangulo
	* @return el valor de area del rectangulo
	*/
    public double CalcularArea() {        
        return this.area=(base*altura);
     }
	/*
	*constructores de la base y la altura
	*/
    public double getBase() {
        return base;
    }
	
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
