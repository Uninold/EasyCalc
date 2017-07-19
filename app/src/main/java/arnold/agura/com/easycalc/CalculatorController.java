package arnold.agura.com.easycalc;

import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.EditText;

import org.w3c.dom.Text;

import static android.R.id.edit;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static arnold.agura.com.easycalc.R.layout.activity_main;

/**
 * Created by Arnold on 19 Jul 2017.
 */

public class CalculatorController extends CalculatorModel  {


   private double fNum ;
   private double sNum ;
   private double total;


    public void add()
    {
        setfNum();
        setsNum();
         fNum = getfNum();
         sNum = getsNum();
            total = fNum + sNum;
            setTotal(total);

    }
    public void subtract()
    {
        setfNum();
        setsNum();
        fNum = getfNum();
        sNum = getsNum();
        total = fNum - sNum;
        setTotal(total);
    }
    public void multiply()
    {
        setfNum();
        setsNum();
        fNum = getfNum();
        sNum = getsNum();
        total = fNum * sNum;
        setTotal(total);
    }
    public void divide()
    {
        setfNum();
        setsNum();
        fNum = getfNum();
        sNum = getsNum();
        total = fNum / sNum;
        setTotal(total);
    }
    public void reset()
    {
        EditText fText = (EditText)findViewById(R.id.fNumber);
        EditText sText = (EditText)findViewById(R.id.sNumber);
        fText.setText("");
        sText.setText("");
    }

}
