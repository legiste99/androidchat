package project.lapps.a7chat_ui_demo.ui;

import androidx.appcompat.app.AppCompatActivity;
import project.lapps.a7chat_ui_demo.R;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CompleteRegistrationActivity extends AppCompatActivity {

    final Calendar calendar = Calendar.getInstance();
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_registration);


        input = (EditText) findViewById(R.id.edit_dob_input);
        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, month);
                calendar.set(Calendar.DAY_OF_MONTH, day);
                updateTextField();
            }
        };
        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(CompleteRegistrationActivity.this, date,calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
    }

    private void updateTextField() {
        String format = "dd/MM/yy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format, Locale.US);
        input.setText(dateFormat.format(calendar.getTime()));
    }
}