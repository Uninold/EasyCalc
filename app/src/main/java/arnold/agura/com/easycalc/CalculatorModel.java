package arnold.agura.com.easycalc;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.R.attr.value;

/**
 * Created by Arnold on 19 Jul 2017.
 */

public class CalculatorModel extends AppCompatActivity {
    private double total;
    private double fNum;
    private double sNum;

        public void setfNum()
    {
        EditText num = (EditText)findViewById(R.id.fNumber);
        fNum = Double.parseDouble(num.getText().toString());

    }
    public double getfNum() {
        return fNum;
    }
    public void setsNum()
    {
        EditText num = (EditText)findViewById(R.id.sNumber);
        sNum = Double.parseDouble(num.getText().toString());
    }
    public double getsNum() {
        return sNum;
    }
    public void setTotal(double totalEquation)
    {
        TextView mtotal = (TextView)findViewById(R.id.txtTotal);
        total = totalEquation;
        mtotal.setText("" + String.format("%,.2f", total));
    }
    public double getTotal()
    {
        return total;
    }


}
