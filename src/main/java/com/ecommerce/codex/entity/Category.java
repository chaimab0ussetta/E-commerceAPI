package com.ecommerce.codex.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "category")
public class Category {
 //on va relier ces attributs avec la table category de notre bd relationnelle avec @column , @Generatedvalue etc..
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    @Column(name = "category_name")
	    private @NotBlank String categoryName;

	    private @NotBlank String description;

	    @Column(name = "image_url")
	    private @NotBlank String imageUrl;

	    
	    public Category(Integer id, @NotBlank String categoryName, @NotBlank String description,
				@NotBlank String imageUrl) {

			this.id = id;
			this.categoryName = categoryName;
			this.description = description;
			this.imageUrl = imageUrl;
		}

		public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getCategoryName() {
	        return categoryName;
	    }

	    public void setCategoryName(String categoryName) {
	        this.categoryName = categoryName;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public String getImageUrl() {
	        return imageUrl;
	    }

	    public void setImageUrl(String imageUrl) {
	        this.imageUrl = imageUrl;
	    }
	    
		@Override
		public String toString() {
			return "User {category id=" + id + ", category name='" + categoryName + "', description='" + description + "'}";
		}
	}

