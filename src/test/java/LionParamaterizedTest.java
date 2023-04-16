import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionParamaterizedTest {
    @Mock
    Feline feline;
    private boolean hasMane;
    private String sex;

    public LionParamaterizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;

    }
    @Parameterized.Parameters
    public static Object[][] hasMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Before
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void doesHaveManeReturnCorrectValue() throws Exception {
        Lion lion = new Lion("Самец", feline, true);
        Assert.assertEquals(true, lion.doesHaveMane());
    }

}
