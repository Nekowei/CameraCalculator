package nekowei.cc;

import java.text.NumberFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	private Button calc;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		calc = (Button) findViewById(R.id.calcu);
		calc.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		EditText et = (EditText)findViewById(R.id.input);
		double i = Double.valueOf(et.getText().toString().trim());
		double r = CameraCalculator.caculate(i);
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		TextView tv = (TextView) findViewById(R.id.result);
		String result = getString(R.string.result) + nf.format(r) + "бу";
		tv.setText(result);
	}

}
