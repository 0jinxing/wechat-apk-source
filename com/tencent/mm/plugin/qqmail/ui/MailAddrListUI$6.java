package com.tencent.mm.plugin.qqmail.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;

final class MailAddrListUI$6
  implements View.OnClickListener
{
  MailAddrListUI$6(MailAddrListUI paramMailAddrListUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(68316);
    BackwardSupportUtil.c.a(MailAddrListUI.g(this.pyp));
    AppMethodBeat.o(68316);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAddrListUI.6
 * JD-Core Version:    0.6.2
 */