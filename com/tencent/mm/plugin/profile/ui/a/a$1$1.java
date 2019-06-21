package com.tencent.mm.plugin.profile.ui.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;

final class a$1$1
  implements DialogInterface.OnCancelListener
{
  a$1$1(a.1 param1)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(23795);
    aw.Rg().c(this.ppK.ppJ.ppH);
    this.ppK.ppJ.mzU = null;
    AppMethodBeat.o(23795);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.a.a.1.1
 * JD-Core Version:    0.6.2
 */