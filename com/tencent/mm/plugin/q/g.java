package com.tencent.mm.plugin.q;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.e;

public final class g
{
  public static String bQX()
  {
    AppMethodBeat.i(22916);
    Object localObject = new StringBuilder();
    aw.ZK();
    localObject = c.Rt() + "msgsynchronize/syncFile/";
    AppMethodBeat.o(22916);
    return localObject;
  }

  public static String bQY()
  {
    AppMethodBeat.i(22917);
    Object localObject = new StringBuilder();
    aw.ZK();
    localObject = c.Rt() + "msgsynchronize/";
    AppMethodBeat.o(22917);
    return localObject;
  }

  public static String bQZ()
  {
    AppMethodBeat.i(22918);
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      aw.ZK();
      localObject = c.Rt() + "msgsynchronize.zip";
      b localb = new com/tencent/mm/vfs/b;
      localb.<init>((String)localObject);
      if (!localb.exists())
        localb.createNewFile();
      AppMethodBeat.o(22918);
      return localObject;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MsgSynchronizeUtil", localException, "", new Object[0]);
        String str = "";
        AppMethodBeat.o(22918);
      }
    }
  }

  public static void f(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(22919);
    if ((TextUtils.isEmpty(paramString1)) || (paramArrayOfByte == null))
    {
      ab.e("MicroMsg.MsgSynchronizeUtil", "appendFile dir:%s fileName:%s ", new Object[] { paramString1, paramString2 });
      AppMethodBeat.o(22919);
    }
    while (true)
    {
      return;
      int j;
      for (int i = 3; ; i = j)
      {
        j = i - 1;
        if (i <= 0)
          break label185;
        long l1 = com.tencent.mm.plugin.backup.b.g.EY(paramString1 + paramString2);
        i = g(paramString1, paramString2, paramArrayOfByte);
        long l2 = com.tencent.mm.plugin.backup.b.g.EY(paramString1 + paramString2);
        if ((i == 0) && (l2 >= paramArrayOfByte.length))
        {
          AppMethodBeat.o(22919);
          break;
        }
        ab.e("MicroMsg.MsgSynchronizeUtil", "appendFile retry:%d append:%d  old:%d  new:%d  data:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(paramArrayOfByte.length) });
      }
      label185: AppMethodBeat.o(22919);
    }
  }

  private static int g(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(22920);
    try
    {
      Object localObject = new com/tencent/mm/vfs/b;
      ((b)localObject).<init>(paramString1);
      if (!((b)localObject).exists())
        ((b)localObject).mkdirs();
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      paramString2 = paramString1 + "/" + paramString2;
      paramString1 = new com/tencent/mm/vfs/b;
      paramString1.<init>(paramString2);
      if (!paramString1.exists())
        paramString1.createNewFile();
      i = e.a(paramString2, paramArrayOfByte, paramArrayOfByte.length);
      AppMethodBeat.o(22920);
      return i;
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MsgSynchronizeUtil", paramString1, "", new Object[0]);
        int i = -1;
        AppMethodBeat.o(22920);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.q.g
 * JD-Core Version:    0.6.2
 */