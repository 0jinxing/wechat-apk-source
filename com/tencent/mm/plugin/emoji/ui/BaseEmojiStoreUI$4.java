package com.tencent.mm.plugin.emoji.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseEmojiStoreUI$4
  implements DialogInterface.OnCancelListener
{
  BaseEmojiStoreUI$4(BaseEmojiStoreUI paramBaseEmojiStoreUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(53215);
    BaseEmojiStoreUI.blf();
    AppMethodBeat.o(53215);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI.4
 * JD-Core Version:    0.6.2
 */