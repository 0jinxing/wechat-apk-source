package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ar;
import com.tencent.mm.protocal.protobuf.can;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.Iterator;
import java.util.List;

final class u$2
  implements Runnable
{
  u$2(u paramu, boolean paramBoolean, can paramcan, ak paramak)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36300);
    if (this.qJI)
    {
      Iterator localIterator = u.cnb().iterator();
      while (localIterator.hasNext())
      {
        ar localar = (ar)localIterator.next();
        ab.i("MicroMsg.NetSceneNewSyncAlbum", "notify list ");
        localar.Zx();
      }
    }
    this.qJG.sendEmptyMessage(0);
    AppMethodBeat.o(36300);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.u.2
 * JD-Core Version:    0.6.2
 */