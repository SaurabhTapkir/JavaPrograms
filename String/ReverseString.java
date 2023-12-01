public class ReverseString {
    public static void main(String[] args) {
        String str="Saurabh";
        int n=str.length();
char ch;

        String revString="";
        for(int i=0;i<n;i++)
        {
            ch=str.charAt(i);
        revString =ch+revString;
        }
        System.out.println(revString);
    }
}
