package com.tencent.mm.plugin.emoji.ui.v2;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.contact.LabelContainerView;

final class EmojiStoreV2SingleProductUI$9
  implements MenuItem.OnMenuItemClickListener
{
  EmojiStoreV2SingleProductUI$9(EmojiStoreV2SingleProductUI paramEmojiStoreV2SingleProductUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(53753);
    boolean bool;
    if ((EmojiStoreV2SingleProductUI.f(this.lfC) != null) && (EmojiStoreV2SingleProductUI.f(this.lfC).getVisibility() == 0))
    {
      EmojiStoreV2SingleProductUI.f(this.lfC).setVisibility(8);
      paramMenuItem = this.lfC;
      if (EmojiStoreV2SingleProductUI.g(this.lfC))
      {
        bool = true;
        paramMenuItem.showOptionMenu(1001, bool);
        this.lfC.setMMTitle(2131299132);
      }
    }
    while (true)
    {
      AppMethodBeat.o(53753);
      return false;
      bool = false;
      break;
      this.lfC.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI.9
 * JD-Core Version:    0.6.2
 */