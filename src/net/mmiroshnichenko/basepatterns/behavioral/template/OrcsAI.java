package net.mmiroshnichenko.basepatterns.behavioral.template;

public class OrcsAI extends GameAi{
    @Override
    protected void buildStructures() {
        System.out.println("Build orcs structures");
    }

    @Override
    protected void buildUnits() {
        System.out.println("Build orcs units");
    }
}
