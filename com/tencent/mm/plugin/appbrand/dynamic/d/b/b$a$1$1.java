package com.tencent.mm.plugin.appbrand.dynamic.d.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg;
import com.tencent.mm.sdk.platformtools.ab;

final class b$a$1$1
  implements Runnable
{
  b$a$1$1(b.a.1 param1, DrawCanvasArg paramDrawCanvasArg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10884);
    ab.v("DrawCanvasRunnable", "running release");
    if (this.hnJ != null)
      this.hnJ.reset();
    AppMethodBeat.o(10884);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.b.b.a.1.1
 * JD-Core Version:    0.6.2
 */