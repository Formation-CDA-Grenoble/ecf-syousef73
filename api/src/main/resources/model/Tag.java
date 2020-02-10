package com.example.api.model;
import java.util.Set;
import javax.persistence.*;


@Entity

@Table(name = "tag")
@EntityListeners(AuditingEntityListener.class)
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private long id;
    
    
    public long getId() {
    	return this.id;
    }
    public void setId(long id) {
    	this.id = id;
    }

    
    
    @OneToOne(mappedBy = "tag")
    @JsonIgnoreProperties("tag")
    private Set<Livre> livre;
  
}
