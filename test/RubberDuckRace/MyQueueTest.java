package RubberDuckRace;

import org.junit.jupiter.api.Test;

import static RubberDuckRace.RubberDuck.setRubberDuckNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MyQueueTest {

    private    MyQueue aTestQueue =  new MyQueue();

    @Test
    void isTheQueueGenerated(){
        assertNotNull( aTestQueue, "The test queue exist");
    }

    @Test
    void add() {
        RubberDuck  dummyDuck  =  new  RubberDuck();

        int  numberBefore  =  aTestQueue.size();
        aTestQueue.add( dummyDuck );
        int  numberAfter   =  aTestQueue.size();
        assertEquals( numberBefore+1, numberAfter, "One duck - the dummyDuck - is add()");
    }

    @Test
    void get() {
        MyQueue aNewTestQueue   =  new  MyQueue();
        setRubberDuckNumber( 0 );

        RubberDuck  dummyDuck   =  new  RubberDuck();
        RubberDuck  daffyDuck   =  new  RubberDuck();
        RubberDuck  donaldDuck  =  new  RubberDuck();

        aNewTestQueue.add( dummyDuck  );
        aNewTestQueue.add( daffyDuck  );
        aNewTestQueue.add( donaldDuck );
        System.out.println( aNewTestQueue.toString() );

        RubberDuck    firstInTheRow  =  new  RubberDuck( aNewTestQueue.get( ) );
        assertEquals( firstInTheRow.getDuckNumber(),
                      dummyDuck.getDuckNumber(), "Test of the first position, 1st time");
        RubberDuck    nextInTheRow   =  new  RubberDuck( aNewTestQueue.get( ) );
        assertEquals( nextInTheRow.getDuckNumber(),
                      daffyDuck.getDuckNumber(), "Test of the first position, 2nd time");

        /*  asbc
            NOTE : hvis Equals havde været defineret i RubberDuck klassen, som at to ænder
                   er ens, hvis de har samme nummer, så havde ovenstående været meget pænere.

            assertEquals( firstInTheRow, dummyDuck, "Test of the first position, 1st time");
            RubberDuck    nextInTheRow   =  new  RubberDuck( aNewTestQueue.get( ) );
            assertEquals( nextInTheRow,  daffyDuck, "Test of the first position, 2nd time");
         */
    }


    @Test
    void size() {
        RubberDuck  dummyDuck  =  new  RubberDuck();

        int  numberBefore  =  aTestQueue.size();
        assertEquals( 0, numberBefore, "No duck is in queue");

        aTestQueue.add( dummyDuck );
        int  numberAfter   =  aTestQueue.size();
        assertEquals( 1, numberAfter, "One duck - the dummyDuck - is in queue");
    }
}