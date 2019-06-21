package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.pluginsdk.n;

final class WelcomeActivity$1
  implements View.OnClickListener
{
  WelcomeActivity$1(WelcomeActivity paramWelcomeActivity)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125633);
    paramView = new Intent();
    paramView.putExtra("not_auth_setting", true);
    paramView.putExtra("from_login_history", true);
    a.gkE.o(paramView, this.gIu);
    AppMethodBeat.o(125633);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.WelcomeActivity.1
 * JD-Core Version:    0.6.2
 */