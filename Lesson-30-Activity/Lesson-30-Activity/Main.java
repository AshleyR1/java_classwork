class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
Car car1= new Car("ford","black","Mustang",2025,31920);
Car car2= new Car("jeep","white","2025 jeep wrangler",2025,32095);
print("brand"+car1.brand);
print("color"+car1.color);
print("model"+car1.model);
print("year"+car1.year);
print("value"+car1.value);

print("brand"+car2.brand);
print("color"+car2.color);
print("model"+car2.model);
print("year"+car2.year);
print("value"+car2.value);
  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}