import javax.swing.JOptionPane;

public class Hamburger
{
   
    //this is a class called Hamburger
    //from the class we can make as many 
    //hamburger instances as we want
    //instances variable
    private boolean hasFootlettuce;
    private int numPatties;
    private String cheeseType;
    
    //zero-argument constructor
    //this runs everytime a zero-arg hamburger is made
    //always is named public className
    
    public Hamburger(){
       
       this.hasFootlettuce=true;//sets all instance variable to generic values
       this.numPatties=1;
       this.cheeseType=null;
        
        
    }
    //multi-arg constructor
    
    public Hamburger(boolean hasFootlettuce, int numPatties, String cheeseType ){
            this.hasFootlettuce=hasFootlettuce;//set instance variables to the argument variables
            this.numPatties=numPatties;
            this.cheeseType=cheeseType;
            
        }
    //toString method
    
    public String toString(){
        String output="Some Footlettuce:"+this.hasFootlettuce+" \n Patties: "+this.numPatties+" \n cheese"+this.cheeseType;
        return output;
    }
}