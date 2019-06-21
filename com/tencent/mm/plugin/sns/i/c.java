package com.tencent.mm.plugin.sns.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class c
{
  private static Map<String, c.a> qSP;
  private static volatile long qSQ;

  static
  {
    AppMethodBeat.i(36872);
    qSP = new ConcurrentHashMap();
    qSQ = 0L;
    AppMethodBeat.o(36872);
  }

  private static String YG(String paramString)
  {
    AppMethodBeat.i(36868);
    int i = paramString.indexOf('?');
    String str = paramString;
    if (i >= 0)
      str = paramString.substring(0, i);
    i = str.indexOf("://");
    paramString = str;
    if (i >= 0)
      paramString = str.substring(i + 3);
    i = paramString.indexOf('/');
    if (i >= 0)
    {
      paramString = paramString.substring(i + 1);
      AppMethodBeat.o(36868);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(36868);
    }
  }

  public static void a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    AppMethodBeat.i(36869);
    try
    {
      c.b localb = new com/tencent/mm/plugin/sns/i/c$b;
      localb.<init>((byte)0);
      localb.qSR = YG(paramString1);
      localb.mMimeType = paramString2;
      localb.mWidth = paramInt1;
      localb.mHeight = paramInt2;
      localb.qST = paramInt3;
      localb.qSU = paramLong;
      paramString1 = new java/lang/StringBuilder;
      paramString1.<init>(1024);
      paramString1.append(localb.qSR).append(',').append(localb.mMimeType).append(',').append(localb.mWidth).append(',').append(localb.mHeight).append(',').append(localb.qST).append(',').append(localb.qSU);
      paramString1 = paramString1.toString();
      ab.i("MicroMsg.SnsImgStats", "report up: ".concat(String.valueOf(paramString1)));
      h.pYm.X(13512, paramString1);
      AppMethodBeat.o(36869);
      return;
    }
    catch (Exception paramString1)
    {
      while (true)
        AppMethodBeat.o(36869);
    }
  }

  public static void a(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(36870);
    try
    {
      c.a locala = new com/tencent/mm/plugin/sns/i/c$a;
      locala.<init>((byte)0);
      locala.qSR = YG(paramString2);
      locala.qSS = paramInt1;
      locala.mMimeType = paramString3;
      locala.mWidth = paramInt2;
      locala.mHeight = paramInt3;
      locala.qST = paramInt4;
      locala.qSU = paramLong1;
      locala.qSV = paramLong2;
      qSP.put(paramString1, locala);
      AppMethodBeat.o(36870);
      return;
    }
    catch (Exception paramString1)
    {
      while (true)
        AppMethodBeat.o(36870);
    }
  }

  public static void an(String paramString, long paramLong)
  {
    AppMethodBeat.i(36871);
    try
    {
      c.a locala = (c.a)qSP.remove(paramString);
      if (locala == null);
      while (true)
      {
        return;
        locala.qSW = paramLong;
        paramString = new java/lang/StringBuilder;
        paramString.<init>(1024);
        paramString.append(locala.qSR).append(',').append(locala.qSS).append(',').append(locala.mMimeType).append(',').append(locala.mWidth).append(',').append(locala.mHeight).append(',').append(locala.qST).append(',').append(locala.qSU).append(',').append(locala.qSV).append(',').append(locala.qSW);
        paramString = paramString.toString();
        ab.i("MicroMsg.SnsImgStats", "report dl: ".concat(String.valueOf(paramString)));
        h.pYm.X(13513, paramString);
        coD();
        AppMethodBeat.o(36871);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        coD();
        AppMethodBeat.o(36871);
      }
    }
    finally
    {
      coD();
      AppMethodBeat.o(36871);
    }
    throw paramString;
  }

  private static void coD()
  {
    AppMethodBeat.i(36867);
    synchronized (qSP)
    {
      if (bo.az(qSQ) <= 120000L)
      {
        AppMethodBeat.o(36867);
        return;
      }
      qSQ = bo.yz();
      qSP.clear();
      AppMethodBeat.o(36867);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.i.c
 * JD-Core Version:    0.6.2
 */