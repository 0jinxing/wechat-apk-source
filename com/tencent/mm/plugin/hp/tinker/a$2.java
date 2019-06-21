package com.tencent.mm.plugin.hp.tinker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$2 extends BroadcastReceiver
{
  a$2(a parama, Runnable paramRunnable)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(90625);
    if (paramIntent == null)
    {
      paramIntent = "";
      if (!"android.intent.action.SCREEN_OFF".equals(paramIntent))
        break label65;
      com.tencent.tinker.lib.util.a.i("Tinker.ScreenOffRetryPatch", "ScreenOffRetryPatch screen off now, send message now", new Object[0]);
      this.nua.handler.postDelayed(this.val$runnable, this.nub);
      AppMethodBeat.o(90625);
    }
    while (true)
    {
      return;
      paramIntent = paramIntent.getAction();
      break;
      label65: com.tencent.tinker.lib.util.a.i("Tinker.ScreenOffRetryPatch", "ScreenOffRetryPatch screen on, remove pending runnable and receive", new Object[0]);
      this.nua.handler.removeCallbacks(this.val$runnable);
      paramContext.unregisterReceiver(this);
      AppMethodBeat.o(90625);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.tinker.a.2
 * JD-Core Version:    0.6.2
 */