package com.tencent.mm.plugin.game.model.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;

final class e$a extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(111513);
    if ((!g.RK()) || (a.QT()))
    {
      ab.e("MicroMsg.GameSilentDownloadListener", "acc has not ready");
      AppMethodBeat.o(111513);
    }
    while (true)
    {
      return;
      if (paramIntent == null)
      {
        AppMethodBeat.o(111513);
      }
      else if ("android.intent.action.BATTERY_OKAY".equals(paramIntent.getAction()))
      {
        ab.i("MicroMsg.GameSilentDownloadListener", "batteryChange: ACTION_BATTERY_OKAY, checkDownload");
        h.a.bFa().hO(true);
        AppMethodBeat.o(111513);
      }
      else
      {
        if ("android.intent.action.BATTERY_LOW".equals(paramIntent.getAction()))
        {
          ab.i("MicroMsg.GameSilentDownloadListener", "batteryChange: ACTION_BATTERY_LOW, pauseDownload");
          h.a.bFa();
          h.pauseDownload();
        }
        AppMethodBeat.o(111513);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.a.e.a
 * JD-Core Version:    0.6.2
 */