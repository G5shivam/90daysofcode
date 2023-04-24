public class Array {
    public static void main(String[] args) {
        int num[][]={
            {5,4,7,8},
            {9,2,6,4},
            {6,1,3,2}
        };
        for(int[] a: num)
        {
            for(int b:a)
            {System.out.println(b+" ");}
        }System.out.println();
    }
    
}
