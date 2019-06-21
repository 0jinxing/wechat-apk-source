package com.tencent.mm.plugin.emoji.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class EmojiPaidUI$1
  implements MenuItem.OnMenuItemClickListener
{
  EmojiPaidUI$1(EmojiPaidUI paramEmojiPaidUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(53389);
    EmojiPaidUI.a(this.lan);
    AppMethodBeat.o(53389);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiPaidUI.1
 * JD-Core Version:    0.6.2
 */