package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.d;

final class WelcomeActivity$9
  implements View.OnClickListener
{
  WelcomeActivity$9(WelcomeActivity paramWelcomeActivity)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125645);
    if (d.vxr)
    {
      WelcomeActivity.c(this.gIu);
      AppMethodBeat.o(125645);
    }
    while (true)
    {
      return;
      paramView = new Intent(this.gIu, RegByMobileRegAIOUI.class);
      this.gIu.startActivity(paramView);
      AppMethodBeat.o(125645);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.WelcomeActivity.9
 * JD-Core Version:    0.6.2
 */