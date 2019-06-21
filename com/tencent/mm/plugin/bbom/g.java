package com.tencent.mm.plugin.bbom;

import android.app.Service;
import android.content.ContentResolver;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.TrafficStatsReceiver;
import com.tencent.mm.modelfriend.AddrBookObserver;
import com.tencent.mm.modelstat.WatchDogPushReceiver;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;

public final class g
  implements com.tencent.mm.plugin.zero.a.a
{
  private AddrBookObserver jEp;
  private WatchDogPushReceiver jEq;
  private TrafficStatsReceiver jEr;

  public final void a(Service paramService)
  {
    AppMethodBeat.i(18256);
    boolean bool1;
    if (Build.VERSION.SDK_INT < 26)
      bool1 = true;
    while (true)
    {
      boolean bool2 = bool1;
      if (!bool1)
        bool2 = b.o(paramService.getApplicationContext(), "android.permission.READ_CONTACTS");
      if (bool2);
      try
      {
        AddrBookObserver localAddrBookObserver = new com/tencent/mm/modelfriend/AddrBookObserver;
        localAddrBookObserver.<init>(paramService);
        this.jEp = localAddrBookObserver;
        paramService.getContentResolver().registerContentObserver(com.tencent.mm.pluginsdk.a.dgN(), true, this.jEp);
        this.jEq = new WatchDogPushReceiver();
        paramService.registerReceiver(this.jEq, new IntentFilter("com.tencent.mm.WatchDogPushReceiver"));
        this.jEr = new TrafficStatsReceiver();
        paramService.registerReceiver(this.jEr, new IntentFilter("com.tencent.mm.TrafficStatsReceiver"));
        TrafficStatsReceiver.bu(paramService);
        AppMethodBeat.o(18256);
        return;
        bool1 = false;
      }
      catch (Exception localException)
      {
        while (true)
        {
          this.jEp = null;
          ab.e("MicroMsg.CoreService", "onCreate registerContentObserver() Exception = %s", new Object[] { localException.getMessage() });
        }
      }
    }
  }

  public final void b(Service paramService)
  {
    AppMethodBeat.i(18257);
    if (this.jEp != null)
    {
      paramService.getContentResolver().unregisterContentObserver(this.jEp);
      this.jEp = null;
    }
    paramService.unregisterReceiver(this.jEq);
    paramService.unregisterReceiver(this.jEr);
    TrafficStatsReceiver.bv(paramService);
    AppMethodBeat.o(18257);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.g
 * JD-Core Version:    0.6.2
 */