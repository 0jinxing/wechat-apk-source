package com.tencent.mm.plugin.nearby.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NearbyFriendShowSayHiUI$3
  implements View.OnClickListener
{
  NearbyFriendShowSayHiUI$3(NearbyFriendShowSayHiUI paramNearbyFriendShowSayHiUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(55428);
    paramView = new Intent(this.oPZ, NearbySayHiListUI.class);
    paramView.putExtra("k_say_hi_type", 2);
    paramView.putExtra("show_clear_header", true);
    this.oPZ.startActivityForResult(paramView, 2009);
    AppMethodBeat.o(55428);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyFriendShowSayHiUI.3
 * JD-Core Version:    0.6.2
 */