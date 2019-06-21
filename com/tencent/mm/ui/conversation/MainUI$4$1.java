package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;

final class MainUI$4$1
  implements Runnable
{
  MainUI$4$1(MainUI.4 param4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34495);
    MainUI.a(this.zvh.zvg, MainUI.a(this.zvh.zvg).getCount());
    if ((MainUI.a(this.zvh.zvg).getCount() <= 0) && (MainUI.c(this.zvh.zvg) != null))
    {
      ConversationListView localConversationListView = MainUI.c(this.zvh.zvg);
      ab.i("MicroMsg.ConversationListView", "alvinluo refreshFooter mHeaderOpen: %b", new Object[] { Boolean.valueOf(localConversationListView.iVR) });
      if (!localConversationListView.iVR)
      {
        localConversationListView.qH(false);
        if (localConversationListView.zst != null)
          localConversationListView.zst.setBackgroundColor(localConversationListView.getContext().getResources().getColor(2131690691));
        localConversationListView.e(1.0F, localConversationListView.getResources().getColor(2131689650));
      }
    }
    MainUI.d(this.zvh.zvg).dIn();
    g.BO(12);
    AppMethodBeat.o(34495);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.MainUI.4.1
 * JD-Core Version:    0.6.2
 */