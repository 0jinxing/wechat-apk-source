package com.tencent.mm.ui.chatting.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.sz;

final class an$12
  implements DialogInterface.OnClickListener
{
  an$12(an paraman)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(31759);
    paramDialogInterface = new sz();
    paramDialogInterface.cPf.cPi = true;
    com.tencent.mm.sdk.b.a.xxA.m(paramDialogInterface);
    an.a(this.ySD, this.ySD.cgL.getTalkerUserName());
    AppMethodBeat.o(31759);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.an.12
 * JD-Core Version:    0.6.2
 */