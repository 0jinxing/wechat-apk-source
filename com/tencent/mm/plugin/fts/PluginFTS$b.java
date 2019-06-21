package com.tencent.mm.plugin.fts;

import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.j;

final class PluginFTS$b extends a
{
  private PluginFTS$b(PluginFTS paramPluginFTS)
  {
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136599);
    g.RQ();
    if (2 != ((Integer)g.RP().Ry().get(ac.a.xSB, Integer.valueOf(0))).intValue())
    {
      d.bAb();
      g.RQ();
      g.RP().Ry().set(ac.a.xSB, Integer.valueOf(2));
    }
    g.RQ();
    Object localObject = new b(g.RP().cachePath, "IndexMicroMsg.db");
    if (((b)localObject).exists())
      ((b)localObject).delete();
    while (true)
    {
      g.RQ();
      localObject = new b(g.RP().cachePath, "FTS5IndexMicroMsg.db");
      if (((b)localObject).exists())
        ((b)localObject).delete();
      try
      {
        while (true)
        {
          PluginFTS localPluginFTS = this.mBO;
          localObject = new com/tencent/mm/plugin/fts/d;
          g.RQ();
          ((d)localObject).<init>(g.RP().cachePath);
          PluginFTS.access$202(localPluginFTS, (d)localObject);
          PluginFTS.access$600(this.mBO);
          PluginFTS.access$700(this.mBO);
          PluginFTS.access$800(this.mBO);
          PluginFTS.access$900(this.mBO);
          AppMethodBeat.o(136599);
          return true;
          ab.i("MicroMsg.FTS.PluginFTS", "not exist fts3DBFile %s", new Object[] { j.w(((b)localObject).dMD()) });
          break;
          ab.i("MicroMsg.FTS.PluginFTS", "not exist fts5DBUnEncrypt %s", new Object[] { j.w(((b)localObject).dMD()) });
        }
      }
      catch (Exception localException)
      {
        while (true)
          if (PluginFTS.mBA)
          {
            AppMethodBeat.o(136599);
          }
          else
          {
            ab.printErrStackTrace("MicroMsg.FTS.PluginFTS", localException, "Index database corruption detected", new Object[0]);
            com.tencent.mm.plugin.fts.a.e.vV(19);
            PluginFTS.access$300(this.mBO);
            PluginFTS.access$400(this.mBO);
            if (PluginFTS.access$200(this.mBO) != null)
              PluginFTS.access$200(this.mBO).close();
            d.bAb();
            String str = "InitSearchTask: " + Log.getStackTraceString(localException);
            h.pYm.g("FTS", str, null);
          }
      }
    }
  }

  public final String getName()
  {
    return "InitSearchTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.PluginFTS.b
 * JD-Core Version:    0.6.2
 */