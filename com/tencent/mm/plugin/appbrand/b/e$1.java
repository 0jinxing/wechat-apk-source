package com.tencent.mm.plugin.appbrand.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class e$1 extends BroadcastReceiver
{
  final String gWP = "reason";
  final String gWQ = "homekey";
  final String gWR = "recentapps";

  e$1(e parame)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(114317);
    if (paramIntent == null)
      AppMethodBeat.o(114317);
    while (true)
    {
      return;
      if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(paramIntent.getAction()))
      {
        paramContext = paramIntent.getStringExtra("reason");
        if (paramContext != null)
        {
          ab.i("MicroMsg.BaseAppBrandUIHomePressReceiver", "[home_pressed] action: %s, reason: %s", new Object[] { paramIntent.getAction(), paramContext });
          if (paramContext.equals("homekey"))
          {
            this.gWS.awC();
            AppMethodBeat.o(114317);
            continue;
          }
          if (paramContext.equals("recentapps"))
            this.gWS.awD();
        }
      }
      else
      {
        AppMethodBeat.o(114317);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.b.e.1
 * JD-Core Version:    0.6.2
 */