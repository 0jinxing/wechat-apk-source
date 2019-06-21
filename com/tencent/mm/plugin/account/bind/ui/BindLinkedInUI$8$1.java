package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.bind.a.c;
import com.tencent.mm.ui.base.h;

final class BindLinkedInUI$8$1
  implements DialogInterface.OnClickListener
{
  BindLinkedInUI$8$1(BindLinkedInUI.8 param8)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13394);
    paramDialogInterface = new c();
    BindLinkedInUI.a(this.gre.grc, h.b(this.gre.grc, this.gre.grc.getString(2131300968), false, new BindLinkedInUI.8.1.1(this, paramDialogInterface)));
    g.Rg().a(paramDialogInterface, 0);
    AppMethodBeat.o(13394);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI.8.1
 * JD-Core Version:    0.6.2
 */