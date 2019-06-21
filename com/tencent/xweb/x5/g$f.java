package com.tencent.xweb.x5;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.xweb.h;

public final class g$f extends h
{
  public JsResult AQz;

  public g$f(JsResult paramJsResult)
  {
    this.AQz = paramJsResult;
  }

  public final void cancel()
  {
    AppMethodBeat.i(84831);
    this.AQz.cancel();
    AppMethodBeat.o(84831);
  }

  public final void confirm()
  {
    AppMethodBeat.i(84830);
    this.AQz.confirm();
    AppMethodBeat.o(84830);
  }

  public final void confirmWithResult(String paramString)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.g.f
 * JD-Core Version:    0.6.2
 */