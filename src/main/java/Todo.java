public class Todo extends Task {

    protected String by;
    protected String description;

    public Todo(String description, String by) {
        super(description);
        this.by = by;
    }

    @Override
    public String toString() {
        return "[T]" + super.toString() + " (by: " + by + ")";
    }
}