package main.templatemethod.networks;

public abstract class SocialNetwork {
    protected String username;
    protected String password;

    public void post(String message) {
        logIn();
        sendPost(message);
        logOut();
    }

    abstract void logIn();

    abstract void sendPost(String post);

    abstract void logOut();
}