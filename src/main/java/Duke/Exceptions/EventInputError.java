package Duke.Exceptions;

public class EventInputError extends DukeException {

    public EventInputError() {

        this.ERROR_MESSAGE = "\u2639 OOPS!! event command must be in the format: \nevent xxx /at yyyy-mm-dd";

    }

}
