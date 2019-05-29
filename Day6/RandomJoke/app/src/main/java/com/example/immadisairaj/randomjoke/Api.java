package com.example.immadisairaj.randomjoke;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://official-joke-api.appspot.com/jokes/random/";

    @GET(BASE_URL)
    Call<Joke> getJoke();
}
