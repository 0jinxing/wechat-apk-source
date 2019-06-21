package com.tencent.mm.plugin.luckymoney.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.k;
import com.tencent.mm.api.t.a;
import com.tencent.mm.sdk.platformtools.ab;

final class LuckyMoneyNewYearSendUI$7
  implements t.a
{
  LuckyMoneyNewYearSendUI$7(LuckyMoneyNewYearSendUI paramLuckyMoneyNewYearSendUI)
  {
  }

  public final void a(k paramk)
  {
    AppMethodBeat.i(42814);
    ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "[onSelectedEmoji] emojiInfo:%s", new Object[] { paramk });
    LuckyMoneyNewYearSendUI.a(this.ogn, paramk);
    LuckyMoneyNewYearSendUI.a(this.ogn);
    AppMethodBeat.o(42814);
  }

  public final void onHide()
  {
    AppMethodBeat.i(138549);
    LuckyMoneyNewYearSendUI.a(this.ogn);
    AppMethodBeat.o(138549);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI.7
 * JD-Core Version:    0.6.2
 */