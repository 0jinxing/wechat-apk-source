package com.tencent.mm.media.widget.b;

import a.f.a.b;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class c$3
  implements b<Boolean, y>
{
  c$3(c paramc)
  {
  }

  private static y c(Boolean arg0)
  {
    AppMethodBeat.i(12742);
    if (!???.booleanValue())
    {
      ??? = com.tencent.mm.media.i.c.faj;
      com.tencent.mm.media.i.c.Vx();
    }
    synchronized (c.al())
    {
      try
      {
        c.al().notifyAll();
        AppMethodBeat.o(12742);
        return null;
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.Media.MediaCodecMP4MuxRecorder", localException, "initSurfaceLock notify error", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.b.c.3
 * JD-Core Version:    0.6.2
 */