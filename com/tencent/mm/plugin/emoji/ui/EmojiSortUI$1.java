package com.tencent.mm.plugin.emoji.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class EmojiSortUI$1
  implements MenuItem.OnMenuItemClickListener
{
  EmojiSortUI$1(EmojiSortUI paramEmojiSortUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(53408);
    this.law.finish();
    AppMethodBeat.o(53408);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiSortUI.1
 * JD-Core Version:    0.6.2
 */