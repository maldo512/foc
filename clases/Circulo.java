package clases;

import clases.Figura;
/**
*Clase publica circulo
*Calcula el area de un circulo
*@author: FOC
*@version: curso20/21
*@see <a href="https://www.foc.es/" /> Web del centro </a>
*/
/**
* La calse circulo hace llamada a la clase figura
*/
public class Circulo extends Figura{
    /*
	* atributos
	* variable constante llamada pi que recoge el valor 3.1416
	* variable radio que recoge un valor numerico
	*/
    final double pi=3.1416;
    private double radio;
	/*
	* metodo que calcula el area del circulo
	* @return el valor de area del circulo
	*/
    public double CalcularArea() {        
        return this.area=pi*radio*radio;
     }
	/*
	* constructores del radio
	*/
    public double getRadio() {
        return radio;
    }
	
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
