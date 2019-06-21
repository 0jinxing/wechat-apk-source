package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class du
{
  private static int a(NetworkInfo paramNetworkInfo)
  {
    int i = 6;
    AppMethodBeat.i(101114);
    if ((paramNetworkInfo == null) || (!paramNetworkInfo.isAvailable()))
    {
      i = 0;
      AppMethodBeat.o(101114);
    }
    while (true)
    {
      return i;
      int j = paramNetworkInfo.getType();
      if (j == 1)
      {
        i = 5;
        AppMethodBeat.o(101114);
      }
      else if (j != 0)
      {
        AppMethodBeat.o(101114);
      }
      else
      {
        paramNetworkInfo = paramNetworkInfo.getExtraInfo();
        if (StringUtil.isEmpty(paramNetworkInfo))
        {
          AppMethodBeat.o(101114);
        }
        else if (paramNetworkInfo.equalsIgnoreCase("cmwap"))
        {
          AppMethodBeat.o(101114);
          i = 1;
        }
        else if (paramNetworkInfo.equalsIgnoreCase("3gwap"))
        {
          AppMethodBeat.o(101114);
          i = 3;
        }
        else if (paramNetworkInfo.equalsIgnoreCase("uniwap"))
        {
          i = 2;
          AppMethodBeat.o(101114);
        }
        else if (paramNetworkInfo.equalsIgnoreCase("ctwap"))
        {
          i = 4;
          AppMethodBeat.o(101114);
        }
        else
        {
          AppMethodBeat.o(101114);
          i = 3;
        }
      }
    }
  }

  public static NetworkInfo a(Context paramContext)
  {
    AppMethodBeat.i(101111);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      AppMethodBeat.o(101111);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        paramContext = null;
        AppMethodBeat.o(101111);
      }
    }
  }

  public static int b(Context paramContext)
  {
    AppMethodBeat.i(101112);
    int i = a(a(paramContext));
    AppMethodBeat.o(101112);
    return i;
  }

  public static String c(Context paramContext)
  {
    AppMethodBeat.i(101113);
    int i = b(paramContext);
    paramContext = "";
    switch (i)
    {
    default:
    case 5:
    case 3:
    case 2:
    case 1:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(101113);
      return paramContext;
      paramContext = "wifi";
      continue;
      paramContext = "3gwap";
      continue;
      paramContext = "uniwap";
      continue;
      paramContext = "cmwap";
      continue;
      paramContext = "ctwap";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.du
 * JD-Core Version:    0.6.2
 */