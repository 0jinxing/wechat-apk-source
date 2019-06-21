package com.tencent.mm.plugin.profile.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.y;
import com.tencent.mm.aj.z;

final class c$16
  implements DialogInterface.OnCancelListener
{
  c$16(c paramc, y paramy)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(23471);
    z.afa();
    com.tencent.mm.aj.c.a(this.pmO);
    AppMethodBeat.o(23471);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.c.16
 * JD-Core Version:    0.6.2
 */