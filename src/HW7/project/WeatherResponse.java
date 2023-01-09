package HW7.project;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.JsonNode;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "LocalObservationDateTime",
        "EpochTime",
        "WeatherText",
        "WeatherIcon",
        "HasPrecipitation",
        "PrecipitationType",
        "IsDayTime",
        "Temperature",
        "MobileLink",
        "Link"
})
@Generated("jsonschema2pojo")
public class WeatherResponse {

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "LocalObservationDateTime",
            "Temperature",
            "WeatherText",
            })
        JsonNode weatherText;
        Temperature temperature;
        JsonNode localObservationDateTime;


    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("LocalObservationDateTime")
    public JsonNode getLocalObservationDateTime() {
        return localObservationDateTime;
    }

    @JsonProperty("LocalObservationDateTime")
    public void setLocalObservationDateTime(JsonNode localObservationDateTime) {
        this.localObservationDateTime = localObservationDateTime;
    }

    @JsonProperty("WeatherText")
    public JsonNode getWeatherText() {
        return weatherText;
    }

    @JsonProperty("WeatherText")
    public void setWeatherText(JsonNode weatherText) {
        this.weatherText = weatherText;
    }

    @JsonProperty("Temperature")
    public Temperature getTemperature() {
        return temperature;
    }

    @JsonProperty("Temperature")
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }


    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}