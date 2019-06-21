package com.tinkerboots.sdk.b;

import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  public static boolean jG(Context paramContext)
  {
    boolean bool = true;
    AppMethodBeat.i(65554);
    if (Build.VERSION.SDK_INT < 23)
      AppMethodBeat.o(65554);
    while (true)
    {
      return bool;
      int i;
      if (paramContext.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)
      {
        i = 1;
        label33: if (paramContext.checkSelfPermission("android.permission.INTERNET") != 0)
          break label65;
      }
      label65: for (int j = 1; ; j = 0)
      {
        if ((i == 0) || (j == 0))
          break label70;
        AppMethodBeat.o(65554);
        break;
        i = 0;
        break label33;
      }
      label70: AppMethodBeat.o(65554);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tinkerboots.sdk.b.b
 * JD-Core Version:    0.6.2
 */