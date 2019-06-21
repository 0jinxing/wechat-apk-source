package com.tencent.mm.splash;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SplashFallbackActivity extends Activity
{
  private Handler mHandler;
  private Runnable xHb;

  public SplashFallbackActivity()
  {
    AppMethodBeat.i(114874);
    this.xHb = new Runnable()
    {
      private long xHc = -1L;

      public final void run()
      {
        AppMethodBeat.i(114873);
        if (this.xHc == -1L)
          this.xHc = System.currentTimeMillis();
        if (!SplashFallbackActivity.drn())
          if (System.currentTimeMillis() - this.xHc >= 80000L)
          {
            h.g("MicroMsg.FallbackSplash", "checkIfMainProcessStartupDone timeout", new Object[0]);
            SplashFallbackActivity.this.finish();
            SplashFallbackActivity.this.overridePendingTransition(2131034275, 2131034273);
            AppMethodBeat.o(114873);
          }
        while (true)
        {
          return;
          SplashFallbackActivity.b(SplashFallbackActivity.this).postDelayed(SplashFallbackActivity.a(SplashFallbackActivity.this), 100L);
          AppMethodBeat.o(114873);
          continue;
          h.g("MicroMsg.FallbackSplash", "checkIfMainProcessStartupDone true", new Object[0]);
          SplashFallbackActivity.this.finish();
          SplashFallbackActivity.this.overridePendingTransition(2131034275, 2131034273);
          AppMethodBeat.o(114873);
        }
      }
    };
    AppMethodBeat.o(114874);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(114876);
    h.g("MicroMsg.FallbackSplash", "block onBackPressed", new Object[0]);
    AppMethodBeat.o(114876);
  }

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(114875);
    super.onCreate(paramBundle);
    h.g("MicroMsg.FallbackSplash", "onCreate", new Object[0]);
    paramBundle = new HandlerThread("splash-activity");
    paramBundle.start();
    this.mHandler = new Handler(paramBundle.getLooper());
    this.mHandler.postDelayed(this.xHb, 100L);
    AppMethodBeat.o(114875);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.splash.SplashFallbackActivity
 * JD-Core Version:    0.6.2
 */