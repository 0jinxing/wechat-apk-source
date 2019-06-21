package com.tencent.mm.plugin.account.bind.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.friend.a.a;
import com.tencent.mm.plugin.account.friend.ui.InviteFriendUI;

final class MobileFriendUI$14
  implements AdapterView.OnItemClickListener
{
  MobileFriendUI$14(MobileFriendUI paramMobileFriendUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(13732);
    if (paramInt < MobileFriendUI.f(this.gtZ).getHeaderViewsCount())
      AppMethodBeat.o(13732);
    while (true)
    {
      return;
      int i = MobileFriendUI.f(this.gtZ).getHeaderViewsCount();
      paramAdapterView = (a)MobileFriendUI.d(this.gtZ).getItem(paramInt - i);
      if ((paramAdapterView.status == 1) || (paramAdapterView.status == 2))
        this.gtZ.b(paramAdapterView);
      if (paramAdapterView.status == 0)
      {
        paramView = new Intent(this.gtZ, InviteFriendUI.class);
        paramView.putExtra("friend_type", 1);
        paramView.putExtra("friend_user_name", paramAdapterView.getUsername());
        paramView.putExtra("friend_num", paramAdapterView.apG());
        paramView.putExtra("friend_nick", paramAdapterView.apA());
        paramView.putExtra("friend_weixin_nick", paramAdapterView.apD());
        paramView.putExtra("friend_scene", 13);
        this.gtZ.startActivity(paramView);
      }
      AppMethodBeat.o(13732);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.MobileFriendUI.14
 * JD-Core Version:    0.6.2
 */