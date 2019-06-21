package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.List;

final class u$1
  implements Runnable
{
  u$1(u paramu, cbf paramcbf, ak paramak)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36299);
    if (!this.qJF.vHl.equals(u.a(this.qJH)))
    {
      g.RQ();
      if (!g.RN().QY())
      {
        ab.e("MicroMsg.NetSceneNewSyncAlbum", "mmcore has not set uin!!");
        AppMethodBeat.o(36299);
      }
    }
    while (true)
    {
      return;
      g.RQ();
      Object localObject = (String)g.RP().Ry().get(68377, null);
      g.RQ();
      if ((bo.a((Integer)g.RP().Ry().get(68400, null), 0) != this.qJF.pcX) || ((!bo.isNullOrNil((String)localObject)) && (!((String)localObject).equals(this.qJF.vHl))))
      {
        g.RQ();
        g.RP().Ry().set(68377, this.qJF.vHl);
        g.RQ();
        g.RP().Ry().set(68400, Integer.valueOf(this.qJF.pcX));
        g.RQ();
        g.RP().Ry().set(68418, i.jV(this.qJF.vQE));
        g.RQ();
        g.RP().Ry().set(68419, Integer.valueOf(0));
        f.k(1, i.jV(this.qJF.vQE), 0);
      }
      localObject = u.cnb().iterator();
      while (((Iterator)localObject).hasNext())
        ((ar)((Iterator)localObject).next()).Zy();
      this.qJG.sendEmptyMessage(0);
      AppMethodBeat.o(36299);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.u.1
 * JD-Core Version:    0.6.2
 */