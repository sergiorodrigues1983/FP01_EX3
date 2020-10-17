package pt.ipp.estg.dwdm.gcfgreatescommonfactor;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class Results extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getIntent().getIntegerArrayListExtra("NUMBERS");
    }


}
