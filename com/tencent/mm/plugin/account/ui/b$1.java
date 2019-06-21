package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.h;

final class b$1
  implements DialogInterface.OnClickListener
{
  b$1(b paramb, Context paramContext)
  {
  }

  public final void onClick(final DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(124716);
    paramDialogInterface = this.gAk.a(this.gAk.gAi, this.gAk.gue.getSecImgCode());
    g.Rg().a(paramDialogInterface, 0);
    Context localContext = this.gAj;
    this.gAj.getString(2131297061);
    h.b(localContext, this.gAj.getString(2131301031), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        AppMethodBeat.i(124715);
        g.Rg().c(paramDialogInterface);
        AppMethodBeat.o(124715);
      }
    });
    AppMethodBeat.o(124716);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.b.1
 * JD-Core Version:    0.6.2
 */