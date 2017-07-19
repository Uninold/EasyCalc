package arnold.agura.com.easycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends CalculatorController {
    private Button mAddBtn;
    private Button mSubBtn;
    private Button mMulBtn;
    private Button mDivBtn;
    private TextView mTotal;
    private Button mcBtn;
    private Button mExitBtn;
    private EditText mFirst;
    private EditText mSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirst = (EditText)findViewById(R.id.fNumber);
        mSecond = (EditText)findViewById(R.id.sNumber);
        mAddBtn = (Button)findViewById(R.id.addBtn);
        mSubBtn = (Button)findViewById(R.id.subBtn);
        mMulBtn = (Button)findViewById(R.id.mulBtn);
        mDivBtn = (Button)findViewById(R.id.divBtn);
        mcBtn = (Button)findViewById(R.id.cBtn);
        mExitBtn = (Button)findViewById(R.id.exitBtn);

        mAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mFirst.getText().length()==0) {
                    mFirst.setError("Please enter a valid number.");
                }
                else if(mSecond.getText().length()==0) {
                    mSecond.setError("Please enter a valid number.");
                }
                else
              add();

            }
        });
        mSubBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mFirst.getText().length()==0) {
                    mFirst.setError("Please enter a valid number.");
                }
                else if(mSecond.getText().length()==0) {
                    mSecond.setError("Please enter a valid number.");
                }
                else
                subtract();

            }
        });
        mMulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mFirst.getText().length()==0) {
                    mFirst.setError("Please enter a valid number.");
                }
                else if(mSecond.getText().length()==0) {
                    mSecond.setError("Please enter a valid number.");
                }
                else
            multiply();

            }
        });
        mDivBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mFirst.getText().length()==0) {
                    mFirst.setError("Please enter a valid number.");
                }
                else if(mSecond.getText().length()==0) {
                    mSecond.setError("Please enter a valid number.");
                }
                else
                divide();


            }
        });
        mcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });
        mExitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
