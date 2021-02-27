/**
*Codigo desarrollado para la practica Tarea 6
*@author: FOC
*@version: curso20/21
*@see <a href="https://www.foc.es/" /> Web del centro </a>
*@link clases.Circulo
*@see clases.Circulo
*/
import clases.Circulo;
import clases.Figura;
import clases.Rectangulo;
import clases.Triangulo;

public class Main {
	/**
	* Metodo principal donde crearemos los objetos y le daremos valor para 		*usar el proyecto
	*/
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        
        circulo.setRadio(44.55);
        rectangulo.setBase(30);
        rectangulo.setAltura(40);
        triangulo.setBase(50);
        triangulo.setAltura(60);
        
        System.out.println("Area del circulo "+calcularArea(circulo));
        System.out.println("Area del rectangulo "+calcularArea(rectangulo));
        System.out.println("Area del Triangulo "+calcularArea(triangulo));
       }
		/*
		*@see figura.java
		*/
    public static double calcularArea(Figura f){ // Ejemplo de uso de polimorfismo
        
        return f.CalcularArea();
    }
}
