package com.tencent.mm.plugin.emoji.ui.v2;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.contact.LabelContainerView;
import java.util.ArrayList;

final class EmojiStoreV2SingleProductUI$13
  implements MenuItem.OnMenuItemClickListener
{
  EmojiStoreV2SingleProductUI$13(EmojiStoreV2SingleProductUI paramEmojiStoreV2SingleProductUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(53759);
    if (EmojiStoreV2SingleProductUI.f(this.lfC) != null)
    {
      EmojiStoreV2SingleProductUI.f(this.lfC).setVisibility(0);
      paramMenuItem = new ArrayList();
      paramMenuItem.add(EmojiStoreV2SingleProductUI.l(this.lfC));
      EmojiStoreV2SingleProductUI.m(this.lfC).a(paramMenuItem, EmojiStoreV2SingleProductUI.n(this.lfC));
      this.lfC.setMMTitle(2131299156);
      this.lfC.showOptionMenu(1001, false);
      h.pYm.X(12788, "1");
    }
    AppMethodBeat.o(53759);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI.13
 * JD-Core Version:    0.6.2
 */