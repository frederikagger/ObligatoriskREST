
package home.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Coord extends BaseEntity
{

    @OneToOne(mappedBy = "coord")
    private Vejr vejr;
    private Float lon;
    private Float lat;
    private final static long serialVersionUID = 8467535423907993800L;

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Vejr getVejr() {
        return vejr;
    }

    public void setVejr(Vejr vejr) {
        this.vejr = vejr;
    }
}
