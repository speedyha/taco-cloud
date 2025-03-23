package ir.jiring.tacocloud.domain;


import lombok.Data;

@Data
public class Ingredient {
    private final String ID;
    private final String NAME;
    private final Type TYPE;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE , SAUCE
    }
}