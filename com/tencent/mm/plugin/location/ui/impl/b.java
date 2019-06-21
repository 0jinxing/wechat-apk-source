package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.tencent.mm.plugin.k.a;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class b extends a
{
  public Activity activity;
  protected com.tencent.mm.plugin.k.d nMj;
  protected float neG = 0.0F;
  protected float neH = 0.0F;
  protected int type = 0;

  public b(Activity paramActivity)
  {
    this.activity = paramActivity;
  }

  protected final void aqX()
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)this.activity.getSystemService("input_method");
    if (localInputMethodManager == null);
    while (true)
    {
      return;
      Object localObject = this.activity.getCurrentFocus();
      if (localObject != null)
      {
        localObject = ((View)localObject).getWindowToken();
        if (localObject != null)
          localInputMethodManager.hideSoftInputFromWindow((IBinder)localObject, 0);
      }
    }
  }

  public final boolean bKn()
  {
    return false;
  }

  public abstract com.tencent.mm.plugin.k.d bKo();

  public void bKp()
  {
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      ab.d("MicroMsg.MMBaseMapUI", "dispatchKeyEvent");
      this.activity.finish();
    }
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public final View findViewById(int paramInt)
  {
    return this.activity.findViewById(paramInt);
  }

  public final String getString(int paramInt)
  {
    return this.activity.getString(paramInt);
  }

  public final void onBackPressed()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    this.activity.requestWindowFeature(1);
    this.activity.setContentView(2130970366);
    this.type = this.activity.getIntent().getIntExtra("map_view_type", 0);
    ab.i("MicroMsg.MMBaseMapUI", "init oncreate type %d", new Object[] { Integer.valueOf(this.type) });
    ((FrameLayout)findViewById(2131824670)).addView(d.ep(this.activity));
    this.nMj = bKo();
    this.nMj.setMapViewOnTouchListener(new b.1(this));
    this.nMj.setMapAnchor(0.5F, 0.5F);
  }

  public void onDestroy()
  {
    this.nMj.destroy();
  }

  public void onPause()
  {
  }

  public void onResume()
  {
  }

  public final void showVKB()
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)this.activity.getSystemService("input_method");
    if (localInputMethodManager == null);
    while (true)
    {
      return;
      View localView = this.activity.getCurrentFocus();
      if ((localView != null) && (localView.getWindowToken() != null))
        localInputMethodManager.toggleSoftInput(0, 2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.b
 * JD-Core Version:    0.6.2
 */