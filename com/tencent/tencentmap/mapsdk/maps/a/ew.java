package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Build.VERSION;
import com.tencent.map.lib.gl.e;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ew
{
  public static boolean a(e parame, boolean paramBoolean)
  {
    AppMethodBeat.i(98851);
    if (Build.VERSION.SDK_INT < 11)
    {
      paramBoolean = false;
      AppMethodBeat.o(98851);
    }
    while (true)
    {
      return paramBoolean;
      parame.setPreserveEGLContextOnPause(paramBoolean);
      paramBoolean = true;
      AppMethodBeat.o(98851);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ew
 * JD-Core Version:    0.6.2
 */