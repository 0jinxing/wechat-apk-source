package com.tencent.mm.plugin.qqmail.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ComposeUI$7
  implements View.OnClickListener
{
  ComposeUI$7(ComposeUI paramComposeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(68174);
    ComposeUI.z(this.pwY).setVisibility(8);
    ComposeUI.A(this.pwY).setVisibility(0);
    ComposeUI.B(this.pwY).setVisibility(0);
    ComposeUI.z(this.pwY).post(new ComposeUI.7.1(this));
    AppMethodBeat.o(68174);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.7
 * JD-Core Version:    0.6.2
 */