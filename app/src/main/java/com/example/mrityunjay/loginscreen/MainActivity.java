package com.example.mrityunjay.loginscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

// initialing variable
        private Button btn;
        private EditText inputName;
        private EditText inputPassword;

        static String NAME="NAME";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            inputName = (EditText) findViewById(R.id.name);
            inputPassword = (EditText) findViewById(R.id.password);
            btn = (Button) findViewById(R.id.btnLogin);


            // button click
            btn.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    String name = inputName.getText().toString();
                    String password = inputPassword.getText().toString();

                    // Check for empty data in the form
                    if (name.trim().isEmpty()) {
                        //  user
                        inputName.setError("Enter Name...");
                    }
                    else if(password.trim().isEmpty()){
                        inputPassword.setError("Enter Password...");
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "checking password", Toast.LENGTH_LONG).show();
                        if (name.equals("MJ") && password.equals("1001")) {

                            Intent intent = new Intent(MainActivity.this, NewScreen.class);

                            Bundle bundle = new Bundle();
                            bundle.putString(NAME, inputName.getText().toString());

                            intent.putExtras(bundle);

                            startActivity(intent);
                        } else {
                            Toast.makeText(getApplicationContext(), "Input False", Toast.LENGTH_LONG).show();
                        }

                    }
                }

            });
    }
}
