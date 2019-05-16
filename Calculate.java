import java.util.Scanner;
public class Main
{
    public static double calculate (double a, double b, char symbol){ // sam ras4et
        double res;
        switch(symbol){
            case '*':
            res = a*b;
            break;
            case '/':
            res = a/b;
            break;
            case ':': // additional
            res = a/b;
            break;
            case '+':
            res = a+b;
            break;
            case '-':
            res = a-b;
            break;
            default:
            break;
        }
        return res;
    }
  
	public static void main(String[] args) throws Exception {
	    Scanner in = new Scanner(System.in);
		System.out.println("Calculate 1.0 by Denis S :-)\n");
      	double a=0,b=0,i=0;
        String str = null;
        char symbol = ' ';
        boolean stopper = false;
		while(!stopper)
		{
	        while(!stopper)
	        {
	        System.out.print("Type A: ");
                try{
                    str = in.next();
                    a = Float.parseFloat(str);
                    stopper = true;
                }
                catch(Exception e){
                    System.out.print("Incorrect! Need a number. "); 		    
		        }
	        }
	   stopper = false; // Zaciklivaem snova, esli vse @ok
	        while(!stopper)
	        {
	        System.out.print("Type B: ");
                try{
                    str = in.next();
                    b =  Float.parseFloat(str);
                    stopper = true;
                }
                catch(Exception e){
                    System.out.print("Incorrect! Need a number. "); 		    
		        }
	        }
	   stopper = false; // Zaciklivaem snova, esli vse @ok
	         while(!stopper)
	        {
                System.out.print("Type symbol. Availible symbols: * / + - : ");
                symbol = in.next().charAt(0);
                //System.out.println(symbol);
                if (symbol == '*' || symbol == '/' || symbol == '+' || symbol == '-' || symbol == ':') {
                    stopper = true;
                } else {
                    System.out.print("Incorrect! ");                    
                }
	        } 
	   stopper = false; // Zaciklivaem snova, esli vse @ok	   
	        System.out.println("Result of A "+symbol+" B = "+String.format("%.2f", calculate(a,b,symbol)));
		    if(i>=1) {
		    System.out.println("You want to stop calculate? Type y/n ");
		    symbol = in.next().charAt(0);
		    switch(symbol){
		        case 'y':
		        stopper=true;
		        System.out.println("Stopped!");
		        break;
		        case 'n':
		        System.out.println("Well. Going further :-)");
		        break;
		        default:
		        System.out.println("Well. Going further :-)");
		        break;
		        }
		    }
		i++;        
		}
	}
}
