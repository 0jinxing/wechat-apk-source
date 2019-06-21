package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;

class JsApiLuggageStartSoterAuthentication$1 extends ResultReceiver
{
  JsApiLuggageStartSoterAuthentication$1(b paramb, Handler paramHandler, c paramc, int paramInt)
  {
    super(paramHandler);
  }

  protected void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(73792);
    if (paramInt == -1)
    {
      ab.i("MicroMsg.JsApiLuggageStartSoterAuthentication", "hy: soter auth ok");
      localb = this.hDp;
      localc = this.hxc;
      paramInt = this.eIl;
      if (paramBundle != null);
      while (true)
      {
        b.a(localb, localc, paramInt, paramBundle, "ok");
        AppMethodBeat.o(73792);
        return;
        paramBundle = null;
      }
    }
    if (paramInt == 1)
    {
      ab.w("MicroMsg.JsApiLuggageStartSoterAuthentication", "hy: soter auth failed");
      localb = this.hDp;
      localc = this.hxc;
      paramInt = this.eIl;
      if (paramBundle != null);
      while (true)
      {
        b.a(localb, localc, paramInt, paramBundle, "fail");
        AppMethodBeat.o(73792);
        break;
        paramBundle = null;
      }
    }
    ab.e("MicroMsg.JsApiLuggageStartSoterAuthentication", "hy: soter user cancelled");
    b localb = this.hDp;
    c localc = this.hxc;
    paramInt = this.eIl;
    if (paramBundle != null);
    while (true)
    {
      b.a(localb, localc, paramInt, paramBundle, "cancel");
      AppMethodBeat.o(73792);
      break;
      paramBundle = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiLuggageStartSoterAuthentication.1
 * JD-Core Version:    0.6.2
 */