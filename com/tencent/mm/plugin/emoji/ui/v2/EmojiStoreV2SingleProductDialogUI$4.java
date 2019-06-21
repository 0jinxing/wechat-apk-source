package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class EmojiStoreV2SingleProductDialogUI$4
  implements DialogInterface.OnDismissListener
{
  EmojiStoreV2SingleProductDialogUI$4(EmojiStoreV2SingleProductDialogUI paramEmojiStoreV2SingleProductDialogUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(53733);
    this.leZ.setResult(0);
    this.leZ.finish();
    AppMethodBeat.o(53733);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductDialogUI.4
 * JD-Core Version:    0.6.2
 */