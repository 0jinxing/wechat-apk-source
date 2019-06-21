package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.os.Bundle;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.widget.n.a;
import com.tencent.mm.sdk.platformtools.ab;

final class ad$1$1$1
  implements n.a
{
  ad$1$1$1(ad.1.1 param1)
  {
  }

  public final void f(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(6332);
    ab.i("MicroMsg.JsApiLogin", "onRevMsg resultCode %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
      ab.i("MicroMsg.JsApiLogin", "press back button!");
      this.ukm.ukl.mUf.a("auth_cancel", null);
      AppMethodBeat.o(6332);
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      ad.a(this.ukm.ukl.ukj, this.ukm.ukl.val$appId, paramBundle, this.ukm.ukk, paramInt, this.ukm.ukl.mUf);
      if (paramInt != 2)
        break;
      ab.e("MicroMsg.JsApiLogin", "fail auth deny!");
      this.ukm.ukl.mUf.a("auth_deny", null);
      AppMethodBeat.o(6332);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ad.1.1.1
 * JD-Core Version:    0.6.2
 */