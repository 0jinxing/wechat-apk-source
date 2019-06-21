package com.tinkerboots.sdk.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private static ConnectivityManager AUg = null;

  public static boolean isConnected(Context paramContext)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(65552);
    if (AUg == null)
      AUg = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (AUg == null)
    {
      AppMethodBeat.o(65552);
      bool1 = bool2;
    }
    while (true)
    {
      return bool1;
      paramContext = AUg.getActiveNetworkInfo();
      if (paramContext != null);
      try
      {
        bool2 = paramContext.isConnected();
        if (bool2);
        for (bool1 = true; ; bool1 = false)
        {
          label64: AppMethodBeat.o(65552);
          break;
        }
      }
      catch (Exception paramContext)
      {
        break label64;
      }
    }
  }

  public static boolean isWifi(Context paramContext)
  {
    AppMethodBeat.i(65553);
    if (AUg == null)
      AUg = (ConnectivityManager)paramContext.getSystemService("connectivity");
    boolean bool;
    if (AUg == null)
    {
      AppMethodBeat.o(65553);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramContext = AUg.getActiveNetworkInfo();
      if ((paramContext != null) && (paramContext.getType() == 1))
      {
        AppMethodBeat.o(65553);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(65553);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tinkerboots.sdk.b.a
 * JD-Core Version:    0.6.2
 */