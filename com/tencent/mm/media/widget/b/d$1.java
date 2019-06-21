package com.tencent.mm.media.widget.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.g.a;
import com.tencent.mm.plugin.mmsight.model.a.c;
import com.tencent.mm.plugin.mmsight.model.a.d.c;
import com.tencent.mm.plugin.mmsight.model.a.s;
import com.tencent.mm.plugin.mmsight.model.b;
import com.tencent.mm.plugin.mmsight.model.f;
import com.tencent.mm.sdk.platformtools.ab;

final class d$1
  implements f
{
  d$1(d paramd)
  {
  }

  public final boolean O(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    AppMethodBeat.i(12778);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      ab.e("MicroMsg.Media.X264MP4MuxRecorder", "preview callback data is null");
      AppMethodBeat.o(12778);
    }
    while (true)
    {
      return bool;
      if ((this.fds.fcQ.oxa == d.c.ovB) || (this.fds.fcQ.oxa == d.c.ovC))
      {
        if (this.fds.fcQ.oxa == d.c.ovC)
        {
          this.fds.fcQ.oxa = d.c.ovD;
          ab.v("MicroMsg.Media.X264MP4MuxRecorder", "forward one more frame");
        }
        this.fds.fcX.jl(1L);
        if (this.fds.fcJ != null)
          this.fds.fcJ.bPM();
        this.fds.fdi.a(paramArrayOfByte, System.nanoTime(), new d.1.1(this));
        this.fds.fcW.jl(1L);
        bool = true;
        AppMethodBeat.o(12778);
      }
      else
      {
        AppMethodBeat.o(12778);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.b.d.1
 * JD-Core Version:    0.6.2
 */