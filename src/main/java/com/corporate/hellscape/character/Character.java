package com.corporate.hellscape.character;

//TODO: Flesh me out some for issue #4
public class Character {
    
    //Class fields
    private String Name;
    private int Health;
    private  int Stress;
    private  int Hunger;
    private  int Stamina;
    private  int Fun;
    private  int Hygiene;
    private  int WorkLoad;


    
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

    public int getStamina() {
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

    public  void setHunger(int hunger) {
        Hunger = hunger;
    }

    public  void setStress(int stress) {
        Stress = stress;
    }

    public  void setStamina(int stamina) {
        Stamina = stamina;
    }

    public  void setFun(int fun) {
        Fun = fun;
    }

    public  void setHygiene(int hygiene) {
        Hygiene = hygiene;
    }

    public  void setWorkLoad(int workLoad) {
        WorkLoad = workLoad;
    }


    //Increase/Decrease funtion

    public  void decreaseHealth(int amount){
        if(Health > 0 ){
            Health -= amount;
            if(Health < 0){
                //end game method goes here
            }
        }
    }

    public  void decreaseStress(int amount){
        if(Stress > 0 ){
            Stress -= amount;
            if(Stress < 0){
                setStress(0);
            }
        }
    }

    public  void decreaseHunger(int amount){
        if(Hunger > 0 ){
            Hunger -= amount;
            if(Hunger < 0){
                setHunger(0);
            }
        }
    }

    public  void decreaseStamina(int amount){
        if(Stamina > 0 ){
            Stamina -= amount;
            if(Stamina < 0){
               setStamina(0);
            }
        }
    }

    public  void decreaseFun(int amount){
        if(Fun > 0 ){
            Fun -= amount;
            if(Fun < 0){
                setFun(0);
            }
        }
    }

    public  void decreaseHygiene(int amount){
        if(Hygiene > 0 ){
            Hygiene -= 1;
            if(Hygiene < 0){
                setHygiene(0);
            }
        }
    }

    public  void decreaseWorkLoad(int amount){
       if(WorkLoad > 0 ){
            WorkLoad -= amount;
            if(WorkLoad < 0){
                setWorkLoad(0);
            }
        }
    }

    public  void increaseHealth(int amount){
        if (Health<100) {
            Health += amount;}
    }

    public  void increaseStress(int amount){
        if (Stress<100) {
            Stress += amount;}
    }

    public  void increaseHunger(int amount){
       if (Hunger<100) {
        Hunger += amount; } 
    }

    public  void increaseStamina(int amount){
        if (Stamina<100) {
            Stamina += amount; }
    }

    public  void increaseFun(int amount){
        if (Fun<100) {
            Fun += amount;}
    }

    public  void increaseHygiene(int amount){
        if (Hygiene<100) {
            Hygiene += amount; }
    }

    public  void increaseWorkLoad(int amount){
       if (WorkLoad<100) {
        WorkLoad += amount;}
    }

 
}
