package pt.ipp.estg.dwdm.gcfgreatescommonfactor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Intent intent = getIntent();
        String numberOne = intent.getStringExtra(MainActivity.fNumber);
        String numberTwo = intent.getStringExtra(MainActivity.sNumber);
        String result = intent.getStringExtra(MainActivity.gCFactor);

        TextView textViewOne = findViewById(R.id.fNumber);
        TextView textViewTwo = findViewById(R.id.sNumber);
        TextView textViewResult = findViewById(R.id.result);

        textViewOne.setText(numberOne);
        textViewTwo.setText(numberTwo);
        textViewResult.setText(result);
    }
}