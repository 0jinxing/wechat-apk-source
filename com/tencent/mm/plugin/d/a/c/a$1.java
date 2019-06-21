package com.tencent.mm.plugin.d.a.c;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

final class a$1 extends BroadcastReceiver
{
  a$1(a parama)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(18475);
    if (paramIntent == null)
      AppMethodBeat.o(18475);
    while (true)
    {
      return;
      paramContext = paramIntent.getAction();
      ab.i("MicroMsg.exdevice.BluetoothChatManager", "------onReceive------ action  = ".concat(String.valueOf(paramContext)));
      if ("android.bluetooth.device.action.FOUND".equals(paramContext))
      {
        paramContext = (BluetoothDevice)paramIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (paramContext.getBondState() != 12)
          this.jIB.jIy.dd(paramContext.getAddress(), paramContext.getName());
        AppMethodBeat.o(18475);
      }
      else if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(paramContext))
      {
        this.jIB.jIy.aVx();
        AppMethodBeat.o(18475);
      }
      else if ("android.bluetooth.adapter.action.SCAN_MODE_CHANGED".equals(paramContext))
      {
        paramIntent.getIntExtra("android.bluetooth.adapter.extra.SCAN_MODE", -1);
        AppMethodBeat.o(18475);
      }
      else if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(paramContext))
      {
        paramContext = (BluetoothDevice)paramIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        paramIntent = paramContext.getAddress();
        if (!a.a(this.jIB).containsKey(Long.valueOf(b.KK(paramIntent))))
        {
          AppMethodBeat.o(18475);
        }
        else
        {
          ab.i("MicroMsg.exdevice.BluetoothChatManager", "------ACTION_ACL_DISCONNECTED------ device name = %s, device Mac = %s", new Object[] { paramContext.getName(), paramIntent });
          if (this.jIB.jIy != null)
            this.jIB.jIy.l(b.KK(paramIntent), false);
        }
      }
      else
      {
        AppMethodBeat.o(18475);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.c.a.1
 * JD-Core Version:    0.6.2
 */