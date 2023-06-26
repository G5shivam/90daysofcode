package apiannotations;


enum week
{
    MON,TUE,WED,THU,FRI,SAT,SUN
}
public class Enums {
    enum Result{
        PASS,FAIL,NR;
    }
    public static void main(String[] args) {
        week w=week.MON;
        System.out.println(w);

        int index = week.MON.ordinal();
        System.out.println(index);

        week []wr=week.values();
        for(week w1:wr)
        {
            System.out.println(w1+":"+w1.ordinal());
        }
        Result r=Result.PASS;
        System.out.println(r);
    }
    
}
