package com.tencent.mm.plugin.sns.ui.d;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.model.r;

final class a$1
  implements DialogInterface.OnCancelListener
{
  a$1(a parama, r paramr)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(40229);
    g.RQ();
    g.RO().eJo.c(this.rhO);
    AppMethodBeat.o(40229);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.a.1
 * JD-Core Version:    0.6.2
 */