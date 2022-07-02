package project.lapps.a7chat_ui_demo.ui;

import androidx.appcompat.app.AppCompatActivity;
import project.lapps.a7chat_ui_demo.R;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.google.android.material.button.MaterialButton;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class RegistrationActivity extends AppCompatActivity {

    EditText inputName, inputEmail, inputPassword;
    private MaterialButton btnCreateAccount;
    private LinearLayout btnRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        inputName = findViewById(R.id.edit_name_input);
        inputEmail = findViewById(R.id.edit_email_input);
        inputPassword = findViewById(R.id.edit_password_input);

        btnCreateAccount = findViewById(R.id.btn_create_account);
        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(RegistrationActivity.this, CompleteRegistrationActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnRegistration = findViewById(R.id.btn_back_to_login);
        btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

}