package com.tencent.mm.plugin.dbbackup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import java.text.SimpleDateFormat;
import java.util.Date;

final class d$9 extends BroadcastReceiver
{
  d$9(d paramd)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(18981);
    paramContext = paramIntent.getAction();
    int i = -1;
    switch (paramContext.hashCode())
    {
    default:
      switch (i)
      {
      default:
        label92: ab.v("MicroMsg.SubCoreDBBackup", "Action received: %s, interactive: %s, charging: %s", new Object[] { paramContext, Boolean.valueOf(d.i(this.kIO)), Boolean.valueOf(d.j(this.kIO)) });
        if ((d.h(this.kIO)) && (d.k(this.kIO) == null) && (d.j(this.kIO)) && (!d.i(this.kIO)))
          if (System.currentTimeMillis() - d.l(this.kIO) < 86400000L)
          {
            ab.d("MicroMsg.SubCoreDBBackup", "Last backup time not matched.");
            AppMethodBeat.o(18981);
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
      d.b(this.kIO, true);
      break label92;
      d.b(this.kIO, false);
      break label92;
      d.c(this.kIO, true);
      break label92;
      d.c(this.kIO, false);
      break label92;
      if (d.m(this.kIO) < 10);
      for (boolean bool = true; ; bool = false)
      {
        paramContext = new d.9.1(this, bool);
        d.a(this.kIO, new d.9.2(this, bool, paramContext));
        aw.RS().m(d.k(this.kIO), d.g(this.kIO));
        ab.i("MicroMsg.SubCoreDBBackup", "Auto database backup scheduled.");
        h.pYm.e(11098, new Object[] { Integer.valueOf(10009), this.kIO.kIy.format(new Date()) });
        AppMethodBeat.o(18981);
        break;
      }
      if (d.k(this.kIO) != null)
      {
        aw.RS().doN().removeCallbacks(d.k(this.kIO));
        d.a(this.kIO, null);
        ab.i("MicroMsg.SubCoreDBBackup", "Auto database backup canceled.");
        h.pYm.e(11098, new Object[] { Integer.valueOf(10010), this.kIO.kIy.format(new Date()) });
        AppMethodBeat.o(18981);
      }
      else
      {
        if (d.o(this.kIO))
        {
          this.kIO.bhP();
          d.d(this.kIO, false);
        }
        AppMethodBeat.o(18981);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.d.9
 * JD-Core Version:    0.6.2
 */