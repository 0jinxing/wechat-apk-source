package com.tencent.mm.plugin.exdevice.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class c
  implements ServiceConnection
{
  public c.a lwE;
  public volatile boolean lwF;
  private List<Runnable> lwG;

  public c()
  {
    AppMethodBeat.i(19571);
    this.lwG = new LinkedList();
    AppMethodBeat.o(19571);
  }

  public final boolean U(Runnable paramRunnable)
  {
    AppMethodBeat.i(19575);
    boolean bool;
    if (paramRunnable == null)
    {
      bool = false;
      AppMethodBeat.o(19575);
      return bool;
    }
    if (this.lwF)
      paramRunnable.run();
    while (true)
    {
      bool = true;
      AppMethodBeat.o(19575);
      break;
      synchronized (this.lwG)
      {
        this.lwG.add(paramRunnable);
      }
    }
  }

  public final void dH(Context paramContext)
  {
    AppMethodBeat.i(19574);
    if (!d.dI(paramContext))
    {
      ab.i("MicroMsg.exdevice.ExDeviceServiceConnection", "ensureServiceInstance return false");
      AppMethodBeat.o(19574);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.bp.d.a(new Intent(paramContext, ExDeviceService.class), this, "exdevice"))
      {
        ab.i("MicroMsg.exdevice.ExDeviceServiceConnection", "bind exdeviceservice success");
        AppMethodBeat.o(19574);
      }
      else
      {
        ab.e("MicroMsg.exdevice.ExDeviceServiceConnection", "bind exdeviceservice failed");
        AppMethodBeat.o(19574);
      }
    }
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder arg2)
  {
    AppMethodBeat.i(19572);
    ab.i("MicroMsg.exdevice.ExDeviceServiceConnection", "onServiceConnected");
    paramComponentName = new x(h.a.u(???));
    u.a(paramComponentName);
    ah.doH();
    paramComponentName.a(com.tencent.mm.plugin.exdevice.b.a.bop());
    paramComponentName.b(com.tencent.mm.plugin.exdevice.model.a.boA());
    if (!paramComponentName.a(ad.bpi()))
      ab.e("MicroMsg.exdevice.ExDeviceServiceConnection", "simpleBluetoothRegistOnRecv error");
    if (this.lwE != null)
      this.lwE.onServiceConnected();
    this.lwF = true;
    synchronized (this.lwG)
    {
      paramComponentName = new java/util/ArrayList;
      paramComponentName.<init>(this.lwG);
      this.lwG.clear();
      int i = 0;
      if (i < paramComponentName.size())
      {
        ??? = (Runnable)paramComponentName.get(i);
        if (??? != null)
          ???.run();
        i++;
      }
    }
    paramComponentName.clear();
    AppMethodBeat.o(19572);
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    AppMethodBeat.i(19573);
    ab.i("MicroMsg.exdevice.ExDeviceServiceConnection", "onServiceDisconnected");
    this.lwF = false;
    u.a(null);
    ah.doH();
    if ((aw.ZM()) && (!aw.QT()))
    {
      dH(ah.getContext());
      AppMethodBeat.o(19573);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.exdevice.ExDeviceServiceConnection", "no user login, ignore this disconnection");
      AppMethodBeat.o(19573);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.c
 * JD-Core Version:    0.6.2
 */