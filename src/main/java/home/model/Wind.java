package home.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Wind extends BaseEntity
{

    @OneToOne(mappedBy = "wind")
    private Vejr vejr;
    private Float speed;
    private Integer deg;
    private final static long serialVersionUID = 4773578386944280830L;

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(Integer deg) {
        this.deg = deg;
    }


    public Vejr getVejr() {
        return vejr;
    }

    public void setVejr(Vejr vejr) {
        this.vejr = vejr;
    }
}
