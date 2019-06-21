package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t.a;
import com.tencent.mm.modelvideo.t.a.a;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.storage.bi;

final class j$5$1
  implements t.a
{
  j$5$1(j.5 param5)
  {
  }

  public final void a(t.a.a parama)
  {
    AppMethodBeat.i(30537);
    parama = u.ut(parama.fileName);
    if ((parama != null) && (parama.status == 199))
      j.c(this.yIG.fku.field_imgPath, this.yIG.eiH, parama.fXh, parama.fXd, parama.alw(), this.yIG.fku.getType());
    AppMethodBeat.o(30537);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.j.5.1
 * JD-Core Version:    0.6.2
 */