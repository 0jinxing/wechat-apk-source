package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class j$7
  implements b
{
  j$7(j paramj)
  {
  }

  public final long bOR()
  {
    AppMethodBeat.i(32322);
    ab.i("MicroMsg.Imagegallery.handler.video", "%d video get online cache sec", new Object[] { Integer.valueOf(this.yWZ.hashCode()) });
    aw.ZK();
    c.Ry().set(ac.a.xQl, Boolean.TRUE);
    try
    {
      if ((j.c(this.yWZ)) && (j.f(this.yWZ) != null))
      {
        int i = j.f(this.yWZ).fUV;
        l = i;
        AppMethodBeat.o(32322);
        return l;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        long l = 0L;
        AppMethodBeat.o(32322);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.j.7
 * JD-Core Version:    0.6.2
 */