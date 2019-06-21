package com.tencent.mm.plugin.game.model.a;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.b;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class e
{
  private static int kNC;
  private static e.b mYZ;
  private static e.a mZa;
  private static c mZb;
  private static com.tencent.mm.sdk.b.c mZc;
  private static com.tencent.mm.sdk.b.c mZd;

  static
  {
    AppMethodBeat.i(111517);
    kNC = -1;
    mZc = new e.1();
    mZd = new e.2();
    AppMethodBeat.o(111517);
  }

  public static void bgr()
  {
    AppMethodBeat.i(111516);
    if (mYZ != null);
    try
    {
      ah.getContext().unregisterReceiver(mYZ);
      mYZ = null;
      if (mZa == null);
    }
    catch (Exception localException1)
    {
      try
      {
        ah.getContext().unregisterReceiver(mZa);
        mZa = null;
        a.xxA.d(mZc);
        a.xxA.d(mZd);
        if (mZb != null)
        {
          d.bij();
          b.b(mZb);
          mZb = null;
        }
        AppMethodBeat.o(111516);
        return;
        localException1 = localException1;
        ab.i("MicroMsg.GameSilentDownloadListener", "unregisterNetChange err:%s", new Object[] { localException1.getMessage() });
      }
      catch (Exception localException2)
      {
        while (true)
          ab.i("MicroMsg.GameSilentDownloadListener", "unregisterBatteryChange err:%s", new Object[] { localException2.getMessage() });
      }
    }
  }

  public static void bie()
  {
    AppMethodBeat.i(111515);
    try
    {
      if (mYZ == null)
      {
        localObject = new com/tencent/mm/plugin/game/model/a/e$b;
        ((e.b)localObject).<init>((byte)0);
        mYZ = (e.b)localObject;
      }
      localObject = new android/content/IntentFilter;
      ((IntentFilter)localObject).<init>();
      ((IntentFilter)localObject).addAction("android.net.wifi.STATE_CHANGE");
      ((IntentFilter)localObject).addAction("android.net.wifi.WIFI_STATE_CHANGED");
      ((IntentFilter)localObject).addAction("android.net.conn.CONNECTIVITY_CHANGE");
      ah.getContext().registerReceiver(mYZ, (IntentFilter)localObject);
    }
    catch (Exception localException1)
    {
      try
      {
        while (true)
        {
          if (mZa == null)
          {
            localObject = new com/tencent/mm/plugin/game/model/a/e$a;
            ((e.a)localObject).<init>((byte)0);
            mZa = (e.a)localObject;
          }
          Object localObject = new android/content/IntentFilter;
          ((IntentFilter)localObject).<init>();
          ((IntentFilter)localObject).addAction("android.intent.action.BATTERY_OKAY");
          ((IntentFilter)localObject).addAction("android.intent.action.BATTERY_LOW");
          ah.getContext().registerReceiver(mZa, (IntentFilter)localObject);
          a.xxA.c(mZc);
          a.xxA.c(mZd);
          if (mZb == null)
            mZb = new c();
          d.bij();
          b.a(mZb);
          AppMethodBeat.o(111515);
          return;
          localException1 = localException1;
          ab.i("MicroMsg.GameSilentDownloadListener", "registerNetChange err:%s", new Object[] { localException1.getMessage() });
        }
      }
      catch (Exception localException2)
      {
        while (true)
          ab.i("MicroMsg.GameSilentDownloadListener", "registerBatteryChange err:%s", new Object[] { localException2.getMessage() });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.a.e
 * JD-Core Version:    0.6.2
 */