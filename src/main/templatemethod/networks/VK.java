package main.templatemethod.networks;


public class VK extends SocialNetwork {
    public VK(String userName, String password) {
        this.username = userName;
        this.password = password;
    }

    public void logIn() {
        System.out.printf("Пользователь %s успешно авторизован на сайте vk.com%n", username);
    }

    public void sendPost(String post) {
        System.out.printf("Пост '%s' успешно опубликован в vk.com%n", post);
    }

    public void logOut() {
        System.out.printf("Пользователь %s вышел из сайта vk.com%n", username);
    }
}