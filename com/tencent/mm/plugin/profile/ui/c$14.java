package com.tencent.mm.plugin.profile.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.profile.b.d;

final class c$14
  implements DialogInterface.OnCancelListener
{
  c$14(c paramc, d paramd)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(23469);
    aw.Rg().c(this.jMe);
    aw.Rg().b(1394, this.pmK);
    AppMethodBeat.o(23469);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.c.14
 * JD-Core Version:    0.6.2
 */