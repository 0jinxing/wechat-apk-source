package com.tencent.mm.plugin.profile.ui.newbizinfo.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.profile.ui.newbizinfo.b.b;
import com.tencent.mm.plugin.profile.ui.newbizinfo.b.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.s;
import java.util.Iterator;
import java.util.List;

public final class a
{
  public static int pqF = 0;
  public static int pqG = 1;
  public static int pqH = 2;

  private static int Bl(int paramInt)
  {
    if (paramInt == 0)
      paramInt = pqG;
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
        paramInt = pqH;
      else
        paramInt = pqF;
    }
  }

  private static void a(String paramString1, int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, int paramInt4, int paramInt5, int paramInt6, int paramInt7, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(23949);
    ab.d("MicroMsg.Kv10298", "brandUsername:%s, scene:%s, brandType:%d, dataType:%d, enterTimestamp:%d, exitTimestamp:%d isAttention:%d, originalCount:%d, fansCount:%d, bindWeappCount:%d, showArticleList:%s, showFuwuList:%s decryptUserName:%s", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5), Integer.valueOf(paramInt6), Integer.valueOf(paramInt7), paramString2, paramString3, paramString4 });
    h.pYm.e(10298, new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5), Integer.valueOf(paramInt6), Integer.valueOf(paramInt7), paramString2, paramString3, paramString4, Integer.valueOf(s.getSessionId()) });
    AppMethodBeat.o(23949);
  }

  public static void a(String paramString, int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    AppMethodBeat.i(23950);
    a(paramString, paramInt1, Bl(paramInt2), 1, paramLong, 0L, paramInt3, 0, 0, 0, "", "", "");
    AppMethodBeat.o(23950);
  }

  public static void a(String paramString1, int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, int paramInt5, int paramInt6, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(23952);
    a(paramString1, paramInt1, Bl(paramInt2), 3, paramLong, 0L, paramInt3, paramInt4, paramInt5, paramInt6, paramString2, paramString3, paramString4);
    AppMethodBeat.o(23952);
  }

  public static void a(String paramString1, int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(23951);
    a(paramString1, paramInt1, Bl(paramInt2), 2, paramLong1, paramLong2, paramInt3, paramInt4, paramInt5, paramInt6, paramString2, paramString3, paramString4);
    AppMethodBeat.o(23951);
  }

  public static String cE(List<b> paramList)
  {
    AppMethodBeat.i(23953);
    if (paramList == null)
    {
      paramList = "";
      AppMethodBeat.o(23953);
    }
    while (true)
    {
      return paramList;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("[");
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        b localb = (b)paramList.next();
        localStringBuilder.append(localb.pqz + "#" + localb.pqA + "#" + localb.pqB + ";");
      }
      localStringBuilder.append("]");
      paramList = localStringBuilder.toString();
      AppMethodBeat.o(23953);
    }
  }

  public static String cF(List<e> paramList)
  {
    AppMethodBeat.i(23954);
    if (paramList == null)
    {
      paramList = "";
      AppMethodBeat.o(23954);
    }
    while (true)
    {
      return paramList;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("[");
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (e)localIterator.next();
        localStringBuilder.append(paramList.id + "#" + paramList.key + ";");
      }
      localStringBuilder.append("]");
      paramList = localStringBuilder.toString();
      AppMethodBeat.o(23954);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.c.a
 * JD-Core Version:    0.6.2
 */