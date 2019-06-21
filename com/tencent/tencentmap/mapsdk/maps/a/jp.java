package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.w;

public class jp
{
  private static int a = 0;

  public static int a()
  {
    try
    {
      int i = a;
      return i;
    }
    finally
    {
    }
  }

  public static void a(Context paramContext)
  {
    AppMethodBeat.i(100088);
    try
    {
      a = w.a(paramContext).b("handDrawMapVer");
      return;
    }
    finally
    {
      AppMethodBeat.o(100088);
    }
    throw paramContext;
  }

  public static void a(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(100089);
    try
    {
      a = paramInt;
      w.a(paramContext).a("handDrawMapVer", paramInt);
      return;
    }
    finally
    {
      AppMethodBeat.o(100089);
    }
    throw paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jp
 * JD-Core Version:    0.6.2
 */