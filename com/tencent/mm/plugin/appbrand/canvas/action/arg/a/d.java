package com.tencent.mm.plugin.appbrand.canvas.action.arg.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionWrapper;
import com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg;
import com.tencent.mm.sdk.c;

public final class d
{
  private static d hdB;
  public c<DrawActionWrapper> hdA;
  public c<DrawCanvasArg> hdz;

  static
  {
    AppMethodBeat.i(103637);
    hdB = new d();
    AppMethodBeat.o(103637);
  }

  private d()
  {
    AppMethodBeat.i(103636);
    this.hdz = new c(5);
    this.hdA = new c(500);
    AppMethodBeat.o(103636);
  }

  public static d ayk()
  {
    return hdB;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.a.d
 * JD-Core Version:    0.6.2
 */