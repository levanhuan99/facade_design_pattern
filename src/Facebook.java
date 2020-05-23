public class Facebook implements SocialMedia {
    private String message;

    @Override
    public void setMessage(String message) {
        this.message=message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to facbook "+this.message);
    }
}
