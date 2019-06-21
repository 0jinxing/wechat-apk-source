package com.bumptech.glide.manager;

import android.content.Context;
import android.support.v4.content.b;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f
  implements d
{
  public final c a(Context paramContext, c.a parama)
  {
    AppMethodBeat.i(92383);
    int i;
    if (b.checkSelfPermission(paramContext, "android.permission.ACCESS_NETWORK_STATE") == 0)
    {
      i = 1;
      Log.isLoggable("ConnectivityMonitor", 3);
      if (i == 0)
        break label49;
      paramContext = new e(paramContext, parama);
      AppMethodBeat.o(92383);
    }
    while (true)
    {
      return paramContext;
      i = 0;
      break;
      label49: paramContext = new j();
      AppMethodBeat.o(92383);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.manager.f
 * JD-Core Version:    0.6.2
 */