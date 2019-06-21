package com.tencent.mm.modelstat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.jm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class o$a extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(78772);
    try
    {
      boolean bool;
      if (g.RN().QY())
      {
        g.RN();
        if (!com.tencent.mm.kernel.a.QT());
      }
      else
      {
        bool = g.RN().QY();
        g.RN();
        ab.e("MicroMsg.NetTypeReporter", "onReceive acc not ready .%b %b", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(com.tencent.mm.kernel.a.QT()) });
        AppMethodBeat.o(78772);
      }
      while (true)
      {
        return;
        if ((paramIntent == null) || (bo.isNullOrNil(paramIntent.getAction())))
        {
          if (paramIntent == null);
          for (paramContext = "intent is null"; ; paramContext = "action is null")
          {
            ab.e("MicroMsg.NetTypeReporter", "onReceive %s  ", new Object[] { paramContext });
            AppMethodBeat.o(78772);
            break;
          }
        }
        paramContext = paramIntent.getAction();
        ab.i("MicroMsg.NetTypeReporter", "onReceive action:%s foreground:%b", new Object[] { paramContext, Boolean.valueOf(b.foreground) });
        bool = b.foreground;
        if (!bool)
        {
          AppMethodBeat.o(78772);
        }
        else
        {
          if (!paramContext.equals("android.net.wifi.supplicant.CONNECTION_CHANGE"))
            break;
          o.mg(1001);
          AppMethodBeat.o(78772);
        }
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.NetTypeReporter", "onReceive : %s", new Object[] { bo.l(paramContext) });
        AppMethodBeat.o(78772);
        continue;
        if (paramContext.equals("android.net.wifi.supplicant.STATE_CHANGE"))
        {
          o.mg(1002);
          AppMethodBeat.o(78772);
        }
        else if (paramContext.equals("android.net.wifi.STATE_CHANGE"))
        {
          o.mg(1003);
          AppMethodBeat.o(78772);
        }
        else if (paramContext.equals("android.net.wifi.WIFI_STATE_CHANGED"))
        {
          o.mg(1004);
          AppMethodBeat.o(78772);
        }
        else if (paramContext.equals("android.net.wifi.SCAN_RESULTS"))
        {
          o.mg(1005);
          AppMethodBeat.o(78772);
        }
        else
        {
          if (paramContext.equals("android.net.conn.CONNECTIVITY_CHANGE"))
          {
            o.mg(1006);
            paramIntent = com.tencent.mm.sdk.b.a.xxA;
            paramContext = new com/tencent/mm/g/a/jm;
            paramContext.<init>();
            paramIntent.m(paramContext);
          }
          AppMethodBeat.o(78772);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.o.a
 * JD-Core Version:    0.6.2
 */