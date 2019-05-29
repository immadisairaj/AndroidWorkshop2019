package com.example.immadisairaj.recyclerapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Fruit> fruitArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("Attach", "0");
        fruitArrayList = new ArrayList<>();
        fruitArrayList.add(new Fruit("Apple", R.drawable.apple));
        fruitArrayList.add(new Fruit("Avocado", R.drawable.avocado));
        fruitArrayList.add(new Fruit("Banana", R.drawable.banana));
        fruitArrayList.add(new Fruit("Blue Berries", R.drawable.blueberries));
        fruitArrayList.add(new Fruit("Cherries", R.drawable.cherries));
        fruitArrayList.add(new Fruit("Grapes", R.drawable.grapes));
        fruitArrayList.add(new Fruit("Lemon", R.drawable.lemon));
        fruitArrayList.add(new Fruit("Orange", R.drawable.orange));
        fruitArrayList.add(new Fruit("Pine Apple", R.drawable.pineapple));
        fruitArrayList.add(new Fruit("Strawberry", R.drawable.strawberry));
        fruitArrayList.add(new Fruit("Watermelon", R.drawable.watermelon));

        FruitAdapter fruitAdapter = new FruitAdapter(fruitArrayList);
        RecyclerView recyclerView = findViewById(R.id.rv_fruit);
        recyclerView.setAdapter(fruitAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
