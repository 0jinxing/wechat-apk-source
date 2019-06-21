package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ba;
import com.tencent.mm.ui.base.m;
import java.util.List;

final class WelcomeActivity$8
  implements View.OnClickListener
{
  WelcomeActivity$8(WelcomeActivity paramWelcomeActivity, com.tencent.mm.ui.widget.a.d paramd, List paramList, m paramm)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125644);
    if (com.tencent.mm.protocal.d.vxr)
    {
      WelcomeActivity.c(this.gIu);
      AppMethodBeat.o(125644);
    }
    while (true)
    {
      return;
      this.gCw.cpD();
      if (this.gCz.contains(this.gDw))
      {
        WelcomeActivity.a(this.gIu).daR = 1L;
        WelcomeActivity.a(this.gIu).cVS = 1L;
        WelcomeActivity.a(this.gIu).ajK();
      }
      AppMethodBeat.o(125644);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.WelcomeActivity.8
 * JD-Core Version:    0.6.2
 */