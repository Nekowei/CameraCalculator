package nekowei.cc;

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
		calc = (Button) findViewById(R.id.calc);
		calc.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		EditText et = (EditText)findViewById(R.id.input);
		double i = Double.valueOf(et.getText().toString().trim());
		double r = CameraCalculator.caculate(i);
		TextView tv = (TextView) findViewById(R.id.result);
		String result = getString(R.string.result) + r + "бу";
		tv.setText(result);
	}

}
