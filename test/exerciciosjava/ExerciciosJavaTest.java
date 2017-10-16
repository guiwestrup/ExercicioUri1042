package exerciciosjava;
import exerciciosjava.ExerciciosJava;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
public class ExerciciosJavaTest 
{
    private ExerciciosJava teste;
    private Ordena ordena;
    public ExerciciosJavaTest() 
    {
        teste = new ExerciciosJava();
    }
    @Test
    public void Testar()
    {
        int[] num = {7,21,-14};
        
        int[] esperado = {-14, 7, 21};
        Assert.assertArrayEquals("Deu errado", esperado, Ordena.ordena(num));
        
    }
}
