package com.tencent.mm.plugin.qqmail.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;

final class ComposeUI$11
  implements View.OnClickListener
{
  ComposeUI$11(ComposeUI paramComposeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(68183);
    this.pwY.aqX();
    ComposeUI.j(this.pwY).getText();
    ComposeUI.D(this.pwY);
    if (!this.pwY.ccT())
      AppMethodBeat.o(68183);
    while (true)
    {
      return;
      paramView = this.pwY;
      ComposeUI localComposeUI = this.pwY;
      this.pwY.getString(2131297061);
      ComposeUI.a(paramView, h.b(localComposeUI, this.pwY.getString(2131301967), true, new ComposeUI.11.1(this)));
      if (!ComposeUI.E(this.pwY).cdc())
      {
        ComposeUI.G(this.pwY).setMessage(this.pwY.getString(2131301964));
        ComposeUI.E(this.pwY).pxV = new ComposeUI.11.2(this);
        AppMethodBeat.o(68183);
      }
      else
      {
        ComposeUI.a(this.pwY, ComposeUI.H(this.pwY));
        AppMethodBeat.o(68183);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.11
 * JD-Core Version:    0.6.2
 */