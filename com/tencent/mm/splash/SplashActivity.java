package com.tencent.mm.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;

public class SplashActivity extends Activity
{
  private boolean xGZ = false;

  private void drk()
  {
    AppMethodBeat.i(114868);
    if (h.xGG.b(this, new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(114860);
        SplashActivity.c(SplashActivity.this);
        AppMethodBeat.o(114860);
      }
    }))
      drm();
    AppMethodBeat.o(114868);
  }

  private void drm()
  {
    AppMethodBeat.i(114870);
    if (this.xGZ)
    {
      AppMethodBeat.o(114870);
      return;
    }
    this.xGZ = true;
    if (!isFinishing())
    {
      setResult(-100);
      int i = getIntent().getIntExtra("hashcode", 0);
      Iterator localIterator = h.xGC.iterator();
      while (localIterator.hasNext())
      {
        i locali = (i)localIterator.next();
        if (i == locali.hashCode())
          h.a(locali);
      }
      new Handler().postDelayed(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(114862);
          SplashActivity.this.finish();
          SplashActivity.d(SplashActivity.this);
          AppMethodBeat.o(114862);
        }
      }
      , 50L);
    }
    while (true)
    {
      new Handler().postDelayed(new Runnable()
      {
        public final void run()
        {
          h.xGG = null;
        }
      }
      , 30000L);
      AppMethodBeat.o(114870);
      break;
      onBackPressed();
    }
  }

  public final void drl()
  {
    AppMethodBeat.i(114869);
    if (h.xGG != null)
    {
      if (h.xGG.a(this, new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(114861);
          SplashActivity.c(SplashActivity.this);
          AppMethodBeat.o(114861);
        }
      }))
        break label56;
      drk();
      AppMethodBeat.o(114869);
    }
    while (true)
    {
      return;
      h.g("WxSplash.SplashActivity", "permissions delegate is null, call splash finish directly.", new Object[0]);
      drm();
      label56: AppMethodBeat.o(114869);
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(114863);
    super.onCreate(paramBundle);
    h.a(this);
    h.g("WxSplash.SplashActivity", "onCreate", new Object[0]);
    if (!h.dra())
    {
      h.g("WxSplash.SplashActivity", "no need splash, finish", new Object[0]);
      drl();
    }
    if (h.xGP != null)
      h.xGP.n(this);
    AppMethodBeat.o(114863);
  }

  protected void onDestroy()
  {
    AppMethodBeat.i(114866);
    h.b(this);
    h.g("WxSplash.SplashActivity", "onDestroy", new Object[0]);
    super.onDestroy();
    AppMethodBeat.o(114866);
  }

  protected void onPause()
  {
    AppMethodBeat.i(114865);
    h.g("WxSplash.SplashActivity", "onPause", new Object[0]);
    super.onPause();
    AppMethodBeat.o(114865);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(114867);
    if (h.xGG != null)
      h.xGG.a(this, paramInt, paramArrayOfString, paramArrayOfInt);
    AppMethodBeat.o(114867);
  }

  protected void onResume()
  {
    AppMethodBeat.i(114864);
    super.onResume();
    h.g("WxSplash.SplashActivity", "onResume", new Object[0]);
    AppMethodBeat.o(114864);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.splash.SplashActivity
 * JD-Core Version:    0.6.2
 */