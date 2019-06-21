package com.tencent.mm.plugin.emoji.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseEmojiStoreUI$3
  implements DialogInterface.OnCancelListener
{
  BaseEmojiStoreUI$3(BaseEmojiStoreUI paramBaseEmojiStoreUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(53214);
    this.kYA.bkY();
    BaseEmojiStoreUI.blf();
    AppMethodBeat.o(53214);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI.3
 * JD-Core Version:    0.6.2
 */