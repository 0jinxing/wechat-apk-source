package com.tencent.mm.plugin.emoji.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class EmojiAddCustomDialogUI$7
  implements DialogInterface.OnClickListener
{
  EmojiAddCustomDialogUI$7(EmojiAddCustomDialogUI paramEmojiAddCustomDialogUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(53276);
    this.kZj.setResult(2);
    this.kZj.finish();
    AppMethodBeat.o(53276);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.7
 * JD-Core Version:    0.6.2
 */