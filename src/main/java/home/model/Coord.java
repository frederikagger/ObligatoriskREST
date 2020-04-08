
package home.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Coord implements Serializable
{

    private Float lon;
    private Float lat;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
