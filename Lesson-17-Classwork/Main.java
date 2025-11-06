class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
//p1

String txt=Input.readString();
system.outprintln("enter sentance");
char c=Input.readString();
system.outprint("enter charter to replace");
String swapletter( String txt ){
if (txt.equals("c")){
  bld="!";
  
}else 
bld+=swapletter

}

    
  }

  //will use reverse for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);

    return bld;
  }


}