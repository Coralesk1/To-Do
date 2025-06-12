package Project;

public class Task {

    private String Title;
    private String Description;
    private int Priority; 
    private Boolean Completed = false;

    /* construtor da class */
    public Task(String Title, String Description, int Priority, boolean Completed){
        this.Title = Title; /* this.Title =  o atributo da classe, e Title = o parâmetro que veio de fora*/
        this.Description = Description;
        this.Priority = Priority;
        this.Completed = Completed;
    }

    public String getTitle() {
        return Title; 
    }

    public String getDescription() {
        return Description;
    }

    public int getPriority() {
        return Priority;
    }

    public boolean getCompleted() {
        return Completed;
    }

    public void setCompleted(boolean completed) {
        this.Completed = completed;
    }
    
    public void setUnmark(boolean completed){
        this.Completed = completed;
    }

    
   


    
}
