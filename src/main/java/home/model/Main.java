package home.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Main extends BaseEntity
{

    @OneToOne(mappedBy = "main")
    private Vejr vejr;
    private Float temp;
    private Float feels_like;
    private Float temp_min;
    private Float temp_max;
    private Integer pressure;
    private Integer humidity;
    private final static long serialVersionUID = -5800791447258722349L;

    public Float getTemp() {
        return temp;
    }

    public void setTemp(Float temp) {
        this.temp = temp;
    }

    public Float getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(Float feels_like) {
        this.feels_like = feels_like;
    }

    public Float getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(Float temp_min) {
        this.temp_min = temp_min;
    }

    public Float getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(Float temp_max) {
        this.temp_max = temp_max;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Vejr getVejr() {
        return vejr;
    }

    public void setVejr(Vejr vejr) {
        this.vejr = vejr;
    }
}
