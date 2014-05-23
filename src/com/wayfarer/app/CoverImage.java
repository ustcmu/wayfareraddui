package com.wayfarer.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MotionEvent;

public class CoverImage extends Activity
  implements GestureDetector.OnGestureListener
{
  private static final String TAG = "CoverImage";
  private GestureDetector detector;

  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.cover_img);
    detector = new GestureDetector(this, this);
  }

  // different Gesture action
  @Override
  public boolean onTouchEvent(MotionEvent event)
  {
    return this.detector.onTouchEvent(event);
    
  }

  public boolean onDown(MotionEvent paramMotionEvent)
  {
    Log.v("CoverImage", "onDown: " + paramMotionEvent.getAction());
    startActivity(new Intent(this, MainActivity.class));
    return true;
  }

  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public void onLongPress(MotionEvent paramMotionEvent)
  {
  }

  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public void onShowPress(MotionEvent paramMotionEvent)
  {
    Log.i("CoverImage", "onShowPress: " + paramMotionEvent.getAction());
  }

  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    Log.i("CoverImage", "onSingleTapUp: " + paramMotionEvent.getAction());
    return true;
  }
}