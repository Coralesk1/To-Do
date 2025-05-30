package Project;
import java.time.LocalDate;


public class Task {
    

    private String Title;
    private String Description;
    private LocalDate dateLimit;
    private int Priority; // Enum: BAIXA, MEDIA, ALTA
    private boolean Completed;

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
        /* return Completed; */
    }


    
}
