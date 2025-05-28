package Class;
import java.time.LocalDate;
import java.util.Scanner;

public class Task {
    

    private String Title; 
    private String Description;
    private LocalDate dateLimit;
    private String priority; // Enum: BAIXA, MEDIA, ALTA
    private boolean completed;

    /* construtor da class */
    public Task(String Title, String Description){
        this.Title = Title; /* this.Title =  o atributo da classe, e Title = o parâmetro que veio de fora*/
        this.Description = Description;
    }
    public String toString(){
        return "Título: " + Title + ", Descrição: " + Description;
    }

    
}
