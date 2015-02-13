package za.ac.cput.prac2;

/**
 * Hello world!
 *
 */
public class App 
{
    public float getFloat(){

        float sum = 125 * 1;
        return sum;
    }

    public int getInt(){

        return 12;
    }

    public String getObj(){
        return "thabo";
    }

    public boolean getTruth(){
        return true;
    }

    public boolean getFalse(){
        return false;
    }

    public String getNull(){
        String name = null;
        return name;
    }

    public String getNotNull(){
        String name = "thabo";
        return name;
    }

    public int [] getArray(){
        int [] myAarray = {12,12,25,45,2};
        return myAarray;
    }

    public static double getTimeOut(int a,int b){
        return a*b;
    }
}
