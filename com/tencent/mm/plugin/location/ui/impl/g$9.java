package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.location.model.o;
import com.tencent.mm.plugin.location.ui.k;
import com.tencent.mm.plugin.location.ui.m;

final class g$9
  implements DialogInterface.OnClickListener
{
  g$9(g paramg)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(113678);
    this.nQT.nQG.iE(false);
    this.nQT.nQH.stop();
    this.nQT.nQH.xC(2);
    k.bKb();
    this.nQT.activity.finish();
    AppMethodBeat.o(113678);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.g.9
 * JD-Core Version:    0.6.2
 */