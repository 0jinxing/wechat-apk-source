package com.tencent.mm.plugin.qqmail.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class ComposeUI$8
  implements View.OnClickListener
{
  ComposeUI$8(ComposeUI paramComposeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(68176);
    paramView = this.pwY;
    String str1 = this.pwY.getString(2131301976);
    String str2 = this.pwY.getString(2131301973);
    String str3 = this.pwY.getString(2131301974);
    ComposeUI.8.1 local1 = new ComposeUI.8.1(this);
    h.a(paramView, null, new String[] { str1, str2, str3 }, null, local1);
    AppMethodBeat.o(68176);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.8
 * JD-Core Version:    0.6.2
 */