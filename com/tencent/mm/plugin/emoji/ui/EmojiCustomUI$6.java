package com.tencent.mm.plugin.emoji.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class EmojiCustomUI$6
  implements MenuItem.OnMenuItemClickListener
{
  EmojiCustomUI$6(EmojiCustomUI paramEmojiCustomUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(53305);
    EmojiCustomUI.a(this.kZL, EmojiCustomUI.c.kZW);
    AppMethodBeat.o(53305);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.6
 * JD-Core Version:    0.6.2
 */