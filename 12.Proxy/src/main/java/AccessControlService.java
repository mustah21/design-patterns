import java.util.HashMap;
import java.util.HashSet;

public class AccessControlService {

    private final HashMap<String, HashSet<Integer>> userPermissions = new HashMap<>();
    private static AccessControlService instance;

    private AccessControlService(){}


    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public boolean isAllowed(String username, int documentId) {
        HashSet<Integer> allowed = userPermissions.get(username);
        return allowed != null && allowed.contains(documentId);
    }

    public void grantAccess(String username, int documentId) {
        userPermissions.computeIfAbsent(username, k -> new HashSet<>()).add(documentId);
    }


//    public void grantAccess(String username, int documentId) {
//        if (!userPermissions.containsKey(username)) {
//            userPermissions.put(username, new HashSet<>());
//        }
//        userPermissions.get(username).add(documentId);
//    }

}