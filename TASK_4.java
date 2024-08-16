import java.util.HashMap;
import java.util.Currency;
import java.util.Scanner;
public class TASK_4 {
    Currency c=Currency.getInstance("EUR");
    public void toUSD(int base,double amount){
        double au_us=0.65;
        double eu_us=1.09;
        if(base==2){
            System.out.print("\t==>Converting Australian Dollar to US Dollar:\n");
            System.out.println("\t\t"+amount+" A$"+" = "+amount*au_us+"US$");
        }
        else if(base==3){
            System.out.print("\t==>Converting Euro to US Dollar:\n");
            System.out.println("\t\t"+amount+c.getSymbol()+" = "+amount*eu_us+" US$");
        }
        else{
            System.out.println("**Remains same since base and target currency are same**");
        }
    }
    public void toAU(int base,double amount){
        double us_au=1.52;
        double eu_au=1.66;
        if(base==1){
            System.out.print("\t==>Converting US Dollar to Australian Dollar:\n");
            System.out.println("\t\t"+amount+" US$"+" = "+amount*us_au+"A$");
        }
        else if(base==3){
            System.out.print("\t==>Converting Euro to Australian Dollar:\n");
            System.out.println("\t\t"+amount+c.getSymbol()+" = "+amount*eu_au+"A$");
        }
        else{
            System.out.println("**Remains same, since base and target currency units are same**");
        }
    }
    public void toEURO(int base,double amount){
        double us_euro=0.91;
        double au_euro=0.60;
        if(base==1){
            System.out.print("\t==>Converting US Dollar to Euro:\n");
            System.out.println("\t\t"+amount+" US$"+" = "+amount*us_euro+c.getSymbol());
        }
        else if(base==2){
            System.out.print("\t==>Converting Australian Dollar to Euro:\n");
            System.out.println("\t\t"+amount+" A$"+" = "+amount*au_euro+c.getSymbol());
        }
        else{
            System.out.println("**Remains same since base and target currency are same**");
        }
    }

    public static void main(String[] args) {
        TASK_4 task=new TASK_4();
        Scanner sc=new Scanner(System.in);
        HashMap<Integer, String> map=new HashMap<>();
        map.put(1, "US Dollar");
        map.put(2, "Australian Dollar");
        map.put(3, "European Euro");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t**CURRENCY CONVERSION**");
        System.out.println("\t\t\t\t\t\t\t\t_______________________\n");
        System.out.println("\t<--Choose the base and target currencies from the following-->\n\n");
        System.out.println("\t1. US Dollar\n\t2. Australian Dollar\n\t3. European Euro\n\n");
        System.out.print("\tchoose Base currency: ");
        int b=sc.nextInt();
        System.out.print("\tenter amount in "+map.get(b)+" :");
        double amount=sc.nextDouble();
        System.out.println();
        System.out.print("\tchoose Target currency: ");
        int t=sc.nextInt();
        switch (t) {
            case 1: task.toUSD(b, amount);
                    break;
            case 2: task.toAU(b, amount);
                    break;
            case 3: task.toEURO(b, amount);
                    break;
            default:System.out.println("\tPLEASE ENTER CORRECT TARGET\n");
                    break;
        }
        sc.close();
    }

}

