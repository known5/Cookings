package controller;

import model.*;
import view.RecipeView;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Set;

/**
 * Created by Breus on 17-12-2015.
 */
public class RecipeController {
    private Recipe model;
    private RecipeView view;

    public RecipeController(Recipe model, RecipeView view){
        this.model = model;
        this.view = view;
    }

    public void setRecipeID(int id) {
        model.setRecipeID(id);
    }

    public int getRecipeID() {
        return model.getRecipeID();
    }

    public void setRecipeName(String name){
        model.setRecipeName(name);
    }

    public String getRecipeName() {
        return model.getRecipeName();
    }

    public void setStepsequence(List<Step> stepsequence){
        model.setStepSequence(stepsequence);
    }

    public List<Step> getStepsequence() {
        return model.getStepSequence();
    }

    public void setToolSet(Set<Tool> toolSet) {
        model.setToolSet(toolSet);
    }

    public Set<Tool> getToolSet() {
       return model.getToolSet();
    }

    public void setIngredientSet(Set<Ingredient> ingredients) {
        model.setRequiredIngredients(ingredients);
    }

    public Set<Ingredient> getIngredientSet() {
        return model.getRequiredIngredients();
    }



    public void updateView() {

    }
}

