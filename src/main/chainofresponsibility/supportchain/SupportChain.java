package main.chainofresponsibility.supportchain;

public abstract class SupportChain {

    private SupportChain nextLink;

    public static SupportChain link(SupportChain first, SupportChain... chain) {
        SupportChain head = first;
        for (SupportChain nextLink : chain) {
            head.nextLink = nextLink;
            head = nextLink;
        }
        return first;
    }

    public abstract boolean solveProblem(String problem);

    protected boolean solveProblemNext(String problem) {
        if (nextLink == null) {
            return true;
        }
        return nextLink.solveProblem(problem);
    }

}