package com.tencent.xweb.x5;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.xweb.j;

public final class g$a
  implements j
{
  SslErrorHandler AQv;

  public g$a(SslErrorHandler paramSslErrorHandler)
  {
    this.AQv = paramSslErrorHandler;
  }

  public final void cancel()
  {
    AppMethodBeat.i(84823);
    this.AQv.cancel();
    AppMethodBeat.o(84823);
  }

  public final void proceed()
  {
    AppMethodBeat.i(84822);
    this.AQv.proceed();
    AppMethodBeat.o(84822);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.g.a
 * JD-Core Version:    0.6.2
 */