package com.tencent.smtt.sdk;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;

class aa
  implements ValueCallback<Uri>
{
  aa(SystemWebChromeClient paramSystemWebChromeClient, android.webkit.ValueCallback paramValueCallback)
  {
  }

  public void a(Uri paramUri)
  {
    AppMethodBeat.i(64152);
    this.a.onReceiveValue(paramUri);
    AppMethodBeat.o(64152);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.aa
 * JD-Core Version:    0.6.2
 */