package main.listner;

import main.listner.newspaper.Newspaper;
import main.listner.subscriber.NewspaperSubscriber;
import main.listner.subscriber.Subscriber;

public class Demo {
    public static void main(String[] args) {
        Newspaper newspaper = new Newspaper("Выпуск №15 от 02.04.2023");
        Subscriber subscriber = new NewspaperSubscriber("г. Москва, ул. 1905 года, д. 23, кв. 65");
        newspaper.getPublisher().subscribe(subscriber);
        newspaper.releaseNewIssue();
        newspaper.getPublisher().unsubscribe(subscriber);
        newspaper.releaseNewIssue();
    }
}
