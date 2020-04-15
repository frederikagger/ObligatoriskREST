
package home.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "clouds")
public class Clouds extends BaseEntity
{

    @OneToOne(mappedBy = "clouds")
    private Vejr vejr;
    @Column(name = "total")
    private int all;
    private final static long serialVersionUID = 5551183102126533029L;

    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }

    public Vejr getVejr() {
        return vejr;
    }

    public void setVejr(Vejr vejr) {
        this.vejr = vejr;
    }
}