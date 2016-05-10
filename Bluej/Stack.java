import java.util.Arrays;
public class Stack {
    
    public Integer stackBegin;
    public Integer counter=0;
    public Integer counterAll=0;
    public Integer[] stackArray = new Integer[5];
    public Integer[] stackReturnAll = new Integer[5];
    
    public Stack(){
    }
        
    public void push(int StackBegin) {
        
        if (this.counter>=5){
            System.out.println("В стеке может быть только"+stackArray.length+" элементов, вызывайте метод pop");
        }
        
        if (this.counter<5){
           stackArray[counter] = StackBegin;
           System.out.println("В стеке "+this.counter+" элементов "+"добавлен "+StackBegin);
           this.counter++;
           counterAll=this.counter;
        }      
    }
    public void pop(){
        
       if(this.counter==0){
           System.out.println("Стек пустой, возвращать нечего!");
        }
        
       if(this.counter>0){
           this.counter--;
           System.out.println("Выводим по принципу LIFO "+stackArray[this.counter]);
        }
    }
    
     public void popAll(){
        
       if(this.counterAll==0){
           System.out.println("Стек пустой, возвращать нечего!");
        }
        
       if(this.counterAll>0){
           counterAll--;
           int i=0;
           while(counterAll>=0){
              // System.out.println(stackReturnAll[counterAll], stackArray[i]);
               stackReturnAll[counterAll] = stackArray[i];
               counterAll--;
               i++;
            }
           System.out.println("Выводим по принципу LIFO "+Arrays.toString(stackReturnAll));
        }
    }
}