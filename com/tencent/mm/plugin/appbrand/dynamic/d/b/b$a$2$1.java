package com.tencent.mm.plugin.appbrand.dynamic.d.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg;
import com.tencent.mm.sdk.platformtools.ab;

final class b$a$2$1
  implements Runnable
{
  b$a$2$1(b.a.2 param2, DrawCanvasArg paramDrawCanvasArg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10886);
    ab.v("DrawCanvasRunnable", "running release");
    if (this.hnJ != null)
      this.hnJ.reset();
    AppMethodBeat.o(10886);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.b.b.a.2.1
 * JD-Core Version:    0.6.2
 */