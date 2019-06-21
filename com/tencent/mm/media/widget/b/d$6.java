package com.tencent.mm.media.widget.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.i.c;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.sight.base.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class d$6
  implements Runnable
{
  d$6(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(12786);
    Object localObject2;
    synchronized (this.fds.fcD)
    {
      boolean bool = d.a(this.fds);
      ab.i("MicroMsg.Media.X264MP4MuxRecorder", "stopImpl result: %s", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        localObject2 = c.faj;
        c.Vu();
        d.a(this.fds, com.tencent.mm.plugin.mmsight.d.tv(this.fds.fcE));
      }
    }
    try
    {
      a locala = com.tencent.mm.plugin.sight.base.d.WR(this.fds.fcE);
      if (locala != null)
      {
        localObject2 = c.faj;
        c.cj(locala.videoBitrate, locala.eTk);
      }
      label104: if (this.fds.fde != null)
      {
        ab.i("MicroMsg.Media.X264MP4MuxRecorder", "call stopCallback");
        al.d(this.fds.fde);
      }
      while (true)
      {
        localObject2 = c.faj;
        c.Vs();
        AppMethodBeat.o(12786);
        return;
        localObject2 = c.faj;
        c.Vt();
        SightVideoJNI.releaseBigSightDataBufferLock(this.fds.eTa);
        if (this.fds.fdd != null)
        {
          localObject2 = new com/tencent/mm/media/widget/b/d$6$1;
          ((d.6.1)localObject2).<init>(this);
          al.d((Runnable)localObject2);
        }
      }
      localObject3 = finally;
      AppMethodBeat.o(12786);
      throw localObject3;
    }
    catch (Exception localException)
    {
      break label104;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.b.d.6
 * JD-Core Version:    0.6.2
 */