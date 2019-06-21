package com.tencent.mm.media.widget.b;

import a.f.a.b;
import a.f.b.j;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.d.g;
import com.tencent.mm.media.d.g.c;
import com.tencent.mm.plugin.mmsight.model.a.c;
import com.tencent.mm.plugin.mmsight.model.a.c.b;
import com.tencent.mm.plugin.mmsight.model.a.d.c;
import com.tencent.mm.plugin.mmsight.model.a.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.nio.IntBuffer;

final class d$4
  implements b<Boolean, y>
{
  d$4(d paramd)
  {
  }

  private y WV()
  {
    AppMethodBeat.i(12782);
    while (true)
    {
      Object localObject4;
      g localg;
      int i;
      int j;
      synchronized (this.fds.fcD)
      {
        if (this.fds.fdp != null)
        {
          ??? = this.fds.fdq.eYL;
          if (??? == null)
            continue;
          ??? = ((com.tencent.mm.media.h.b.a)???).eZl;
          if (??? != null)
          {
            ((IntBuffer)???).position(0);
            localObject4 = new int[((IntBuffer)???).remaining()];
            ((IntBuffer)???).get((int[])localObject4);
            localg = this.fds.fdp;
            i = this.fds.fcL;
            j = this.fds.fcM;
            j.p(localObject4, "data");
            if (localg.eTa >= 0)
              break label268;
            ab.e("MicroMsg.X264TransEncoder", "writeRGBData error, buffId error");
          }
        }
        if ((this.fds.fdp != null) && (this.fds.fcQ.oxa == d.c.ovD))
        {
          this.fds.fdp.stop(false);
          if (this.fds.fcJ != null)
          {
            ??? = this.fds.fcJ;
            localObject4 = new com/tencent/mm/media/widget/b/d$4$1;
            ((d.4.1)localObject4).<init>(this);
            ((c)???).a((c.b)localObject4);
          }
          this.fds.fdi.release();
          ??? = this.fds;
          ab.c("MicroMsg.Media.X264MP4MuxRecorder", "stopImpl", new Object[0]);
          localObject4 = new com/tencent/mm/media/widget/b/d$6;
          ((d.6)localObject4).<init>((d)???);
          com.tencent.mm.sdk.g.d.post((Runnable)localObject4, "X264MP4MuxRecorder_stop");
          if (this.fds.fcQ != null)
            this.fds.fcQ.a(d.c.ovE);
        }
        AppMethodBeat.o(12782);
        return null;
        ??? = null;
      }
      label268: synchronized (localg.eTu)
      {
        al localal = localg.eVS;
        g.c localc = new com/tencent/mm/media/d/g$c;
        localc.<init>(localg, i, j, (int[])localObject4);
        localal.aa((Runnable)localc);
        continue;
        localObject3 = finally;
        AppMethodBeat.o(12782);
        throw localObject3;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.b.d.4
 * JD-Core Version:    0.6.2
 */