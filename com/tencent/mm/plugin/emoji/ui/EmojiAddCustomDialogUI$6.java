package com.tencent.mm.plugin.emoji.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class EmojiAddCustomDialogUI$6
  implements DialogInterface.OnDismissListener
{
  EmojiAddCustomDialogUI$6(EmojiAddCustomDialogUI paramEmojiAddCustomDialogUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(53275);
    this.kZj.setResult(3);
    this.kZj.finish();
    AppMethodBeat.o(53275);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.6
 * JD-Core Version:    0.6.2
 */