package com.tencent.smtt.sdk;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;

class ab
  implements ValueCallback<Uri[]>
{
  ab(SystemWebChromeClient paramSystemWebChromeClient, android.webkit.ValueCallback paramValueCallback)
  {
  }

  public void a(Uri[] paramArrayOfUri)
  {
    AppMethodBeat.i(64154);
    this.a.onReceiveValue(paramArrayOfUri);
    AppMethodBeat.o(64154);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ab
 * JD-Core Version:    0.6.2
 */