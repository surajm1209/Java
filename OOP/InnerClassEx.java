class OuterC 
{
    int num;
    
    // inner class
    private class InnerC {
        public void print() {
            System.out.println("This is an inner class");
        }
    }
   
   // Accessing he inner class from the method within
    void display_Inner() {
        InnerC inner = new InnerC();
        inner.print();
   }
}
   
public class InnerClassEx {

   public static void main(String args[]) {
      // Instantiating the outer class 
      OuterC outer = new OuterC();
      
      // Accessing the display_Inner() method.
      outer.display_Inner();
   }
}
