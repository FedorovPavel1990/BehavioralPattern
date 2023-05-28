package main.templatemethod.networks;

public class OK extends SocialNetwork {

    public OK(String userName, String password) {
        this.username = userName;
        this.password = password;
    }

    public void logIn() {
        System.out.printf("Пользователь %s успешно авторизован на сайте ok.ru%n", username);
    }

    public void sendPost(String post) {
        System.out.printf("Пост '%s' успешно опубликован в ok.ru%n", post);
    }

    public void logOut() {
        System.out.printf("Пользователь %s вышел из сайта ok.ru%n", username);
    }

}