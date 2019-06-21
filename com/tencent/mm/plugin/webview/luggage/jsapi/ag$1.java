package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.os.Bundle;
import com.tencent.luggage.d.a.a;
import com.tencent.luggage.d.e;
import com.tencent.luggage.d.g;
import com.tencent.luggage.d.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;

final class ag$1
  implements Runnable
{
  ag$1(ag paramag, String paramString, a.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6341);
    Bundle localBundle = new Bundle();
    localBundle.putString("rawUrl", this.val$url);
    ((d)this.mUf.bOZ).bPe.xi().h(this.val$url, localBundle);
    AppMethodBeat.o(6341);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ag.1
 * JD-Core Version:    0.6.2
 */