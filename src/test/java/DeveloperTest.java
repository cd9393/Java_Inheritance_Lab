import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    
    Developer developer;
    
    @Before
    public void before(){
        developer = new Developer("Craig", "ABC2345", 27000);
    }

    @Test
    public void hasName(){
        assertEquals("Craig", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("ABC2345", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(27000, developer.getSalary());
    }
    

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1500.0);
        assertEquals(28500, developer.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(270, developer.payBonus());
    }

    @Test
    public void canSetName(){
        developer.setName("Joseph");
        assertEquals("Joseph", developer.getName());
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void cantSetNameToNull(){
        exception.expect(IllegalArgumentException.class);
        developer.setName(null);
    }

    @Test
    public void cantRaiseSalaryWithNegativeValue(){
        exception.expect(IllegalArgumentException.class);
        developer.raiseSalary(-3000.00);
    }
}
