package net.mmiroshnichenko.basepatterns.behavioral.template;

public class MonsterAI extends GameAi{
    @Override
    protected void buildStructures() {
        System.out.println("Build monster structures");
    }

    @Override
    protected void buildUnits() {
        System.out.println("Build monster units");
    }
}
