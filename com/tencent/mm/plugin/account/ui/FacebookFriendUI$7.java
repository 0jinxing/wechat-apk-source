package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.plugin.account.friend.a.g;
import com.tencent.mm.pluginsdk.n;

final class FacebookFriendUI$7
  implements AdapterView.OnItemClickListener
{
  FacebookFriendUI$7(FacebookFriendUI paramFacebookFriendUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(124813);
    paramView = (g)FacebookFriendUI.b(this.gBf).getItem(paramInt - FacebookFriendUI.e(this.gBf).getHeaderViewsCount());
    if ((paramView.status == 100) || (paramView.status == 101))
    {
      paramAdapterView = new Intent();
      paramAdapterView.putExtra("Contact_User", paramView.getUsername());
      paramAdapterView.putExtra("Contact_Nick", paramView.apD());
      paramAdapterView.putExtra("Contact_KFacebookId", paramView.dtU);
      paramAdapterView.putExtra("Contact_KFacebookName", paramView.apL());
      paramAdapterView.putExtra("Contact_Scene", 31);
      a.gkE.c(paramAdapterView, this.gBf);
    }
    if (paramView.status == 102)
      AppMethodBeat.o(124813);
    while (true)
    {
      return;
      AppMethodBeat.o(124813);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookFriendUI.7
 * JD-Core Version:    0.6.2
 */