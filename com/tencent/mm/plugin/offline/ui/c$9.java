package com.tencent.mm.plugin.offline.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.ui.base.h;

final class c$9
  implements DialogInterface.OnClickListener
{
  c$9(c paramc)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(43479);
    paramDialogInterface.dismiss();
    a.bYo();
    h.bQ(this.oZs.mActivity, this.oZs.mActivity.getResources().getString(2131305444));
    c.a(this.oZs);
    AppMethodBeat.o(43479);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.c.9
 * JD-Core Version:    0.6.2
 */