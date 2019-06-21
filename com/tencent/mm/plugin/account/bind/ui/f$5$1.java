package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.aa;

final class f$5$1
  implements DialogInterface.OnCancelListener
{
  f$5$1(f.5 param5, aa paramaa)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(13754);
    this.gun.gul.onDetach();
    g.Rg().c(this.gum);
    AppMethodBeat.o(13754);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.f.5.1
 * JD-Core Version:    0.6.2
 */