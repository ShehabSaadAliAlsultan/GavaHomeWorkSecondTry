package LAB5;

public class TallyCounter {
   private  int VALUE;
    public void  click()
    {
        VALUE++;
    }
    public TallyCounter()
     {
         this.VALUE = 0;
     }


    public  void button()
    {
        VALUE =VALUE -1;
    }

    public void rest()
    {
        VALUE = 0;
    }

    public  int getValue()
    {
        return VALUE;
    }



}
