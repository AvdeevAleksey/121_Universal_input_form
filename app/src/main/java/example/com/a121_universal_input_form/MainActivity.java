package example.com.a121_universal_input_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init() {
        Button buttonOk = findViewById(R.id.buttonOK);
        Button buttonClear = findViewById(R.id.buttonClear);


        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userName = findViewById(R.id.userName);
                EditText userEmail = findViewById(R.id.userEmailAddress);
                TextView txtOutputResults = findViewById(R.id.txtOutputResults);
                String name = userName.getText().toString();
                String email = userEmail.getText().toString();
                String outText = getString(R.string.subscribeToNewsletter) + name + getString(R.string.toEmailAddress) + email;
                txtOutputResults.setText(outText);
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userName = findViewById(R.id.userName);
                EditText userEmail = findViewById(R.id.userEmailAddress);
                TextView txtOutputResults = findViewById(R.id.txtOutputResults);
                txtOutputResults.setText("");
                userName.setText("");
                userEmail.setText("");
            }
        });


    }

}