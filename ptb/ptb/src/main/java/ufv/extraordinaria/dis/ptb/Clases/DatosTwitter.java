package ufv.extraordinaria.dis.ptb.Clases;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class DatosTwitter {
    private Integer id;
    private String tweet;
    private String usuario;

    private String fecha;

  /*  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private Date fecha; //Fecha del informe */

    public DatosTwitter() { //Constructor vacío
    }

    public DatosTwitter(Integer id, String tweet, String usuario, String fecha) {
        this.id = id;
        this.tweet = tweet;
        this.usuario = usuario;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

