package com.tencent.mm.plugin.appbrand.jsapi.b;

import a.f.b.j;
import a.l;
import com.tencent.luggage.g.d;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.f.d;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "onForeground"})
final class g$d
  implements f.d
{
  g$d(MBRuntime paramMBRuntime, com.tencent.magicbrush.b paramb)
  {
  }

  public final void wU()
  {
    AppMethodBeat.i(134667);
    d.i("JsApiInsertHTMLCanvasElement", "foreground");
    com.tencent.magicbrush.c.b localb = this.hHI.getMBRuntimeView();
    if ((localb != null) && (j.j(localb, this.hHJ.getTextureView())))
    {
      d.i("JsApiInsertHTMLCanvasElement", "foreground, really");
      this.hHJ.yx();
    }
    AppMethodBeat.o(134667);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.b.g.d
 * JD-Core Version:    0.6.2
 */