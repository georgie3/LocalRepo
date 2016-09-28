public class ProgramV
{
    // The mathematical constant Pi.
    // Note: 'static' is needed here to use it from main method
    //       without creating an object.
    private double pi;    
    
    public static void main(String[] args)
    {
        // This writes a message to the screen
        System.out.println ( "Hello Pi Program" );
        
        ProgramV self = new ProgramV();
        
        self.pi = 355.0 / 113.0;
        System.out.println ( "Pi is about " + self.pi );
        
        // How much to multiply by (this is a local variable)   
        double multiplier = 2;
        
        double twoPi = multiplier * self.pi;
        System.out.println ( "Two Pi is about " + twoPi );
        
    }
}
