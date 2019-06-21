package com.tencent.mm.plugin.appbrand.dynamic.widget;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.appbrand.canvas.widget.MSurfaceView;

final class b$3
  implements com.tencent.mm.plugin.appbrand.canvas.c.a
{
  b$3(MSurfaceView paramMSurfaceView)
  {
  }

  public final void aj(float paramFloat)
  {
    AppMethodBeat.i(11098);
    b.b(()paramFloat, 2, this.hpC.getTraceId());
    AppMethodBeat.o(11098);
  }

  public final void ak(float paramFloat)
  {
    AppMethodBeat.i(11099);
    b.b(()paramFloat, 3, this.hpC.getTraceId());
    AppMethodBeat.o(11099);
  }

  public final void ays()
  {
    AppMethodBeat.i(11100);
    if (TextUtils.isEmpty(this.hpC.getTraceId()))
    {
      u.i("MicroMsg.WidgetDrawableViewFactory", "traceId is null return", new Object[0]);
      AppMethodBeat.o(11100);
    }
    while (true)
    {
      return;
      u.pp(this.hpC.getTraceId());
      AppMethodBeat.o(11100);
    }
  }

  public final void b(long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(11097);
    com.tencent.mm.plugin.appbrand.widget.g.a.c(2, paramLong1, paramLong2, paramInt);
    AppMethodBeat.o(11097);
  }

  public final void gk(long paramLong)
  {
    AppMethodBeat.i(11095);
    com.tencent.mm.plugin.appbrand.widget.g.a.A(667, paramLong);
    AppMethodBeat.o(11095);
  }

  public final void gl(long paramLong)
  {
    AppMethodBeat.i(11096);
    com.tencent.mm.plugin.appbrand.widget.g.a.B(668, paramLong);
    AppMethodBeat.o(11096);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.widget.b.3
 * JD-Core Version:    0.6.2
 */