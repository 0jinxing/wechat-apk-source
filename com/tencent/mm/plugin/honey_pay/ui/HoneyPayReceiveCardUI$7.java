package com.tencent.mm.plugin.honey_pay.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.honey_pay.a.e;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.ajs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class HoneyPayReceiveCardUI$7
  implements p.a
{
  HoneyPayReceiveCardUI$7(HoneyPayReceiveCardUI paramHoneyPayReceiveCardUI, e parame)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41939);
    if (this.ntd.nqB.vYe != null)
    {
      ab.i(this.ntc.TAG, "do real name");
      paramString = new Bundle();
      paramString.putString("realname_verify_process_jump_activity", ".ui.HoneyPayReceiveCardUI");
      c.a(this.ntc, paramString, this.ntd.nqB.vYe, false);
    }
    h.pYm.k(875L, 5L, 1L);
    AppMethodBeat.o(41939);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI.7
 * JD-Core Version:    0.6.2
 */