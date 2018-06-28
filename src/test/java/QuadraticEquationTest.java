import org.junit.Assert;
import org.junit.Test;

public class QuadraticEquationTest {
    @Test
    public void PTBH_Test() {
        QuadraticEquation equation = new QuadraticEquation();
        equation.setA(6.0);
        equation.setB(-2.0);
        equation.setC(-10.0);

        System.out.println(equation.result());
    }
}