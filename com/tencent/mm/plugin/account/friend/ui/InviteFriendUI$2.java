package com.tencent.mm.plugin.account.friend.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mx;
import com.tencent.mm.g.a.mx.b;
import com.tencent.mm.pluginsdk.n;

final class InviteFriendUI$2
  implements View.OnClickListener
{
  InviteFriendUI$2(InviteFriendUI paramInviteFriendUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(108578);
    paramView = new mx();
    paramView.cIO.opType = 0;
    paramView.cIO.cIQ = (InviteFriendUI.b(this.gxy) + "@qqim");
    paramView.cIO.cIR = InviteFriendUI.f(this.gxy);
    com.tencent.mm.sdk.b.a.xxA.m(paramView);
    if (paramView.cIP.cvi)
      com.tencent.mm.plugin.account.a.a.gkE.d(new Intent().putExtra("Chat_User", InviteFriendUI.b(this.gxy) + "@qqim"), this.gxy);
    this.gxy.finish();
    AppMethodBeat.o(108578);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.InviteFriendUI.2
 * JD-Core Version:    0.6.2
 */