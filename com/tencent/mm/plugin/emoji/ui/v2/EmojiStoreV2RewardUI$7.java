package com.tencent.mm.plugin.emoji.ui.v2;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class EmojiStoreV2RewardUI$7
  implements MenuItem.OnMenuItemClickListener
{
  EmojiStoreV2RewardUI$7(EmojiStoreV2RewardUI paramEmojiStoreV2RewardUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(53701);
    this.leK.onBackPressed();
    AppMethodBeat.o(53701);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI.7
 * JD-Core Version:    0.6.2
 */