package com.tencent.xweb.x5;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;
import com.tencent.xweb.g;

public final class g$g extends g
{
  public JsPromptResult AQA;

  public g$g(JsPromptResult paramJsPromptResult)
  {
    this.AQA = paramJsPromptResult;
  }

  public final void cancel()
  {
    AppMethodBeat.i(84833);
    this.AQA.cancel();
    AppMethodBeat.o(84833);
  }

  public final void confirm()
  {
    AppMethodBeat.i(84832);
    this.AQA.confirm();
    AppMethodBeat.o(84832);
  }

  public final void confirmWithResult(String paramString)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.g.g
 * JD-Core Version:    0.6.2
 */