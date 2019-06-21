package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.f.a.c;

final class BindFacebookUI$3
  implements View.OnClickListener
{
  BindFacebookUI$3(BindFacebookUI paramBindFacebookUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(124727);
    BindFacebookUI.c(this.gAv).a(this.gAv, BindFacebookUI.aqJ(), new BindFacebookUI.a(this.gAv, (byte)0));
    AppMethodBeat.o(124727);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.BindFacebookUI.3
 * JD-Core Version:    0.6.2
 */