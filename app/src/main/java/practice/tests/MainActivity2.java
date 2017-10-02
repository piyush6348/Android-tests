package practice.tests;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText et_dist,et_min;
    Button btn_calc;
    TextView tv_fare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_fare.setText(String.valueOf(calcFare(Float.valueOf(et_dist.getText().toString()),
                        Integer.valueOf(et_min.getText().toString()))));
            }
        });
    }

    private void initViews() {
        et_dist = (EditText) findViewById(R.id.et_dist);
        et_min = (EditText) findViewById(R.id.et_min);
        btn_calc = (Button) findViewById(R.id.btn_calc);
        tv_fare = (TextView) findViewById(R.id.tv_fare);
    }

    private static float calcFare(float km,int min){
        return (float) 50.0;
    }
}
