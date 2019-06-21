package com.tencent.mm.ui.conversation;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ServiceNotifySettingsUI;

final class AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$1
  implements MenuItem.OnMenuItemClickListener
{
  AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$1(AppBrandServiceConversationUI.AppBrandServiceConversationFmUI paramAppBrandServiceConversationFmUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(33985);
    paramMenuItem = new Intent(this.zqn.getContext(), ServiceNotifySettingsUI.class);
    paramMenuItem.putExtra("mode", 1);
    paramMenuItem.putExtra("scene_id", AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.access$000(this.zqn));
    this.zqn.startActivity(paramMenuItem);
    AppMethodBeat.o(33985);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.1
 * JD-Core Version:    0.6.2
 */