package com.example.icare;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.time.LocalTime;



public class MainActivity extends Activity {
    private TextView greetingTextView;
    private ImageView mountain;
    private ImageView centerImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetingTextView = findViewById(R.id.greetingTextView);
        mountain = findViewById(R.id.meditationImage);
        centerImage = findViewById(R.id.centerImage);

        greetingTextView.setText(getGreeting());
        // Set meditation image (ensure you have a drawable named meditation.png)
        mountain.setImageResource(R.drawable.mountain);

}
    private String getGreeting() {
        int hour = 0;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            hour = LocalTime.now().getHour();
        }
        if (hour >= 5 && hour < 12) {
            return "Good Morning!";
        } else if (hour >= 12 && hour < 17) {
            return "Good Afternoon!";
        } else if (hour >= 17 && hour < 21) {
            return "Good Evening!";
        } else {
            return "Welcome!";
        }
    }
}

