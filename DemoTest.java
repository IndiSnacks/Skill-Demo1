import static org.junit.Assert.*; 
import org.junit.*; 

public class DemoTest extends Demo{
    @Test 
    public void addition() { 
        assertEquals(2, add(1, 3)); //this should fail 1+3 != 2
    } 
}

//let commit and then move to ssh !



