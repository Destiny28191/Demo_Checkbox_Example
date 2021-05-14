package sg.edu.rp.c346.id20022098.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBoxDiscount;
    Button buttonCheck;
    TextView textView;

    private double calcPay(double price, double discount){
        double pay = price * (1 - discount/100);
        return pay;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxDiscount.findViewById(R.id.checkBoxDiscount);
        buttonCheck.findViewById(R.id.buttonCheck);
        textView.findViewById(R.id.textView);

        buttonCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MainActivity", "Inside onClick()");
                Toast.makeText(MainActivity.this, "Button is Clicked!", Toast.LENGTH_LONG).show();
                if(checkBoxDiscount.isChecked()) {
                    double pay = calcPay(100, 20);
                    textView.setText("The discount is given. You need to pay " + pay);
                }
                else {
                    double pay = calcPay(100, 0);
                    textView.setText("The discount is not given. You need to pay " + pay);
                }


            }
        });
            }

            }