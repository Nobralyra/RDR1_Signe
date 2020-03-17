package RubberDuckRace;

import org.jetbrains.annotations.NotNull;

public class RubberDuck
{
    private int        duckNumber       = 0 ;   //  selve disse variable er  private.
    private static int rubberDuckNumber = 0 ;   //  Kun adgang gennem get'ter og set'ers.
    /*  asbc
        static værdi fælles for ALLE objekter denne klasse.
        Her inititaliseret til 0.
        Erklæres her oppe fordi de skal gælde i hele klassen.
     */

    /*   asbc
         Her laver vi så to rubberDuck constructor'er.
         BEMÆRK  staves med STORT og ingen returværdi.
     */
    public RubberDuck(){
        duckNumber  =  rubberDuckNumber;
        rubberDuckNumber++;
    }

    /*  asbc
        @NotNull  er en JetBrains / IntelliJ tilføjelse.

        I denne kopi-constructor (i C++ vader man i dem)
        her jeg valgt IKKE at opdatere rubberDuckNumber.
     */
    public RubberDuck(@NotNull RubberDuck duckToCopy ){
        this.duckNumber  =  duckToCopy.getDuckNumber();
        rubberDuckNumber--;
    }

    /*  public int getRubberDuck()
        {
            return rubberDuck;
        }

        public void setRubberDuck(int rubberDuck)
        {
           this.rubberDuck = rubberDuck;
        }

        asbc
        Disse metoder er helt overflødige. Med new i en anden klasse
        kan du få en ny and.
        Get'ers og Set'ers  går på objektets egenskaber, her andens nummer,
        så dem laver vi naturlgvis.
     */
    public void setDuckNumber( int nr ){
        duckNumber =  nr;
    }

    public int getDuckNumber(){
        return  duckNumber;
    }

    public static void setRubberDuckNumber( int nr ){
        rubberDuckNumber =  nr;
    }

    public int getRubberDuckNumber(){
        return  rubberDuckNumber;
    }
    /*    asbc
          Du bør altid overveje at implementere de to metoder :
              equals()     (sammenligner to rubberDucks)
              toString()   (gør at data om en rubberDuck kan skrives ud)
          Også her anvender du inddirekte Object klassens. Og det er ikke
          hensigtsmæssigt.
     */
}
