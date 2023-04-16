import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;
import org.mockito.Mockito;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;
    @Test
    public void getKittensReturnCorrectValue() throws Exception {

        Lion lion = new Lion("Самец", feline, true);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void doesHaveManeReturnCorrectValue() throws Exception {
        Lion lion = new Lion("Самец", feline, true);
        Assert.assertEquals(true, lion.doesHaveMane());
    }

    @Test
    public void getFoodReturnCorrectValue()throws Exception{
        Lion lion = new Lion("Самка", feline, true);
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),  lion.getFood());
    }
    @Test(expected = Exception.class)
    public void testInvalidSex() throws Exception {
        Lion lion = new Lion("Неизвестный пол", new Feline(), true);
    }

}
