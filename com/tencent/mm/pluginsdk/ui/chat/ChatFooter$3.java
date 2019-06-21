package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class ChatFooter$3
  implements ActionMode.Callback
{
  ChatFooter$3(ChatFooter paramChatFooter, Context paramContext)
  {
  }

  public final boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    return false;
  }

  public final boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    AppMethodBeat.i(27788);
    paramActionMode = com.tencent.mm.pluginsdk.f.a.dhS();
    h.pYm.k(1014L, 5L, 1L);
    com.tencent.mm.plugin.c.a.ask();
    if (com.tencent.mm.plugin.c.a.x(paramActionMode))
    {
      ab.i("MicroMsg.ChatFooter", "anti paste text %s", new Object[] { paramActionMode });
      h.pYm.k(1014L, 6L, 1L);
      if (paramMenu.size() > 0)
      {
        paramMenu.removeItem(16908322);
        if (d.iW(23))
          paramMenu.removeItem(16908340);
      }
    }
    AppMethodBeat.o(27788);
    return true;
  }

  public final void onDestroyActionMode(ActionMode paramActionMode)
  {
  }

  public final boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.3
 * JD-Core Version:    0.6.2
 */