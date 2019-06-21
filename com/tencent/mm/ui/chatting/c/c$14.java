package com.tencent.mm.ui.chatting.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.k;
import com.tencent.mm.aj.z;
import com.tencent.mm.ui.chatting.d.a;

final class c$14
  implements DialogInterface.OnClickListener
{
  c$14(c paramc)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(31206);
    c.c(this.yOi).field_hadAlert = 1;
    paramDialogInterface = c.c(this.yOi);
    if (paramDialogInterface != null)
    {
      paramDialogInterface.field_brandFlag &= -5;
      f.g(paramDialogInterface);
    }
    z.afc().rj(this.yOi.cgL.getTalkerUserName());
    AppMethodBeat.o(31206);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.c.14
 * JD-Core Version:    0.6.2
 */