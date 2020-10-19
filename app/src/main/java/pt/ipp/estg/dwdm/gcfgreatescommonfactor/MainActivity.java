package pt.ipp.estg.dwdm.gcfgreatescommonfactor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String fNumber = "FIRST_NUMBER";
    public static final String sNumber = "SECOND_NUMBER";
    public static final String gCFactor = "RESULT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void nActivity(View view) {
        Intent intent = new Intent(this, Results.class);
        EditText editTextFNumber = (EditText) findViewById(R.id.first_number);
        EditText editTextSNumber = (EditText) findViewById(R.id.second_number);
        String numberOne = editTextFNumber.getText().toString();
        String numberTwo = editTextSNumber.getText().toString();
        String result = gcf(Integer.parseInt(numberOne), Integer.parseInt(numberTwo));

        intent.putExtra(fNumber, numberOne);
        intent.putExtra(sNumber, numberTwo);
        intent.putExtra(gCFactor, result);
        startActivity(intent);

    }

    public String gcf(int n1, int n2) {
        int remainder;
        int higher, smaller;

        if (n1 > n2) {
            higher = n1;
            smaller = n2;
        } else {
            higher = n2;
            smaller = n1;
        }

        remainder = higher % smaller;

        if (remainder != 0) {
            return gcf(smaller, remainder);
        }

        return Integer.toString(smaller);

    }

}