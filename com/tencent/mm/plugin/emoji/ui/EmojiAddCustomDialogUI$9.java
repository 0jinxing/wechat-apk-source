package com.tencent.mm.plugin.emoji.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class EmojiAddCustomDialogUI$9
  implements DialogInterface.OnDismissListener
{
  EmojiAddCustomDialogUI$9(EmojiAddCustomDialogUI paramEmojiAddCustomDialogUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(53277);
    this.kZj.setResult(1);
    this.kZj.finish();
    AppMethodBeat.o(53277);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.9
 * JD-Core Version:    0.6.2
 */