package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.Apn;

class bn extends Thread
{
  bn(WebView paramWebView, Context paramContext)
  {
  }

  public void run()
  {
    AppMethodBeat.i(64832);
    try
    {
      if (Apn.getApnType(this.a) == 3);
      for (boolean bool = true; ; bool = false)
      {
        QbSdk.e = bool;
        QbSdk.f = System.currentTimeMillis();
        IntentFilter localIntentFilter = new android/content/IntentFilter;
        localIntentFilter.<init>();
        localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.a.getApplicationContext().registerReceiver(WebView.e(), localIntentFilter);
        AppMethodBeat.o(64832);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(64832);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.bn
 * JD-Core Version:    0.6.2
 */