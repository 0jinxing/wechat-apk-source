package com.tencent.mm.plugin.luckymoney.f2f.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.af;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.HorizontalListViewV2;
import com.tencent.mm.ui.base.HorizontalListViewV2.d;
import com.tencent.mm.ui.base.HorizontalListViewV2.d.a;
import java.util.List;

final class LuckyMoneyF2FQRCodeUI$14
  implements HorizontalListViewV2.d
{
  LuckyMoneyF2FQRCodeUI$14(LuckyMoneyF2FQRCodeUI paramLuckyMoneyF2FQRCodeUI)
  {
  }

  public final void a(HorizontalListViewV2.d.a parama)
  {
    AppMethodBeat.i(42188);
    if ((parama == HorizontalListViewV2.d.a.ytk) && (LuckyMoneyF2FQRCodeUI.a(this.nVw).size() >= 5) && (LuckyMoneyF2FQRCodeUI.a(this.nVw).size() < LuckyMoneyF2FQRCodeUI.v(this.nVw)) && (LuckyMoneyF2FQRCodeUI.w(this.nVw).getLastVisiblePosition() == LuckyMoneyF2FQRCodeUI.a(this.nVw).size() - 1) && (!bo.isNullOrNil(LuckyMoneyF2FQRCodeUI.u(this.nVw))))
    {
      parama = new af(LuckyMoneyF2FQRCodeUI.u(this.nVw), 5, LuckyMoneyF2FQRCodeUI.a(this.nVw).size(), null, "v1.0");
      this.nVw.n(parama);
    }
    AppMethodBeat.o(42188);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.14
 * JD-Core Version:    0.6.2
 */