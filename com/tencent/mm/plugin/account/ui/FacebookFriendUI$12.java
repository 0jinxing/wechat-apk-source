package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FacebookFriendUI$12
  implements View.OnClickListener
{
  FacebookFriendUI$12(FacebookFriendUI paramFacebookFriendUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(124819);
    this.gBf.startActivity(new Intent(this.gBf, FacebookAuthUI.class));
    AppMethodBeat.o(124819);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookFriendUI.12
 * JD-Core Version:    0.6.2
 */