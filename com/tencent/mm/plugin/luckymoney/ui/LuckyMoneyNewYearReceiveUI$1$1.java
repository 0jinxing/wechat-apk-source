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

final class LuckyMoneyNewYearReceiveUI$1$1
  implements Runnable
{
  LuckyMoneyNewYearReceiveUI$1$1(LuckyMoneyNewYearReceiveUI.1 param1, EmojiInfo paramEmojiInfo, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42783);
    if ((this.oeD != null) && (LuckyMoneyNewYearReceiveUI.a(this.ofF.ofE) != null) && (LuckyMoneyNewYearReceiveUI.a(this.ofF.ofE).Aq().equals(this.oeD.Aq())))
      if (this.ejK)
      {
        ab.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "somethings success.");
        LuckyMoneyNewYearReceiveUI.a(this.ofF.ofE, j.getEmojiStorageMgr().xYn.aqi(LuckyMoneyNewYearReceiveUI.a(this.ofF.ofE).Aq()));
        LuckyMoneyNewYearReceiveUI.b(this.ofF.ofE).setVisibility(8);
        LuckyMoneyNewYearReceiveUI.c(this.ofF.ofE).setVisibility(0);
        LuckyMoneyNewYearReceiveUI.c(this.ofF.ofE).setEmojiInfo(LuckyMoneyNewYearReceiveUI.a(this.ofF.ofE));
        AppMethodBeat.o(42783);
      }
    while (true)
    {
      return;
      ab.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "somethings error.");
      LuckyMoneyNewYearReceiveUI.b(this.ofF.ofE).setVisibility(8);
      LuckyMoneyNewYearReceiveUI.d(this.ofF.ofE).setVisibility(0);
      AppMethodBeat.o(42783);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI.1.1
 * JD-Core Version:    0.6.2
 */