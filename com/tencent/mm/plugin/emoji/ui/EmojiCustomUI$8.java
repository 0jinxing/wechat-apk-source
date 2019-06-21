package com.tencent.mm.plugin.emoji.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.sync.EmojiSyncManager;
import com.tencent.mm.plugin.report.service.h;

final class EmojiCustomUI$8
  implements DialogInterface.OnClickListener
{
  EmojiCustomUI$8(EmojiCustomUI paramEmojiCustomUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(53307);
    EmojiCustomUI.c(this.kZL).cg(true);
    h.pYm.e(11595, new Object[] { Integer.valueOf(1), Integer.valueOf(EmojiCustomUI.l(this.kZL)) });
    AppMethodBeat.o(53307);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.8
 * JD-Core Version:    0.6.2
 */