package core.ms.management.api.gateway.dao.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "t_resource_service")
public class ResourceMicroservice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;
    @Column(name = "name", length = 80)
    public String name;
}
