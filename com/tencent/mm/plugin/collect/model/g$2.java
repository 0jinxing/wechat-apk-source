package com.tencent.mm.plugin.collect.model;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.ConcurrentLinkedQueue;

final class g$2
  implements MediaPlayer.OnErrorListener
{
  g$2(g paramg, g.b paramb)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(40935);
    ab.e("MicroMsg.F2fRcvVoiceListener", "prefix play error");
    g.e(this.kBV);
    g.d(this.kBV);
    g.f(this.kBV);
    h.pYm.e(14404, new Object[] { Integer.valueOf(3), this.kBU.cva, Integer.valueOf(7), Integer.valueOf(paramInt1), Integer.valueOf(this.kBU.kBZ) });
    if (!g.g(this.kBV).isEmpty())
      g.h(this.kBV);
    while (true)
    {
      AppMethodBeat.o(40935);
      return false;
      g.bgE();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.g.2
 * JD-Core Version:    0.6.2
 */