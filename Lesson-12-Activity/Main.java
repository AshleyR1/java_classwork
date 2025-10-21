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


    
  }
  void init(){
   /*String visa ="4";
    String  America Express ="34 || 37";
    String Diner Club ="36";
   String Mastercard ="51 || 55";
    String Discovery ="6011 || 65";*/
   
  }

  
  
}