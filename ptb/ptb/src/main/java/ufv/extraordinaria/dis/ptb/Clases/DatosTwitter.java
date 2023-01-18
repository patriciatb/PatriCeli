package ufv.extraordinaria.dis.ptb.Clases;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class DatosTwitter {
    private String codigo_geometria;
    private String zona_basica_salud;
    private Float tasa_incidencia_acumulada_ultimos_14dias;
    private Float tasa_incidencia_acumulada_total;
    private Integer casos_confirmados_totales;
    private Integer casos_confirmados_ultimos_14dias;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy HH:mm:ss")
    private Date fecha_informe; //Fecha del informe

    public DatosTwitter() {
    }

    public DatosTwitter(String codigo_geometria, String zona_basica_salud, Float tasa_incidencia_acumulada_ultimos_14dias, Float tasa_incidencia_acumulada_total, Integer casos_confirmados_totales, Integer casos_confirmados_ultimos_14dias, Date fecha_informe) {
        this.codigo_geometria = codigo_geometria;
        this.zona_basica_salud = zona_basica_salud;
        this.tasa_incidencia_acumulada_ultimos_14dias = tasa_incidencia_acumulada_ultimos_14dias;
        this.tasa_incidencia_acumulada_total = tasa_incidencia_acumulada_total;
        this.casos_confirmados_totales = casos_confirmados_totales;
        this.casos_confirmados_ultimos_14dias = casos_confirmados_ultimos_14dias;
        this.fecha_informe = fecha_informe;
    }

    public String getCodigo_geometria() {
        return codigo_geometria;
    }

    public void setCodigo_geometria(String codigo_geometria) {
        this.codigo_geometria = codigo_geometria;
    }

    public String getZona_basica_salud() {
        return zona_basica_salud;
    }

    public void setZona_basica_salud(String zona_basica_salud) {
        this.zona_basica_salud = zona_basica_salud;
    }

    public Float getTasa_incidencia_acumulada_ultimos_14dias() {
        return tasa_incidencia_acumulada_ultimos_14dias;
    }

    public void setTasa_incidencia_acumulada_ultimos_14dias(Float tasa_incidencia_acumulada_ultimos_14dias) {
        this.tasa_incidencia_acumulada_ultimos_14dias = tasa_incidencia_acumulada_ultimos_14dias;
    }

    public Float getTasa_incidencia_acumulada_total() {
        return tasa_incidencia_acumulada_total;
    }

    public void setTasa_incidencia_acumulada_total(Float tasa_incidencia_acumulada_total) {
        this.tasa_incidencia_acumulada_total = tasa_incidencia_acumulada_total;
    }

    public Integer getCasos_confirmados_totales() {
        return casos_confirmados_totales;
    }

    public void setCasos_confirmados_totales(Integer casos_confirmados_totales) {
        this.casos_confirmados_totales = casos_confirmados_totales;
    }

    public Integer getCasos_confirmados_ultimos_14dias() {
        return casos_confirmados_ultimos_14dias;
    }

    public void setCasos_confirmados_ultimos_14dias(Integer casos_confirmados_ultimos_14dias) {
        this.casos_confirmados_ultimos_14dias = casos_confirmados_ultimos_14dias;
    }

    public Date getfecha_informe() {
        return fecha_informe;
    }

    public void setfecha_informe(Date fecha_informe) {
        this.fecha_informe = fecha_informe;
    }
}

