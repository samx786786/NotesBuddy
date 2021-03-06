package com.example.notesbuddy;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatingActionButton=findViewById(R.id.floatingActionButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, uploadmain.class);
                startActivity(intent);
            }
        });
        Button button3 = findViewById(R.id.sem3);
        Button button4 = findViewById(R.id.sem4);
        Button button5 = findViewById(R.id.sem5);
        Button button6= findViewById(R.id.sem6);
        Button button7= findViewById(R.id.sem7);
        Button button8= findViewById(R.id.sem8);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sem3:
                Intent intent = new Intent(MainActivity.this, sem3.class);
                startActivity(intent);
                break;
            case R.id.sem4:
                intent = new Intent(MainActivity.this, sem4.class);
                startActivity(intent);
                break;
            case R.id.sem5:
                intent = new Intent(MainActivity.this, sem5.class);
                startActivity(intent);
                break;
            case R.id.sem6:
                intent = new Intent(MainActivity.this, sem6.class);
                startActivity(intent);
                break;
            case R.id.sem7:
                intent = new Intent(MainActivity.this, sem7.class);
                startActivity(intent);
                break;
            case R.id.sem8:
                intent = new Intent(MainActivity.this, sem8.class);
                startActivity(intent);
                break;
        }
    }
}
