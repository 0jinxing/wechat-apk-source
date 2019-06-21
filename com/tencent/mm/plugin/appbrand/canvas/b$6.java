package com.tencent.mm.plugin.appbrand.canvas;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg;
import com.tencent.mm.plugin.appbrand.canvas.widget.a.a;
import java.util.List;

final class b$6
  implements Runnable
{
  b$6(b paramb, DrawCanvasArg paramDrawCanvasArg, a.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(103145);
    if (this.hcy.hch == null)
      AppMethodBeat.o(103145);
    while (true)
    {
      return;
      this.hcy.hch.hdv.addAll(this.hcB.hdv);
      this.hcy.hcf = true;
      this.hcy.hcw = false;
      if (this.hcA != null)
        this.hcA.a(null);
      AppMethodBeat.o(103145);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.b.6
 * JD-Core Version:    0.6.2
 */