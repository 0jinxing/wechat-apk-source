package com.tencent.mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mars.comm.WakerLock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.mp;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.kernel.l;
import com.tencent.mm.network.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.service.ProcessService.MMProcessService;
import com.tencent.mm.service.c;
import com.tencent.mm.storage.z;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NotifyReceiver extends BroadcastReceiver
{
  private static WakerLock ebJ;
  private static WakerLock ecc;
  private static Set<Long> ecd;
  private static Lock ece;
  private static byte[] ecf;
  private static byte[] ecg;
  private static NotifyReceiver.a ech;
  private static boolean eci;

  static
  {
    AppMethodBeat.i(57806);
    ebJ = null;
    ecc = null;
    ecd = new HashSet();
    ece = new ReentrantLock(false);
    ecf = new byte[0];
    ecg = new byte[0];
    eci = true;
    AppMethodBeat.o(57806);
  }

  public static void Im()
  {
    AppMethodBeat.i(57802);
    In();
    AppMethodBeat.o(57802);
  }

  public static void In()
  {
    AppMethodBeat.i(57803);
    ab.i("MicroMsg.NotifyReceiver", "quitLightPushMode");
    eci = false;
    aa.anh().edit().putBoolean("is_in_notify_mode", false).commit();
    AppMethodBeat.o(57803);
  }

  public static void Io()
  {
    AppMethodBeat.i(57804);
    g.Rg().b(138, ech);
    g.Rg().b(39, ech);
    g.Rg().b(268369922, ech);
    if (ech == null)
      ech = new NotifyReceiver.a();
    g.Rg().a(138, ech);
    g.Rg().a(39, ech);
    g.Rg().a(268369922, ech);
    AppMethodBeat.o(57804);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(57805);
    ab.i("MicroMsg.NotifyReceiver", "onReceive intent :%s", new Object[] { paramIntent });
    if (paramIntent == null)
      AppMethodBeat.o(57805);
    while (true)
    {
      return;
      if (l.bL(paramContext))
      {
        ab.i("MicroMsg.NotifyReceiver", "fully exited, no need to start service");
        AppMethodBeat.o(57805);
      }
      else
      {
        com.tencent.mm.an.a.lm(paramIntent.getIntExtra("notify_respType", -1));
        paramContext = new Intent(paramContext, NotifyReceiver.NotifyService.class);
        if (paramIntent.getBooleanExtra("intent_from_shoot_key", false))
          paramContext.putExtra("notify_option_type", 3);
        paramContext.putExtras(paramIntent);
        c.a(paramContext, "mm", true, new Intent(ah.getContext(), ProcessService.MMProcessService.class));
        AppMethodBeat.o(57805);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.NotifyReceiver
 * JD-Core Version:    0.6.2
 */