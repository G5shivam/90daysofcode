 class calc
 {
    public int add(int nums[])
    {
        int result=0;
        for(int n:nums)
        {
            result = result + n;
        }
        return result;
    }
 }
 
 public class Anonymousarray {
    public static void main(String[] args) {
        calc obj= new calc();
        int result = obj.add(new int []{5,2,3,7,8,2});
        System.out.println(result);

    }
    
}
