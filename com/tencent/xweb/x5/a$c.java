package com.tencent.xweb.x5;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.xweb.h;

public final class a$c
  implements JsResult
{
  public h AQn;

  public a$c(h paramh)
  {
    this.AQn = paramh;
  }

  public final void cancel()
  {
    AppMethodBeat.i(84780);
    this.AQn.cancel();
    AppMethodBeat.o(84780);
  }

  public final void confirm()
  {
    AppMethodBeat.i(84779);
    this.AQn.confirm();
    AppMethodBeat.o(84779);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.a.c
 * JD-Core Version:    0.6.2
 */