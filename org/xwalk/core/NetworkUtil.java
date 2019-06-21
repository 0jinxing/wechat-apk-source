package org.xwalk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class NetworkUtil
{
  private static final int NON_NETWORK = 0;
  private static final int OTHER = 4;
  private static final int WIFI = 1;
  private static final int _3G = 2;
  private static final int _4G = 3;

  public static int getCurrentNetWorkStatus(Context paramContext)
  {
    AppMethodBeat.i(4191);
    int i;
    if (paramContext.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0)
    {
      AppMethodBeat.o(4191);
      i = 0;
    }
    while (true)
    {
      return i;
      paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (paramContext == null)
      {
        AppMethodBeat.o(4191);
        i = 0;
      }
      else
      {
        paramContext = paramContext.getActiveNetworkInfo();
        if (paramContext == null)
        {
          AppMethodBeat.o(4191);
          i = 0;
        }
        else if (!paramContext.isConnected())
        {
          AppMethodBeat.o(4191);
          i = 0;
        }
        else if (paramContext.getType() == 1)
        {
          AppMethodBeat.o(4191);
          i = 1;
        }
        else if (paramContext.getSubtype() >= 13)
        {
          i = 3;
          AppMethodBeat.o(4191);
        }
        else if ((paramContext.getSubtype() >= 5) && (paramContext.getSubtype() < 13))
        {
          i = 2;
          AppMethodBeat.o(4191);
        }
        else
        {
          i = 4;
          AppMethodBeat.o(4191);
        }
      }
    }
  }

  public static boolean isNetworkAvailable()
  {
    AppMethodBeat.i(4192);
    boolean bool;
    if (getCurrentNetWorkStatus(XWalkEnvironment.getApplicationContext()) == 0)
    {
      XWalkEnvironment.addXWalkInitializeLog("no network");
      bool = false;
      AppMethodBeat.o(4192);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(4192);
    }
  }

  public static boolean isWifiAvailable()
  {
    AppMethodBeat.i(4193);
    boolean bool;
    switch (getCurrentNetWorkStatus(XWalkEnvironment.getApplicationContext()))
    {
    default:
      bool = false;
      AppMethodBeat.o(4193);
    case 1:
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(4193);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     org.xwalk.core.NetworkUtil
 * JD-Core Version:    0.6.2
 */