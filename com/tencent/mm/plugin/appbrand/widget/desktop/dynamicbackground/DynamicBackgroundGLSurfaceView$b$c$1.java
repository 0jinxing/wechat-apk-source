package com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class DynamicBackgroundGLSurfaceView$b$c$1
  implements Runnable
{
  DynamicBackgroundGLSurfaceView$b$c$1(DynamicBackgroundGLSurfaceView.b.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135227);
    GameGLSurfaceView localGameGLSurfaceView = DynamicBackgroundGLSurfaceView.b.b(this.iZy.iZw);
    if (localGameGLSurfaceView != null)
      localGameGLSurfaceView.onPause();
    localGameGLSurfaceView = DynamicBackgroundGLSurfaceView.b.b(this.iZy.iZw);
    if (localGameGLSurfaceView != null)
    {
      localGameGLSurfaceView.setVisibility(4);
      AppMethodBeat.o(135227);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135227);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.DynamicBackgroundGLSurfaceView.b.c.1
 * JD-Core Version:    0.6.2
 */