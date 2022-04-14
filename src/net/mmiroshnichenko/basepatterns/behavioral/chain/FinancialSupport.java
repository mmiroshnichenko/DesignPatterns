package net.mmiroshnichenko.basepatterns.behavioral.chain;

import java.util.List;

public class FinancialSupport extends Support {
    public FinancialSupport(List<ProblemType> supportedProblems) {
        super(supportedProblems);
    }

    @Override
    public void write(String question) {
        System.out.println("You are connected to financial support with question: '" + question + "'" );
    }
}
