package com.tencent.mm.media.widget.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.a.c.a;
import com.tencent.mm.plugin.mmsight.model.a.d.c;
import com.tencent.mm.plugin.mmsight.model.a.s;
import com.tencent.mm.sdk.platformtools.ab;

final class d$5
  implements c.a
{
  d$5(d paramd)
  {
  }

  public final void WU()
  {
    AppMethodBeat.i(12784);
    ab.i("MicroMsg.Media.X264MP4MuxRecorder", "onPcmReady");
    if (this.fds.WL() != d.c.ovI)
    {
      ab.w("MicroMsg.Media.X264MP4MuxRecorder", "not MediaStatus.Initialized, maybe canceled by user");
      AppMethodBeat.o(12784);
    }
    while (true)
    {
      return;
      this.fds.fcQ.a(d.c.ovB);
      AppMethodBeat.o(12784);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.b.d.5
 * JD-Core Version:    0.6.2
 */