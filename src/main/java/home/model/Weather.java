
package home.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Weather implements Serializable
{

    private Integer id;
    private String main;
    private String description;
    private String icon;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
