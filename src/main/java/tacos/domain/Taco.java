package tacos.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

public class Taco {

	private Long id;
	private Date createdAt = new Date();

	@NotNull
	@Size(min=5, message="Name must be at least 5 characters long!")
	private String name;

	@NotNull
	@Size(min=1, message="You must choose at least 1 ingredient")
	private List<Ingredient> ingredients;
	
	
	public Taco() {
		super();
	}

	public Taco(String name, List<Ingredient> ingredients) {
		super();
		this.name = name;
		this.ingredients = ingredients;
	}

	public Taco(Long id, Date createdAt, String name, List<Ingredient> ingredients) {
		this.id = id;
		this.createdAt = createdAt;
		this.name = name;
		this.ingredients = ingredients;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
