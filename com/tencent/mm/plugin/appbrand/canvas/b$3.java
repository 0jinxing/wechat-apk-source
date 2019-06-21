package com.tencent.mm.plugin.appbrand.canvas;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg;
import com.tencent.mm.plugin.appbrand.canvas.widget.a.a;
import org.json.JSONArray;

final class b$3
  implements Runnable
{
  b$3(b paramb, JSONArray paramJSONArray, a.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(103142);
    DrawCanvasArg localDrawCanvasArg = this.hcy.hch;
    this.hcy.hch = null;
    this.hcy.hcg = this.hcz;
    this.hcy.hcw = true;
    this.hcy.hcf = true;
    if (this.hcA != null)
      this.hcA.a(localDrawCanvasArg);
    b.a(this.hcy);
    AppMethodBeat.o(103142);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.b.3
 * JD-Core Version:    0.6.2
 */