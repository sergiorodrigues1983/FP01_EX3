package pt.ipp.estg.dwdm.gcfgreatescommonfactor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList numbers = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText firstNumber = (EditText) findViewById(R.id.first_number);
        EditText secondNumber = (EditText) findViewById(R.id.second_number);

        numbers.add(firstNumber);
        numbers.add(secondNumber);
    }

    public void nActivity(View view) {
        Intent intent = new Intent(this, Results.class);
        intent.putExtra("NUMBERS", numbers);
        startActivity(intent);
    }
}