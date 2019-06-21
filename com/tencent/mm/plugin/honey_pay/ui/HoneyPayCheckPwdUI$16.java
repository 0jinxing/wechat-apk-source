package com.tencent.mm.plugin.honey_pay.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class HoneyPayCheckPwdUI$16
  implements p.a
{
  HoneyPayCheckPwdUI$16(HoneyPayCheckPwdUI paramHoneyPayCheckPwdUI, com.tencent.mm.plugin.honey_pay.a.h paramh)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41849);
    ab.i("MicroMsg.HoneyPayCheckPwdUI", "modify success");
    paramString = new Intent();
    paramString.putExtra("key_modify_create_line_succ", true);
    paramString.putExtra("key_credit_line", this.nsj.nqF);
    this.nse.setResult(-1, paramString);
    this.nse.finish();
    com.tencent.mm.plugin.report.service.h.pYm.k(875L, 8L, 1L);
    AppMethodBeat.o(41849);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI.16
 * JD-Core Version:    0.6.2
 */