package com.tencent.mm.plugin.game.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.ipcinvoker.l;
import com.tencent.mm.plugin.game.luggage.d.a;
import com.tencent.mm.sdk.platformtools.ab;

final class aw$7
  implements d.a
{
  aw$7(String paramString, GameWebPerformanceInfo paramGameWebPerformanceInfo, c paramc, Bundle paramBundle)
  {
  }

  public final void wM()
  {
    AppMethodBeat.i(111470);
    ab.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preLoadWePkgAndWebCore end, time = %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    l.q(new aw.7.1(this));
    AppMethodBeat.o(111470);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.aw.7
 * JD-Core Version:    0.6.2
 */