package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onRegisterClick(View view) {
        TextView txtFName = findViewById(R.id.txtFName);
        TextView txtLName = findViewById(R.id.txtLName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        EditText editFName = findViewById(R.id.editFName);
        EditText editLName = findViewById(R.id.editLName);
        EditText editEmail = findViewById(R.id.editEmail);

        txtFName.setText(editFName.getText().toString());
        txtLName.setText(editLName.getText().toString());
        txtEmail.setText(editEmail.getText().toString());
    }
}
