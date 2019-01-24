package bootcamp_ejercicio_2;

public class D implements InterfazA,InterfazB
{
    @Override
    public void mensajeAlianza() 
    {
        System.out.println("Por la Alianza, nuevamente!");
    }
    @Override
    public void mensajeHorda()
    {
        System.out.println("Por la Horda!");
    }
    
}
