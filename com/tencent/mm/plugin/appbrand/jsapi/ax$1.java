package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity.a;

final class ax$1
  implements MMActivity.a
{
  ax$1(ax paramax, c paramc, int paramInt)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(130516);
    if (paramInt1 != (this.hyg.hashCode() & 0xFFFF))
    {
      AppMethodBeat.o(130516);
      return;
    }
    if (paramIntent != null)
    {
      paramIntent = paramIntent.getStringExtra("key_callback");
      ab.i("MicroMsg.JsApiOpenOfflinePayView", "callback: %s", new Object[] { paramIntent });
      this.hxc.M(this.eIl, this.hyg.j(paramIntent, null));
      h.pYm.e(14954, new Object[] { f.dlI(), "openOfflinePayView:ok" });
    }
    while (true)
    {
      if (!f.dlH())
        f.dlJ();
      AppMethodBeat.o(130516);
      break;
      this.hxc.M(this.eIl, this.hyg.j("fail", null));
      if (!f.dlH())
        h.pYm.e(14954, new Object[] { f.dlI(), "openOfflinePayView:fail" });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.ax.1
 * JD-Core Version:    0.6.2
 */