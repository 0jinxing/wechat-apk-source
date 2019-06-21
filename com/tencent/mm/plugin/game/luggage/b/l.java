package com.tencent.mm.plugin.game.luggage.b;

import android.content.Context;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

public class l extends bc<com.tencent.mm.plugin.game.luggage.d.e>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<com.tencent.mm.plugin.game.luggage.d.e>.a parama)
  {
    AppMethodBeat.i(135881);
    ab.i("MicroMsg.JsApiOpenGameRegion", "invoke");
    MMActivity localMMActivity = (MMActivity)((com.tencent.mm.plugin.game.luggage.d.e)parama.bOZ).mContext;
    localMMActivity.ifE = new l.1(this, parama, localMMActivity);
    d.a(localMMActivity, "game", ".ui.GameRegionSelectUI", null, hashCode() & 0xFFFF, false);
    AppMethodBeat.o(135881);
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "openGameRegion";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.b.l
 * JD-Core Version:    0.6.2
 */