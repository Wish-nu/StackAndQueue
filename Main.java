package com.ilearn;

//Driver code
class Main{
 public static void main(String args[])
{
    StackImplementation s = new StackImplementation();
     s.push(3);
     s.push(62);
     s.push(91);
     s.push(83);
     System.out.println(s.pop() + " Popped from stack");
     System.out.print ("Elements present in stack :");
     s.printStack();
}
}
