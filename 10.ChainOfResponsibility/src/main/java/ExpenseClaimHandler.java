
public class ExpenseClaimHandler extends FeedbackHandler {

    @Override
    public void handle(Message message) {
        if (message.getMessageType() == MessageType.EXPENSE_CLAIM) {

            System.out.println("--- Expense claim handler ---");
            System.out.println("Reviewing claim from: " + message.getSenderEmail());
            System.out.println("Claim details: " + message.getContent());

            if (message.getContent().contains("refund")) {
                System.out.println("Decision: APPROVED, refund will be processed.");
            } else {
                System.out.println("Decision: REJECTED, claim does not meet criteria.");
            }

        }
        else {
            if (nextHandler != null) {
                nextHandler.handle(message);
            }

        }
    }
}