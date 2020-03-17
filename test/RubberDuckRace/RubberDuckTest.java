package RubberDuckRace;

import org.junit.jupiter.api.Test;

import static RubberDuckRace.RubberDuck.setRubberDuckNumber;
                                   /*   asbc
                                        import sætning herover gør det muligt,
                                        at kalde metoden  setRubberDuckNumber()
                                        UDEN et objekt eller klasse navn.
                                    */
import static org.junit.jupiter.api.Assertions.*;

class RubberDuckTest
{
    @Test
    void rubberDuckNumberingTest(){
        RubberDuck rubberDuck1 = new RubberDuck();
        int         duckNumber =     rubberDuck1.getDuckNumber();
                                                             /*  asbc
                                                                 Nedenfor genereres en ny, der skal
                                                                 have et nummer højere
                                                              */
        RubberDuck rubberDuck3 = new RubberDuck();
        assertEquals( duckNumber+1, rubberDuck3.getDuckNumber(), "Test for autonumbering");
    }
    /**
     * How can I test getter and setter ?
     * @param
     */
    @Test
    void setRubberDucksTest()
    {
        setRubberDuckNumber( 0 );       /*  asbc
                                            Tvangsnummereres eller resettes om man vil
                                         */
        RubberDuck rubberDuck1 = new RubberDuck();
                                        /*  asbc
                                            Ikke den samme som ovenfor
                                         */

        assertEquals( 0, rubberDuck1.getDuckNumber(), "First Test");

        RubberDuck rubberDuck2 = new RubberDuck();
        assertEquals( 1, rubberDuck2.getDuckNumber(), "Test of 2nd");

        RubberDuck rubberDuck3 = new RubberDuck();
        assertEquals( 2, rubberDuck3.getDuckNumber(), "Test of 3rd");
    }

}