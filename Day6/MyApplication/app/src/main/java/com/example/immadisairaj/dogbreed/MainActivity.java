package com.example.immadisairaj.dogbreed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import org.json.JSONObject;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    ImageView image1, image2;
    EditText breed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = findViewById(R.id.iv_dog1);
        image2 = findViewById(R.id.iv_dog2);
        breed = findViewById(R.id.et_breed);
    }

    public void search(View view) {
        String dogBreed = breed.getText().toString();

        if(!(dogBreed.equals(""))) {
            DogTask task = new DogTask();

            JSONObject object = null;

            try {
                object = task.execute(dogBreed).get();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            } catch (ExecutionException ee) {
                ee.printStackTrace();
            }

            try {
                String status = object.getString("status");
                if(status.equals("success")) {
                    String dogImage1 = object.getJSONArray("message").get(0).toString();
                    String dogImage2 = object.getJSONArray("message").get(1).toString();

                    Glide.with(this).load(dogImage1).into(image1);
                    Glide.with(this).load(dogImage2).into(image2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
