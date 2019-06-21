package com.tencent.mm.ui.conversation;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.sns.b.e;
import com.tencent.mm.plugin.sns.b.n;

final class k$10$1
  implements DialogInterface.OnCancelListener
{
  k$10$1(k.10 param10)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(34478);
    aw.Rg().c(k.g(this.zuV.zuQ));
    if (n.qFy != null)
      n.qFy.cml();
    AppMethodBeat.o(34478);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.k.10.1
 * JD-Core Version:    0.6.2
 */