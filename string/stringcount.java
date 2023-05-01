public class stringcount 
    
{ 
    public static void main(String args[]) 
    { 
        String str="Shivam gupta";
        System.out.println(str);
        int cnt=1;
        
        int ln=str.length();
        for(int i=0;i<ln;i++)
        {
          if(str.charAt(i)==' ')
          {
            cnt++;
          }
        }
        System.out.println("The string contains "+cnt+ " words.");
        
        
    } 
}

