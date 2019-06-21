package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class z
{
  public static NetworkInfo a(Context paramContext)
  {
    AppMethodBeat.i(101244);
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((paramContext != null) && (paramContext.isConnected()))
      AppMethodBeat.o(101244);
    while (true)
    {
      return paramContext;
      paramContext = null;
      AppMethodBeat.o(101244);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.z
 * JD-Core Version:    0.6.2
 */