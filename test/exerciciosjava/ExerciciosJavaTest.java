package exerciciosjava;
import exerciciosjava.ExerciciosJava;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
public class ExerciciosJavaTest 
{
    private ExerciciosJava teste;
    public ExerciciosJavaTest() 
    {
        teste = new ExerciciosJava();
    }
    @Test
    public void Testar()
    {
        int num[] = new int[3];
        int esperado[] = new int[3];
        num[0] = 7;
        num[1] = 21;
        num[2] = -14;
        
        esperado[0] = -14;
        esperado[1] = 7;
        esperado[2] = 21;
        for (int i = 0;i<3;i++)
        {
            Assert.assertArrayEquals(esperado[i], ExerciciosJava.ordena(num), 1);
        }
    }
}
