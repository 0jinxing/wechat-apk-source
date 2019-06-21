package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.dc;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.b.a;

final class b$6
  implements DialogInterface.OnCancelListener
{
  b$6(b paramb, m paramm)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(23809);
    aw.Rg().b(536, this.ppO);
    paramDialogInterface = new dc();
    paramDialogInterface.cwj.opType = 2;
    paramDialogInterface.cwj.cwn = this.crb;
    a.xxA.m(paramDialogInterface);
    AppMethodBeat.o(23809);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.b.6
 * JD-Core Version:    0.6.2
 */