package main.chainofresponsibility.supportchain;

public class ChatBotSupportChain extends SupportChain {

    @Override
    public boolean solveProblem(String problem) {
        System.out.printf("Проблему '%s' решает чатбот%n", problem);
        return solveProblemNext(problem);
    }

}