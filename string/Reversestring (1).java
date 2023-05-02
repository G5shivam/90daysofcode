

public class Reversestring {
    
    public static void main(String[] args) {
        String str1 = "Shivam Gupta";
        String str2="";
        String arr[]=str1.split(" ");

        for(int i=arr.length-1;i>=0;i--){
            str2 = str2+arr[i]+" ";
        }
        System.out.println("before reversing:" + str1);
        System.out.println("After reversing:" + str2);
    }
}
