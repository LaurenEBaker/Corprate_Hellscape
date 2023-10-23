package com.corporate.hellscape.character;

//TODO: Flesh me out some for issue #4
public class Character {

    
        //Class fields
        private String Name;
        private int Health;
        private int Stress;
        private int Hunger;
        private int Sleep;
        private int Fun;
        private int Hygiene;
        private int WorkLoad;
    
    
    
        //Getter Function
        public String getName() {
            return Name;
        }
    
        public int getHealth() {
            return Health;
        }
    
        public int getStress() {
            return Stress;
        }
    
        public int getHunger() {
            return Hunger;
        }
    
        public int getSleep() {
            return Sleep;
        }
    
        public int getFun() {
            return Fun;
        }
    
        public int getHygiene() {
            return Hygiene;
        }
    
        public int getWorkLoad() {
            return WorkLoad;
        }
    
        //Setter Funtion
        public void setName(String name) {
            Name = name;
        }
    
        public void setHealth(int health) {
            Health = health;
        }
    
        public void setHunger(int hunger) {
            Hunger = hunger;
        }
    
        public void setStress(int stress) {
            Stress = stress;
        }
    
        public void setSleep(int sleep) {
            Sleep = sleep;
        }
    
        public void setFun(int fun) {
            Fun = fun;
        }
    
        public void setHygiene(int hygiene) {
            Hygiene = hygiene;
        }
    
        public void setWorkLoad(int workLoad) {
            WorkLoad = workLoad;
        }
    
    
        //Increase/Decrease funtion
    
        /*All the value will be set at 10 till a definete
         * value is decided on.
         */
    
        public void decreaseHealth(){
            if(Health > 0 ){
                Health -= 10;
                if(Health < 0){
                    setHealth(0);
                }
            }
    
            else{
                System.out.println("Health is is too low.");
            }
            
        }
    
        public void decreaseStress(){
            if(Stress > 0 ){
                Stress -= 10;
                if(Stress < 0){
                    setStress(0);
                }
            }
    
            else{
                System.out.println("Stress is is too low.");
            }
        }
    
        public void decreaseHunger(){
            if(Hunger > 0 ){
                Hunger -= 10;
                if(Hunger < 0){
                    setHunger(0);
                }
            }
    
            else{
                System.out.println("Hunger is is too low.");
            }
        }
    
        public void decreaseSleep(){
            if(Sleep > 0 ){
                Sleep -= 10;
                if(Sleep < 0){
                   setSleep(0);
                }
            }
    
            else{
                System.out.println("Sleep is is too low.");
            }
        }
    
        public void decreaseFun(){
            if(Fun > 0 ){
                Fun -= 10;
                if(Fun < 0){
                    setFun(0);
                }
            }
    
            else{
                System.out.println("Fun is is too low.");
            }
        }
    
        public void decreaseHygiene(){
            if(Hygiene > 0 ){
                Hygiene -= 10;
                if(Hygiene < 0){
                    setHygiene(0);
                }
            }
    
            else{
                System.out.println("Hygiene is is too low.");
            }
        }
    
        public void decreaseWorkLoad(){
           if(WorkLoad > 0 ){
                WorkLoad -= 10;
                if(WorkLoad < 0){
                    setWorkLoad(0);
                }
            }
    
            else{
                System.out.println("Work Load is is too low.");
            }
        }
    
        public void increaseHealth(){
            Health += 10;
        }
    
        public void increaseStress(){
            Stress += 10;
        }
    
        public void increaseHunger(){
            Hunger += 10;
        }
    
        public void increaseSleep(){
            Sleep += 10;
        }
    
        public void increaseFun(){
            Fun += 10;
        }
    
        public void increaseHygiene(){
            Hygiene += 10;
        }
    
        public void increaseWorkLoad(){
            WorkLoad += 10;
        }
    
     
    }
    

