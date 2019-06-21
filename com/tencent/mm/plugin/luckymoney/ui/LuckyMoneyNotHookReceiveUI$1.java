package com.tencent.mm.plugin.luckymoney.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.model.d.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.emotion.EmojiInfo;

final class LuckyMoneyNotHookReceiveUI$1
  implements d.a
{
  LuckyMoneyNotHookReceiveUI$1(LuckyMoneyNotHookReceiveUI paramLuckyMoneyNotHookReceiveUI)
  {
  }

  public final void a(final boolean paramBoolean, final EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(42850);
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(42849);
        al.d(new LuckyMoneyNotHookReceiveUI.1.1.1(this));
        AppMethodBeat.o(42849);
      }
    });
    AppMethodBeat.o(42850);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI.1
 * JD-Core Version:    0.6.2
 */