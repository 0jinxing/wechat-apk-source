package com.tencent.mm.plugin.appbrand.dynamic.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.appbrand.canvas.widget.MDrawableView;

final class b$5
  implements com.tencent.mm.plugin.appbrand.canvas.c.a
{
  b$5(MDrawableView paramMDrawableView)
  {
  }

  public final void aj(float paramFloat)
  {
    AppMethodBeat.i(11110);
    b.b(()paramFloat, 2, this.hpE.getTraceId());
    AppMethodBeat.o(11110);
  }

  public final void ak(float paramFloat)
  {
    AppMethodBeat.i(11111);
    b.b(()paramFloat, 3, this.hpE.getTraceId());
    AppMethodBeat.o(11111);
  }

  public final void ays()
  {
    AppMethodBeat.i(11112);
    u.pp(this.hpE.getTraceId());
    AppMethodBeat.o(11112);
  }

  public final void b(long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(11109);
    com.tencent.mm.plugin.appbrand.widget.g.a.c(4, paramLong1, paramLong2, paramInt);
    AppMethodBeat.o(11109);
  }

  public final void gk(long paramLong)
  {
    AppMethodBeat.i(11107);
    com.tencent.mm.plugin.appbrand.widget.g.a.A(667, paramLong);
    AppMethodBeat.o(11107);
  }

  public final void gl(long paramLong)
  {
    AppMethodBeat.i(11108);
    com.tencent.mm.plugin.appbrand.widget.g.a.B(668, paramLong);
    AppMethodBeat.o(11108);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.widget.b.5
 * JD-Core Version:    0.6.2
 */