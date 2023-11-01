package bookingsystem;

public class Revisor {

    private String userNameRevisor;
    private String passwordRevisor;



    private boolean isLoggedIn;

    static Revisor createRevisor(String userNameRevisor, String passwordRevisor) {
        return new Revisor(userNameRevisor, passwordRevisor);
    }


    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public boolean isLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
        return isLoggedIn;
    }

    Revisor(String userNameRevisor, String passwordRevisor){
        this.passwordRevisor = passwordRevisor;
        this.userNameRevisor = userNameRevisor;
    }

    public void setUserNameRevisor(String userNameRevisor) {
        this.userNameRevisor = userNameRevisor;
    }

    public void setPasswordRevisor(String passwordRevisor) {
        this.passwordRevisor = passwordRevisor;
    }

    public String getUserNameRevisor() {
        return userNameRevisor;
    }

    public String getPasswordRevisor() {
        return passwordRevisor;
    }
}
