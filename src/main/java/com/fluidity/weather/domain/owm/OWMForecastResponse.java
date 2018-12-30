
package com.fluidity.weather.domain.owm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "city",
    "cod",
    "message",
    "cnt",
    "list"
})
public class OWMForecastResponse {

    @JsonProperty("city")
    private City city;
    @JsonProperty("cod")
    private String cod;
    @JsonProperty("message")
    private Float message;
    @JsonProperty("cnt")
    private Long cnt;
    @JsonProperty("list")
    private java.util.List<List> list = null;

    @JsonProperty("city")
    public City getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(City city) {
        this.city = city;
    }

    @JsonProperty("cod")
    public String getCod() {
        return cod;
    }

    @JsonProperty("cod")
    public void setCod(String cod) {
        this.cod = cod;
    }

    @JsonProperty("message")
    public Float getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(Float message) {
        this.message = message;
    }

    @JsonProperty("cnt")
    public Long getCnt() {
        return cnt;
    }

    @JsonProperty("cnt")
    public void setCnt(Long cnt) {
        this.cnt = cnt;
    }

    @JsonProperty("list")
    public java.util.List<List> getList() {
        return list;
    }

    @JsonProperty("list")
    public void setList(java.util.List<List> list) {
        this.list = list;
    }

}
