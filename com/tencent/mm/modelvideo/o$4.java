package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

final class o$4
  implements Runnable
{
  o$4(o paramo)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(50762);
    if (!g.RK())
      AppMethodBeat.o(50762);
    while (true)
    {
      return;
      Object localObject1 = o.all();
      long l = System.currentTimeMillis() / 1000L;
      Object localObject2 = "UPDATE videoinfo2 SET status = 198, lastmodifytime = " + l + " WHERE masssendid > 0  AND status = 200";
      ab.i("MicroMsg.VideoInfoStorage", "fail all massSendInfos, sql %s", new Object[] { localObject2 });
      ((t)localObject1).fni.hY("videoinfo2", (String)localObject2);
      o.alp().bSd.hY("SightDraftInfo", "UPDATE SightDraftInfo SET fileStatus = 1 WHERE fileStatus = 6");
      localObject2 = o.alp();
      if (1209600000L <= 0L)
      {
        ab.w("MicroMsg.SightDraftStorage", "keep 0 sight draft");
        ((l)localObject2).bSd.hY("SightDraftInfo", "UPDATE SightDraftInfo SET fileStatus = 7 WHERE fileStatus = 1");
      }
      while (true)
      {
        localObject1 = o.alp().alf().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (j)((Iterator)localObject1).next();
          ab.i("MicroMsg.SubCoreVideo", "do delete sight draft file, name %s", new Object[] { ((j)localObject2).field_fileName });
          com.tencent.mm.a.e.deleteFile(k.tX(((j)localObject2).field_fileName));
          com.tencent.mm.a.e.deleteFile(k.tY(((j)localObject2).field_fileName));
        }
        l = bo.anU() - 1209600000L;
        ab.i("MicroMsg.SightDraftStorage", "check delete ITEM, create time %d", new Object[] { Long.valueOf(l) });
        localObject1 = "UPDATE SightDraftInfo SET fileStatus = 7 WHERE fileStatus = 1 AND createTime < ".concat(String.valueOf(l));
        ((l)localObject2).bSd.hY("SightDraftInfo", (String)localObject1);
      }
      AppMethodBeat.o(50762);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.o.4
 * JD-Core Version:    0.6.2
 */