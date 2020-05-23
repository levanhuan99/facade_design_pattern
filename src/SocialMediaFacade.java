public class SocialMediaFacade {
    private Facebook facebook;
    private Twitter twitter;
    private Linkedln linkedln;

    public SocialMediaFacade( Facebook facebook,Twitter twitter,Linkedln linkedln){
        this.facebook=facebook;
        this.twitter=twitter;
        this.linkedln=linkedln;
    }
    public void share(String message) {
        this.facebook.setMessage(message);
        this.twitter.setMessage(message);
        this.linkedln.setMessage(message);
        facebook.share();
        twitter.share();;
        linkedln.share();
    }
}
