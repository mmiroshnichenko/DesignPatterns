package net.mmiroshnichenko.basepatterns.behavioral.template;

public class GameRunner {
    public static void main(String[] args) {
        MonsterAI monster = new MonsterAI();
        OrcsAI orcsAI = new OrcsAI();

        monster.turn();
        orcsAI.turn();
    }
}
