package com.example.immadisairaj.listapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Fruit> fruitArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        FruitAdapter fruitAdapter = new FruitAdapter(this, fruitArrayList);
        ListView fruitListView = findViewById(R.id.lv_fruit);
        fruitListView.setAdapter(fruitAdapter);
    }
}
