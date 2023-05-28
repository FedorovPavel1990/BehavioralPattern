package main.listner.subscriber;

import main.listner.newspaper.Newspaper;

public class NewspaperSubscriber implements Subscriber {

    private final String address;

    public NewspaperSubscriber(String address) {
        this.address = address;
    }

    @Override
    public void update(Newspaper newspaper) {
        System.out.printf("По адресу %s отправлен новый выпуск газеты %s%n", address, newspaper.getIssueName());
    }

}
