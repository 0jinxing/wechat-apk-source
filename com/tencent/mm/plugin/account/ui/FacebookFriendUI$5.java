package com.tencent.mm.plugin.account.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.ui.p.a;

final class FacebookFriendUI$5
  implements p.a
{
  FacebookFriendUI$5(FacebookFriendUI paramFacebookFriendUI, TextView paramTextView)
  {
  }

  public final void apt()
  {
    AppMethodBeat.i(124811);
    if ((r.Za()) && (FacebookFriendUI.a(this.gBf)))
    {
      if (FacebookFriendUI.b(this.gBf).getCount() != 0)
        break label56;
      this.gBg.setVisibility(0);
    }
    while (true)
    {
      FacebookFriendUI.c(this.gBf);
      AppMethodBeat.o(124811);
      return;
      label56: this.gBg.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookFriendUI.5
 * JD-Core Version:    0.6.2
 */