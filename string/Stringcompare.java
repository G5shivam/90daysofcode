public class Stringcompare{
    public static void main(String[] args) {
        String s1 ="g5shivam";
        String s2 ="g5shivam";
        String s3 ="G5SHIVAM";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}