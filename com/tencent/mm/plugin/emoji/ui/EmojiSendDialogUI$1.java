package com.tencent.mm.plugin.emoji.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class EmojiSendDialogUI$1
  implements DialogInterface.OnDismissListener
{
  EmojiSendDialogUI$1(EmojiSendDialogUI paramEmojiSendDialogUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(53400);
    this.lap.setResult(0);
    this.lap.finish();
    AppMethodBeat.o(53400);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiSendDialogUI.1
 * JD-Core Version:    0.6.2
 */