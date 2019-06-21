package com.tencent.mm.plugin.appbrand.s.a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b
  implements e
{
  private final IntentFilter bJe;
  private final d iRY;
  Intent iRZ;
  final e iSa;
  private b.a iSb;
  protected Context mContext;

  b()
  {
    AppMethodBeat.i(126653);
    this.bJe = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    this.iRY = new d();
    this.iRZ = null;
    this.iSa = this;
    AppMethodBeat.o(126653);
  }

  public final c aOb()
  {
    boolean bool1 = true;
    int i = -1;
    Object localObject3;
    while (true)
    {
      try
      {
        AppMethodBeat.i(126656);
        Object localObject1;
        if (this.mContext == null)
        {
          ab.e("MicroMsg.AppBrandBatteryManagerImplBelow21", "getBatteryInfo no context");
          localObject1 = a.iRV;
          AppMethodBeat.o(126656);
          return localObject1;
        }
        localObject4 = this.mContext;
        if (this.iRZ != null)
        {
          localObject1 = this.iRZ;
          if (localObject1 != null)
            break;
          ab.e("MicroMsg.AppBrandBatteryManagerImplBelow21", "getBatteryInfo no intent got");
          localObject1 = a.iRV;
          AppMethodBeat.o(126656);
          continue;
        }
      }
      finally
      {
      }
      localObject3 = new com/tencent/mm/plugin/appbrand/s/a/b$a;
      ((b.a)localObject3).<init>(this, (byte)0);
      this.iSb = ((b.a)localObject3);
      localObject3 = ((Context)localObject4).getApplicationContext().registerReceiver(this.iSb, this.bJe);
      this.iRZ = ((Intent)localObject3);
    }
    Object localObject4 = new com/tencent/mm/plugin/appbrand/s/a/c;
    ((c)localObject4).<init>();
    int j;
    if (localObject3 == null)
    {
      j = i;
      label141: ((c)localObject4).iSe = j;
      if (localObject3 == null)
        break label291;
      j = ((Intent)localObject3).getIntExtra("status", -1);
      i = ((Intent)localObject3).getIntExtra("plugged", 0);
      bool2 = bool1;
      if (j != 2)
      {
        bool2 = bool1;
        if (i != 1)
        {
          bool2 = bool1;
          if (i != 2)
            if ((Build.VERSION.SDK_INT < 17) || (i != 4))
              break label291;
        }
      }
    }
    label291: for (boolean bool2 = bool1; ; bool2 = false)
    {
      ((c)localObject4).iSd = bool2;
      AppMethodBeat.o(126656);
      localObject3 = localObject4;
      break;
      int k = ((Intent)localObject3).getIntExtra("level", -1);
      int m = ((Intent)localObject3).getIntExtra("scale", -1);
      j = i;
      if (m <= 0)
        break label141;
      j = i;
      if (k < 0)
        break label141;
      j = Math.min(Math.max((int)Math.floor(k * 100.0F / m), 0), 100);
      break label141;
    }
  }

  public final void init(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(126654);
      this.iRZ = null;
      this.mContext = paramContext.getApplicationContext();
      AppMethodBeat.o(126654);
      return;
    }
    finally
    {
      paramContext = finally;
    }
    throw paramContext;
  }

  public final void release()
  {
    try
    {
      AppMethodBeat.i(126655);
      if (this.mContext != null)
      {
        if (this.iSb != null)
          this.mContext.unregisterReceiver(this.iSb);
        this.mContext = null;
      }
      AppMethodBeat.o(126655);
      return;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.a.b
 * JD-Core Version:    0.6.2
 */