package com.tencent.mm.ui.chatting.c;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.i;

final class j$2$1
  implements DialogInterface.OnClickListener
{
  j$2$1(j.2 param2, Context paramContext, h paramh)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(31307);
    ab.i("MicroMsg.ChattingMoreBtnBarHelper", "delete message");
    i.a(this.val$context, this.yOQ.dCQ(), this.yOR.yOP);
    this.yOR.yOP.dDL();
    AppMethodBeat.o(31307);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.j.2.1
 * JD-Core Version:    0.6.2
 */