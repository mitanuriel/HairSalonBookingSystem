package bookingsystem;

public class Revisor {

    private String userNameRevisor;
    private String passwordRevisor;
    boolean loggedIn;

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
