public class ContactData

{
  int counter=0;
  public String[][] contactItem = new String[50][50];
    
  public ContactData(){
    }
  /*
   * mobile = 1;
   * home = 2;
   * skype =3;
   * work=4;*/
   
  public void createData(String data, String datatype){
      
      if (counter<this.contactItem.length){
            this.contactItem[counter][counter] = data; datatype;
            System.out.println("Добавлен элемент под номером" + counter + " !");
        }
        
      if (counter>=this.contactItem.length){
           System.out.println("Ошибка массив переполнен! Нужно что то удалить.");
        }  

    }
  
  public String getAdress(int counter){
    String returnAdress="Записи нет";;  
    if (contactItem[counter]!=null){
     returnAdress= contactItem[counter];
    }
    return returnAdress;
}
}
