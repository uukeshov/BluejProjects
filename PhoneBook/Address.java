public class Address

{
  int counter;
  public String[] adress = new String[50];
    
  public Address(){
    }
  
  public void setAdress(String adress){
      
      if (counter<this.adress.length){
            this.adress[counter] = adress;
            System.out.println("Добавлен элемент под номером" + counter + " !");
        }
        
      if (counter>=this.adress.length){
           System.out.println("Ошибка массив переполнен! Нужно что то удалить.");
        }  

    }
  
  public String getAdress(int counter){
    String returnAdress="Записи нет";;  
    if (adress[counter]!=null){
     returnAdress= adress[counter];
    }
    return returnAdress;
}
}
