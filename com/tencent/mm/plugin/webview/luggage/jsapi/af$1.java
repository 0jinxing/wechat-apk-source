package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.os.Bundle;
import com.tencent.luggage.d.a.a;
import com.tencent.luggage.d.e;
import com.tencent.luggage.d.g;
import com.tencent.luggage.d.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;

final class af$1
  implements Runnable
{
  af$1(af paramaf, boolean paramBoolean, a.a parama, String paramString, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6339);
    if (this.ukn)
    {
      ((d)this.mUf.bOZ).bPe.xi().i(this.val$url, this.cgJ);
      AppMethodBeat.o(6339);
    }
    while (true)
    {
      return;
      ((d)this.mUf.bOZ).bPe.xi().h(this.val$url, this.cgJ);
      AppMethodBeat.o(6339);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.af.1
 * JD-Core Version:    0.6.2
 */