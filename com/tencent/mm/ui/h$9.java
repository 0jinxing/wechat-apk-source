package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.b.a.a;

final class h$9
  implements DialogInterface.OnClickListener
{
  h$9(h paramh, int paramInt, a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29320);
    h.a(this.yih, this.val$id, this.yio.actionType, this.yio.id, this.yio.vzH);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(29320);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.h.9
 * JD-Core Version:    0.6.2
 */