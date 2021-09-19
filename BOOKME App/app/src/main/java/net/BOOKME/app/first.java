package net.BOOKME.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class first extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        button = findViewById(R.id.barber);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openbarber();
            }
        });
    }

    public void openbarber() {
        Intent intent = new Intent(this, state.class);
        startActivity(intent);
    }
}