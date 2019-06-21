package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cv;
import com.tencent.mm.sdk.b.a;

final class s$m$2
  implements DialogInterface.OnClickListener
{
  s$m$2(s.m paramm)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(30732);
    paramDialogInterface = new cv();
    paramDialogInterface.cvX.enable = false;
    a.xxA.m(paramDialogInterface);
    AppMethodBeat.o(30732);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.s.m.2
 * JD-Core Version:    0.6.2
 */