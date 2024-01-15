package com.example.mvp01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpenScreen extends AppCompatActivity {
Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.openscreen);

        initComponents();

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OpenScreen.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    private void initComponents() {
        bt1 = findViewById(R.id.bt1);
    }

}
