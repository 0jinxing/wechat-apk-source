package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

final class SnsUIAction$5
  implements DialogInterface.OnClickListener
{
  SnsUIAction$5(SnsUIAction paramSnsUIAction, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(39641);
    g.RQ();
    paramInt = bo.a((Integer)g.RP().Ry().get(68386, null), 0);
    g.RQ();
    g.RP().Ry().set(68386, Integer.valueOf(paramInt + 1));
    this.rCe.Em(this.bVv);
    AppMethodBeat.o(39641);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUIAction.5
 * JD-Core Version:    0.6.2
 */