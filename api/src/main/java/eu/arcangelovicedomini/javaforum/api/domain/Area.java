package eu.arcangelovicedomini.javaforum.api.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "AREA")
public class Area {
    private String uuid;
    private Long order;
    private Forum forum;
    private String name;
    private String description;
    private List<Section> sections;
}
