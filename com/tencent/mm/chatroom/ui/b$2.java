package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.chatroom.c.q;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.n;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.storage.u;

final class b$2
  implements f
{
  b$2(ProgressDialog paramProgressDialog, Activity paramActivity, b.a parama)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(104218);
    g.RO().eJo.b(482, this);
    if (!this.ekJ)
      this.eiD.cancel();
    boolean bool1 = false;
    this.val$activity.getString(2131302654);
    q localq = (q)paramm;
    boolean bool2 = bool1;
    if (paramInt1 == 0)
    {
      bool2 = bool1;
      if (paramInt2 == 0)
      {
        paramm = ((c)g.K(c.class)).XV().oa(localq.chatroomName);
        paramString = paramm;
        if (paramm == null)
          paramString = new u();
        paramString.ib(r.Yz(), localq.ehC);
        n.a(paramString);
        bool2 = true;
      }
    }
    if (this.ekK != null)
      this.ekK.e(bool2, localq.ehE);
    AppMethodBeat.o(104218);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.b.2
 * JD-Core Version:    0.6.2
 */