package com.tencent.mm.pluginsdk.model.app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.s.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class w$1
  implements DialogInterface.OnCancelListener
{
  public w$1(w paramw)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(79364);
    ab.w("MicroMsg.LoadAppInfoAfterLogin", "do init canceled");
    g.Rg().c(this.vcn.cwn);
    a.bYM().b(7, this.vcn);
    if (this.vcn.vcm != null)
      this.vcn.vcm.arL();
    AppMethodBeat.o(79364);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.w.1
 * JD-Core Version:    0.6.2
 */