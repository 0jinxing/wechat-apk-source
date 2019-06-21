package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bf;
import com.tencent.mm.g.a.bf.a;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.j;

final class b$2 extends c<bf>
{
  b$2(b paramb)
  {
    AppMethodBeat.i(136716);
    this.xxI = bf.class.getName().hashCode();
    AppMethodBeat.o(136716);
  }

  private boolean a(bf parambf)
  {
    AppMethodBeat.i(136717);
    b localb;
    Object localObject1;
    if ((parambf.cus.cut == 35) && (parambf.cus.cuu == 1))
    {
      ab.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "CheckResUpdateCacheFileEvent: %s", new Object[] { parambf.cus.filePath });
      localb = this.mGm;
      parambf = parambf.cus.filePath;
      localObject1 = new com.tencent.mm.vfs.b(b.bAx(), "temp");
      if (((com.tencent.mm.vfs.b)localObject1).exists())
        com.tencent.mm.vfs.e.N(j.w(((com.tencent.mm.vfs.b)localObject1).dMD()), true);
      ((com.tencent.mm.vfs.b)localObject1).mkdirs();
    }
    try
    {
      int i = com.tencent.mm.vfs.e.iu(parambf, j.w(((com.tencent.mm.vfs.b)localObject1).dMD()));
      ab.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "unzip %s %d", new Object[] { parambf, Integer.valueOf(i) });
      if (i >= 0)
      {
        parambf = b.bAy();
        Object localObject2 = new com/tencent/mm/vfs/b;
        ((com.tencent.mm.vfs.b)localObject2).<init>((com.tencent.mm.vfs.b)localObject1, "fts_feature");
        i = b.j((com.tencent.mm.vfs.b)localObject2);
        int j = b.j(parambf);
        ab.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "updateFeatureList: updateVersion %d currentVersion %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        if (i > j)
        {
          com.tencent.mm.vfs.e.N(j.w(parambf.dMD()), true);
          ((com.tencent.mm.vfs.b)localObject2).o(parambf);
          localObject1 = localb.eAX;
          localObject2 = new com/tencent/mm/plugin/fts/b/b$d;
          ((b.d)localObject2).<init>(localb, j.w(parambf.dMD()));
          ((m)localObject1).a(65596, (a)localObject2);
        }
      }
      AppMethodBeat.o(136717);
      return true;
    }
    catch (Exception parambf)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FTS.FTS5SearchFeatureLogic", parambf, "updateFeatureList", new Object[0]);
        com.tencent.mm.plugin.report.e.pXa.a(146L, 22L, 1L, false);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.b.2
 * JD-Core Version:    0.6.2
 */