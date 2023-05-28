package main.templatemethod;

import main.templatemethod.networks.OK;
import main.templatemethod.networks.SocialNetwork;
import main.templatemethod.networks.VK;

public class Demo {

    public static void main(String[] args) {
        SocialNetwork vk = new VK("Петя", "111");
        SocialNetwork ok = new OK("Вася", "qwerty");
        vk.post("Сегодня у меня ДР");
        ok.post("Вот такого леща поймал сегодня");
    }

}
