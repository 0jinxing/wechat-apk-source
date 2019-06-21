package com.tencent.mm.ui.chatting.l.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.chatting.view.MMChattingListView;

final class e$1
  implements Runnable
{
  e$1(e parame, int paramInt, MMChattingListView paramMMChattingListView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32734);
    int i = Math.max(0, this.sN - this.zaE.cgL.getFirstVisiblePosition());
    this.zaE.Pj(this.sN);
    this.zaD.setHighLightChild(i);
    aw.ZK();
    c.Ry().set(ac.a.xMJ, Boolean.FALSE);
    AppMethodBeat.o(32734);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.l.a.e.1
 * JD-Core Version:    0.6.2
 */