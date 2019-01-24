
package bootcamp_ejercicio_1;

import java.util.ArrayList;

public class Bootcamp_Ejercicio_1 
{


    public static void main(String[] args) 
    {
        //1.A los metodos de cada clase excepto D van a retornar un String.
        //Creo los objetos
        A a = new A();
        A b = new B();
        A c = new C();
        A d = new D();
        
        //Muestro en consola el resultado de ejecutar el método dentro de cada uno de los objetos.
        System.out.println(a.whoIam());
        System.out.println(b.whoIam());
        System.out.println(c.whoIam());
        System.out.println(d.whoIam());
        
        //1.B Usar un arraylist en el que guardar todas las clases, recorrerlo y llamar al metodo whoIam (quien soy?).
        //Creo el listado
        ArrayList<A> ClassList = new ArrayList();
        //Le inserto la información
        ClassList.add(a);
        ClassList.add(b);
        ClassList.add(c);
        ClassList.add(d);
        //Recorro el listado con un foreach y ejecuto el método whoIam de cada uno de los obj guardados dentro del mismo
        for(A x : ClassList)
        {
            System.out.println(x.whoIam());
        }
    }
    
}
