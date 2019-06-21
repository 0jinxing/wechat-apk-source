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

final class LuckyMoneyNotHookReceiveUI$1$1$1
  implements Runnable
{
  LuckyMoneyNotHookReceiveUI$1$1$1(LuckyMoneyNotHookReceiveUI.1.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42848);
    if ((this.ogz.oeD != null) && (LuckyMoneyNotHookReceiveUI.a(this.ogz.ogy.ogx) != null) && (LuckyMoneyNotHookReceiveUI.a(this.ogz.ogy.ogx).Aq().equals(this.ogz.oeD.Aq())))
      if (this.ogz.ejK)
      {
        ab.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "somethings success.");
        LuckyMoneyNotHookReceiveUI.a(this.ogz.ogy.ogx, j.getEmojiStorageMgr().xYn.aqi(LuckyMoneyNotHookReceiveUI.a(this.ogz.ogy.ogx).Aq()));
        LuckyMoneyNotHookReceiveUI.b(this.ogz.ogy.ogx).setVisibility(8);
        LuckyMoneyNotHookReceiveUI.c(this.ogz.ogy.ogx).setVisibility(0);
        LuckyMoneyNotHookReceiveUI.a(this.ogz.ogy.ogx, 3);
        LuckyMoneyNotHookReceiveUI.b(this.ogz.ogy.ogx, LuckyMoneyNotHookReceiveUI.a(this.ogz.ogy.ogx));
        AppMethodBeat.o(42848);
      }
    while (true)
    {
      return;
      ab.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "somethings error.");
      LuckyMoneyNotHookReceiveUI.b(this.ogz.ogy.ogx).setVisibility(8);
      LuckyMoneyNotHookReceiveUI.d(this.ogz.ogy.ogx).setVisibility(0);
      LuckyMoneyNotHookReceiveUI.a(this.ogz.ogy.ogx, 1);
      AppMethodBeat.o(42848);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI.1.1.1
 * JD-Core Version:    0.6.2
 */