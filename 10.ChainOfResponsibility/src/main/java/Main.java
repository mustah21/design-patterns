public class Main {
    public static void main(String[] args) {

        FeedbackHandler expenseHandler  = new ExpenseClaimHandler();
        FeedbackHandler leaveRequestHandler = new LeaveRequestHandler();
        FeedbackHandler generalHandler = new GeneralFeedbackHandler();

        expenseHandler.setNextHandler(leaveRequestHandler);
        leaveRequestHandler.setNextHandler(generalHandler);


        Message msg1 = new Message(MessageType.EXPENSE_CLAIM,
                "I would like a refund for my trip expenses.",
                "godzilla@gmail.com");

        Message msg2 = new Message(MessageType.LEAVE_REQUEST,
                "I wish to take a sick leave feeling under the weather.",
                "bobbylee@gmail.com");


        Message msg3 = new Message(MessageType.GENERAL_FEEDBACK,
                "Overall I am happy with the service, keep it up!",
                "goliath@novista.em");


        System.out.println("\n");
        expenseHandler.handle(msg1);

        System.out.println("\n");
        expenseHandler.handle(msg2);

        System.out.println("\n");
        expenseHandler.handle(msg3);


    }
}
