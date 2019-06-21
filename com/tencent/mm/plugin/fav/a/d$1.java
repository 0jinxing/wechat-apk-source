package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class d$1
  implements Runnable
{
  d$1(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(102623);
    ((ae)g.M(ae.class)).getFavItemInfoStorage().bva();
    d.a(this.meO, System.currentTimeMillis());
    ab.d("MicroMsg.FavCleanFirstLoader", "calDataBaseDataTotalLength, used: %dms", new Object[] { Long.valueOf(d.a(this.meO) - d.b(this.meO)) });
    d.a(this.meO, -1L);
    d.c(this.meO);
    synchronized (d.d(this.meO))
    {
      g.RP().Ry().set(ac.a.xLL, Boolean.TRUE);
      d.e(this.meO);
      this.meO.mHandler.sendEmptyMessage(0);
      AppMethodBeat.o(102623);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.d.1
 * JD-Core Version:    0.6.2
 */