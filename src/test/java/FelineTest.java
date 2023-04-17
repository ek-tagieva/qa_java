import com.example.Feline;
import org.junit.Test;
import org.junit.Assert;
import java.util.List;
public class FelineTest {
    @Test
    public void eatMeatReturnCorrectValue() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
    @Test
    public void getFamilyReturnCorrectValue(){
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    public void getKittensReturnCorrectValue(){
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }
    @Test
    public void getKittensReturnKittensCount(){
        Feline feline = new Feline();
        int kittensCount = 1;
        Assert.assertEquals(kittensCount, feline.getKittens(kittensCount));
    }

}
