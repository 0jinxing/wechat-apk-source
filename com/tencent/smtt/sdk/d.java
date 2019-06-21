package com.tencent.smtt.sdk;

import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsError;

class d
  implements ValueCallback<IX5JsError>
{
  d(JsContext paramJsContext)
  {
  }

  public void a(IX5JsError paramIX5JsError)
  {
    AppMethodBeat.i(63911);
    JsContext.a(this.a).handleException(this.a, new JsError(paramIX5JsError));
    AppMethodBeat.o(63911);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.d
 * JD-Core Version:    0.6.2
 */