import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    
    DatabaseAdmin terry;
    
    @Before
    public void before(){
        terry = new DatabaseAdmin("Terry", "ADCS123", 40000);
    }

    @Test
    public void hasName(){
        assertEquals("Terry", terry.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("ADCS123", terry.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000, terry.getSalary());
    }


    @Test
    public void canRaiseSalary(){
        terry.raiseSalary(1500.0);
        assertEquals(41500, terry.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(400, terry.payBonus());
    }

    @Test
    public void canSetName(){
        terry.setName("Joseph");
        assertEquals("Joseph", terry.getName());
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void cantSetNameToNull(){
        exception.expect(IllegalArgumentException.class);
        terry.setName(null);
    }

    @Test
    public void cantRaiseSalaryWithNegativeValue(){
        exception.expect(IllegalArgumentException.class);
        terry.raiseSalary(-3000.00);
    }
}
