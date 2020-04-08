
package home.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Wind implements Serializable
{

    private Float speed;
    private Integer deg;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
