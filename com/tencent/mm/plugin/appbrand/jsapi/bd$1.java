package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.ui.MMActivity.a;

final class bd$1
  implements MMActivity.a
{
  bd$1(bd parambd, Context paramContext, c paramc, int paramInt)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(130524);
    if (paramInt1 != (this.hyp.hashCode() & 0xFFFF))
    {
      AppMethodBeat.o(130524);
      return;
    }
    if (paramInt2 == -1)
    {
      new Intent().putExtra("key_account_type", 1);
      d.H(this.hym, "wallet", ".balance.ui.lqt.WalletLqtDetailUI");
      this.hxc.M(this.eIl, this.hyp.j("ok", null));
    }
    while (true)
    {
      if (!f.dlH())
        f.dlJ();
      AppMethodBeat.o(130524);
      break;
      this.hxc.M(this.eIl, this.hyp.j("fail", null));
      if (!f.dlH())
        h.pYm.e(14954, new Object[] { f.dlI(), "JsApiOpenWCPayLQTDetail:fail" });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bd.1
 * JD-Core Version:    0.6.2
 */