package com.tencent.mm.plugin.appbrand.jsapi.b;

import a.f.b.j;
import a.l;
import com.tencent.luggage.g.d;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.f.f;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "onViewWillDisappear"})
final class g$f
  implements f.f
{
  g$f(MBRuntime paramMBRuntime, com.tencent.magicbrush.b paramb)
  {
  }

  public final void aCf()
  {
    AppMethodBeat.i(134669);
    d.i("JsApiInsertHTMLCanvasElement", "disappear");
    com.tencent.magicbrush.c.b localb = this.hHI.getMBRuntimeView();
    if ((localb != null) && (j.j(localb, this.hHJ.getTextureView())))
    {
      d.i("JsApiInsertHTMLCanvasElement", "disappear, really");
      this.hHI.setMBRuntimeView(null);
    }
    AppMethodBeat.o(134669);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.b.g.f
 * JD-Core Version:    0.6.2
 */