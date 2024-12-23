package core.ms.management.api.gateway.dao.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "t_microservice")
public class Microservice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;
    @Column(name = "name", length = 80)
    public String name;
}
