package ir.housework.springbootrecipeapp.model;

import javax.persistence.*;

public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private String notes;
    @Lob
    private Recipe recipeNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Recipe getRecipe() {
        return recipeNotes;
    }

    public void setRecipe(Recipe recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
