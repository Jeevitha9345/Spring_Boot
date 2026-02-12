package com.example.OrderEx.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "usersdatabase")
public class UserEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

//    One user can have many orders
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<OrderEntity> orders;

//    getters and seters
//    as we imported lombok we don't need to type it we use annotation @Getter, @Setter and @NoArgsConstructor
}
