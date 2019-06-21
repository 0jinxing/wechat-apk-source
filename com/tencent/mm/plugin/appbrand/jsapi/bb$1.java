package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.ui.MMActivity.a;

final class bb$1
  implements MMActivity.a
{
  bb$1(bb parambb, Context paramContext, c paramc, int paramInt)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(130520);
    if (paramInt1 != (this.hyn.hashCode() & 0xFFFF))
    {
      AppMethodBeat.o(130520);
      return;
    }
    if (paramInt2 == -1)
    {
      new Intent().putExtra("key_mode", 1);
      d.H(this.hym, "wallet", ".balance.ui.lqt.WalletLqtPlanHomeUI");
      this.hxc.M(this.eIl, this.hyn.j("ok", null));
    }
    while (true)
    {
      if (!f.dlH())
        f.dlJ();
      AppMethodBeat.o(130520);
      break;
      this.hxc.M(this.eIl, this.hyn.j("fail", null));
      if (!f.dlH())
        h.pYm.e(14954, new Object[] { f.dlI(), "openWCPayLQTDepositPlan:fail" });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bb.1
 * JD-Core Version:    0.6.2
 */