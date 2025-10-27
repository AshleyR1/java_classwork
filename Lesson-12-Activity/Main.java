class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
// chalemgr 1

 String creditCardType (String card){
if(card.substring(0,1).equals("4")){
        return "visa";
      }else if(card.substring(0,2).equals("34")||card.substring(0,2).equals("37")){
        return "America Express";
      }else if (card.substring(0,2).equals("36")){
      return"Diner Club";
    }else if(card.substring(0,2).equals("51")||card.substring(0,2).equals("55")){
      return "Masercard";
    }else if(card.substring(0,4).equals("6011")||card.substring(0,2).equals("65")){
      return "Discovery";
    } else{
      return "unknown";
    }

    }
    
  // challange 2
  String piglatin(String word){
  return word.substring(1) + word.substring(0,1) + "ay"; 
  }
  //challange3
  String nycLocate(String zip){
    if (zip.substring(0,3).equals("100") || zip.substring(0,3).equals("101") ||zip.substring(0,3).equals("102")) 
    return "Manhattan";
  }
  //chanllange4
  String getMonth( String date){

  }

  //chanllange5
boolean validatepass(string pswd){
  if(pswd.length()>=5 && pswd.length()<=8 && pswd.indexOf("*")==-1 && pswd.indexOf("^")==-1 && pswd.indexOf(",")==-1)
  return true;
}

  void init(){

   
  }

  
  
}