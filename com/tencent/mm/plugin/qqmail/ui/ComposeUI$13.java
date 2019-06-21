package com.tencent.mm.plugin.qqmail.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.ui.base.h;

final class ComposeUI$13
  implements View.OnClickListener
{
  ComposeUI$13(ComposeUI paramComposeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(68187);
    if (!ComposeUI.E(this.pwY).cdc())
    {
      ComposeUI.a(this.pwY, h.b(this.pwY, this.pwY.getString(2131301964), true, new ComposeUI.13.1(this)));
      ComposeUI.E(this.pwY).pxV = new ComposeUI.13.2(this);
      AppMethodBeat.o(68187);
    }
    while (true)
    {
      return;
      u.a(ComposeUI.s(this.pwY), ComposeUI.n(this.pwY), ComposeUI.x(this.pwY));
      ComposeUI.I(this.pwY);
      AppMethodBeat.o(68187);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.13
 * JD-Core Version:    0.6.2
 */