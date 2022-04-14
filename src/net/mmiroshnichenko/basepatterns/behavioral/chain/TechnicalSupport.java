package net.mmiroshnichenko.basepatterns.behavioral.chain;

import java.util.List;

public class TechnicalSupport extends Support {

    public TechnicalSupport(List<ProblemType> supportedProblems) {
        super(supportedProblems);
    }

    @Override
    public void write(String question) {
        System.out.println("You are connected to technical support with question: '" + question + "'" );
    }
}
