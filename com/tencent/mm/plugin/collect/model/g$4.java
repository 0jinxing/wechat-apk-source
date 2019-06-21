package com.tencent.mm.plugin.collect.model;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.collect.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.ConcurrentLinkedQueue;

final class g$4
  implements MediaPlayer.OnCompletionListener
{
  g$4(g paramg, g.b paramb)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(40937);
    ab.i("MicroMsg.F2fRcvVoiceListener", "no need to play money this time");
    g.f(this.kBV);
    g.e(this.kBV);
    g.d(this.kBV);
    a.bgv();
    h.pYm.e(14404, new Object[] { Integer.valueOf(4), this.kBU.cva, "", "", Integer.valueOf(this.kBU.kBZ) });
    if (!g.g(this.kBV).isEmpty())
    {
      g.h(this.kBV);
      AppMethodBeat.o(40937);
    }
    while (true)
    {
      return;
      g.bgE();
      AppMethodBeat.o(40937);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.g.4
 * JD-Core Version:    0.6.2
 */