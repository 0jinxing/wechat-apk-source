package com.tencent.mm.chatroom.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.aa;

final class RoomUpgradeResultUI$2
  implements View.OnClickListener
{
  RoomUpgradeResultUI$2(RoomUpgradeResultUI paramRoomUpgradeResultUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(104221);
    paramView = new Intent();
    paramView.putExtra("rawUrl", this.ekR.getString(2131298060, new Object[] { aa.dor() }));
    paramView.putExtra("geta8key_username", r.Yz());
    d.c(this.ekR, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", 0);
    AppMethodBeat.o(104221);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomUpgradeResultUI.2
 * JD-Core Version:    0.6.2
 */