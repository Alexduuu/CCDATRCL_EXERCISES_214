public class App {
    public static void main(String[] args) {
  
      Stack brief_stack = new Stack(5);
    
      brief_stack.push("Blue Brief");
      brief_stack.push("Red Brief");
      brief_stack.push("Yellow Brief");
      brief_stack.push("Green Brief");
      
      System.out.println("The size of the stack is: " + brief_stack.size());
      
      System.out.println("The top of the stack is: " + brief_stack.peek());
     
      brief_stack.pop();
  
      System.out.println("After pop");
      
      brief_stack.printStack();
  
      System.out.println("The top of the stack is: " + brief_stack.peek());
    }
  }
