package pattern;


public class patterns { 
    public static void main(String[] args) {
    int n=7;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {    
        
        //if(i==0 || j==0 || j==n-1/2 || j == n-2/2 || i == n/2)
        //if (j==0 || j==n-1 || i==n-1/2 || i==n/2)
        if(i%3==0  )
            {
                System.out.print("*");
            }
            else if(i<=6/2 && j==0){
                System.out.print("*");
            }
            else if(i>=6/2 && j==6){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            
        }System.out.println();
    }

}
}



    

