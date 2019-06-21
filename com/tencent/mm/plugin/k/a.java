package com.tencent.mm.plugin.k;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;

public abstract class a
{
  public abstract boolean bKn();

  public abstract boolean dispatchKeyEvent(KeyEvent paramKeyEvent);

  public abstract boolean dispatchTouchEvent(MotionEvent paramMotionEvent);

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }

  public abstract void onBackPressed();

  public abstract void onCreate(Bundle paramBundle);

  public abstract void onDestroy();

  public abstract void onPause();

  public abstract void onResume();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.k.a
 * JD-Core Version:    0.6.2
 */