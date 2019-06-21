package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class as$1
  implements at.b
{
  as$1(as paramas, as.c paramc)
  {
  }

  public final void a(List<n> paramList, Map<Integer, Integer> paramMap1, Map<Integer, Integer> paramMap2, Map<Integer, Integer> paramMap3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(39200);
    ab.d("MicroMsg.SnsphotoAdapter", "onFinishFixPos");
    as localas = this.rvF;
    ab.d("MicroMsg.SnsphotoAdapter", "setSnsList the thread id is " + Thread.currentThread().getId());
    if ((paramList == null) || (paramList.size() <= 0))
      AppMethodBeat.o(39200);
    while (true)
    {
      return;
      ab.d("MicroMsg.SnsphotoAdapter", "copy list info");
      int i = paramList.size();
      localas.list.clear();
      localas.rgf.clear();
      localas.rgg.clear();
      localas.rvt.clear();
      for (int j = 0; j < i; j++)
      {
        n localn = n.z((n)paramList.get(j));
        localas.list.add(localn);
      }
      paramList = paramMap1.keySet().iterator();
      while (paramList.hasNext())
      {
        j = ((Integer)paramList.next()).intValue();
        i = ((Integer)paramMap1.get(Integer.valueOf(j))).intValue();
        localas.rgf.put(Integer.valueOf(j), Integer.valueOf(i));
      }
      paramList = paramMap2.keySet().iterator();
      while (paramList.hasNext())
      {
        j = ((Integer)paramList.next()).intValue();
        i = ((Integer)paramMap2.get(Integer.valueOf(j))).intValue();
        localas.rgg.put(Integer.valueOf(j), Integer.valueOf(i));
      }
      paramList = paramMap3.keySet().iterator();
      while (paramList.hasNext())
      {
        j = ((Integer)paramList.next()).intValue();
        i = ((Integer)paramMap3.get(Integer.valueOf(j))).intValue();
        localas.rvt.put(Integer.valueOf(j), Integer.valueOf(i));
      }
      paramMap1.clear();
      paramMap2.clear();
      if (localas.czr)
      {
        if (localas.list.size() <= 1);
        for (j = 2147483647; ; j = ((n)localas.list.get(1)).field_head)
        {
          localas.rvy = 0;
          for (i = 0; i < localas.list.size(); i++)
            if ((!localas.czr) || (i != 0))
            {
              if (j != ((n)localas.list.get(i)).field_head)
                break;
              localas.rvy = Math.max(localas.rvy, ((n)localas.list.get(i)).field_createTime);
            }
        }
      }
      if (localas.list.isEmpty());
      for (j = 2147483647; ; j = ((n)localas.list.get(0)).field_head)
        break;
      if ((localas.list.isEmpty()) || ((localas.czr) && (localas.list.size() == 1)))
        localas.rvy = 2147483647;
      if (localas.list.isEmpty());
      for (j = 0; ; j = ((n)localas.list.get(localas.list.size() - 1)).field_head)
      {
        localas.rvz = 2147483647;
        for (i = localas.list.size() - 1; (i >= 0) && (j != 0) && (j == ((n)localas.list.get(i)).field_head); i--)
          localas.rvz = Math.min(localas.rvz, ((n)localas.list.get(i)).field_createTime);
      }
      if (localas.list.isEmpty())
        localas.rvz = 0;
      localas.rgi = paramInt1;
      localas.rgh = paramInt2;
      ab.d("MicroMsg.SnsphotoAdapter", "reallyCount " + paramInt1 + " icount " + paramInt2 + " stTime " + localas.rvy + " edTIme " + localas.rvz);
      localas.notifyDataSetChanged();
      AppMethodBeat.o(39200);
    }
  }

  public final void ctL()
  {
    AppMethodBeat.i(39201);
    this.rvF.notifyDataSetChanged();
    AppMethodBeat.o(39201);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.as.1
 * JD-Core Version:    0.6.2
 */