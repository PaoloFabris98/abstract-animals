package org.classes;

public class Lupo extends Animal implements faiNuotare {
    public String mangia() {
        return "Carnivoro";
    }

    public String verso() {
        return "ulula";
    }

    public String nuota() {
        return "Sto nuovanto!!!";
    }
}
