package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class gn
{
  private static String[] a = new String[0];

  public static boolean a()
  {
    boolean bool = false;
    AppMethodBeat.i(99386);
    String str = Build.MODEL;
    int i = a.length;
    int j = 0;
    if (j < i)
      if (str.equalsIgnoreCase(a[j]))
      {
        bool = true;
        AppMethodBeat.o(99386);
      }
    while (true)
    {
      return bool;
      j++;
      break;
      AppMethodBeat.o(99386);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gn
 * JD-Core Version:    0.6.2
 */