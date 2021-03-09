package com.example.activityevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edEmail,edPwd;
    Button button;
    String text_Email,text_Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edEmail = (EditText) findViewById(R.id.editUser);
        edPwd = (EditText) findViewById(R.id.editPassword);
        button = (Button) findViewById(R.id.button);

        //Membuat fungsi onclik pada button signin
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_Email = edEmail.getText().toString();
                text_Password = edPwd.getText().toString();

                //Membuat variabel toast dan membuat tost untuk menampilkan toast sesuai kondisi
                if (text_Email.equals("admin123@mail.com") && text_Password.equals("admin123")){

                    //Jika Login Berhasil
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Berhasil",Toast.LENGTH_LONG);
                    t.show();
                }else if (text_Password.equals("admin123")){

                    //Jika Email Salah
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email Salah",Toast.LENGTH_LONG);
                    t.show();
                }
                else if (text_Email.equals("admin123@mail.com")){

                    //Jika Password Salah
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Password Salah",Toast.LENGTH_LONG);
                    t.show();
                }else {

                    //Jika Email dan Password Salah
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password Salah",Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });
    }
}