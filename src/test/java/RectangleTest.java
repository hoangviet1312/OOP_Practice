import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void RectangleDrawTest_Area() {
        double height = 40;
        double width = 4;
        RectangleDraw hinhChuNhat_2 = new RectangleDraw(height, width);
        double result = hinhChuNhat_2.getArea();
        Assert.assertEquals(160.0, result, 10);
    }

    @Test
    public void RectangleDrawTest_Perimeter(){
        double height = 35.9;
        double width = 3.5;
        RectangleDraw hinhChuNhat_3 = new RectangleDraw(height, width);
        double result = hinhChuNhat_3.getPerimeter();
        Assert.assertEquals(78.8, result, 10);
    }
}
