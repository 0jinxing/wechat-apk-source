package com.tencent.smtt.sdk;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;

class t
  implements ValueCallback<Uri[]>
{
  t(q paramq, android.webkit.ValueCallback paramValueCallback)
  {
  }

  public void a(Uri[] paramArrayOfUri)
  {
    AppMethodBeat.i(64083);
    this.a.onReceiveValue(paramArrayOfUri);
    AppMethodBeat.o(64083);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.t
 * JD-Core Version:    0.6.2
 */