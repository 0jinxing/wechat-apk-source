package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;

final class EmojiStoreV2SingleProductUI$3
  implements DialogInterface.OnCancelListener
{
  EmojiStoreV2SingleProductUI$3(EmojiStoreV2SingleProductUI paramEmojiStoreV2SingleProductUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(53746);
    if (EmojiStoreV2SingleProductUI.p(this.lfC) != null)
      g.RO().eJo.c(EmojiStoreV2SingleProductUI.p(this.lfC));
    AppMethodBeat.o(53746);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI.3
 * JD-Core Version:    0.6.2
 */