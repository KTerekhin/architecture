package ru.gb;

public class AttackUnitAdapter extends AttackUnit implements Unit {

    public AttackUnitAdapter(String name) {
        super(name);
    }

    @Override
    public void move() {
        moveUnit();
    }

    @Override
    public void salute() {
        saluteUnit();
    }

    @Override
    public void attack() {
        attackUnit();
    }
}
