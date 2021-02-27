package clases;
/**
*Clase publica triangulo
*Calcula el area de un triaguangulo
*@author: FOC
*@version: curso20/21
*@see <a href="https://www.foc.es/" /> Web del centro </a>
*/
public class Triangulo extends Figura{
    
    private double base;
    private double altura;
	/*
	*Metodo que calcula el area del triangulo
	*@return el valor del area
	*/
    public double CalcularArea() {        
        return this.area=(base*altura)/2;
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
