package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.y;
import com.tencent.mm.ui.base.h;

final class BindMContactIntroUI$24
  implements DialogInterface.OnClickListener
{
  BindMContactIntroUI$24(BindMContactIntroUI paramBindMContactIntroUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13434);
    if ((BindMContactIntroUI.e(this.grt) == null) || (BindMContactIntroUI.e(this.grt).equals("")))
      AppMethodBeat.o(13434);
    while (true)
    {
      return;
      paramDialogInterface = new y(y.gvW);
      g.Rg().a(paramDialogInterface, 0);
      paramDialogInterface = this.grt;
      BindMContactIntroUI localBindMContactIntroUI = this.grt;
      this.grt.getString(2131297061);
      BindMContactIntroUI.a(paramDialogInterface, h.b(localBindMContactIntroUI, this.grt.getString(2131296965), true, new BindMContactIntroUI.24.1(this)));
      AppMethodBeat.o(13434);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.24
 * JD-Core Version:    0.6.2
 */