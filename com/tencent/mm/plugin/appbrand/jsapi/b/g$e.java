package com.tencent.mm.plugin.appbrand.jsapi.b;

import a.f.b.j;
import a.l;
import com.tencent.luggage.g.d;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.f.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "onBackground"})
final class g$e
  implements f.b
{
  g$e(MBRuntime paramMBRuntime, com.tencent.magicbrush.b paramb)
  {
  }

  public final void wW()
  {
    AppMethodBeat.i(134668);
    d.i("JsApiInsertHTMLCanvasElement", "background");
    com.tencent.magicbrush.c.b localb = this.hHI.getMBRuntimeView();
    if ((localb != null) && (j.j(localb, this.hHJ.getTextureView())))
    {
      d.i("JsApiInsertHTMLCanvasElement", "background, really");
      this.hHJ.yy();
    }
    AppMethodBeat.o(134668);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.b.g.e
 * JD-Core Version:    0.6.2
 */