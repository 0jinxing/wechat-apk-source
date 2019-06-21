package com.tencent.mm.modelcontrol;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.e;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public final class b
{
  private static boolean H(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt1 < paramInt2)
      if ((paramInt3 < paramInt2) && (paramInt3 >= paramInt1))
        bool2 = bool1;
    while (true)
    {
      return bool2;
      bool2 = false;
      continue;
      if (paramInt3 <= 1440)
      {
        bool2 = bool1;
        if (paramInt3 >= paramInt1);
      }
      else if (paramInt3 < paramInt2)
      {
        bool2 = bool1;
        if (paramInt3 >= 0);
      }
      else
      {
        bool2 = false;
      }
    }
  }

  public static boolean W(String paramString, int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(78088);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(78088);
    while (true)
    {
      return bool1;
      try
      {
        int i = afA();
        paramString = paramString.split(";");
        for (int j = 0; ; j++)
        {
          if (j >= paramString.length)
            break label189;
          String[] arrayOfString1 = paramString[j].split("-");
          String[] arrayOfString2 = arrayOfString1[0].split(":");
          int k = bo.ank(arrayOfString2[0]);
          int m = bo.ank(arrayOfString2[1]);
          arrayOfString1 = arrayOfString1[1].split(":");
          int n = bo.ank(arrayOfString1[0]);
          boolean bool2 = H(m + k * 60, bo.ank(arrayOfString1[1]) + n * 60 + paramInt, i);
          if (bool2)
          {
            AppMethodBeat.o(78088);
            bool1 = true;
            break;
          }
        }
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.BusyTimeControlLogic", paramString, "", new Object[0]);
        ab.e("MicroMsg.BusyTimeControlLogic", "checkNeedToControl error : " + paramString.toString());
        label189: AppMethodBeat.o(78088);
      }
    }
  }

  private static int afA()
  {
    AppMethodBeat.i(78089);
    String[] arrayOfString = new SimpleDateFormat("HH:mm").format(new Date()).split(":");
    int i = bo.ank(arrayOfString[0]);
    int j = bo.ank(arrayOfString[1]) + i * 60 - ((int)afB() - 8) * 60;
    if (j < 0)
      i = j + 1440;
    while (true)
    {
      AppMethodBeat.o(78089);
      return i;
      i = j;
      if (j >= 1440)
        i = j - 1440;
    }
  }

  public static long afB()
  {
    AppMethodBeat.i(78090);
    long l = (int)(TimeZone.getDefault().getRawOffset() / 60000L) / 60L;
    AppMethodBeat.o(78090);
    return l;
  }

  public static boolean afz()
  {
    AppMethodBeat.i(78086);
    String str = ((a)g.K(a.class)).Nu().getValue("C2CImgNotAutoDownloadTimeRange");
    ab.i("MicroMsg.BusyTimeControlLogic", "C2CImgNotAutoDownloadTimeRange value: ".concat(String.valueOf(str)));
    boolean bool = rR(str);
    AppMethodBeat.o(78086);
    return bool;
  }

  public static boolean rR(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(78087);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(78087);
    while (true)
    {
      return bool1;
      try
      {
        int i = afA();
        paramString = paramString.split(";");
        for (int j = 0; ; j++)
        {
          if (j >= paramString.length)
            break label184;
          String[] arrayOfString1 = paramString[j].split("-");
          String[] arrayOfString2 = arrayOfString1[0].split(":");
          int k = bo.ank(arrayOfString2[0]);
          int m = bo.ank(arrayOfString2[1]);
          arrayOfString1 = arrayOfString1[1].split(":");
          int n = bo.ank(arrayOfString1[0]);
          boolean bool2 = H(m + k * 60, bo.ank(arrayOfString1[1]) + n * 60, i);
          if (bool2)
          {
            AppMethodBeat.o(78087);
            bool1 = true;
            break;
          }
        }
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.BusyTimeControlLogic", paramString, "", new Object[0]);
        ab.e("MicroMsg.BusyTimeControlLogic", "checkNeedToControl error : " + paramString.toString());
        label184: AppMethodBeat.o(78087);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelcontrol.b
 * JD-Core Version:    0.6.2
 */