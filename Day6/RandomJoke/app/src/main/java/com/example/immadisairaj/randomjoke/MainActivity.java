package com.example.immadisairaj.randomjoke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView setup, punchLine;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.bt_joke);
        setup = findViewById(R.id.tv_setup);
        punchLine = findViewById(R.id.tv_punch_line);
    }

    public void generate(View view) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);
        Call<Joke> call = api.getJoke();

        call.enqueue(new Callback<Joke>() {
            @Override
            public void onResponse(Call<Joke> call, Response<Joke> response) {

                Log.v("Api", call.request().url().toString());

                Joke joke = response.body();

                setup.setText(joke.getSetup());
                punchLine.setText(joke.getPunchline());

            }

            @Override
            public void onFailure(Call<Joke> call, Throwable t) {
                Log.v("Api", "Api Failed");
            }
        });
    }
}