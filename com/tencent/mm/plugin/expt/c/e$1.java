package com.tencent.mm.plugin.expt.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.w;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class e$1
  implements Runnable
{
  e$1(e parame, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(73554);
    Object localObject1 = this.lOh;
    Object localObject2 = this.fpw;
    long l1;
    ArrayList localArrayList;
    int i;
    int j;
    Object localObject3;
    if (!bo.isNullOrNil((String)localObject2))
    {
      l1 = bo.yz();
      localObject2 = ((String)localObject2).split("\\|");
      localArrayList = new ArrayList();
      i = localObject2.length;
      for (j = 0; j < i; j++)
      {
        localObject3 = localObject2[j];
        if (!bo.isNullOrNil((String)localObject3))
        {
          localObject3 = new w(((String)localObject3).replace(';', ','));
          if ((((w)localObject3).cWT > 0L) && (((w)localObject3).cWS > 0L))
            localArrayList.add(localObject3);
        }
      }
      localObject2 = new StringBuffer();
      i = 0;
      j = 0;
      if (!localArrayList.isEmpty())
        Collections.sort(localArrayList, new e.2((e)localObject1));
    }
    try
    {
      k = localArrayList.size();
      localObject1 = null;
      l2 = 0L;
      i = 0;
      j = 0;
      if (i >= k);
    }
    catch (Exception localException1)
    {
      try
      {
        while (true)
        {
          int k;
          localObject3 = (w)localArrayList.get(i);
          if (i + 1 < k)
            localObject1 = (w)localArrayList.get(i + 1);
          if ((localObject3 == null) || (localObject1 == null))
            break;
          if ((((w)localObject3).cWS == 7L) && (((w)localObject1).cWS == 8L) && (((w)localObject3).cWT < ((w)localObject1).cWT) && (((w)localObject3).cWc == ((w)localObject1).cWc))
          {
            if (l2 > 0L);
            for (l2 = ((w)localObject3).cWT - l2; ; l2 = 0L)
            {
              ((StringBuffer)localObject2).append(String.format("{\"tbe\":%d.\"ten\":%d.\"in\":%d.\"inbg\":%d}", new Object[] { Long.valueOf(((w)localObject3).cWT), Long.valueOf(((w)localObject1).cWT), Long.valueOf(((w)localObject1).cWT - ((w)localObject3).cWT), Long.valueOf(l2) })).append(";");
              l2 = ((w)localObject1).cWT;
              j++;
              i += 2;
              break;
            }
          }
          if (((w)localObject3).cWS != 8L)
            break;
          long l2 = ((w)localObject3).cWT;
          i++;
        }
        while (true)
        {
          localObject1 = ((StringBuffer)localObject2).toString();
          if (!bo.isNullOrNil((String)localObject1))
          {
            h.pYm.e(16563, new Object[] { localObject1, Long.valueOf(bo.az(l1)), Integer.valueOf(j) });
            ab.i("MicroMsg.MMPageReporter", "reportWeixinAppTime [%s]", new Object[] { localObject1 });
          }
          ab.i("MicroMsg.MMPageReporter", "reportWeixinAppTime cost[%d] count[%d]", new Object[] { Long.valueOf(bo.az(l1)), Integer.valueOf(j) });
          AppMethodBeat.o(73554);
          return;
          localException1 = localException1;
          j = i;
          ab.printErrStackTrace("MicroMsg.MMPageReporter", localException1, "reportWeixinAppTime error", new Object[0]);
        }
      }
      catch (Exception localException2)
      {
        while (true);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.c.e.1
 * JD-Core Version:    0.6.2
 */