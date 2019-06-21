package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.a.d;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.concurrent.FutureTask;

final class af$1
  implements d
{
  af$1(af paramaf, FutureTask paramFutureTask)
  {
  }

  public final void a(Runnable paramRunnable, int paramInt)
  {
    AppMethodBeat.i(131949);
    if (this.iio == paramRunnable)
      this.iip.iil = bo.anU();
    AppMethodBeat.o(131949);
  }

  public final void b(Runnable paramRunnable, int paramInt)
  {
    AppMethodBeat.i(131950);
    if (this.iio == paramRunnable)
    {
      this.iip.iim = bo.anU();
      this.iip.iin = (this.iip.iim - this.iip.iil);
    }
    AppMethodBeat.o(131950);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.af.1
 * JD-Core Version:    0.6.2
 */