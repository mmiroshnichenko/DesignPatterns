package net.mmiroshnichenko.basepatterns.behavioral.chain;

import java.util.ArrayList;
import java.util.List;

public class SupportRunner {
    public static void main(String[] args) {
        List<ProblemType> financialProblems = new ArrayList<>();
        financialProblems.add(ProblemType.BALANCE);
        financialProblems.add(ProblemType.CREDIT);
        financialProblems.add(ProblemType.TRANSACTIONS);
        financialProblems.add(ProblemType.COMMON);

        List<ProblemType> technicalProblems = new ArrayList<>();
        technicalProblems.add(ProblemType.BAD_QUALITY);
        technicalProblems.add(ProblemType.NO_CONNECTION);
        technicalProblems.add(ProblemType.BREAKING);
        technicalProblems.add(ProblemType.COMMON);

        Support technicalSupport = new TechnicalSupport(technicalProblems);
        Support financialSupport = new FinancialSupport(financialProblems);

        technicalSupport.setNextSupport(financialSupport);

        technicalSupport.responseCustomer("I have balance question", ProblemType.BALANCE);
        technicalSupport.responseCustomer("I have common question", ProblemType.COMMON);
    }
}
