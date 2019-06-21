package com.tencent.mm.plugin.nearby.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.nearby.a.c;
import com.tencent.mm.ui.base.h;

final class a$4
  implements DialogInterface.OnClickListener
{
  a$4(a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(55414);
    a.a(this.oPV, new c(2, 0.0F, 0.0F, 0, 0, "", ""));
    g.Rg().a(a.c(this.oPV), 0);
    a locala = this.oPV;
    paramDialogInterface = a.a(this.oPV);
    a.a(this.oPV).getString(2131297061);
    a.a(locala, h.b(paramDialogInterface, a.a(this.oPV).getString(2131301618), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        AppMethodBeat.i(55413);
        g.Rg().c(a.c(a.4.this.oPV));
        AppMethodBeat.o(55413);
      }
    }));
    AppMethodBeat.o(55414);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.a.4
 * JD-Core Version:    0.6.2
 */