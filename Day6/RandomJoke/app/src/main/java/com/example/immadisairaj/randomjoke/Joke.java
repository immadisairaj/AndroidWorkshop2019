package com.example.immadisairaj.randomjoke;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Joke {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("setup")
    @Expose
    private String setup;
    @SerializedName("punchline")
    @Expose
    private String punchline;

    /**
     * No args constructor for use in serialization
     *
     */
    public Joke() {
    }

    /**
     *
     * @param id
     * @param setup
     * @param punchline
     * @param type
     */
    public Joke(Integer id, String type, String setup, String punchline) {
        super();
        this.id = id;
        this.type = type;
        this.setup = setup;
        this.punchline = punchline;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }

}