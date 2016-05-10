public class Contact

{
  int counter;
  public String[] contact = new String[50];
    
  public Contact(){
    }
  
  public void createContact(String email){
      
      if (counter<this.email.length){
            this.email[counter] = email;
            System.out.println("Добавлен элемент под номером" + counter + " !");
        }
        
      if (counter>=this.email.length){
           System.out.println("Ошибка массив переполнен! Нужно что то удалить.");
        }

    }
  
  public String getContact(int counter){
    String returnEmail="Записи нет";;  
    if (email[counter]!=null){
     returnEmail= email[counter];
    }
    return returnEmail;
}
}
