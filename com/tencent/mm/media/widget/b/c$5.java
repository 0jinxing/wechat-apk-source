package com.tencent.mm.media.widget.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.a.c.a;
import com.tencent.mm.plugin.mmsight.model.a.d.c;
import com.tencent.mm.plugin.mmsight.model.a.s;
import com.tencent.mm.sdk.platformtools.ab;

final class c$5
  implements c.a
{
  c$5(c paramc)
  {
  }

  public final void WU()
  {
    AppMethodBeat.i(12746);
    ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "onPcmReady");
    if (this.fdl.WL() != d.c.ovI)
    {
      ab.w("MicroMsg.Media.MediaCodecMP4MuxRecorder", "not MediaStatus.Initialized, maybe canceled by user");
      AppMethodBeat.o(12746);
    }
    while (true)
    {
      return;
      this.fdl.fcQ.a(d.c.ovB);
      AppMethodBeat.o(12746);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.b.c.5
 * JD-Core Version:    0.6.2
 */