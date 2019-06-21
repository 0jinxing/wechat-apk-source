package com.tencent.mm.plugin.appbrand.ui.recommend;

import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.h.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.anl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
{
  public static void a(long paramLong, anl paramanl)
  {
    AppMethodBeat.i(138150);
    int i;
    ArrayList localArrayList;
    if ((paramanl == null) || (paramanl.wsl == null))
    {
      i = 0;
      b.i("MicroMsg.Recommend.AppBrandRecommendIdkeyReport", "doReportCgiGet costTime:%d, list size:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(i) });
      IDKey localIDKey = new IDKey();
      localIDKey.SetID(1043);
      localIDKey.SetKey(0);
      localIDKey.SetValue(1L);
      localArrayList = new ArrayList();
      localArrayList.add(localIDKey);
      if (paramanl != null)
        break label223;
      paramanl = new IDKey();
      paramanl.SetID(1043);
      paramanl.SetKey(1);
      paramanl.SetValue(1L);
      localArrayList.add(paramanl);
    }
    while (true)
    {
      paramanl = new IDKey();
      paramanl.SetID(1043);
      paramanl.SetKey(5);
      paramanl.SetValue(1L);
      localArrayList.add(paramanl);
      paramanl = new IDKey();
      paramanl.SetID(1043);
      paramanl.SetKey(gt(paramLong));
      paramanl.SetValue(1L);
      localArrayList.add(paramanl);
      h.pYm.b(localArrayList, true);
      r(localArrayList);
      AppMethodBeat.o(138150);
      return;
      i = paramanl.wsl.size();
      break;
      label223: if ((paramanl.wsl == null) || (paramanl.wsl.size() == 0))
      {
        paramanl = new IDKey();
        paramanl.SetID(1043);
        paramanl.SetKey(2);
        paramanl.SetValue(1L);
        localArrayList.add(paramanl);
      }
      else
      {
        paramanl = new IDKey();
        paramanl.SetID(1043);
        paramanl.SetKey(3);
        paramanl.SetValue(1L);
        localArrayList.add(paramanl);
      }
    }
  }

  private static int gt(long paramLong)
  {
    int i;
    if (paramLong <= 1L)
      i = 6;
    while (true)
    {
      return i;
      if ((1L < paramLong) && (paramLong <= 3L))
        i = 7;
      else if ((3L < paramLong) && (paramLong <= 5L))
        i = 8;
      else if ((5L < paramLong) && (paramLong <= 10L))
        i = 9;
      else if ((10L < paramLong) && (paramLong <= 20L))
        i = 10;
      else
        i = 11;
    }
  }

  public static void pX(int paramInt)
  {
    AppMethodBeat.i(138151);
    b.i("MicroMsg.Recommend.AppBrandRecommendIdkeyReport", "doReportDataSource");
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(1043);
    localIDKey.SetKey(18);
    localIDKey.SetValue(1L);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localIDKey);
    localIDKey = new IDKey();
    localIDKey.SetID(1043);
    if (paramInt == 1)
      localIDKey.SetKey(19);
    while (true)
    {
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
      h.pYm.b(localArrayList, true);
      r(localArrayList);
      AppMethodBeat.o(138151);
      return;
      localIDKey.SetKey(20);
    }
  }

  private static void r(ArrayList<IDKey> paramArrayList)
  {
    AppMethodBeat.i(138152);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("idkeyGroupStat:  id:1043");
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      IDKey localIDKey = (IDKey)paramArrayList.next();
      localStringBuilder.append(", key:" + localIDKey.GetKey() + " value:" + localIDKey.GetValue());
    }
    b.i("MicroMsg.Recommend.AppBrandRecommendIdkeyReport", localStringBuilder.toString());
    AppMethodBeat.o(138152);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.e
 * JD-Core Version:    0.6.2
 */