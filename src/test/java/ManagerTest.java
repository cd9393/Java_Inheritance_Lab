import management.Manager;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jacob", "JX12345", 34000, "IT");
    }

    @Test
    public void hasName(){
        assertEquals("Jacob", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JX12345", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(34000, manager.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1500.0);
        assertEquals(35500, manager.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(340, manager.payBonus());
    }

    @Test
    public void canSetName(){
        manager.setName("Joseph");
        assertEquals("Joseph", manager.getName());
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void cantSetNameToNull(){
        exception.expect(IllegalArgumentException.class);
        manager.setName(null);
    }

    @Test
    public void cantRaiseSalaryWithNegativeValue(){
        exception.expect(IllegalArgumentException.class);
        manager.raiseSalary(-3000.00);
    }
}
