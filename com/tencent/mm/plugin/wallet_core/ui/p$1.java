package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.a;

final class p$1
  implements EditHintPasswdView.a
{
  p$1(p paramp)
  {
  }

  public final void hY(boolean paramBoolean)
  {
    AppMethodBeat.i(47554);
    if (paramBoolean)
    {
      this.tKg.cRO();
      h.pYm.e(11977, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
    }
    AppMethodBeat.o(47554);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.p.1
 * JD-Core Version:    0.6.2
 */