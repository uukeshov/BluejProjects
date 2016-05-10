import java.util.Arrays;
public class Queue {
    
    public Integer queueBegin;
    public Integer counter=0;
    public Integer counterAll=0;
    public Integer len=0;
    public Integer[] queueArray = new Integer[5];
    public Integer[] queueArrayAll = new Integer[5];
    
    public Queue(){
    }
        
    public void enqueue (int queueBegin) {
        
        if (this.counter>=5){
            System.out.println("В очереди может быть только"+queueArray.length+" ожидающих, вызывайте метод pop");
        }
        
        if (this.counter<5){
           queueArray[counter] = queueBegin;
           System.out.println("В массиве "+this.counter+" элементов "+"добавлен "+queueBegin);
           this.counter++;
           this.counterAll=this.counter;
        }      
    }
    public void dequeue(){
        
       if(this.counter>0){
           System.out.println("В очереди никого нет, возвращать нечего");
        }
        
       if(this.len<queueArray.length){           
           System.out.println("Выводим по принципу LILO "+queueArray[this.len]);
           this.len++;
        }
    }
    
     public void dequeueAll(){
        
       if(this.counterAll==0){
           System.out.println("Стек пустой, возвращать нечего!");
        }
        
       if(this.counterAll>0){
          for (int i = 0;i<queueArray.length;i++){
              queueArrayAll[i] = queueArray[i];             
            }
           System.out.println("Выводим по принципу LILO "+Arrays.toString(queueArrayAll));
        }
    }

}