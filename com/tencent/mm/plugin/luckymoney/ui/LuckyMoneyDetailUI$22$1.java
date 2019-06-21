package com.tencent.mm.plugin.luckymoney.ui;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.view.BaseEmojiView;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;

final class LuckyMoneyDetailUI$22$1
  implements Runnable
{
  LuckyMoneyDetailUI$22$1(LuckyMoneyDetailUI.22 param22, EmojiInfo paramEmojiInfo, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42671);
    if ((this.oeD != null) && (LuckyMoneyDetailUI.m(this.oeE.oeA) != null) && (LuckyMoneyDetailUI.m(this.oeE.oeA).Aq().equals(this.oeD.Aq())))
      if (this.ejK)
      {
        ab.i("MicroMsg.LuckyMoneyDetailUI", "somethings success.");
        LuckyMoneyDetailUI.a(this.oeE.oeA, j.getEmojiStorageMgr().xYn.aqi(LuckyMoneyDetailUI.m(this.oeE.oeA).Aq()));
        LuckyMoneyDetailUI.n(this.oeE.oeA).setVisibility(8);
        LuckyMoneyDetailUI.o(this.oeE.oeA).setVisibility(0);
        LuckyMoneyDetailUI.b(this.oeE.oeA, LuckyMoneyDetailUI.m(this.oeE.oeA));
        AppMethodBeat.o(42671);
      }
    while (true)
    {
      return;
      ab.i("MicroMsg.LuckyMoneyDetailUI", "somethings error.");
      LuckyMoneyDetailUI.n(this.oeE.oeA).setVisibility(8);
      LuckyMoneyDetailUI.p(this.oeE.oeA).setVisibility(0);
      AppMethodBeat.o(42671);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.22.1
 * JD-Core Version:    0.6.2
 */