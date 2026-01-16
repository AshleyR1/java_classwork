class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    double[] g1 = {60,70,90};
    double[] g2 = {65,75,60};

    String[]  courses1  = {"EEFG7QH","FSFC3","HQFC3TH","HUF43X"};
    String[]  courses2  = {"MRF43","PGF43Q3C","SCF43QG","HUF43X"};

    
    //Create a new student objects 
  
  Student p1 = new Student("harry",10,70.8,90,100,"EEFG7QH","FSFC3","HQFC3TH","PGF43Q3C","SCF43QG",);
  if(p1.checkcourses("FSFC3")){}
  Student p2 = new Student("james",9,80.8,70,90,"MRF43","PGF43Q3C","SCF43QG","EEFG7QH"); 
   
    
  }


  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}