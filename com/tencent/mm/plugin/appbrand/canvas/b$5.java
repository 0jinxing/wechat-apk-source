package com.tencent.mm.plugin.appbrand.canvas;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg;
import com.tencent.mm.plugin.appbrand.canvas.widget.a.a;

final class b$5
  implements Runnable
{
  b$5(b paramb, DrawCanvasArg paramDrawCanvasArg, a.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(103144);
    DrawCanvasArg localDrawCanvasArg = this.hcy.hch;
    this.hcy.hch = this.hcB;
    this.hcy.hcf = true;
    this.hcy.hcw = false;
    if (this.hcA != null)
      this.hcA.a(localDrawCanvasArg);
    b.a(this.hcy);
    AppMethodBeat.o(103144);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.b.5
 * JD-Core Version:    0.6.2
 */