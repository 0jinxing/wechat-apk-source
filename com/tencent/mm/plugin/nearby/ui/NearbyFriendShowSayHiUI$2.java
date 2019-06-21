package com.tencent.mm.plugin.nearby.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NearbyFriendShowSayHiUI$2
  implements View.OnClickListener
{
  NearbyFriendShowSayHiUI$2(NearbyFriendShowSayHiUI paramNearbyFriendShowSayHiUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(55427);
    this.oPZ.startActivity(new Intent(this.oPZ, NearbyFriendsUI.class));
    AppMethodBeat.o(55427);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyFriendShowSayHiUI.2
 * JD-Core Version:    0.6.2
 */