package main.chainofresponsibility.supportchain;

public class FirstLineEngineerSupportChain extends SupportChain {

    @Override
    public boolean solveProblem(String problem) {
        System.out.printf("Проблему '%s' решает инженер первой линии технической поддержки%n", problem);
        return solveProblemNext(problem);
    }

}