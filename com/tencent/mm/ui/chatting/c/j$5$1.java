package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.wework.api.IWWAPI;
import com.tencent.wework.api.WWAPIFactory;

final class j$5$1
  implements n.c
{
  j$5$1(j.5 param5)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(31311);
    paraml.hi(0, 2131301518);
    paraml.hi(1, 2131301519);
    if (WWAPIFactory.jv(this.yOT.yOP.cgL.yTx.getContext()).dTK())
    {
      Activity localActivity = this.yOT.yOP.cgL.yTx.getContext();
      WWAPIFactory.jv(this.yOT.yOP.cgL.yTx.getContext());
      paraml.e(2, localActivity.getString(2131301520, new Object[] { "企业微信" }));
    }
    AppMethodBeat.o(31311);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.j.5.1
 * JD-Core Version:    0.6.2
 */