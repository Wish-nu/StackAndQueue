package com.gl.demo;

class StackImplementation {
    static final int Size_of_stack = 100;      // can hold 100 elements
    int current_pointer ;
    int a[] = new int[Size_of_stack]; // Maximum size of Stack
    
    StackImplementation(){          // stack implementation method
        current_pointer = -1;
    }
    
    boolean push(int x){
        if (current_pointer >= (Size_of_stack - 1)) {       //when pointer at the end of the array, its overflow
            System.out.println("Stack Overflow");
            return false;
            }
        else {
            a[++current_pointer ] = x;                  // else keeping assigning for current pointer till condition false
            System.out.println(x + " pushed into stack");
            return true;
            }
            }
    int pop(){                                      // pop method 
        if (current_pointer < 0) {
         System.out.println("Stack Underflow");     //cause pointer is less than 0
         return 0;
         }
        else {
        int x = a[current_pointer--];               //take the value of current pointer and store in x and keep poping
        return x;
        }
        }
     void printStack(){
        for (int i = current_pointer ;i>-1;i--){
         System.out.print (" "+ a[i]);
         }
         }
         }
