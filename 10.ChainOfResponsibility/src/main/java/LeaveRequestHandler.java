
// Code logic is a bit fragile, but it follows the pattern logic for now

public class LeaveRequestHandler extends FeedbackHandler {


    @Override
    public void handle(Message message) {
        if (message.getMessageType() == MessageType.LEAVE_REQUEST) {

            System.out.println("--- Leave request handler ---");
            System.out.println("Reviewing claim from: " + message.getSenderEmail());
            System.out.println("Claim details: " + message.getContent());

            if (message.getContent().contains("sick")) {
                System.out.println("Leave request approved on basis of being sick. ");

            } else if (message.getContent().contains("casual")) {
                System.out.println("Leave request approved, to be cut from casual leave days.");
            } else if (message.getContent().contains("vacations")) {
                System.out.println("HR will be in contact");
            } else {
                System.out.println("Leave request rejected, no valid reason provided.");
            }

        } else {
            if (nextHandler != null) {
                nextHandler.handle(message);
            }
        }
    }


}
