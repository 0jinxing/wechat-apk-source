package com.tencent.mm.plugin.exdevice.model;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;

final class i$1
  implements DialogInterface.OnCancelListener
{
  i$1(i parami, o paramo, i.a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(19295);
    aw.Rg().c(this.lts);
    i.a(this.ltu).dismiss();
    i.b(this.ltu);
    if (this.ltt != null)
      this.ltt.gM(false);
    i.c(this.ltu);
    AppMethodBeat.o(19295);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.i.1
 * JD-Core Version:    0.6.2
 */