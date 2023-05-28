package main.chainofresponsibility;

import main.chainofresponsibility.supportchain.*;

public class Demo {

    public static void main(String[] args) {
        String problem = "Ничего не работает";

        SupportChain supportLine = SupportChain.link(
                new ChatBotSupportChain(),
                new ChatOperatorChain(),
                new FirstLineEngineerSupportChain(),
                new SecondLineEngineerSupportChain()
        );

        supportLine.solveProblem(problem);
    }

}
