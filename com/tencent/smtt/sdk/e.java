package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;

class e
  implements ValueCallback<String>
{
  e(JsVirtualMachine.a parama, android.webkit.ValueCallback paramValueCallback)
  {
  }

  public void a(String paramString)
  {
    AppMethodBeat.i(63957);
    this.a.onReceiveValue(paramString);
    AppMethodBeat.o(63957);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.e
 * JD-Core Version:    0.6.2
 */