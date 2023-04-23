package pattern;

public class complexpatterntriangle1 {
    public static void main(String[] args) {
        int n=15;
        for(int i = 0;i<n; i++)
        {
            for(int j=0;j<n;j++)
            {
                //if(i==j || i+j==n-1 || i==0 || j==0 || i==n-1 || j==n-1) //for x
               //if(i+j==n-6 || i==j-5 || i==5) //for triangle
               if(i==0||j==0||i==n-1||j==n-1||i+j==n-7||i==j-6||i+j==n+5||i==j+6||j==7 ) //for sand clock
                { 
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println(" ");
        }
        
    }
    
}
