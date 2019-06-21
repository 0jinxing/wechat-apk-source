package com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class GLSurfaceView$j
{
  private static String TAG = "GLThreadManager";

  public final void b(GLSurfaceView.i parami)
  {
    try
    {
      AppMethodBeat.i(133993);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("exiting tid=");
      ab.i("GLThread", parami.getId());
      GLSurfaceView.i.a(parami);
      notifyAll();
      AppMethodBeat.o(133993);
      return;
    }
    finally
    {
      parami = finally;
    }
    throw parami;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.GLSurfaceView.j
 * JD-Core Version:    0.6.2
 */