import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PingPongTest {
    @Test
    public void runPingPong_countUpToOne_ArrayList(){
    // continue of test will eventually go here
        PingPong testPingPong = new PingPong();
        List<Object> expectedOutput = new ArrayList<>();
        expectedOutput.add(1);
        assertEquals(expectedOutput,testPingPong.runPingPong(1));


    }

    @Test
    public void runPingPong_countUpToGivenNumber_ArrayList() throws Exception{
        PingPong testPingPong = new PingPong();
        ArrayList<Object> expectedOutput = new ArrayList<>();
        expectedOutput.add(1);
        expectedOutput.add(2);
        assertEquals(expectedOutput,testPingPong.runPingPong(2));

    }
    @Test
    public void runPingPong_replaceMultipleOf3_ArrayList(){
        PingPong testPingPong = new PingPong();
        ArrayList<Object> expectedOutPut = new ArrayList<>();
        expectedOutPut.add(1);
        expectedOutPut.add(2);
        expectedOutPut.add("ping");
        assertEquals(expectedOutPut,testPingPong.runPingPong(3));
    }

}