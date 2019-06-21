package com.tencent.mm.plugin.emoji.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;

final class EmojiSortUI$3
  implements DialogInterface.OnCancelListener
{
  EmojiSortUI$3(EmojiSortUI paramEmojiSortUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(53410);
    if (EmojiSortUI.c(this.law) != null)
      g.RO().eJo.c(EmojiSortUI.c(this.law));
    AppMethodBeat.o(53410);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiSortUI.3
 * JD-Core Version:    0.6.2
 */