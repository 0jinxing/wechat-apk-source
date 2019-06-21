package com.tencent.mm.plugin.profile.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;

final class c$15
  implements DialogInterface.OnCancelListener
{
  c$15(c paramc, com.tencent.mm.plugin.profile.b.c paramc1)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(23470);
    aw.Rg().c(this.pmN);
    aw.Rg().b(1363, this.pmK);
    AppMethodBeat.o(23470);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.c.15
 * JD-Core Version:    0.6.2
 */