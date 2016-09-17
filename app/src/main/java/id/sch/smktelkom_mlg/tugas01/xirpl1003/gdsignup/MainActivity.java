package id.sch.smktelkom_mlg.tugas01.xirpl1003.gdsignup;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    CheckBox cbPS, cbAI, cbCD;
    EditText etNama, etEmail;
    Button bSU;
    TextView tvHasil;
    RadioGroup rgKelas;
    Spinner spKelas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbAI = (CheckBox) findViewById(R.id.checkBoxAI);
        cbPS = (CheckBox) findViewById(R.id.checkBoxPS);
        cbCD = (CheckBox) findViewById(R.id.checkBoxCorel);
        etNama = (EditText) findViewById(R.id.editTextNama);
        etEmail = (EditText) findViewById(R.id.editTextEmail);
        bSU = (Button) findViewById(R.id.buttonSU);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        rgKelas = (RadioGroup) findViewById(R.id.radioGroupKelas);
        spKelas = (Spinner) findViewById(R.id.spinnerKelas);
        bSU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClick();
            }
        });
    }

    private void doClick() {

    }
}
