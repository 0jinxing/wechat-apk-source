package com.tencent.mm.plugin.appbrand.jsapi.c;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class a$1 extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool1 = false;
    AppMethodBeat.i(94351);
    if (paramIntent == null)
    {
      ab.i("MicroMsg.BeaconManager", "Receive intent failed");
      AppMethodBeat.o(94351);
    }
    while (true)
    {
      return;
      paramContext = BluetoothAdapter.getDefaultAdapter();
      if (paramContext != null)
      {
        int i = paramContext.getState();
        ab.d("MicroMsg.BeaconManager", "state:%d", new Object[] { Integer.valueOf(i) });
        boolean bool2;
        if (i == 12)
          bool2 = true;
        while (((a.hDs) && (!bool2)) || ((!a.hDs) && (bool2)))
        {
          paramContext = a.map.values().iterator();
          while (paramContext.hasNext())
          {
            paramIntent = (a.a)paramContext.next();
            if ((paramIntent.isStart()) && (!bool2))
              paramIntent.EH();
            if (paramIntent.hKb != null)
              paramIntent.hKb.dV(bool2);
          }
          bool2 = bool1;
          if (i == 10)
            bool2 = bool1;
        }
        a.hDs = bool2;
      }
      AppMethodBeat.o(94351);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.c.a.1
 * JD-Core Version:    0.6.2
 */