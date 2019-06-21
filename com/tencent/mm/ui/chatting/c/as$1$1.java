package com.tencent.mm.ui.chatting.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.ui.chatting.d.a;

final class as$1$1
  implements DialogInterface.OnClickListener
{
  as$1$1(as.1 param1, long paramLong)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(31865);
    aw.ZK();
    int i;
    if (c.XO().X(aw.getNotification().IG(), this.yTj))
    {
      i = ((com.tencent.mm.ui.chatting.c.b.h)this.yTk.yTi.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCP();
      paramInt = ((com.tencent.mm.ui.chatting.c.b.h)this.yTk.yTi.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).getCount();
      aw.ZK();
      i = c.XO().e(aw.getNotification().IG(), this.yTj, i - paramInt);
      if (i < 0)
        AppMethodBeat.o(31865);
    }
    while (true)
    {
      return;
      if (paramInt > i)
        this.yTk.yTi.cgL.Oq(i);
      AppMethodBeat.o(31865);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.as.1.1
 * JD-Core Version:    0.6.2
 */