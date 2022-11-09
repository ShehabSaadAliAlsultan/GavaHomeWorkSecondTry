package LAB_4;

public class ex3 {
    public static void main(String[] args) {
        String X=new String("Mississippi") , R=X.replace("i","!");

        /************************************************************************/
        System.out.println("actual answer: M!ss!ss!pp!");
        System.out.println("Expected answer: "+R);
        System.out.println("The length of the first resulting string: "+R.length());
         /************************************************************************/
        String G=R.replace("s","$");
        /************************************************************************/
        System.out.println("actual answer: M!$$!$$!pp!");
        System.out.println("Expected answer: "+G);
        System.out.println("The two length of the second resulting string: "+G.length());

    }
}
