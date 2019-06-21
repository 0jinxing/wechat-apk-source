package com.tencent.mm.plugin.account.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.f.a.c;

final class ShowNonWeixinFriendUI$2
  implements View.OnClickListener
{
  ShowNonWeixinFriendUI$2(ShowNonWeixinFriendUI paramShowNonWeixinFriendUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125590);
    c localc = new c(this.gIm.getString(2131305891));
    paramView = new Bundle();
    paramView.putString("message", this.gIm.getString(2131299542));
    paramView.putString("to", Long.toString(ShowNonWeixinFriendUI.a(this.gIm)));
    localc.a(this.gIm, "apprequests", paramView, new ShowNonWeixinFriendUI.2.1(this));
    AppMethodBeat.o(125590);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.ShowNonWeixinFriendUI.2
 * JD-Core Version:    0.6.2
 */