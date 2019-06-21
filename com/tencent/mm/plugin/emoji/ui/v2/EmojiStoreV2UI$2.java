package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.ui.EmojiMineUI;

final class EmojiStoreV2UI$2
  implements MenuItem.OnMenuItemClickListener
{
  EmojiStoreV2UI$2(EmojiStoreV2UI paramEmojiStoreV2UI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(53817);
    paramMenuItem = new Intent();
    paramMenuItem.putExtra("10931", 1);
    paramMenuItem.setClass(this.lgg, EmojiMineUI.class);
    this.lgg.startActivity(paramMenuItem);
    AppMethodBeat.o(53817);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI.2
 * JD-Core Version:    0.6.2
 */