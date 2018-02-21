package sdu.cs58.suteenart.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1EditText,number2EditText;
    Button addButton,minusButton,mlutiButton,dividedButton;
    TextView resultTextView;
    int num1, num2, result, result2, result3, result4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2. ผูกตัวแปรบน java กับ element บน xml
        number1EditText = findViewById(R.id.edtNumber1);
        number2EditText = findViewById(R.id.edtNumber2);
        addButton = findViewById(R.id.btnAdd);
        minusButton = findViewById(R.id.btnMinus);
        mlutiButton = findViewById(R.id.btnMluti);
        dividedButton = findViewById(R.id.btnDivided);
        resultTextView = findViewById(R.id.txvResult);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //3.แปลงค่าจาก Edittext เป็นตัวเลขในตัวแปร int
                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                result = num1 + num2;
                //4. แสดงผลลับการคำนวน
                resultTextView.setText(result + "");

            }
        });//end setOnClickListener
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                result2 = num1 - num2;
                resultTextView.setText(result2 + "");
            }
        });
        mlutiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                result3 = num1 * num2;
                resultTextView.setText(result3 + "");
            }
        });
        dividedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                result4 = num1 / num2;
                resultTextView.setText(result4 + "");
            }
        });


    } //end onCreate
} //end Class
