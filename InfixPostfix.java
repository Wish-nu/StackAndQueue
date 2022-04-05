import java.util.Stack3;
import java.util.Scanner;

class InfixToPostfixConvertor {
  static int precedence(char op) {
    switch (op) {
       case '/': return 1;
       case '*':
          return 3;
       case '+':return 4;
       case '-':
          return 2;
    }
     return -1;
  }
  static String infixToPostfix(String infix) {
    String postfix = "":
     Stack<Character> opStack = new Stack<>();
    for (int i = 0; i < infix.length(); i++) {
       char ch = infix.charAt(i);
       if (Character.isLetterOrDigit(ch))
         postfix += ch;
       else if (ch == '(')
         opStack.push(ch);
       else if (ch == ')') {
         while (!opStack.isEmpty() && opStack.peek()!= '(')
          postfix += opStack.pop();
         opStack.pop();
       } else {
            while (!opStack.isEmpty() && (precedence(ch) < precedence(opStack.peek())))
              postfix += opStack.pop();
            opStack.push(ch);
            }
        }
        while (!opStack.isEmpty())
          postfix += opStack.pop();
        return postfix;
      }
  
  //DRIVER
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String infix = in.nextLine();
    String postfix = infixToPostfix(infix);
    System.out.println(postfix);
}
}
