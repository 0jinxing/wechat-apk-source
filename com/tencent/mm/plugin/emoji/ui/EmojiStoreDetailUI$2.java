package com.tencent.mm.plugin.emoji.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class EmojiStoreDetailUI$2
  implements MenuItem.OnMenuItemClickListener
{
  EmojiStoreDetailUI$2(EmojiStoreDetailUI paramEmojiStoreDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(53422);
    this.lbG.finish();
    AppMethodBeat.o(53422);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI.2
 * JD-Core Version:    0.6.2
 */