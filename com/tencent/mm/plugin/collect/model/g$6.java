package com.tencent.mm.plugin.collect.model;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.collect.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.ConcurrentLinkedQueue;

final class g$6
  implements MediaPlayer.OnCompletionListener
{
  g$6(g paramg, g.b paramb)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(40939);
    ab.i("MicroMsg.F2fRcvVoiceListener", "play done");
    g.e(this.kBV);
    g.i(this.kBV);
    g.f(this.kBV);
    if (a.bgv().kBA)
    {
      h.pYm.e(14404, new Object[] { Integer.valueOf(1), this.kBU.cva, "", "", Integer.valueOf(this.kBU.kBZ) });
      if (g.g(this.kBV).isEmpty())
        break label179;
      g.h(this.kBV);
      AppMethodBeat.o(40939);
    }
    while (true)
    {
      return;
      h.pYm.e(14404, new Object[] { Integer.valueOf(2), this.kBU.cva, "", "", Integer.valueOf(this.kBU.kBZ) });
      break;
      label179: g.bgE();
      AppMethodBeat.o(40939);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.g.6
 * JD-Core Version:    0.6.2
 */