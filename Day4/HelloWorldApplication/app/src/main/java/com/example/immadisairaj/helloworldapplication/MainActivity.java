package com.example.immadisairaj.helloworldapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
    }

    public void sayHello(View view) {
        String name = editText.getText().toString();
        if(name.equals(""))
            name = "Hello World!";
        else
            name = "Hello " + name +"!";
        textView.setText(name);
    }
}
