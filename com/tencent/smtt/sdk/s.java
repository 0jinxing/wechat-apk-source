package com.tencent.smtt.sdk;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;

class s
  implements ValueCallback<Uri>
{
  s(q paramq, android.webkit.ValueCallback paramValueCallback)
  {
  }

  public void a(Uri paramUri)
  {
    AppMethodBeat.i(64081);
    this.a.onReceiveValue(new Uri[] { paramUri });
    AppMethodBeat.o(64081);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.s
 * JD-Core Version:    0.6.2
 */