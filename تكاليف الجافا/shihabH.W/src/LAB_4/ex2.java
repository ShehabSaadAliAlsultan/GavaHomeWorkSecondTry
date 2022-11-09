package LAB_4;

public class ex2 {
    public static void main(String[] args) {

        String MI=new String("Mississippi");
        /************************************************************************/

        String  AF=MI.replace("i","ii");
        /************************************************************************/

        System.out.println("After first modification: "+AF);
        /************************************************************************/

        System.out.println("The length of the first resulting string: "+AF.length());
         /************************************************************************/
        String AFS=AF.replace("ss","s");
        /************************************************************************/
        System.out.println("After second modification: "+AFS);
        /************************************************************************/
        System.out.println("The two length of the second resulting string: "+AFS.length());


    }
}
