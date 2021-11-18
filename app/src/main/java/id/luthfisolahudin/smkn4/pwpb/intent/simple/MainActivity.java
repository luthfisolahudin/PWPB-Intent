package id.luthfisolahudin.smkn4.pwpb.intent.simple;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonImplicitIntent;
    private Button buttonExplicitIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonImplicitIntent = findViewById(R.id.button_intent_implicit);
        buttonImplicitIntent.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://smkn4bdg.sch.id"));
            startActivity(intent);
        });

        buttonExplicitIntent = findViewById(R.id.button_intent_explicit);
        buttonExplicitIntent.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, IntentActivity.class);
            startActivity(intent);
        });
    }
}