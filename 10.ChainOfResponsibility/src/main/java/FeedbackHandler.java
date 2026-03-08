
public abstract class FeedbackHandler {

    protected FeedbackHandler nextHandler;

    public void setNextHandler(FeedbackHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(Message message);

}

