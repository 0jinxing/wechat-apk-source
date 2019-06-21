package com.tencent.mm.plugin.report.service;

import com.tencent.mars.smc.IDKey;
import com.tencent.mars.smc.SmcLogic;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.report.b.a;
import com.tencent.mm.protocal.protobuf.ate;
import com.tencent.mm.protocal.protobuf.bdf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class e
{
  private static boolean pWV;
  private static Map<Long, Long> pXT;
  private static a pXU;
  private static int pXV;
  private static boolean pXW;

  static
  {
    AppMethodBeat.i(72728);
    pXU = new a();
    pXV = -1;
    pXW = false;
    pWV = false;
    AppMethodBeat.o(72728);
  }

  public static void a(long paramLong1, long paramLong2, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(72722);
    if (paramBoolean2);
    while (true)
    {
      try
      {
        SmcLogic.writeImportKvDataWithType(paramLong1, paramLong2, paramString, paramBoolean1, paramBoolean3);
        if (pWV)
          j.cgu().t(paramLong1, paramString);
        AppMethodBeat.o(72722);
        return;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.KVEasyReport", "localReport :%s", new Object[] { bo.l(localException) });
        continue;
      }
      try
      {
        SmcLogic.writeKvDataWithType(paramLong1, paramLong2, paramString, paramBoolean1, paramBoolean3);
      }
      catch (Throwable localThrowable)
      {
        ab.printErrStackTrace("MicroMsg.KVEasyReport", localThrowable, "", new Object[0]);
        if (d.fP(20))
        {
          SmcLogic.writeKvDataWithType(paramLong1, paramLong2, paramString, paramBoolean1, paramBoolean3);
          continue;
        }
        AppMethodBeat.o(72722);
        throw localThrowable;
      }
    }
  }

  public static void a(long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(72721);
    if (paramBoolean2);
    while (true)
    {
      try
      {
        SmcLogic.writeImportKvData(paramLong, paramString, paramBoolean1, paramBoolean3);
        if (pWV)
          j.cgu().t(paramLong, paramString);
        AppMethodBeat.o(72721);
        return;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.KVEasyReport", "localReport :%s", new Object[] { bo.l(localException) });
        continue;
      }
      try
      {
        SmcLogic.writeKvData(paramLong, paramString, paramBoolean1, paramBoolean3);
      }
      catch (Throwable localThrowable)
      {
        ab.printErrStackTrace("MicroMsg.KVEasyReport", localThrowable, "", new Object[0]);
        if (d.fP(20))
        {
          SmcLogic.writeKvData(paramLong, paramString, paramBoolean1, paramBoolean3);
          continue;
        }
        AppMethodBeat.o(72721);
        throw localThrowable;
      }
    }
  }

  public static void a(long paramLong, byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(72723);
    if (paramBoolean2);
    while (true)
    {
      try
      {
        SmcLogic.writeImportKvPbData(paramLong, paramArrayOfByte, paramBoolean1);
        AppMethodBeat.o(72723);
        return;
      }
      catch (Exception paramArrayOfByte)
      {
        ab.e("MicroMsg.KVEasyReport", "localReport :%s", new Object[] { bo.l(paramArrayOfByte) });
        AppMethodBeat.o(72723);
        continue;
      }
      SmcLogic.writeKvPbData(paramLong, paramArrayOfByte, paramBoolean1);
      AppMethodBeat.o(72723);
    }
  }

  public static void b(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
  {
    AppMethodBeat.i(72724);
    while (true)
    {
      int i;
      label16: int j;
      if (e.class.getClassLoader() == null)
      {
        i = -1;
        if (Thread.currentThread().getContextClassLoader() != null)
          break label129;
        j = -1;
        ab.i("MicroMsg.KVEasyReport", "SmcLogic.reportIDKey class loader %s, %s ", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      }
      try
      {
        SmcLogic.reportIDKey(paramLong1, paramLong2, paramLong3, paramBoolean);
        if (pXW)
        {
          if (pXT == null)
            cgp();
          long l = bo.a((Long)pXT.get(Long.valueOf(paramLong1)), 0L);
          paramLong1 = l;
          if (l > 0L)
            continue;
        }
        AppMethodBeat.o(72724);
        return;
        i = e.class.getClassLoader().hashCode();
        break label16;
        label129: j = Thread.currentThread().getContextClassLoader().hashCode();
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.KVEasyReport", localThrowable, "", new Object[0]);
          if (!d.fP(20))
            break;
          SmcLogic.reportIDKey(paramLong1, paramLong2, paramLong3, paramBoolean);
        }
        AppMethodBeat.o(72724);
        throw localThrowable;
      }
    }
  }

  public static void cgp()
  {
    try
    {
      AppMethodBeat.i(72727);
      if (pXT == null)
      {
        localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>(20);
        pXT = (Map)localObject1;
      }
      Object localObject1 = a.cgh();
      if ((localObject1 != null) && (((ate)localObject1).wxc != pXV))
      {
        pXV = ((ate)localObject1).wxc;
        pXT.clear();
        localObject1 = ((ate)localObject1).wxd;
        if (localObject1 != null)
        {
          Iterator localIterator = ((LinkedList)localObject1).iterator();
          while (localIterator.hasNext())
          {
            bdf localbdf = (bdf)localIterator.next();
            Map localMap = pXT;
            Long localLong = new java/lang/Long;
            localLong.<init>(localbdf.wHk);
            localObject1 = new java/lang/Long;
            ((Long)localObject1).<init>(localbdf.wHl);
            localMap.put(localLong, localObject1);
          }
        }
      }
    }
    finally
    {
    }
    ab.i("MicroMsg.KVEasyReport", "summerhv reloadHeavyUserIDMap heavyUserIDMap[%d][%d][%s], stack[%s]", new Object[] { Integer.valueOf(pXV), Integer.valueOf(pXT.size()), pXT, bo.dpG() });
    AppMethodBeat.o(72727);
  }

  public static void d(ArrayList<IDKey> paramArrayList, boolean paramBoolean)
  {
    AppMethodBeat.i(72725);
    if (paramArrayList != null);
    while (true)
    {
      try
      {
        SmcLogic.reportListIDKey((IDKey[])paramArrayList.toArray(new IDKey[paramArrayList.size()]), paramBoolean);
        AppMethodBeat.o(72725);
        return;
      }
      catch (Throwable localThrowable)
      {
        ab.printErrStackTrace("MicroMsg.KVEasyReport", localThrowable, "", new Object[0]);
        if (d.fP(20))
        {
          SmcLogic.reportListIDKey((IDKey[])paramArrayList.toArray(new IDKey[paramArrayList.size()]), paramBoolean);
          AppMethodBeat.o(72725);
          continue;
        }
        AppMethodBeat.o(72725);
        throw localThrowable;
      }
      AppMethodBeat.o(72725);
    }
  }

  public static void kh(boolean paramBoolean)
  {
    pWV = paramBoolean;
  }

  public static void ki(boolean paramBoolean)
  {
    AppMethodBeat.i(72726);
    ab.i("MicroMsg.KVEasyReport", "summerhv setHeavyUser [%b %b], stack[%s]", new Object[] { Boolean.valueOf(pXW), Boolean.valueOf(paramBoolean), bo.dpG() });
    pXW = paramBoolean;
    AppMethodBeat.o(72726);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.service.e
 * JD-Core Version:    0.6.2
 */