package RubberDuckRace;

import java.util.ArrayList;

public class MyQueue {

    int        listNumber;
    static int faellesNumber = 0;
    ArrayList<RubberDuck>  duckList;

    /*  asbc
        Programmørens egen kø.
        Java har et Interface, som man kan anvende, men her har jeg valgt
        ligesom du, at lave en selv baseret på en ArrayList.

        Ansvaret her at holde styr på køen incl at kende længden af den.

        Køen skal indeholder ænder, dvs objekter fra klassen RubberDuck.
        Altså IKKE tal, det er noget som ande objektet indeholder.
    */
    /*  asbc
        Først laver vi en constructor.
        Så kan vi i RubberDuckMain anvende en eller flere objekter,
        der så her er kø'er.
     */

    public MyQueue() {
        duckList = new ArrayList<>();

        listNumber  =  faellesNumber;
        faellesNumber++;
    }
    /*   asbc
        I denne klasse skal vi så definere de services, som køen anvender.
        Forrest i køen definerer jeg så til plads nr. 0  og
        bagerst er så den første ledige plads - 1.
     */

    public void  add( RubberDuck placeholderForRubberDuck ){
        duckList.add( placeholderForRubberDuck );
    };

    public RubberDuck  get(){
        RubberDuck  returnedObject = duckList.get( 0 );
        int         actualListSize = duckList.size()  ;

        for( int i=0; i < actualListSize-1; i++ ){
            duckList.set(i,  duckList.get(i+1) );  /*  asbc
                                                       her ajourføres køen
                                                   */
        }
        duckList.remove( actualListSize-1 );

        return  returnedObject;
    }

    public int size(){
        return  duckList.size();
    }

        /*   asbc
             toString() er altid god at implementere.
             Den er bl.a. meget anvendelig tiltestudskrifter.
         */
    public String toString(){
        String  returnText = "";
        for ( RubberDuck rd : duckList ) {
            returnText = returnText + rd.getDuckNumber() + '\n';
        }
        return  returnText;
    }

}
