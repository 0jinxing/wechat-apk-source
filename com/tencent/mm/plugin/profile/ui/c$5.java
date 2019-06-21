package com.tencent.mm.plugin.profile.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.dc;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.b.a;

final class c$5
  implements DialogInterface.OnCancelListener
{
  c$5(c paramc, m paramm)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(23461);
    aw.Rg().b(536, this.pmK);
    paramDialogInterface = new dc();
    paramDialogInterface.cwj.opType = 2;
    paramDialogInterface.cwj.cwn = this.crb;
    a.xxA.m(paramDialogInterface);
    AppMethodBeat.o(23461);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.c.5
 * JD-Core Version:    0.6.2
 */