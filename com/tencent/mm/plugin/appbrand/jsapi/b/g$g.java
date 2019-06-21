package com.tencent.mm.plugin.appbrand.jsapi.b;

import a.f.b.j;
import a.l;
import com.tencent.luggage.g.d;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.f.c;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "onDestroy"})
final class g$g
  implements f.c
{
  g$g(MBRuntime paramMBRuntime, com.tencent.magicbrush.b paramb)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(134670);
    d.i("JsApiInsertHTMLCanvasElement", "destroy");
    com.tencent.magicbrush.c.b localb = this.hHI.getMBRuntimeView();
    if ((localb != null) && (j.j(localb, this.hHJ.getTextureView())))
    {
      d.i("JsApiInsertHTMLCanvasElement", "destroy, really");
      this.hHI.setMBRuntimeView(null);
    }
    AppMethodBeat.o(134670);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.b.g.g
 * JD-Core Version:    0.6.2
 */