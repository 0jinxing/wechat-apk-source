package com.tencent.mm.compatible.e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

public final class y
{
  private static y eud = null;

  public static int Me()
  {
    AppMethodBeat.i(93018);
    NetworkInfo localNetworkInfo = ((ConnectivityManager)ah.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
    int i;
    if (localNetworkInfo == null)
    {
      AppMethodBeat.o(93018);
      i = 0;
    }
    while (true)
    {
      return i;
      i = localNetworkInfo.getSubtype();
      if (localNetworkInfo.getType() == 1)
      {
        AppMethodBeat.o(93018);
        i = 1;
      }
      else
      {
        switch (i)
        {
        case 8:
        case 9:
        case 10:
        case 16:
        default:
          AppMethodBeat.o(93018);
          i = 0;
          break;
        case 13:
        case 14:
        case 15:
          i = 4;
          AppMethodBeat.o(93018);
          break;
        case 3:
        case 4:
        case 5:
        case 6:
        case 12:
        case 17:
          i = 3;
          AppMethodBeat.o(93018);
          break;
        case 1:
        case 2:
        case 7:
        case 11:
          i = 2;
          AppMethodBeat.o(93018);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.e.y
 * JD-Core Version:    0.6.2
 */