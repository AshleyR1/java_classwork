class Student{

  
  String firstName;
  int gradeLevel;
  double gpa;
  double[] grades;
  String[]courses;


  
  Student(String firstName, int gradeLevel, double gpa, 
          double[] grades,String[] courses){
    
    this.firstName  = firstName;
    this.gradeLevel = gradeLevel;
    this.gpa        = gpa;
    this.grades     = grades;
    this.courses    = courses;
 
  }


  // class functions
boolean checkcourses(String courses){
for(int x=0; x<this.courses.length; i++){
  if(this.courses[x].equals(courses)){
    return true;
  }
}


}

  double calculateAvg(){
    double sum=0;
    for(int x=0; x<=this.grades.length-1;x++){
      sum+=this.grades[x];
    }
    return sum/this.grades.length;
  }

  
}