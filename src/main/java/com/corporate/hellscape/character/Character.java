package com.corporate.hellscape.character;

//TODO: Flesh me out some for issue #4
public class Character {
    
    //Class fields
    private String Name;
    private int Health;
    private int Stress;
    private int Hunger;
    private int Stamina;
    private int Fun;
    private int Hygiene;
    private int WorkLoad;


    
    public Character(String name) {
        Name = name;
        Health = 100;
        Stress=0;
        Hunger=0;
        Stamina=100;
        Fun=100;
        Hygiene=100;
        WorkLoad=0;
    }

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

    public int getStamin() {
        return Stamina;
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

    public void setStamina(int stamina) {
        Stamina = stamina;
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

    public void decreaseHealth(){
        if(Health > 0 ){
            Health -= 1;
            if(Health < 0){
                //end game method goes here
            }
        }
    }

    public void decreaseStress(){
        if(Stress > 0 ){
            Stress -= 10;
            if(Stress < 0){
                setStress(0);
            }
        }
    }

    public void decreaseHunger(){
        if(Hunger > 0 ){
            Hunger -= 10;
            if(Hunger < 0){
                setHunger(0);
            }
        }
    }

    public void decreaseStamina(){
        if(Stamina > 0 ){
            Stamina -= 1;
            if(Stamina < 0){
               setStamina(0);
            }
        }
    }

    public void decreaseFun(){
        if(Fun > 0 ){
            Fun -= 1;
            if(Fun < 0){
                setFun(0);
            }
        }
    }

    public void decreaseHygiene(){
        if(Hygiene > 0 ){
            Hygiene -= 1;
            if(Hygiene < 0){
                setHygiene(0);
            }
        }
    }

    public void decreaseWorkLoad(){
       if(WorkLoad > 0 ){
            WorkLoad -= 10;
            if(WorkLoad < 0){
                setWorkLoad(0);
            }
        }
    }

    public void increaseHealth(){
        if (Health<100) {
            Health += 10;}
    }

    public void increaseStress(){
        if (Stress<100) {
            Stress += 1;}
    }

    public void increaseHunger(){
       if (Hunger<100) {
        Hunger += 1; } 
    }

    public void increaseStamina(){
        if (Stamina<100) {
            Stamina += 10; }
    }

    public void increaseFun(){
        if (Fun<100) {
            Fun += 10;}
    }

    public void increaseHygiene(){
        if (Hygiene<100) {
            Hygiene += 10; }
    }

    public void increaseWorkLoad(){
       if (WorkLoad<100) {
        WorkLoad += 1;}
    }

 
}
