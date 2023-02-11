package Duke.task;

import java.time.LocalDateTime;

public class Event extends Task {
    LocalDateTime from;
    LocalDateTime to;

    public Event(String desc, boolean done, LocalDateTime from, LocalDateTime to) {
        super(desc, done);
        this.from = from;
        this.to = to;
    }

    /**
     * getter for "from" date
     * @return this.from
     */
    public String getFrom(){
        return format24HrDate(this.from);
    }

    /**
     * getter for "to" date
     * @return this.to
     */
    public String getTo(){
        return format24HrDate(this.to);
    }

    @Override
    public String toString(){
        return "[E]" + super.toString() + " (from: " + formatDate(this.from) + " to " + formatDate(this.to) + ")";
    }
}