class Animal{

  String animalSpecies;
  double weight;
  double height;

  
  Animal(String animalSpecies, double weight, double height){
    this.animalSpecies  = animalSpecies;
    this.weight         = weight;
    this.height         = height;
  }

 int isHealthy(){
  if (weight<=100 && weight>30){
    return"is healthy";
  }
 }

  // other class functions
  
  
  
}