package com.tencent.mm.plugin.luckymoney.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.a.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.g;

final class LuckyMoneyPrepareUI$19
  implements g
{
  LuckyMoneyPrepareUI$19(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI)
  {
  }

  public final void aQ(int paramInt, String paramString)
  {
    AppMethodBeat.i(42962);
    ab.i("MicroMsg.LuckyMoneyPrepareUI", "onSceneEnd() scene:NetScenePrepareLuckyMoney JumpRemind:onNext()");
    if ((bo.gW(paramInt, 2)) && (bo.isEqual(paramString, "requestwxhb")))
    {
      LuckyMoneyPrepareUI.x(this.ohI);
      AppMethodBeat.o(42962);
    }
    while (true)
    {
      return;
      if (bo.gW(paramInt, 1))
        a.b(this.ohI, paramString, 0, true);
      AppMethodBeat.o(42962);
    }
  }

  public final void onCancel()
  {
    AppMethodBeat.i(42963);
    ab.i("MicroMsg.LuckyMoneyPrepareUI", "onSceneEnd() scene:NetScenePrepareLuckyMoney JumpRemind:onCancel()");
    AppMethodBeat.o(42963);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.19
 * JD-Core Version:    0.6.2
 */