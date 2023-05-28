package main.listner.newspaper;

import main.listner.publisher.NewIssuePublisher;

public class Newspaper {

    private final String issueName;
    private final NewIssuePublisher publisher = new NewIssuePublisher();

    public Newspaper(String issueName) {
        this.issueName = issueName;
    }

    public void releaseNewIssue() {
        System.out.printf("Новый выпуск газеты %s%n", issueName);
        publisher.notify(this);
    }

    public String getIssueName() {
        return issueName;
    }

    public NewIssuePublisher getPublisher() {
        return publisher;
    }
}
