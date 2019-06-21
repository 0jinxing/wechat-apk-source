package com.tencent.mm.network;

import com.tencent.mars.magicbox.IPxxLogic.ICallBack;
import com.tencent.mars.mm.MMLogic;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class p
  implements IPxxLogic.ICallBack
{
  private static long gcN = 0L;
  private static int gcO = 0;
  private final String TAG = "IPxxCallback";

  private static void my(int paramInt)
  {
    AppMethodBeat.i(58535);
    try
    {
      aa.ano().mz(paramInt);
      AppMethodBeat.o(58535);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("IPxxCallback", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(58535);
      }
    }
  }

  public final String getCrashFilePath(int paramInt)
  {
    AppMethodBeat.i(58530);
    Object localObject = new Date(System.currentTimeMillis() - paramInt * 86400000L);
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMdd");
    localObject = com.tencent.mm.compatible.util.e.eSo + "crash_" + localSimpleDateFormat.format((Date)localObject) + ".txt";
    if (com.tencent.mm.a.e.ct((String)localObject))
      AppMethodBeat.o(58530);
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(58530);
    }
  }

  public final String getUplodLogExtrasInfo()
  {
    AppMethodBeat.i(58528);
    try
    {
      Object localObject1 = new java/lang/StringBuffer;
      ((StringBuffer)localObject1).<init>();
      ((StringBuffer)localObject1).append("Device:").append(d.vxj).append(" ").append(d.vxk).append("\n");
      localObject1 = ((StringBuffer)localObject1).toString();
      AppMethodBeat.o(58528);
      return localObject1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject2 = null;
        AppMethodBeat.o(58528);
      }
    }
  }

  public final void recoverLinkAddrs()
  {
    AppMethodBeat.i(58531);
    MMLogic.recoverLinkAddrs();
    AppMethodBeat.o(58531);
  }

  public final void setNewDnsDebugHostInfo(String paramString, int paramInt)
  {
    AppMethodBeat.i(58529);
    MMLogic.setNewDnsDebugHost(paramString, String.valueOf(paramInt));
    AppMethodBeat.o(58529);
  }

  public final void uploadLogFail()
  {
    AppMethodBeat.i(58533);
    gcO = 0;
    my(-1);
    AppMethodBeat.o(58533);
  }

  public final void uploadLogResponse(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(58532);
    ab.i("IPxxCallback", "ipxx progress totalSize:%d uploadSize:%d lastPercent:%d ", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(gcO) });
    long l = bo.anT();
    if (l - 1L < gcN)
      AppMethodBeat.o(58532);
    while (true)
    {
      return;
      gcN = l;
      int i = 0;
      int j = i;
      if (paramLong2 >= 0L)
      {
        j = i;
        if (paramLong1 > 0L)
        {
          j = i;
          if (paramLong2 < paramLong1)
            j = (int)(100L * paramLong2 / paramLong1);
        }
      }
      i = j;
      if (j > 100)
        i = 100;
      j = i;
      if (gcO > i)
        j = gcO;
      gcO = j;
      my(j);
      AppMethodBeat.o(58532);
    }
  }

  public final void uploadLogSuccess()
  {
    AppMethodBeat.i(58534);
    gcO = 0;
    my(100);
    AppMethodBeat.o(58534);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.p
 * JD-Core Version:    0.6.2
 */