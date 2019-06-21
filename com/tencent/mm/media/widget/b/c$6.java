package com.tencent.mm.media.widget.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.sight.base.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class c$6
  implements Runnable
{
  c$6(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(12748);
    boolean bool = c.c(this.fdl);
    ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "stopImpl result: %s", new Object[] { Boolean.valueOf(bool) });
    Object localObject;
    if (bool)
    {
      localObject = com.tencent.mm.media.i.c.faj;
      com.tencent.mm.media.i.c.VC();
      c.a(this.fdl, com.tencent.mm.plugin.mmsight.d.tv(this.fdl.fcE));
    }
    try
    {
      localObject = com.tencent.mm.plugin.sight.base.d.WR(this.fdl.fcE);
      if (localObject != null)
      {
        com.tencent.mm.media.i.c localc = com.tencent.mm.media.i.c.faj;
        com.tencent.mm.media.i.c.ck(((a)localObject).videoBitrate, ((a)localObject).eTk);
      }
      label90: if (this.fdl.fde != null)
      {
        ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "call stopCallback");
        al.d(this.fdl.fde);
      }
      while (true)
      {
        localObject = com.tencent.mm.media.i.c.faj;
        com.tencent.mm.media.i.c.VA();
        AppMethodBeat.o(12748);
        return;
        localObject = com.tencent.mm.media.i.c.faj;
        com.tencent.mm.media.i.c.VB();
        SightVideoJNI.releaseBigSightDataBufferLock(this.fdl.eTa);
        if (this.fdl.fdd != null)
          al.d(new c.6.1(this));
      }
    }
    catch (Exception localException)
    {
      break label90;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.b.c.6
 * JD-Core Version:    0.6.2
 */