package com.example.model;


import java.util.List;




import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Sharanu_product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Double price;
    private Integer stock;
	

	
	

}
