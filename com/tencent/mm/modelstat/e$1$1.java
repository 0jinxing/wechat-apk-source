package com.tencent.mm.modelstat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.o;

final class e$1$1
  implements ap.a
{
  boolean fSt = false;

  e$1$1(e.1 param1, e.b paramb, e.c paramc, String paramString1, String paramString2)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(78715);
    boolean bool = o.eA(ah.getContext());
    long l1 = bo.anU();
    long l2 = l1 - e.a(this.fSy.fSs);
    if (l2 <= e.g(this.fSy.fSs))
      if (bool)
      {
        this.fSt = false;
        bool = true;
        AppMethodBeat.o(78715);
      }
    while (true)
    {
      return bool;
      if (!this.fSt)
      {
        this.fSt = true;
        bool = true;
        AppMethodBeat.o(78715);
      }
      else
      {
        ab.i("MicroMsg.IndoorReporter", "Stop Now goingbg:%b fg:%b runtime:%d", new Object[] { Boolean.valueOf(this.fSt), Boolean.valueOf(bool), Long.valueOf(l2) });
        e.a(this.fSy.fSs, 0L);
        Object localObject1 = this.fSu.akg();
        Object localObject2 = this.fSv.akg();
        try
        {
          if ((bo.isNullOrNil((String)localObject1)) || (bo.isNullOrNil((String)localObject2)))
          {
            ab.e("MicroMsg.IndoorReporter", "get Res Failed [%s][%s]", new Object[] { localObject1, localObject2 });
            localObject3 = h.pYm;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ((StringBuilder)localObject2).append(this.fSw).append(this.fSx);
            if (!bo.isNullOrNil((String)localObject1));
            for (localObject1 = ",-10011,ERROR:StopFailed."; ; localObject1 = ",-10012,ERROR:StopFailed.")
            {
              ((h)localObject3).X(13381, (String)localObject1);
              bool = false;
              AppMethodBeat.o(78715);
              break;
            }
          }
          Object localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject3 = (String)localObject1 + (String)localObject2;
          int i = (int)Math.ceil(((String)localObject3).length() / 5400.0D);
          int j = 0;
          if (j < i)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject2 = ((StringBuilder)localObject1).append(this.fSw).append(this.fSx).append("_").append(l1).append("_").append(i).append("_");
            if (l2 > e.g(this.fSy.fSs));
            for (localObject1 = "1"; ; localObject1 = "2")
            {
              localObject1 = (String)localObject1 + "," + (j + 1) + "," + ((String)localObject3).substring(j * 5400, Math.min((j + 1) * 5400, ((String)localObject3).length()));
              ab.i("MicroMsg.IndoorReporter", "reportKV [%d/%d] res:%d kv:%d [%s]", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(((String)localObject3).length()), Integer.valueOf(((String)localObject1).length()), localObject1 });
              h.pYm.X(13381, (String)localObject1);
              j++;
              break;
            }
          }
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.IndoorReporter", "reprot Stop exception:%s", new Object[] { localException.getMessage() });
          bool = false;
          AppMethodBeat.o(78715);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.e.1.1
 * JD-Core Version:    0.6.2
 */