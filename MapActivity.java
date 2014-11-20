package kr.co.unknown.windy;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.location.LocationListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;


public class MapActivity extends Activity {
	private GoogleMap mMap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.map);
		setUpMapIfNeeded();
	}

	private void setUpMapIfNeeded(){
		if(mMap == null){
			mMap = ((MapFragment)
					getFragmentManager().findFragmentById(R.id.map)).getMap();
		}
	}

	@Override
	public void onResume(){
		super.onResume();
		mMap.setMyLocationEnabled(true);
	}

	@Override
	public void onPause(){
		super.onPause();
		mMap.setMyLocationEnabled(false);
	}


	public void myListener1(View target){
		Intent intent = new Intent(getApplicationContext(), ThumbnailActivity.class);
		startActivity(intent);
		overridePendingTransition(0,0);
	}

	public void myListener2(View target){

	}

	public void myListener3(View target){
		Intent intent = new Intent(getApplicationContext(), WriteActivity.class);
		startActivity(intent);
		overridePendingTransition(0,0);
	}

	public void myListener4(View target){
		Intent intent = new Intent(getApplicationContext(), MyinfoActivity.class);
		startActivity(intent);
		overridePendingTransition(0,0);
	}

}
