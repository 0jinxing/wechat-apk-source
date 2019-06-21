package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.ui.MMActivity.a;

final class bc$1
  implements MMActivity.a
{
  bc$1(bc parambc, Context paramContext, c paramc, int paramInt)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(130522);
    if (paramInt1 != (this.hyo.hashCode() & 0xFFFF))
    {
      AppMethodBeat.o(130522);
      return;
    }
    if (paramInt2 == -1)
    {
      paramIntent = new Intent();
      paramIntent.putExtra("key_mode", 1);
      d.b(this.hym, "wallet", ".balance.ui.lqt.WalletLqtPlanAddUI", paramIntent);
      this.hxc.M(this.eIl, this.hyo.j("ok", null));
    }
    while (true)
    {
      if (!f.dlH())
        f.dlJ();
      AppMethodBeat.o(130522);
      break;
      this.hxc.M(this.eIl, this.hyo.j("fail", null));
      if (!f.dlH())
        h.pYm.e(14954, new Object[] { f.dlI(), "openWCPayLQTDepositPlanAdd:fail" });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bc.1
 * JD-Core Version:    0.6.2
 */