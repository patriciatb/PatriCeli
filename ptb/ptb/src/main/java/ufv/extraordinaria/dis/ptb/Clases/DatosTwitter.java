package ufv.extraordinaria.dis.ptb.Clases;

public class DatosTwitter {
    private String id;
    private String tweet;
    private String usuario;
    private String fecha;

    public DatosTwitter() { //Constructor vacío
    }

    public DatosTwitter(String id, String tweet, String usuario, String fecha) {
        this.id = id;
        this.tweet = tweet;
        this.usuario = usuario;
        this.fecha = fecha;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
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

