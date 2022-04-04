import java.util.Scanner;
class Stack {
  int[] arr;
  int top;
  int min;

  Stack(int size) {
    arr = new int[size];
    top = -1;
    min = Integer.MAX_VALUE;
    }
  
  void push(int ele) {
    if (top == arr.length - 1){
    System.out.println("Overflow");
    return;
    }
    
    top++;
    arr[top] = ele;
    if(min > ele)
      min = ele;
  }


  int pop() {
    if (top == -1){
      System.out.print("Underflow ");
      return -1;
      }
      
      
      int temp = arr[top];
      top--;
      
      if(min==temp)
        min=arr[top];
        return temp;
     }
     
      int getMin(){
        return min;
        }
}



//DRIVER CLASS

class FindMinimum {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int queries = in.nextInt();
      int i=0;
      Stack stack = new Stack(size);
      while(i++ < queries){
        switch(in.next()){
        case "push": stack.push(in.nextInt()); 
        break;
        case "pop": stack.pop(); 
        break;
        case "min": System.out.println(stack.getMin());
}
}
}
}
