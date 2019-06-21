package com.tencent.mm.plugin.emoji.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class EmojiMineUI$2
  implements MenuItem.OnMenuItemClickListener
{
  EmojiMineUI$2(EmojiMineUI paramEmojiMineUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(53374);
    Object localObject = j.getEmojiStorageMgr().xYo.duM();
    paramMenuItem = new ArrayList();
    localObject = ((ArrayList)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      EmojiGroupInfo localEmojiGroupInfo = (EmojiGroupInfo)((Iterator)localObject).next();
      if (localEmojiGroupInfo.field_type != EmojiGroupInfo.TYPE_CUSTOM)
        paramMenuItem.add(localEmojiGroupInfo);
    }
    if (paramMenuItem.size() <= 1)
    {
      h.g(this.lal.mController.ylL, 2131299016, 2131297061);
      AppMethodBeat.o(53374);
    }
    while (true)
    {
      return true;
      if (!com.tencent.mm.sdk.platformtools.at.isConnected(ah.getContext()))
      {
        EmojiMineUI.a(this.lal);
        AppMethodBeat.o(53374);
      }
      else
      {
        paramMenuItem = new Intent();
        paramMenuItem.setClass(this.lal, EmojiSortUI.class);
        this.lal.startActivity(paramMenuItem);
        AppMethodBeat.o(53374);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiMineUI.2
 * JD-Core Version:    0.6.2
 */