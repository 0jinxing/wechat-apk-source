package com.tencent.mm.plugin.emoji.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class EmojiAddCustomDialogUI$4
  implements DialogInterface.OnClickListener
{
  EmojiAddCustomDialogUI$4(EmojiAddCustomDialogUI paramEmojiAddCustomDialogUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(53273);
    paramDialogInterface = new Intent();
    h.pYm.e(11596, new Object[] { Integer.valueOf(3) });
    paramDialogInterface.setClass(EmojiAddCustomDialogUI.h(this.kZj), EmojiCustomUI.class);
    paramDialogInterface.putExtra("key_emoji_panel_type", 0);
    this.kZj.startActivity(paramDialogInterface);
    AppMethodBeat.o(53273);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.4
 * JD-Core Version:    0.6.2
 */