package com.nosbielc.music.match.dtos;

import java.io.Serializable;
import java.util.StringJoiner;

public class MusicMatchDto implements Serializable {

    private String cidade;
    private Double lat;
    private Double lon;

    @Override
    public String toString() {
        return new StringJoiner(", ", MusicMatchDto.class.getSimpleName() + "[", "]")
                .add("cidade='" + cidade + "'")
                .add("lat='" + lat + "'")
                .add("lon='" + lon + "'")
                .toString();
    }

    public MusicMatchDto() {
    }

    public MusicMatchDto(String cidade, Double lat, Double lon) {
        this.cidade = cidade;
        this.lat = lat;
        this.lon = lon;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }
}
