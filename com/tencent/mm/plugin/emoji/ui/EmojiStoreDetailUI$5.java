package com.tencent.mm.plugin.emoji.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;

final class EmojiStoreDetailUI$5
  implements DialogInterface.OnCancelListener
{
  EmojiStoreDetailUI$5(EmojiStoreDetailUI paramEmojiStoreDetailUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(53424);
    g.RO().eJo.c(EmojiStoreDetailUI.o(this.lbG));
    EmojiStoreDetailUI.p(this.lbG).setText(2131299115);
    EmojiStoreDetailUI.q(this.lbG);
    AppMethodBeat.o(53424);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI.5
 * JD-Core Version:    0.6.2
 */