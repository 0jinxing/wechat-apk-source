package com.tencent.mm.ui.chatting.viewitems;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelappbrand.s;

final class w$1$2$2
  implements DialogInterface.OnCancelListener
{
  w$1$2$2(w.1.2 param2, s params)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(33125);
    aw.Rg().c(this.zfb);
    AppMethodBeat.o(33125);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w.1.2.2
 * JD-Core Version:    0.6.2
 */