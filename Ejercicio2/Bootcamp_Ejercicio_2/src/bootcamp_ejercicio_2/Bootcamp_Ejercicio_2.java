package bootcamp_ejercicio_2;

public class Bootcamp_Ejercicio_2 {

    
    public static void main(String[] args) 
    {
       /*
       Crear 2 interfaces con metodos distintos y 2 implementaciones diferentes para cada una. 
       una de ellas debera implementar solo una interfaz. 
       y la otra debera implementar las dos interfaces. 
       los metodos de las implementaciones deberan imprimir por consola diferentes mensajes.
       */
       //Creo los objetos 
       C c = new C();
       D d = new D();
       
       //Muestro en consola la implementación de las interfaces en las clases y el mensaje que cada una muestra.
       c.mensajeAlianza();
       d.mensajeHorda();
       d.mensajeAlianza();
    }
    
}
