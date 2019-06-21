package com.tencent.mm.plugin.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.b.b;
import com.tencent.mm.plugin.fts.a.h;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.util.HashMap;

final class PluginFTS$a extends a
{
  private PluginFTS$a(PluginFTS paramPluginFTS)
  {
  }

  public final String aAo()
  {
    AppMethodBeat.i(136598);
    String str = String.format("{T2S: %d PY: %d}", new Object[] { Integer.valueOf(com.tencent.mm.plugin.fts.a.g.ghK.size()), Integer.valueOf(com.tencent.mm.plugin.fts.a.g.mDn.size()) });
    AppMethodBeat.o(136598);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136597);
    Ng("start");
    try
    {
      localObject1 = com.tencent.mm.vfs.e.e("assets:///fts_t2s.txt", 0, -1);
      Object localObject2 = new java/lang/String;
      ((String)localObject2).<init>((byte[])localObject1);
      localObject1 = ((String)localObject2).split("\n");
      i = localObject1.length;
      for (j = 0; j < i; j++)
      {
        localObject2 = localObject1[j].split(",");
        com.tencent.mm.plugin.fts.a.g.ghK.put(localObject2[0], localObject2[1]);
      }
    }
    catch (Exception localException1)
    {
      Object localObject1;
      int i;
      int j;
      ab.printErrStackTrace("MicroMsg.FTS.PluginFTS", localException1, localException1.getMessage(), new Object[0]);
      Ng("t2s");
      long l2;
      try
      {
        Object localObject3 = com.tencent.mm.vfs.e.e("assets:///fts_py.txt", 0, -1);
        localObject1 = new java/lang/String;
        ((String)localObject1).<init>((byte[])localObject3);
        String[] arrayOfString1 = ((String)localObject1).split("\n");
        for (j = 0; j < arrayOfString1.length; j++)
        {
          String[] arrayOfString2 = arrayOfString1[j].split(",");
          localObject1 = arrayOfString2[0];
          localObject3 = new String[arrayOfString2.length - 1];
          for (i = 0; i < localObject3.length; i++)
            if (i + 1 < arrayOfString2.length)
              localObject3[i] = arrayOfString2[(i + 1)];
          if (localObject3.length > 0)
          {
            int k = localObject3.length;
            for (i = 0; i < k; i++)
            {
              arrayOfString2 = localObject3[i];
              com.tencent.mm.plugin.fts.a.g.mDm.Ni(arrayOfString2);
            }
            com.tencent.mm.plugin.fts.a.g.mDn.put(localObject1, localObject3);
          }
        }
      }
      catch (Exception localException2)
      {
        ab.printErrStackTrace("MicroMsg.FTS.PluginFTS", localException2, localException2.getMessage(), new Object[0]);
        Ng("py");
        com.tencent.mm.plugin.fts.a.e.mCL.mCN = (d.bAc().length() / 1048576L);
        com.tencent.mm.plugin.fts.a.e.mCL.mCO = PluginFTS.access$200(this.mBO).J(-301L, 0L);
        com.tencent.mm.plugin.fts.a.e.mCL.mCP = PluginFTS.access$200(this.mBO).J(-302L, 0L);
        com.tencent.mm.plugin.fts.a.e.mCL.mCR = PluginFTS.access$200(this.mBO).J(-303L, 0L);
        com.tencent.mm.plugin.fts.a.e.mCL.mCQ = PluginFTS.access$200(this.mBO).J(-304L, 0L);
        long l1 = ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSIndexDB().J(-300L, 0L);
        l2 = System.currentTimeMillis();
        if (com.tencent.mm.plugin.fts.a.d.L(l1, l2))
          break label437;
      }
      com.tencent.mm.plugin.fts.a.e.bAj();
      ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSIndexDB().K(-300L, l2);
    }
    while (true)
    {
      Ng("reportData");
      AppMethodBeat.o(136597);
      return true;
      label437: ab.i("MicroMsg.FTS.PluginFTS", "not need to report fts data");
    }
  }

  public final String getName()
  {
    return "InitResourceTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.PluginFTS.a
 * JD-Core Version:    0.6.2
 */