package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class OnlineVideoView$7
  implements b
{
  OnlineVideoView$7(OnlineVideoView paramOnlineVideoView)
  {
  }

  public final long bOR()
  {
    AppMethodBeat.i(38396);
    ab.i("MicroMsg.OnlineVideoView", "%d sns video get online cache", new Object[] { Integer.valueOf(this.rly.hashCode()) });
    g.RQ();
    g.RP().Ry().set(ac.a.xQl, Boolean.TRUE);
    try
    {
      if ((OnlineVideoView.x(this.rly)) && (OnlineVideoView.k(this.rly) != null))
      {
        int i = OnlineVideoView.k(this.rly).fUV;
        l = i;
        AppMethodBeat.o(38396);
        return l;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        long l = 0L;
        AppMethodBeat.o(38396);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OnlineVideoView.7
 * JD-Core Version:    0.6.2
 */