
public class GeneralFeedbackHandler extends FeedbackHandler {

    @Override
    public void handle(Message message) {

        if (message.getMessageType() == MessageType.GENERAL_FEEDBACK) {
            System.out.println("--- General Feedback Handler ---");
            System.out.println("Analyzing feedback from: " + message.getSenderEmail());
            System.out.println("Feedback: " + message.getContent());
            System.out.println("Action: Feedback recorded. Automated response sent to customer.");
        } else {
            if (nextHandler != null) {
                nextHandler.handle(message);
            } else {
                System.out.println("No handler found for message type: " + message.getMessageType());
            }
        }

    }
}