package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.model.app.aj;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.d.a;

final class d$e$7
  implements aj
{
  d$e$7(d.e parame, f paramf, a parama, j.b paramb, bi parambi)
  {
  }

  public final void dR(boolean paramBoolean)
  {
    AppMethodBeat.i(32850);
    if (this.kNP != null)
      if (paramBoolean)
      {
        d.e.a(this.zbG, this.hWW, r.Yz(), this.kNP, this.fku.field_msgSvrId, 3, this.zbG.getTalkerUserName());
        AppMethodBeat.o(32850);
      }
    while (true)
    {
      return;
      d.e.a(this.zbG, this.hWW, r.Yz(), this.kNP, this.fku.field_msgSvrId, 7, this.zbG.getTalkerUserName());
      AppMethodBeat.o(32850);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.d.e.7
 * JD-Core Version:    0.6.2
 */