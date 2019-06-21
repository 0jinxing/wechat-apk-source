package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity.a;

final class be$1
  implements MMActivity.a
{
  be$1(be parambe, Context paramContext, c paramc, int paramInt)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(130526);
    ab.d("MicroMsg.JsApiOpenWCPayLQTSave", "activity result: %s, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == (this.hyq.hashCode() & 0xFFFF))
      if (paramInt2 == -1)
      {
        paramIntent = new Intent();
        d.b(this.hym, "wallet", ".balance.ui.lqt.WalletLqtBeforeSaveUI", paramIntent, this.hyq.hashCode() & 0xFFFE);
        this.hxc.M(this.eIl, this.hyq.j("ok", null));
        if (f.dlH())
          break label253;
        f.dlJ();
        AppMethodBeat.o(130526);
      }
    while (true)
    {
      return;
      this.hxc.M(this.eIl, this.hyq.j("fail", null));
      if (f.dlH())
        break;
      h.pYm.e(14954, new Object[] { f.dlI(), "JsApiOpenWCPayLQTSave:fail" });
      break;
      if (paramInt1 != (this.hyq.hashCode() & 0xFFFE))
      {
        ab.d("MicroMsg.JsApiOpenWCPayLQTSave", "beforeSave callback");
        if (paramInt2 == -1)
        {
          this.hxc.M(this.eIl, this.hyq.j("ok", null));
          AppMethodBeat.o(130526);
        }
        else
        {
          this.hxc.M(this.eIl, this.hyq.j("fail", null));
        }
      }
      else
      {
        label253: AppMethodBeat.o(130526);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.be.1
 * JD-Core Version:    0.6.2
 */