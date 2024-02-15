package com.acceleratedskillup;

class Car{
  int doors;
  string model;
  string brand;
  def script

      Car(script){
        this.script=script
        }
      void printoutCar(){
        script.echo "using script.echo"
        script.echo "Number of Doors:${doors}"
        script.echo "Car Model:${model}"
        script.echo "Car Brand:${brand}"
      }
}
