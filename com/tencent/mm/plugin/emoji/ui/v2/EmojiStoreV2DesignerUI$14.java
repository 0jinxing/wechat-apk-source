package com.tencent.mm.plugin.emoji.ui.v2;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class EmojiStoreV2DesignerUI$14
  implements MenuItem.OnMenuItemClickListener
{
  EmojiStoreV2DesignerUI$14(EmojiStoreV2DesignerUI paramEmojiStoreV2DesignerUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(53592);
    ab.d("MicroMsg.emoji.EmojiStoreV2DesignerUI", "on shard click.");
    EmojiStoreV2DesignerUI.j(this.ldL);
    AppMethodBeat.o(53592);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI.14
 * JD-Core Version:    0.6.2
 */