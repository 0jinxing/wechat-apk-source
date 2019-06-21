package com.tinkerboots.sdk.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tinker.lib.util.a;

public final class d$b
{
  public d$b(Context paramContext, final d.a parama)
  {
    AppMethodBeat.i(65557);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
    paramContext.registerReceiver(new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        AppMethodBeat.i(65556);
        if (paramAnonymousIntent == null);
        for (paramAnonymousIntent = ""; ; paramAnonymousIntent = paramAnonymousIntent.getAction())
        {
          a.i("Tinker.TinkerUtils", "ScreenReceiver action [%s] ", new Object[] { paramAnonymousIntent });
          if ("android.intent.action.SCREEN_OFF".equals(paramAnonymousIntent))
          {
            paramAnonymousContext.unregisterReceiver(this);
            if (parama != null)
              parama.awE();
          }
          AppMethodBeat.o(65556);
          return;
        }
      }
    }
    , localIntentFilter);
    AppMethodBeat.o(65557);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tinkerboots.sdk.b.d.b
 * JD-Core Version:    0.6.2
 */