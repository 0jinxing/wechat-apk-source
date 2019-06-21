package com.tencent.mm.plugin.ipcall.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ba.n;
import com.tencent.mm.ba.r;
import com.tencent.mm.g.a.cq;
import com.tencent.mm.m.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.File;
import java.util.ArrayList;

final class d$1 extends com.tencent.mm.sdk.b.c<cq>
{
  d$1(d paramd)
  {
    AppMethodBeat.i(21725);
    this.xxI = cq.class.getName().hashCode();
    AppMethodBeat.o(21725);
  }

  private boolean a(cq paramcq)
  {
    AppMethodBeat.i(21726);
    c localc;
    String str;
    if ((paramcq instanceof cq))
    {
      ab.d("MicroMsg.IPCallCoutryConfigUpdater", "detect DynamicConfigUpdatedEvent");
      aw.ZK();
      int i = ((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xLl, Integer.valueOf(0))).intValue();
      int j = g.Nu().getInt("WeChatOutCountryCodeRestrictionPackageID", 0);
      ab.d("MicroMsg.IPCallCoutryConfigUpdater", "oldConfig: %d, newConfig: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      if (i != j)
      {
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(ac.a.xLl, Integer.valueOf(j));
        r.aix().lT(26);
        localc = c.bHc();
        str = com.tencent.mm.compatible.util.e.eSj + "ipcallCountryCodeConfig.cfg";
        ab.d("MicroMsg.IPCallCountryCodeConfig", "deleteRestrictionCountryConfigIfExist, path: %s", new Object[] { str });
      }
    }
    try
    {
      paramcq = new java/io/File;
      paramcq.<init>(str);
      if (paramcq.exists())
        paramcq.delete();
      localc.bZi = false;
      localc.nvr.clear();
      this.nvu.ii(true);
      AppMethodBeat.o(21726);
      return false;
    }
    catch (Exception paramcq)
    {
      while (true)
        ab.e("MicroMsg.IPCallCountryCodeConfig", "deleteRestrictionCountryConfigIfExist, error: %s", new Object[] { paramcq.getMessage() });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.d.1
 * JD-Core Version:    0.6.2
 */