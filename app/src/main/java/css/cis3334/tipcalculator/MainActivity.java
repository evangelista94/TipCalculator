package css.cis3334.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declare variable here
    EditText etBill;
    EditText etNumParty;
    TextView tvTotalTip;
    TextView tvTipPerPerson;
    TipCalculatorInterface tipCalc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize variables
        etBill = (EditText) findViewById(R.id.editTextBill);
        etNumParty = (EditText) findViewById(R.id.editTextNumParty);
        tvTotalTip = (TextView) findViewById(R.id.textViewTotalTip);
        tvTipPerPerson = (TextView) findViewById(R.id.textViewTipPP);
        tipCalc = new TipCalculator();
    }

    public void OnClickButtonCalc(View view) {
        //enter code here
        Double bill = Double.parseDouble(etBill.getText().toString());
        Integer numPeople = Integer.parseInt(etNumParty.getText().toString());


        tvTotalTip.setText("Total Tip: " + tipCalc.calcTotalTip(bill));
        tvTipPerPerson.setText ("Tip per person: " + tipCalc.calcTipPerPerson(bill, numPeople));

    }
}
