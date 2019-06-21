package com.tencent.mm.plugin.luckymoney.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.atb;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class LuckyMoneyPickEnvelopeUI$6
  implements MenuItem.OnMenuItemClickListener
{
  LuckyMoneyPickEnvelopeUI$6(LuckyMoneyPickEnvelopeUI paramLuckyMoneyPickEnvelopeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(42906);
    ab.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "click save: %s", new Object[] { Integer.valueOf(LuckyMoneyPickEnvelopeUI.a(this.ogX)) });
    if ((LuckyMoneyPickEnvelopeUI.a(this.ogX) >= 0) && (LuckyMoneyPickEnvelopeUI.a(this.ogX) < LuckyMoneyPickEnvelopeUI.b(this.ogX).size()))
    {
      paramMenuItem = (LuckyMoneyPickEnvelopeUI.b)LuckyMoneyPickEnvelopeUI.b(this.ogX).get(LuckyMoneyPickEnvelopeUI.a(this.ogX));
      if ((!paramMenuItem.kfW) || (paramMenuItem.nZq == null));
    }
    for (paramMenuItem = paramMenuItem.nZq.materialId; ; paramMenuItem = "0")
    {
      LuckyMoneyPickEnvelopeUI.a(this.ogX, paramMenuItem);
      h.pYm.e(16822, new Object[] { Integer.valueOf(3) });
      AppMethodBeat.o(42906);
      return false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.6
 * JD-Core Version:    0.6.2
 */