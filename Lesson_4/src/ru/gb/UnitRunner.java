package ru.gb;

public class UnitRunner {

    public static void main(String[] args) {
        runApp();
    }

    public static void runApp() {
        Unit unit = new AttackUnitAdapter("Terminator");
        unit.salute();
        unit.move();
        unit.attack();
    }
}
