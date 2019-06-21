package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class InviteFacebookFriendsUI$4
  implements AdapterView.OnItemClickListener
{
  InviteFacebookFriendsUI$4(InviteFacebookFriendsUI paramInviteFacebookFriendsUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(124874);
    if (InviteFacebookFriendsUI.a(this.gBw).aqS().length >= 50)
    {
      h.g(this.gBw, 2131299545, 2131297061);
      AppMethodBeat.o(124874);
    }
    while (true)
    {
      return;
      InviteFacebookFriendsUI.a(this.gBw).na(paramInt - InviteFacebookFriendsUI.b(this.gBw).getHeaderViewsCount());
      if (InviteFacebookFriendsUI.a(this.gBw).aqS().length > 0)
      {
        this.gBw.showOptionMenu(true);
        AppMethodBeat.o(124874);
      }
      else
      {
        this.gBw.showOptionMenu(false);
        AppMethodBeat.o(124874);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.InviteFacebookFriendsUI.4
 * JD-Core Version:    0.6.2
 */