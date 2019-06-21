package com.tencent.mm.ui.conversation;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lh;
import com.tencent.mm.sdk.b.a;

final class n$9$2
  implements DialogInterface.OnClickListener
{
  n$9$2(n.9 param9)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(34605);
    paramDialogInterface = new lh();
    a.xxA.m(paramDialogInterface);
    AppMethodBeat.o(34605);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.n.9.2
 * JD-Core Version:    0.6.2
 */