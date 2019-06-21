package com.tencent.mm.protocal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class a
{
  public static int dlZ()
  {
    if (b.foreground);
    for (int i = 1; ; i = 2)
      return i;
  }

  public static int getNetType(Context paramContext)
  {
    int i = 0;
    AppMethodBeat.i(58787);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null)
      {
        AppMethodBeat.o(58787);
        return i;
      }
      int j = paramContext.getSubtype();
      i = paramContext.getType();
      if (i == 1)
        i = 1;
      while (true)
      {
        AppMethodBeat.o(58787);
        break;
        if ((j == 13) || (j == 15) || (j == 14))
          i = 4;
        else if ((j == 3) || (j == 4) || (j == 5) || (j == 6) || (j == 12))
          i = 3;
        else if ((j == 1) || (j == 2))
          i = 2;
        else
          i = 0;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.BgFgBase", "getNetType: %s", new Object[] { bo.l(paramContext) });
        i = 1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a
 * JD-Core Version:    0.6.2
 */