package pzinsta.pizzeria.model.pizza;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import pzinsta.pizzeria.model.Constants;

@Entity
public class PizzaSize {
    @Id
    @GeneratedValue(generator = Constants.ID_GENERATOR)
	private Long id;
    
    @NotNull
    @Size(max = 100)
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}