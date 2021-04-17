package ru.gb;

public class AttackUnit{
    protected String name;

    public AttackUnit(String name) {
        this.name = name;
    }

     public void moveUnit() {
         System.out.println(String.format("%s is moving...", name));
     }

    public void saluteUnit() {
        System.out.println(String.format("%s is saluting...", name));
    }

    public void attackUnit() {
        System.out.println(String.format("%s is attacking...", name));
    }
}
