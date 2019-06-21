package com.tencent.mm.plugin.monitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.a.c;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;

final class b$13 extends BroadcastReceiver
{
  b$13(b paramb)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(84533);
    paramContext = paramIntent.getAction();
    int i = -1;
    label92: boolean bool3;
    switch (paramContext.hashCode())
    {
    default:
      switch (i)
      {
      default:
        boolean bool1 = b.j(this.oEL);
        boolean bool2 = b.k(this.oEL);
        long l = b.l(this.oEL);
        if (b.m(this.oEL) == null)
        {
          bool3 = true;
          label132: ab.v("MicroMsg.SubCoreBaseMonitor", "summerhv Action received: %s, interactive: %s, charging: %s, lastScanTime:%d, delayTimerRunnable null[%b]", new Object[] { paramContext, Boolean.valueOf(bool1), Boolean.valueOf(bool2), Long.valueOf(l), Boolean.valueOf(bool3) });
          if ((b.m(this.oEL) == null) && (b.k(this.oEL)) && (!b.j(this.oEL)))
            break label380;
          if (b.m(this.oEL) == null)
            break label538;
          d.xDH.al(b.m(this.oEL));
          b.a(this.oEL, null);
          ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv auto scan remove[%s]", new Object[] { b.p(this.oEL) });
          AppMethodBeat.o(84533);
        }
        break;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      break;
    case -1454123155:
    case -2128145023:
    case 1019184907:
    case -1886648615:
    }
    while (true)
    {
      return;
      if (!paramContext.equals("android.intent.action.SCREEN_ON"))
        break;
      i = 0;
      break;
      if (!paramContext.equals("android.intent.action.SCREEN_OFF"))
        break;
      i = 1;
      break;
      if (!paramContext.equals("android.intent.action.ACTION_POWER_CONNECTED"))
        break;
      i = 2;
      break;
      if (!paramContext.equals("android.intent.action.ACTION_POWER_DISCONNECTED"))
        break;
      i = 3;
      break;
      b.a(this.oEL, true);
      break label92;
      b.a(this.oEL, false);
      break label92;
      b.b(this.oEL, true);
      break label92;
      b.b(this.oEL, false);
      break label92;
      bool3 = false;
      break label132;
      label380: if (com.tencent.mm.sdk.a.b.dnO())
        b.n(this.oEL);
      while (SystemClock.uptimeMillis() - b.l(this.oEL) >= b.o(this.oEL) * 60000L)
      {
        paramContext = new b.13.1(this);
        b.a(this.oEL, new b.13.2(this, paramContext));
        d.xDH.a(b.m(this.oEL), "MicroMsg.SubCoreBaseMonitor", b.q(this.oEL) * 60000L);
        ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv auto scan post delay[%d]min", new Object[] { Long.valueOf(b.q(this.oEL)) });
        AppMethodBeat.o(84533);
        break;
      }
      ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv last scan time not matched in [%d]min", new Object[] { Long.valueOf(b.o(this.oEL)) });
      AppMethodBeat.o(84533);
      continue;
      label538: if (b.p(this.oEL) != null)
      {
        b.p(this.oEL).fIa = true;
        ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv auto scan canceled[%s]", new Object[] { b.p(this.oEL) });
        b.a(this.oEL, null);
      }
      AppMethodBeat.o(84533);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.monitor.b.13
 * JD-Core Version:    0.6.2
 */