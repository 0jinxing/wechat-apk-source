package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.ui.EmojiMineUI;

final class EmojiStoreV2BaseFragment$5
  implements MenuItem.OnMenuItemClickListener
{
  EmojiStoreV2BaseFragment$5(EmojiStoreV2BaseFragment paramEmojiStoreV2BaseFragment)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(53576);
    paramMenuItem = new Intent();
    paramMenuItem.setClass(this.ldc.thisActivity(), EmojiMineUI.class);
    this.ldc.startActivity(paramMenuItem);
    AppMethodBeat.o(53576);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment.5
 * JD-Core Version:    0.6.2
 */