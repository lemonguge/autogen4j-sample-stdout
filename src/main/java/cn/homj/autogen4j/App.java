package cn.homj.autogen4j;

import cn.homj.autogen4j.support.Client;

/**
 * @author jiehong.jh
 * @date 2023/12/15
 */
public class App {

    public static String apiKey;

    static {
        try {
            Class.forName("cn.homj.autogen4j.Initializer");
        } catch (Exception e) {
            System.out.println("Initializer not found");
        }
    }

    public static void main(String[] args) {
        UserProxyAgent user = new UserProxyAgent("Hom J.");
        QianWenAgent assistant = new QianWenAgent("Jarvis")
            .client(new Client())
            .model("qwen-plus")
            .apiKey(apiKey);

        user.initChat(assistant, "你好");
        System.exit(0);
    }
}
