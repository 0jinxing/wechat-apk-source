package com.tencent.mm.modelfriend;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.it;
import com.tencent.mm.m.e;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.plugin.account.a.a.b;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.service.MMService;

public class AddrBookObserver$AddrBookService extends MMService
{
  public static boolean bqV = false;
  public static boolean fAV = false;
  public static String fAX = "key_sync_session";
  private b fAY;

  public AddrBookObserver$AddrBookService()
  {
    AppMethodBeat.i(124499);
    this.fAY = new AddrBookObserver.AddrBookService.1(this);
    AppMethodBeat.o(124499);
  }

  public final IBinder Iu()
  {
    return null;
  }

  public final String getTag()
  {
    return "MicroMsg.AddrBookObserver";
  }

  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(124500);
    super.onStartCommand(paramIntent, paramInt1, paramInt2);
    boolean bool;
    if (paramIntent == null)
    {
      bool = true;
      ab.i("MicroMsg.AddrBookObserver", "service start intent:%b", new Object[] { Boolean.valueOf(bool) });
      if (paramIntent != null)
        break label67;
      ab.e("MicroMsg.AddrBookObserver", "intent == null, stop service");
      stopSelf();
      AppMethodBeat.o(124500);
    }
    while (true)
    {
      return 2;
      bool = false;
      break;
      label67: float f1 = paramIntent.getFloatExtra(fAX, -1.0F);
      if (f1 == -1.0F)
      {
        ab.e("MicroMsg.AddrBookObserver", "onStartCommand session == -1, stop service");
        stopSelf();
        AppMethodBeat.o(124500);
        continue;
      }
      paramIntent = ah.getContext().getSharedPreferences(ah.doA(), 0);
      float f2 = paramIntent.getFloat(fAX, 0.0F);
      if (f2 == f1)
      {
        ab.d("MicroMsg.AddrBookObserver", "onStartCommand session the same : %f", new Object[] { Float.valueOf(f2) });
        stopSelf();
        AppMethodBeat.o(124500);
        continue;
      }
      paramIntent.edit().putFloat(fAX, f1).commit();
      ab.d("MicroMsg.AddrBookObserver", "onStartCommand new session:%f", new Object[] { Float.valueOf(f1) });
      if (bqV)
      {
        ab.i("MicroMsg.AddrBookObserver", "service canceled");
        bqV = false;
        stopSelf();
        AppMethodBeat.o(124500);
        continue;
      }
      try
      {
        if (!com.tencent.mm.kernel.g.RK())
        {
          ab.i("MicroMsg.AddrBookObserver", "account not ready, stop sync");
          stopSelf();
          AppMethodBeat.o(124500);
          continue;
        }
        if (com.tencent.mm.m.g.Nu().getInt("WCOEntranceSwitch", 0) > 0)
        {
          paramIntent = new com/tencent/mm/g/a/it;
          paramIntent.<init>();
          com.tencent.mm.sdk.b.a.xxA.m(paramIntent);
        }
        if ((l.apV()) && (!l.apR()))
        {
          ab.i("MicroMsg.AddrBookObserver", "start sync");
          if (!w.cq(ah.getContext()))
          {
            fAV = true;
            com.tencent.mm.platformtools.a.syncAddrBook(this.fAY);
          }
        }
        while (true)
        {
          AppMethodBeat.o(124500);
          break;
          ab.e("MicroMsg.AddrBookObserver", "requestSync false, stop service");
          stopSelf();
          AppMethodBeat.o(124500);
          break;
          ab.e("MicroMsg.AddrBookObserver", "can not sync addr book now, stop service");
          stopSelf();
        }
      }
      catch (Exception paramIntent)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.AddrBookObserver", paramIntent, "", new Object[0]);
          ab.e("MicroMsg.AddrBookObserver", "AddrBookService onStart [%s]", new Object[] { paramIntent.getMessage() });
          stopSelf();
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.AddrBookObserver.AddrBookService
 * JD-Core Version:    0.6.2
 */