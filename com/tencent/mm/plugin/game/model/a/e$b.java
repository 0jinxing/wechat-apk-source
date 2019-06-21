package com.tencent.mm.plugin.game.model.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;

final class e$b extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(111514);
    if ((!g.RK()) || (a.QT()))
    {
      ab.e("MicroMsg.GameSilentDownloadListener", "acc has not ready");
      AppMethodBeat.o(111514);
    }
    while (true)
    {
      return;
      int i = at.getNetType(ah.getContext());
      if (i == e.access$200())
      {
        AppMethodBeat.o(111514);
      }
      else
      {
        e.access$202(i);
        if (i == 0)
        {
          ab.i("MicroMsg.GameSilentDownloadListener", "netStateChange, netState = %s, checkDownload", new Object[] { Integer.valueOf(i) });
          h.a.bFa().hO(false);
          AppMethodBeat.o(111514);
        }
        else
        {
          ab.i("MicroMsg.GameSilentDownloadListener", "netStateChange, netState = %s, pauseDownload", new Object[] { Integer.valueOf(i) });
          h.a.bFa();
          h.pauseDownload();
          AppMethodBeat.o(111514);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.a.e.b
 * JD-Core Version:    0.6.2
 */