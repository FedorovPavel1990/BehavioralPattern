package main.chainofresponsibility.supportchain;

public class ChatOperatorChain extends SupportChain {

    @Override
    public boolean solveProblem(String problem) {
        System.out.printf("Проблему '%s' решает оператор чата%n", problem);
        return solveProblemNext(problem);
    }

}