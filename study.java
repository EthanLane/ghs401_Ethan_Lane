import javax.swing.JOptionPane;
public class study
{ 
        public static void main()
        {
        int something=Integer.parseInt(JOptionPane.showInputDialog("whats your grade"));
            while (something<0 || something>100){
            something=Integer.parseInt(JOptionPane.showInputDialog("enter a valid number"));
            
            
        }
        System.out.println("atleast u got a grade");
        if (something<60){
         System.out.println("Pray");
        }
        else if(something<70){
         System.out.println("feels bad man");
        }
        else if(something<80){
        System.out.println("how");
        }
        else if(something<90){
         System.out.println("hows this possible");
 
         }
     }
   }