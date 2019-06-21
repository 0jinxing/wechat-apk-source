package com.tencent.mm.plugin.emoji.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.a.e;
import com.tencent.mm.plugin.emoji.f.s;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class EmojiSortUI$2
  implements MenuItem.OnMenuItemClickListener
{
  EmojiSortUI$2(EmojiSortUI paramEmojiSortUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(53409);
    if (!at.isConnected(ah.getContext()))
      EmojiSortUI.a(this.law);
    while (true)
    {
      AppMethodBeat.o(53409);
      return true;
      paramMenuItem = this.law;
      paramMenuItem.getString(2131297061);
      paramMenuItem.gqo = h.b(paramMenuItem, paramMenuItem.getString(2131297086), true, new EmojiSortUI.3(paramMenuItem));
      ArrayList localArrayList = new ArrayList();
      if ((EmojiSortUI.b(this.law) != null) && (EmojiSortUI.b(this.law).kSg != null))
      {
        paramMenuItem = EmojiSortUI.b(this.law).kSg.iterator();
        while (paramMenuItem.hasNext())
          localArrayList.add(((EmojiGroupInfo)paramMenuItem.next()).field_productID);
      }
      EmojiSortUI.a(this.law, new s(localArrayList, 2));
      g.RO().eJo.a(EmojiSortUI.c(this.law), 0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiSortUI.2
 * JD-Core Version:    0.6.2
 */