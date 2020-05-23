public class Client {
    public void share(String message) {
        SocialMediaFacade socialMedia = new SocialMediaFacade(new Facebook(), new Twitter(), new Linkedln());
        socialMedia.share(message);


    }

    public static void main(String[] args) {
        Client client=new Client();
        client.share("hello");
    }
}
