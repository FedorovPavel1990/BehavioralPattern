package main.listner.publisher;

import main.listner.newspaper.Newspaper;
import main.listner.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class NewIssuePublisher {
    List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notify(Newspaper newspaper) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(newspaper);
        }
    }
}
