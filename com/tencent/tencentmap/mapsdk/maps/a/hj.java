package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import com.tencent.map.lib.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class hj
{
  static final String[] a = { "txmapengine", "txnavengine" };

  public static void a(Context paramContext, String paramString)
  {
    AppMethodBeat.i(99543);
    try
    {
      System.loadLibrary(paramString);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("loadLibary:");
      d.a(paramString + "  successful");
      AppMethodBeat.o(99543);
      return;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      while (true)
      {
        boolean bool = hk.a(paramContext, paramString);
        d.a("loadLibary:" + paramString + " result:" + bool);
        AppMethodBeat.o(99543);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hj
 * JD-Core Version:    0.6.2
 */