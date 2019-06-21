package com.tencent.mm.plugin.appbrand.dynamic.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.appbrand.canvas.widget.MTextureView;

final class b$2
  implements com.tencent.mm.plugin.appbrand.canvas.c.a
{
  b$2(MTextureView paramMTextureView)
  {
  }

  public final void aj(float paramFloat)
  {
    AppMethodBeat.i(11092);
    b.b(()paramFloat, 2, this.hpB.getTraceId());
    AppMethodBeat.o(11092);
  }

  public final void ak(float paramFloat)
  {
    AppMethodBeat.i(11093);
    b.b(()paramFloat, 3, this.hpB.getTraceId());
    AppMethodBeat.o(11093);
  }

  public final void ays()
  {
    AppMethodBeat.i(11094);
    u.pp(this.hpB.getTraceId());
    AppMethodBeat.o(11094);
  }

  public final void b(long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(11091);
    com.tencent.mm.plugin.appbrand.widget.g.a.c(1, paramLong1, paramLong2, paramInt);
    AppMethodBeat.o(11091);
  }

  public final void gk(long paramLong)
  {
    AppMethodBeat.i(11089);
    com.tencent.mm.plugin.appbrand.widget.g.a.A(682, paramLong);
    AppMethodBeat.o(11089);
  }

  public final void gl(long paramLong)
  {
    AppMethodBeat.i(11090);
    com.tencent.mm.plugin.appbrand.widget.g.a.B(683, paramLong);
    AppMethodBeat.o(11090);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.widget.b.2
 * JD-Core Version:    0.6.2
 */