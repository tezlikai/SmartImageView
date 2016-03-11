package com.itheima.smartimageview;

import com.loopj.android.image.SmartImageView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void click(View v){
		SmartImageView siv = (SmartImageView) findViewById(R.id.siv);
		//ÇëÇóÍøÂçÍ¼Æ¬
		siv.setImageUrl("http://192.168.3.82:8080/dd.jpg");
	}
}
