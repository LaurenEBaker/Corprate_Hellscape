package com.corporate.hellscape.character;

public class Character {
    
    //Class fields
    private String Name;
    private int Health;
    private  int Stress;
    private  int Hunger;
    private  int Stamina;
    private  int Fun;
    private  int Hygiene;
    private  int Workload;

    
    public Character(String name) {
        Name = name;
        Health = 100;
        Stress=0;
        Hunger=0;
        Stamina=100;
        Fun=100;
        Hygiene=100;
        Workload=0;
    }

    private static int _clamp(int inValue, int lowerBound, int upperBound) {
        return
            inValue <= lowerBound ? lowerBound :
            inValue >= upperBound ? upperBound :
                                    inValue    ;
    }

    //Getter Function
    public String getName()  { return Name; }
    public int getHealth()   { return Health; }
    public int getStress()   { return Stress; }
    public int getHunger()   { return Hunger; }
    public int getStamina()  { return Stamina; }
    public int getFun()      { return Fun; }
    public int getHygiene()  { return Hygiene; }
    public int getWorkload() { return Workload; }

    //Setter Funtion
    public void setName(String name)      { Name = name; }
    public void setHealth(int health)     { Health = _clamp(health, 0, 100); }
    public void setHunger(int hunger)     { Hunger = _clamp(hunger, 0, 100); }
    public void setStress(int stress)     { Stress = _clamp(stress, 0, 100); }
    public void setStamina(int stamina)   { Stamina = _clamp(stamina, 0, 100); }
    public void setFun(int fun)           { Fun = _clamp(fun, 0, 100); }
    public void setHygiene(int hygiene)   { Hygiene = _clamp(hygiene, 0, 100); }
    public void setWorkload(int workload) { Workload = _clamp(workload, 0, 100); }

    //Increase/Decrease function
    public  void increaseHealth() { increaseHealthBy(1); }
    public  void increaseHealthBy(int amount) { setHealth(Health + amount); }
    public  void decreaseHealthBy(int amount) { increaseHealthBy(-amount); }
    public  void decreaseHealth() { decreaseHealthBy(1); }

    public  void increaseStress() { increaseStressBy(1); }
    public  void increaseStressBy(int amount) { setStress(Stress + amount); }
    public  void decreaseStressBy(int amount) { increaseStressBy(-amount); }
    public  void decreaseStress() { decreaseStressBy(1); }

    public  void increaseHunger() { increaseHungerBy(1); }
    public  void increaseHungerBy(int amount) { setHunger(Hunger + amount); }
    public  void decreaseHungerBy(int amount) { increaseHungerBy(-amount); }
    public  void decreaseHunger() { decreaseHungerBy(1); }

    public  void increaseStamina() { increaseStaminaBy(1); }
    public  void increaseStaminaBy(int amount) { setStamina(Stamina + amount); }
    public  void decreaseStaminaBy(int amount) { increaseStaminaBy(-amount); }
    public  void decreaseStamina() { decreaseStaminaBy(1); }

    public  void increaseFun() { increaseFunBy(1); }
    public  void increaseFunBy(int amount) { setFun(Fun + amount); }
    public  void decreaseFunBy(int amount) { increaseFunBy(-amount); }
    public  void decreaseFun() { decreaseFunBy(1); }

    public  void increaseHygiene() { increaseHygieneBy(1); }
    public  void increaseHygieneBy(int amount) { setHygiene(Hygiene + amount); }
    public  void decreaseHygieneBy(int amount) { increaseHygieneBy(-amount); }
    public  void decreaseHygiene() { decreaseHygieneBy(1); }

    public  void increaseWorkload() { increaseWorkloadBy(1); }
    public  void increaseWorkloadBy(int amount) { setWorkload(Workload + amount); }
    public  void decreaseWorkloadBy(int amount) { increaseWorkloadBy(-amount); }
    public  void decreaseWorkload() { decreaseWorkloadBy(1); }
}
