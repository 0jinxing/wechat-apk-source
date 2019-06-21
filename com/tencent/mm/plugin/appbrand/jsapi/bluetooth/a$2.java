package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class a$2 extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool1 = false;
    AppMethodBeat.i(94166);
    if (paramIntent == null)
    {
      ab.i("MicroMsg.Ble.BleManager", "Receive intent failed");
      AppMethodBeat.o(94166);
    }
    while (true)
    {
      return;
      paramContext = BluetoothAdapter.getDefaultAdapter();
      if (paramContext != null)
      {
        int i = paramContext.getState();
        ab.d("MicroMsg.Ble.BleManager", "state:%d", new Object[] { Integer.valueOf(i) });
        boolean bool2;
        if (i == 12)
          bool2 = true;
        while (((a.hDs) && (!bool2)) || ((!a.hDs) && (bool2)))
        {
          paramIntent = a.awn().values().iterator();
          while (paramIntent.hasNext())
          {
            paramContext = (b)paramIntent.next();
            if (paramContext.hDv != null)
              paramContext.hDv.dV(bool2);
          }
          bool2 = bool1;
          if (i == 10)
            bool2 = bool1;
        }
        a.hDs = bool2;
      }
      AppMethodBeat.o(94166);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.a.2
 * JD-Core Version:    0.6.2
 */