package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.pluginsdk.wallet.g;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

public class n extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    AppMethodBeat.i(6309);
    ab.i("MicroMsg.JsApiGetBrandWCPayRequest", "invokeInOwn");
    MMActivity localMMActivity = (MMActivity)((d)parama.bOZ).mContext;
    g localg = new g(parama.bPa.bOf);
    parama = new n.1(this, parama);
    h.a(localMMActivity, localg, hashCode() & 0xFFFF, parama);
    AppMethodBeat.o(6309);
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "getBrandWCPayRequest";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.n
 * JD-Core Version:    0.6.2
 */