package com.tencent.xweb.xwalk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.h;
import org.xwalk.core.XWalkJavascriptResult;

public final class f$c extends h
{
  public XWalkJavascriptResult ARV;

  public f$c(XWalkJavascriptResult paramXWalkJavascriptResult)
  {
    this.ARV = paramXWalkJavascriptResult;
  }

  public final void cancel()
  {
    AppMethodBeat.i(85221);
    this.ARV.cancel();
    AppMethodBeat.o(85221);
  }

  public final void confirm()
  {
    AppMethodBeat.i(85220);
    this.ARV.confirm();
    AppMethodBeat.o(85220);
  }

  public final void confirmWithResult(String paramString)
  {
    AppMethodBeat.i(85219);
    this.ARV.confirmWithResult(paramString);
    AppMethodBeat.o(85219);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.f.c
 * JD-Core Version:    0.6.2
 */