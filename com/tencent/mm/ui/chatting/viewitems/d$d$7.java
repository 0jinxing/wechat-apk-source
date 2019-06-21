package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.pluginsdk.model.app.aj;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.d.a;

final class d$d$7
  implements aj
{
  d$d$7(d.d paramd, f paramf, a parama, j.b paramb, String paramString, bi parambi)
  {
  }

  public final void dR(boolean paramBoolean)
  {
    AppMethodBeat.i(32833);
    if (this.uHq != null)
      if (paramBoolean)
      {
        d.d.a(this.zbG, this.hWW, this.yGJ, this.uHq, this.fku.field_msgSvrId, 3, this.zbG.getTalkerUserName());
        AppMethodBeat.o(32833);
      }
    while (true)
    {
      return;
      d.d.a(this.zbG, this.hWW, this.yGJ, this.uHq, this.fku.field_msgSvrId, 7, this.zbG.getTalkerUserName());
      AppMethodBeat.o(32833);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.d.d.7
 * JD-Core Version:    0.6.2
 */