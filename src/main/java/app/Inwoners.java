package app;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by philippehaffmans on 23-03-17.
 */
public class  Inwoners {
    private String naam;
    private int jaar;
    private int aantal;

    public static List<Inwoners> inwonersList = new ArrayList<>();


    public static void initInwoners(){
        inwonersList.add(new Inwoners("Bijlmer", 2014, 10000));
        inwonersList.add(new Inwoners("Bijlmer", 2015, 11000));
        inwonersList.add(new Inwoners("Bijlmer", 2016, 12000));
        inwonersList.add(new Inwoners("Oostpoort", 2014, 6000));
        inwonersList.add(new Inwoners("Oostpoort", 2015, 7000));
        inwonersList.add(new Inwoners("Oostpoort", 2016, 8000));
        inwonersList.add(new Inwoners("Julianapark", 2014, 4000));
        inwonersList.add(new Inwoners("Julianapark", 2015, 5000));
        inwonersList.add(new Inwoners("Julianapark", 2016, 6000));
        inwonersList.add(new Inwoners("Dapperbuurt", 2014, 1000));
        inwonersList.add(new Inwoners("Dapperbuurt", 2015, 2000));
        inwonersList.add(new Inwoners("Dapperbuurt", 2016, 3000));
    }

    public static int searchInwoners(String naam, int jaar){
        for (Inwoners i: inwonersList) {
            if(i.getNaam().equalsIgnoreCase(naam) && i.getJaar() == jaar){
                return i.getAantal();
            }
        }
        return 000000000;
    }

    public static boolean getNames(String naam){
        for (Inwoners i : inwonersList){
            if (i.getNaam().equals(naam)){
                return true;
            }
        }
        return false;
    }

    public static boolean getYear(int jaar){
        for (Inwoners i : inwonersList){
            if (i.getJaar() == jaar){
                return true;
            }
        }
        return false;
    }


    public Inwoners(String nm, int jr, int an){
        this.naam = nm;
        this.jaar = jr;
        this.aantal = an;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getJaar() {
        return jaar;
    }

    public void setJaar(int jaar) {
        this.jaar = jaar;
    }

    public int getAantal() {
        return aantal;
    }

    public void setAantal(int aantal) {
        this.aantal = aantal;
    }
}
