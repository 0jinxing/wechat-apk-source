package com.tencent.mm.plugin.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class b$4 extends BroadcastReceiver
{
  b$4(b paramb)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(18580);
    paramContext = paramIntent.getAction();
    int i = -1;
    switch (paramContext.hashCode())
    {
    default:
      switch (i)
      {
      default:
        label92: if ((b.j(this.jZY)) && (!b.k(this.jZY)))
        {
          ab.i("MicroMsg.CalcWxService", "it is charging and screen off, 5 min to calc");
          if (b.l(this.jZY) != null)
            break label313;
          b.b(this.jZY, new b.4.1(this));
          aw.RS().m(b.l(this.jZY), 300000L);
          AppMethodBeat.o(18580);
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
      b.b(this.jZY, true);
      break label92;
      b.b(this.jZY, false);
      break label92;
      b.c(this.jZY, true);
      break label92;
      b.c(this.jZY, false);
      break label92;
      if (b.l(this.jZY) != null)
      {
        aw.RS();
        al.af(b.l(this.jZY));
        b.b(this.jZY, null);
      }
      b.m(this.jZY);
      label313: AppMethodBeat.o(18580);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.4
 * JD-Core Version:    0.6.2
 */