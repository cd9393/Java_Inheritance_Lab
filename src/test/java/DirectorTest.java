import management.Director;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    
    Director director;
    
    @Before
    public void before(){
        director = new Director("Bob", "AX", 34000, "Finance", 12000.50);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("AX", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(34000, director.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Finance", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1500.0);
        assertEquals(35500, director.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(680, director.payBonus());
    }

    @Test
    public void hasBudget(){
        assertEquals(12000.50, director.getBudget(), 0.01);
    }

    @Test
    public void canSetName(){
        director.setName("Joseph");
        assertEquals("Joseph", director.getName());
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void cantSetNameToNull(){
        exception.expect(IllegalArgumentException.class);
        director.setName(null);
    }

    @Test
    public void cantRaiseSalaryWithNegativeValue(){
        exception.expect(IllegalArgumentException.class);
        director.raiseSalary(-3000.00);
    }
    
}
