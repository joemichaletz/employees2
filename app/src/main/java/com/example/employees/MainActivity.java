package com.example.employees;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText fnameET, lnameET, ageET, weightET, feetET, inchesET;
    TextView outputTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.fnameET = this.findViewById(R.id.fnameET);
        this.lnameET = this.findViewById(R.id.lnameET);
        this.ageET = this.findViewById(R.id.ageET);
        this.weightET = this.findViewById(R.id.weightET);
        this.feetET = this.findViewById(R.id.feetET);
        this.inchesET = this.findViewById(R.id.inchesET);

        this.outputTV = this.findViewById(R.id.outputTV);
    }

    /*Write an android program which allows the user
    to read in information about an Employee.
    The info should include first name, last name, age, height, and weight.
    You should create an appropriate data entry screen as well
    as an appropriate Java object to support Employees.
    Prove that you are able to successfully read in an employee
    by displaying the info related to the employ in some way
    (perhaps as a string in a textView).
    Submit a link to your public project on github, a screen shot of your interface,
    and the self evaluation.
     */

    public void onButtonPressed(View v)
    {
        Employee e = new Employee(
                this.fnameET.getText().toString(),
                this.lnameET.getText().toString(),
                Integer.parseInt(this.ageET.getText().toString()),
                Integer.parseInt(this.weightET.getText().toString()),
                Integer.parseInt(this.feetET.getText().toString()),
                Integer.parseInt(this.inchesET.getText().toString()));

        this.outputTV.setText(e.Display());
        //e.Display();

    }


}
