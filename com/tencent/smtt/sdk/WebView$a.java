package com.tencent.smtt.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.Apn;
import com.tencent.smtt.utils.TbsLog;

class WebView$a extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent arg2)
  {
    AppMethodBeat.i(64840);
    if (??? != null);
    try
    {
      int i;
      long l;
      if ("android.net.conn.CONNECTIVITY_CHANGE".equals(???.getAction()))
      {
        i = Apn.getApnType(paramContext);
        l = System.currentTimeMillis();
      }
      synchronized (QbSdk.h)
      {
        if (QbSdk.e)
          QbSdk.g += l - QbSdk.f;
        QbSdk.f = l;
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>("pv report, SdkEngine.registerConnectivityChangedReceiver QbSdk.sWifiConnectTime=");
        TbsLog.d("sdkreport", QbSdk.g + " apnType=" + i);
        if (i == 3)
        {
          bool = true;
          QbSdk.e = bool;
          AppMethodBeat.o(64840);
          return;
        }
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(64840);
        continue;
        boolean bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.WebView.a
 * JD-Core Version:    0.6.2
 */