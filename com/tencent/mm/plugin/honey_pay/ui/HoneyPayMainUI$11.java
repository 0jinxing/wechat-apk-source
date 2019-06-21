package com.tencent.mm.plugin.honey_pay.ui;

import android.view.View;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.honey_pay.a.f;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.ath;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.p.a;
import java.util.LinkedList;

final class HoneyPayMainUI$11
  implements p.a
{
  HoneyPayMainUI$11(HoneyPayMainUI paramHoneyPayMainUI, f paramf)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41891);
    HoneyPayMainUI.b(this.nsB);
    this.nsB.mController.removeAllOptionMenu();
    if ((this.nsG.nqC.wxk == null) || (this.nsG.nqC.wxk.isEmpty()))
    {
      ab.i(this.nsB.TAG, "empty card");
      HoneyPayMainUI.a(this.nsB, this.nsG.nqC.wxl);
      HoneyPayMainUI.c(this.nsB).setVisibility(8);
      this.nsB.nqT = 2131690691;
      this.nsB.setMMTitle("");
      HoneyPayMainUI.a(this.nsB, this.nsG.nqC.wxo);
      this.nsB.bFY();
      this.nsB.findViewById(2131824915).setBackgroundResource(this.nsB.nqT);
      c.b(this.nsB, this.nsG.nqC.wxm, null, 0, null);
      this.nsB.findViewById(2131824926).setVisibility(8);
      h.pYm.k(875L, 0L, 1L);
      AppMethodBeat.o(41891);
      return;
    }
    HoneyPayMainUI.d(this.nsB);
    HoneyPayMainUI.a(this.nsB, this.nsG.nqC.wxk);
    ab.i(this.nsB.TAG, "show open card: %s", new Object[] { Boolean.valueOf(this.nsG.nqC.wxn) });
    if (this.nsG.nqC.wxn)
      HoneyPayMainUI.c(this.nsB).setVisibility(0);
    while (true)
    {
      this.nsB.nqT = 2131690166;
      this.nsB.setMMTitle(2131300563);
      break;
      HoneyPayMainUI.c(this.nsB).setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI.11
 * JD-Core Version:    0.6.2
 */