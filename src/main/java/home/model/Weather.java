package home.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "vejr_id")
    private Vejr vejr;
    @Column(name = "name")
    private Integer id;
    private String main;
    private String description;
    private String icon;
    private final static long serialVersionUID = 2814875370537273520L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Vejr getVejr() {
        return vejr;
    }

    public void setVejr(Vejr vejr) {
        this.vejr = vejr;
    }
}