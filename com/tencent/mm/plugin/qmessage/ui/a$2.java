package com.tencent.mm.plugin.qmessage.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.qmessage.a.b;

final class a$2
  implements DialogInterface.OnCancelListener
{
  a$2(a parama, b paramb)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(24097);
    aw.Rg().c(this.psV);
    AppMethodBeat.o(24097);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.a.2
 * JD-Core Version:    0.6.2
 */