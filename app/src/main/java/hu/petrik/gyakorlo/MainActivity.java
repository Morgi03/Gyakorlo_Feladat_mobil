package hu.petrik.gyakorlo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button nagybetuButton;
    private Button kisbetuButton;
    private Button veletlenSzin;
    private TextView showText;
    private Random r;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        nagybetuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uppercase = editText.getText().toString().trim().toUpperCase();
                showText.setText(uppercase);
            }
        });
        kisbetuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lowercase = editText.getText().toString().trim().toLowerCase();
                showText.setText(lowercase);
            }
        });
        veletlenSzin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int red = r.nextInt(256);
                int green = r.nextInt(256);
                int blue = r.nextInt(256);
                showText.setBackgroundColor(Color.rgb(red, green, blue));
                if (red+green+blue>430){
                    showText.setTextColor(Color.BLACK);
                }else{
                    showText.setTextColor(Color.WHITE);
                }
            }
        });
    }

    private void init() {
        editText = findViewById(R.id.editText);
        nagybetuButton = findViewById(R.id.nagybetuButton);
        kisbetuButton = findViewById(R.id.kisbetuButton);
        veletlenSzin = findViewById(R.id.veletlenSzin);
        showText = findViewById(R.id.showText);
        r = new Random();
    }
}