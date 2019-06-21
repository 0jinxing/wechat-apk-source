package com.tencent.xweb.x5;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.JsContext;
import com.tencent.smtt.sdk.JsContext.ExceptionHandler;
import com.tencent.smtt.sdk.JsError;
import com.tencent.xweb.f;
import org.xwalk.core.Log;

final class h$2
  implements JsContext.ExceptionHandler
{
  h$2(h paramh)
  {
  }

  public final void handleException(JsContext paramJsContext, JsError paramJsError)
  {
    AppMethodBeat.i(84836);
    if (paramJsError == null)
    {
      Log.i("MicroMsg.X5V8JsRuntime", "jsError is null.");
      AppMethodBeat.o(84836);
    }
    while (true)
    {
      return;
      paramJsContext = paramJsError.getMessage();
      Log.e("MicroMsg.X5V8JsRuntime", String.format("handleException(%s)", new Object[] { paramJsContext }));
      if (this.AQE.AQD != null)
        this.AQE.AQD.C(paramJsContext, "");
      AppMethodBeat.o(84836);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.h.2
 * JD-Core Version:    0.6.2
 */