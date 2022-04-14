package net.mmiroshnichenko.basepatterns.behavioral.chain;

import java.util.List;

public abstract class Support {
    private List<ProblemType> supportedProblems;
    private Support nextSupport;

    public Support(List<ProblemType> supportedProblems) {
        this.supportedProblems = supportedProblems;
    }

    public void setNextSupport(Support nextSupport) {
        this.nextSupport = nextSupport;
    }

    public void responseCustomer(String question, ProblemType problemType) {
        if (supportedProblems.contains(problemType)) {
            write(question);
        }

        if (nextSupport != null) {
            nextSupport.responseCustomer(question, problemType);
        }
    }

    public abstract void write(String question);
}
