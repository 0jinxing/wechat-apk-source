package com.tencent.xweb.xwalk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.g;
import org.xwalk.core.XWalkJavascriptResult;

public final class f$d extends g
{
  public XWalkJavascriptResult ARV;

  public f$d(XWalkJavascriptResult paramXWalkJavascriptResult)
  {
    this.ARV = paramXWalkJavascriptResult;
  }

  public final void cancel()
  {
    AppMethodBeat.i(85224);
    this.ARV.cancel();
    AppMethodBeat.o(85224);
  }

  public final void confirm()
  {
    AppMethodBeat.i(85223);
    this.ARV.confirm();
    AppMethodBeat.o(85223);
  }

  public final void confirmWithResult(String paramString)
  {
    AppMethodBeat.i(85222);
    this.ARV.confirmWithResult(paramString);
    AppMethodBeat.o(85222);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.f.d
 * JD-Core Version:    0.6.2
 */