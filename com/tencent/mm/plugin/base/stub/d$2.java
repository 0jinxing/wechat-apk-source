package com.tencent.mm.plugin.base.stub;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.game.a.a;
import com.tencent.mm.plugin.game.a.a.a;

final class d$2
  implements DialogInterface.OnClickListener
{
  d$2(d paramd)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(18123);
    paramDialogInterface = a.a.bDb();
    if (paramDialogInterface != null)
      paramDialogInterface.m(this.jDr.openId, r.YC(), this.jDr.appId);
    this.jDr.jDq.ft(false);
    AppMethodBeat.o(18123);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.d.2
 * JD-Core Version:    0.6.2
 */