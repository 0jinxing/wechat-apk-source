package com.b.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class ab$1 extends BroadcastReceiver
{
  ab$1(ab paramab)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(55584);
    if (paramIntent.getAction().equals("android.net.wifi.SCAN_RESULTS"))
    {
      paramContext = this.bJh;
      try
      {
        paramIntent = paramContext.bCU.getScanResults();
        if ((paramIntent != null) && (!paramIntent.isEmpty()))
          break label67;
        paramContext = new java/lang/Exception;
        paramContext.<init>("WifiScanMsg: null or empty scan result list");
        AppMethodBeat.o(55584);
        throw paramContext;
      }
      catch (Exception paramContext)
      {
      }
    }
    else
    {
      AppMethodBeat.o(55584);
    }
    while (true)
    {
      return;
      label67: ab.a locala = new com/b/a/a/ab$a;
      locala.<init>(paramIntent);
      paramContext.c(locala);
      AppMethodBeat.o(55584);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.b.a.a.ab.1
 * JD-Core Version:    0.6.2
 */