package RubberDuckRace;

public class RubberDuckMain {
    static MyQueue  aRubberDuckQueue;
    /*   asbc
        Hvad skal denne klasses ansvar være ?
        main() metoden skal aldrig rigtig meget.
        Men lad os i dagens anledning oprette en
        kø fyldt med ænder.

        Derfor laver jeg en metode udover main() her.

        Når vi senere udvidere programmet, sender
        vi den kode over i sin egen klasse.
     */
    public static void main(String[] args)
    {
        aRubberDuckQueue  =  new MyQueue();

        ducksInAQueue( aRubberDuckQueue );
     /*   FiFoRubberDuckRace fiFoRubberDuckRace = new FiFoRubberDuckRace();
          fiFoRubberDuckRace.addHundredElementToArrayList();
     */
    }

    public static int ducksInAQueue(MyQueue aRubberDuckQueue){

        for ( int i = 0; i<= 9; i++ ){
            RubberDuck   pureDuck  =  new  RubberDuck();
            /*  asbc
                Herover konstrueres så en and, der automatisk bliver
                nummereret i klassen RubberDuck. Det ser vi ikke her.
                I næste gennemløb af for() løkken får vi en ny and
                med et nyt nummer.
             */

            aRubberDuckQueue.add( pureDuck );
            /*   asbc
                 Her lægger vi så den nye and ind i køen.
             */
        }
        return aRubberDuckQueue.size();
    }
}
