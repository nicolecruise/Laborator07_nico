package ro.pub.cs.systems.pdsd.lab07.calculatorwebservice.graphicaluserinterface;

import ro.pub.cs.systems.pdsd.lab07.calculatorwebservice.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CalculatorWebServiceActivity extends Activity {
	
	private EditText operator1EditText, operator2EditText;
	private TextView resultTextView;
	private Spinner operationsSpinner, methodsSpinner;
	
	private class CalculatorWebServiceThread extends Thread {
		
		@Override
		public void run() {
			
			// TODO: exercise 4
			// get operators 1 & 2 from corresponding edit texts (operator1EditText, operator2EditText)
			// signal missing values through error messages
			// get operation from operationsSpinner
			
			// create an instance of a HttpClient object
			
			// get method used for sending request from methodsSpinner
			
			// 1. GET
			// a) build the URL into a HttpGet object (append the operators / operations to the Internet address)
			// b) create an instance of a ResultHandler object
			// c) execute the request, thus generating the result
			
			// 2. POST
			// a) build the URL into a HttpPost object
			// b) create a list of NameValuePair objects containing the attributes and their values (operators, operation)
			// c) create an instance of a UrlEncodedFormEntity object using the list and UTF-8 encoding and attach it to the post request
			// d) create an instance of a ResultHandler object
			// e) execute the request, thus generating the result
			
			// display the result in resultTextView
			
		}
	}
	
	private DisplayResultButtonClickListener displayResultButtonClickListener = new DisplayResultButtonClickListener();
	private class DisplayResultButtonClickListener implements Button.OnClickListener {
		
		@Override
		public void onClick(View view) {
			new CalculatorWebServiceThread().start();
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator_web_service);
		
		operator1EditText = (EditText)findViewById(R.id.operator1_edit_text);
		operator2EditText = (EditText)findViewById(R.id.operator2_edit_text);
		
		resultTextView = (TextView)findViewById(R.id.result_text_view);
		
		operationsSpinner = (Spinner)findViewById(R.id.operations_spinner);
		methodsSpinner = (Spinner)findViewById(R.id.methods_spinner);
		
		Button displayResultButton = (Button)findViewById(R.id.display_result_button);
		displayResultButton.setOnClickListener(displayResultButtonClickListener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculator_web, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
