package com.tencent.mm.plugin.honey_pay.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.wallet_core.c.p.a;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;

final class HoneyPayCheckPwdUI$12
  implements p.a
{
  HoneyPayCheckPwdUI$12(HoneyPayCheckPwdUI paramHoneyPayCheckPwdUI)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41845);
    if (HoneyPayCheckPwdUI.e(this.nse) != null)
      HoneyPayCheckPwdUI.e(this.nse).cey();
    h.pYm.k(875L, 3L, 1L);
    AppMethodBeat.o(41845);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI.12
 * JD-Core Version:    0.6.2
 */