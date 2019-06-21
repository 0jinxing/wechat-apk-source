package com.tencent.mm.plugin.appbrand.dynamic.d.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg;
import com.tencent.mm.plugin.appbrand.canvas.widget.a.a;

final class b$a$2
  implements a.a
{
  b$a$2(b.a parama, String paramString1, String paramString2, int paramInt)
  {
  }

  public final void a(DrawCanvasArg paramDrawCanvasArg)
  {
    AppMethodBeat.i(10887);
    if (com.tencent.mm.ipcinvoker.e.lg(this.hnL))
    {
      a.bb(this.hnG, this.hnH).F(new b.a.2.1(this, paramDrawCanvasArg));
      AppMethodBeat.o(10887);
    }
    while (true)
    {
      return;
      if (paramDrawCanvasArg != null)
        paramDrawCanvasArg.reset();
      AppMethodBeat.o(10887);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.b.b.a.2
 * JD-Core Version:    0.6.2
 */