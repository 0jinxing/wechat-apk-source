package com.tencent.mm.bq;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
{
  private static final Map<Integer, Integer> vwL;

  static
  {
    AppMethodBeat.i(28267);
    vwL = new HashMap();
    AppMethodBeat.o(28267);
  }

  public static void Lu(int paramInt)
  {
    AppMethodBeat.i(28264);
    int i = bo.h((Integer)vwL.get(Integer.valueOf(paramInt)));
    vwL.put(Integer.valueOf(paramInt), Integer.valueOf(i + 1));
    AppMethodBeat.o(28264);
  }

  public static void akz(String paramString)
  {
    AppMethodBeat.i(28266);
    String str = paramString + dlM();
    Iterator localIterator = vwL.entrySet().iterator();
    paramString = new StringBuilder();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if ((localEntry != null) && (localEntry.getKey() != null) && (localEntry.getValue() != null) && (((Integer)localEntry.getValue()).intValue() != 0))
      {
        paramString.append(localEntry.getKey());
        paramString.append('=');
        paramString.append(localEntry.getValue());
        paramString.append(',');
      }
    }
    vwL.clear();
    if (paramString.length() > 0)
    {
      ab.d("MicroMsg.PostTaskFMessageCardStat", "append fmesage card click");
      bv.s(10, paramString.toString());
    }
    ab.d("MicroMsg.PostTaskFMessageCardStat", "dkfm :".concat(String.valueOf(str + dlM())));
    try
    {
      aw.ZK();
      c.Ry().set(66819, Long.valueOf(bo.anT()));
      AppMethodBeat.o(28266);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.PostTaskFMessageCardStat", "e:" + paramString.getMessage());
        AppMethodBeat.o(28266);
      }
    }
  }

  public static String dlM()
  {
    AppMethodBeat.i(28265);
    StringBuilder localStringBuilder = new StringBuilder("[a=");
    if (aw.ZK() == null);
    for (String str = "0"; ; str = "1")
    {
      str = str + " ";
      if (aw.ZK() != null)
        break;
      AppMethodBeat.o(28265);
      return str;
    }
    localStringBuilder = new StringBuilder().append(str).append("c=");
    aw.ZK();
    if (c.Ry() == null)
    {
      str = "0";
      label89: str = str + " ";
      localStringBuilder = new StringBuilder().append(str).append("u=");
      if (!aw.RK())
        break label158;
    }
    label158: for (str = "1"; ; str = "0")
    {
      str = str + "]";
      AppMethodBeat.o(28265);
      break;
      str = "1";
      break label89;
    }
  }

  public static void run()
  {
    AppMethodBeat.i(28263);
    aw.ZK();
    if (bo.fp(bo.a((Long)c.Ry().get(66819, null), 0L)) * 1000L > 1800000L);
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        akz("");
      AppMethodBeat.o(28263);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bq.a
 * JD-Core Version:    0.6.2
 */