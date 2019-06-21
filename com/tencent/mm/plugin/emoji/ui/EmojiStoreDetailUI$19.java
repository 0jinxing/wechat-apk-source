package com.tencent.mm.plugin.emoji.ui;

import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class EmojiStoreDetailUI$19 extends ak
{
  EmojiStoreDetailUI$19(EmojiStoreDetailUI paramEmojiStoreDetailUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(53436);
    switch (paramMessage.what)
    {
    default:
      ab.w("MicroMsg.emoji.EmojiStoreDetailUI", "unknow message, cannt handle.");
      AppMethodBeat.o(53436);
    case 1001:
    case 1002:
    case 1003:
    case 1004:
    case 1005:
    case 1006:
    case 1007:
    }
    while (true)
    {
      return;
      EmojiStoreDetailUI.e(this.lbG);
      AppMethodBeat.o(53436);
      continue;
      EmojiStoreDetailUI.f(this.lbG);
      AppMethodBeat.o(53436);
      continue;
      EmojiStoreDetailUI.g(this.lbG);
      AppMethodBeat.o(53436);
      continue;
      if (EmojiStoreDetailUI.h(this.lbG).getVisibility() == 0)
      {
        EmojiStoreDetailUI.h(this.lbG).setVisibility(8);
        EmojiStoreDetailUI.i(this.lbG).setVisibility(0);
        EmojiStoreDetailUI.j(this.lbG).setVisibility(0);
      }
      EmojiStoreDetailUI.l(this.lbG).setProgress(EmojiStoreDetailUI.k(this.lbG));
      AppMethodBeat.o(53436);
      continue;
      EmojiStoreDetailUI.m(this.lbG).scrollTo(0, 0);
      AppMethodBeat.o(53436);
      continue;
      EmojiStoreDetailUI.n(this.lbG);
      AppMethodBeat.o(53436);
      continue;
      this.lbG.blH();
      AppMethodBeat.o(53436);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI.19
 * JD-Core Version:    0.6.2
 */