package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;

class y
  implements ValueCallback<String[]>
{
  y(SystemWebChromeClient paramSystemWebChromeClient, android.webkit.ValueCallback paramValueCallback)
  {
  }

  public void a(String[] paramArrayOfString)
  {
    AppMethodBeat.i(64149);
    this.a.onReceiveValue(paramArrayOfString);
    AppMethodBeat.o(64149);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.y
 * JD-Core Version:    0.6.2
 */