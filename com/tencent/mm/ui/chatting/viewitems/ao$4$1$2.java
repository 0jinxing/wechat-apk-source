package com.tencent.mm.ui.chatting.viewitems;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.subapp.c.a;

final class ao$4$1$2
  implements DialogInterface.OnCancelListener
{
  ao$4$1$2(ao.4.1 param1, a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(33387);
    aw.Rg().c(this.zhR);
    aw.Rg().b(331, ao.b(this.zhQ.zhP.zhM));
    ao.a(this.zhQ.zhP.zhM, null);
    if (ao.c(this.zhQ.zhP.zhM) != null)
      ao.c(this.zhQ.zhP.zhM).dismiss();
    AppMethodBeat.o(33387);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ao.4.1.2
 * JD-Core Version:    0.6.2
 */