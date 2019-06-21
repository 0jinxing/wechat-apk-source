package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.b.a.a;

final class h$8
  implements DialogInterface.OnClickListener
{
  h$8(h paramh, int paramInt, a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29319);
    h.a(this.yih, this.val$id, this.yin.actionType, this.yin.id, this.yin.vzH);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(29319);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.h.8
 * JD-Core Version:    0.6.2
 */