package com.example.kurisu;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {


	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	 
		
		final EditText nameField = (EditText)findViewById(R.id.nameField);
		final TextView nameView = (TextView)findViewById(R.id.nameView);
		Button button = (Button)findViewById(R.id.button);
		
		button.setOnClickListener(new OnClickListener()
		{
		
			public void onClick(View v){
				
			   if(nameField.getText().toString().contains("varshitha")||nameField.getText().toString().contains("Varshitha"))
			   {
				   nameView.setText("Haiii Varshii...Your very nice,pretty and a good friend ;) :P :D ");
			   }
			   else if(nameField.getText().toString().contains("christina.kurisu"))
			   {
				   nameView.setText("Eyes depth as space... Smile as cheerful as u have got everythng u wished for...   Hands and the little steps u make as gentle as Baby .... Heart as pure as a moon....Silence as loud as electric guitar in my heart...Voice as melodic and funny...Pony u play with as its ur favrt toy....This is U my Sweet Little Girl as precious as Diamond"
				   		+ " "
				   		+ ""
				   		+);
				   
			   }
			   
			   else if(nameField.getText().toString().contains("sukanya")||nameField.getText().toString().contains("Sukanya"))
			   {
				   nameView.setText("Konichiwaaa Misaa , eat food(salt) on time :P ...take care :D ");
			   }
			   else if(nameField.getText().toString().contains("sekhar")||nameField.getText().toString().contains("Sekhar"))
			   {
				   nameView.setText("Konichiwa Matsuuu....ekva show kottaku , kullukoku inka nanni marchipoku :P ");
			   }
			   else if(nameField.getText().toString().contains("chakri")||nameField.getText().toString().contains("Chakri"))
			   {
				   nameView.setText("Namastey Chakkarr , manam epdu edaina chestey kalsi cheddam....aa subbu gadiki vined led...vaadi access tukku cheddam okaroju sareyna ;) ");
			   }
			   else if(nameField.getText().toString().contains("vineeth")||nameField.getText().toString().contains("Vineeth"))
			   {
				   nameView.setText("Hello vineeeeth !! chadvaku ekva chocklate boy :P ");
			   }
			   else if(nameField.getText().toString().contains("srikanth")||nameField.getText().toString().contains("Srikanth"))
			   {
				   nameView.setText("Namastey laddanna ! Take care...health jagrathha knchm....HOD ni chuskundam tarvtha tension kaku ");
			   }
			   else if(nameField.getText().toString().contains("vijay")||nameField.getText().toString().contains("Vijay"))
			   {
				   nameView.setText("Vijay anna namastey !! Manchiga chadukundam ipdu....hithu sangathi tarvtha chuskundam ;) ");
			   }
			   else if(nameField.getText().toString().contains("srinija")||nameField.getText().toString().contains("Srinija"))
			   {
				   nameView.setText("Hello Aaagam Pakshi !! Ekva tension padaku...Work More-Talk Less !  ");
			   }
			   else if(nameField.getText().toString().contains("scientist")||nameField.getText().toString().contains("Scientist"))
			   {
				   nameView.setText("Hai Tharun....we will rock our b.tech by creating new thngs , we will be true Computer Science students ! :P  ");
			   }
			   else if(nameField.getText().toString().contains("suhas")||nameField.getText().toString().contains("Suhas"))
			   {
				   nameView.setText("I am MAD !");
			   }
			   else if(nameField.getText().toString().contains("nikhil")||nameField.getText().toString().contains("carcar")||nameField.getText().toString().contains("Nikhil"))
			   {
				   nameView.setText("TAKLEEEEEEEEEE !!!!!!!");
			   }
			   else
				   {
				   nameView.setText("Konichiwaaa , " + nameField.getText() + " Thanks alot for trying my app :D ");
				   }
			
			}
		});
		
		
	}
}
