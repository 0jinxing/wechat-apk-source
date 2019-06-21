package com.tencent.mm.plugin.luckymoney.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.k;
import com.tencent.mm.api.t.a;
import com.tencent.mm.sdk.platformtools.ab;

final class LuckyMoneyDetailUI$11
  implements t.a
{
  LuckyMoneyDetailUI$11(LuckyMoneyDetailUI paramLuckyMoneyDetailUI)
  {
  }

  public final void a(k paramk)
  {
    AppMethodBeat.i(42657);
    ab.i("MicroMsg.LuckyMoneyDetailUI", "[onSelectedEmoji] emojiInfo:%s", new Object[] { paramk });
    LuckyMoneyDetailUI.a(this.oeA, paramk.Aq());
    LuckyMoneyDetailUI.B(this.oeA);
    LuckyMoneyDetailUI.s(this.oeA);
    AppMethodBeat.o(42657);
  }

  public final void onHide()
  {
    AppMethodBeat.i(138548);
    LuckyMoneyDetailUI.s(this.oeA);
    AppMethodBeat.o(138548);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.11
 * JD-Core Version:    0.6.2
 */