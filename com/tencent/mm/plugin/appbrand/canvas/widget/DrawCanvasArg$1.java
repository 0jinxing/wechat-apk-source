package com.tencent.mm.plugin.appbrand.canvas.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class DrawCanvasArg$1
  implements Runnable
{
  public DrawCanvasArg$1(DrawCanvasArg paramDrawCanvasArg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(103700);
    DrawCanvasArg.a(this.hee, DrawCanvasArg.b(this.hee));
    DrawCanvasArg.c(this.hee);
    DrawCanvasArg.d(this.hee);
    if (DrawCanvasArg.e(this.hee))
      DrawCanvasArg.f(this.hee);
    ab.i("DrawCanvasArg", "async parse success");
    AppMethodBeat.o(103700);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg.1
 * JD-Core Version:    0.6.2
 */