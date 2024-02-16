package com.acceleratedskillup;

class Car {
    int doors
    String model
    String brand
    def script

        Car(script) {
            this.script = script
        }

        void printoutCar() {
            script.echo "using script.echo"
            script.echo "Number of Doors: ${doors}"
            script.echo "Car Model: ${model}"
            script.echo "Car Brand: ${brand}"
        }
}
