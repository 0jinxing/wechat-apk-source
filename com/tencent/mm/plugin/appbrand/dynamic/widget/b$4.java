package com.tencent.mm.plugin.appbrand.dynamic.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.appbrand.canvas.widget.MCanvasView;

final class b$4
  implements com.tencent.mm.plugin.appbrand.canvas.c.a
{
  b$4(MCanvasView paramMCanvasView)
  {
  }

  public final void aj(float paramFloat)
  {
    AppMethodBeat.i(11104);
    b.b(()paramFloat, 2, this.hpD.getTraceId());
    AppMethodBeat.o(11104);
  }

  public final void ak(float paramFloat)
  {
    AppMethodBeat.i(11105);
    b.b(()paramFloat, 3, this.hpD.getTraceId());
    AppMethodBeat.o(11105);
  }

  public final void ays()
  {
    AppMethodBeat.i(11106);
    u.pp(this.hpD.getTraceId());
    AppMethodBeat.o(11106);
  }

  public final void b(long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(11103);
    com.tencent.mm.plugin.appbrand.widget.g.a.c(3, paramLong1, paramLong2, paramInt);
    AppMethodBeat.o(11103);
  }

  public final void gk(long paramLong)
  {
    AppMethodBeat.i(11101);
    com.tencent.mm.plugin.appbrand.widget.g.a.A(685, paramLong);
    AppMethodBeat.o(11101);
  }

  public final void gl(long paramLong)
  {
    AppMethodBeat.i(11102);
    com.tencent.mm.plugin.appbrand.widget.g.a.B(684, paramLong);
    AppMethodBeat.o(11102);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.widget.b.4
 * JD-Core Version:    0.6.2
 */