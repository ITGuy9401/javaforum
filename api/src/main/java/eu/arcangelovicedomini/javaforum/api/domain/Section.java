package eu.arcangelovicedomini.javaforum.api.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Blob;
import java.util.List;

@Entity
@Table(name = "SECTION")
public class Section {
    private String uuid;
    private Long order;
    private String name;
    private String description;
    private Blob image;
    private Section parentSection;
    private Area area;
    private List<Group> relatedGroups;
    private List<Section> childSections;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(strategy = "uuid2", name = "uuid")
    @Column(name = "UUID")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Column(name = "ORDER")
    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Lob
    @Column(name = "IMAGE")
    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    @ManyToOne
    @Column(name = "PARENT_SECTION_UUID")
    public Section getParentSection() {
        return parentSection;
    }

    public void setParentSection(Section parentSection) {
        this.parentSection = parentSection;
    }

    @ManyToOne
    @Column(name = "AREA_UUID")
    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    @OneToMany(mappedBy = "SECTION_UUID")
    public List<Group> getRelatedGroups() {
        return relatedGroups;
    }

    public void setRelatedGroups(List<Group> relatedGroups) {
        this.relatedGroups = relatedGroups;
    }

    @OneToMany(mappedBy = "PARENT_SECTION_UUID")
    public List<Section> getChildSections() {
        return childSections;
    }

    public void setChildSections(List<Section> childSections) {
        this.childSections = childSections;
    }
}
