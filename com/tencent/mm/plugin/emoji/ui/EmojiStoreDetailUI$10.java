package com.tencent.mm.plugin.emoji.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.f.g;

final class EmojiStoreDetailUI$10
  implements DialogInterface.OnClickListener
{
  EmojiStoreDetailUI$10(EmojiStoreDetailUI paramEmojiStoreDetailUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(53428);
    EmojiStoreDetailUI.a(this.lbG, new g(EmojiStoreDetailUI.a(this.lbG), EmojiStoreDetailUI.y(this.lbG), EmojiStoreDetailUI.z(this.lbG)));
    EmojiStoreDetailUI.A(this.lbG);
    EmojiStoreDetailUI.a(this.lbG, 6);
    EmojiStoreDetailUI.g(this.lbG);
    AppMethodBeat.o(53428);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI.10
 * JD-Core Version:    0.6.2
 */