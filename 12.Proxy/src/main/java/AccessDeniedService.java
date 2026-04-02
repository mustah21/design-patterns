
public class AccessDeniedService {

    public String setMessage(User user) {
        return "Access denied! " + user.getUsername() + " does not have access to this document\n";
    }

}
