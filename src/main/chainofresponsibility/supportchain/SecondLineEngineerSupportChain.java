package main.chainofresponsibility.supportchain;

public class SecondLineEngineerSupportChain extends SupportChain {

    @Override
    public boolean solveProblem(String problem) {
        System.out.printf("Проблему '%s' решает инженер второй линии технической поддержки%n", problem);
        return solveProblemNext(problem);
    }

}