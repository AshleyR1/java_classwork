class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
car car1= new car("ford","black","Mustang",2025,31920);
car car2= new car("jeep","white","2025 jeep wrangler",2025,32095);
print()
  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}