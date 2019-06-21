package com.tencent.mm.plugin.nearby.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NearbyFriendsUI$9
  implements View.OnClickListener
{
  NearbyFriendsUI$9(NearbyFriendsUI paramNearbyFriendsUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(55450);
    NearbyFriendsUI.j(this.oQs).removeHeaderView(NearbyFriendsUI.n(this.oQs));
    NearbyFriendsUI.o(this.oQs);
    paramView = new Intent(this.oQs, NearbySayHiListUI.class);
    paramView.putExtra("k_say_hi_type", 2);
    paramView.putExtra("show_clear_header", true);
    this.oQs.startActivityForResult(paramView, 2009);
    AppMethodBeat.o(55450);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.9
 * JD-Core Version:    0.6.2
 */