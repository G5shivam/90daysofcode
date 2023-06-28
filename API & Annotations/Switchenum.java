package apiannotations;

enum Result2{
    PASS,FAIL,NR;
}
public class Switchenum{
    public static void main(String[] args) {
        Result2 res=Result2.PASS;
        switch(res){
            case PASS:
            System.out.println("passed");
            break;
            case FAIL:
            System.out.println("failed");
            break;
            case NR:
            System.out.println("no reesult");

        }
    }
}