package com.tencent.mm.plugin.emoji.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class EmojiStoreDetailUI$7
  implements MenuItem.OnMenuItemClickListener
{
  EmojiStoreDetailUI$7(EmojiStoreDetailUI paramEmojiStoreDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(53426);
    ab.d("MicroMsg.emoji.EmojiStoreDetailUI", "on shard click.");
    EmojiStoreDetailUI.r(this.lbG);
    AppMethodBeat.o(53426);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI.7
 * JD-Core Version:    0.6.2
 */