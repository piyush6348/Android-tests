package practice.tests

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // static function in kotlin is companion object

        btn_calc.setOnClickListener({
            tv_fare.text = calcFare(
                    et_dist.text.toString().toFloat(),
                    et_min.text.toString().toInt()
            ).toString()
        })
    }


    companion object {
        @JvmStatic fun calcFare(km: Float, min:Int):Float{
            return 50f
                    //(if (km>5)) ((km-5)*12)
        }
    }
}
