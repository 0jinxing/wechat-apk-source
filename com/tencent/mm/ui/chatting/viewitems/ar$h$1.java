package com.tencent.mm.ui.chatting.viewitems;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.sdk.b.a;

final class ar$h$1
  implements DialogInterface.OnClickListener
{
  ar$h$1(ar.h paramh, ay paramay)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(33423);
    sz localsz = new sz();
    localsz.cPf.cPi = true;
    a.xxA.m(localsz);
    ar.h.a(this.zhZ, this.zhY);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(33423);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ar.h.1
 * JD-Core Version:    0.6.2
 */