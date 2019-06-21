package com.tencent.mm.ui.chatting.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ez;

final class an$5
  implements DialogInterface.OnClickListener
{
  an$5(an paraman, Runnable paramRunnable)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(31752);
    this.ySF.run();
    paramDialogInterface = new ez();
    paramDialogInterface.cys.username = this.ySD.cgL.getTalkerUserName();
    com.tencent.mm.sdk.b.a.xxA.m(paramDialogInterface);
    AppMethodBeat.o(31752);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.an.5
 * JD-Core Version:    0.6.2
 */