package com.tencent.mm.ui.transmit;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.ui.contact.m.a;
import java.util.ArrayList;
import java.util.List;

final class b$1
  implements com.tencent.mm.plugin.fts.a.l
{
  b$1(b paramb)
  {
  }

  public final void b(j paramj)
  {
    AppMethodBeat.i(35034);
    if (paramj.bFZ == 0)
      b.a(this.zIL, paramj);
    while (true)
    {
      if (paramj.mEy.size() == 0)
      {
        com.tencent.mm.plugin.fts.a.a.l locall = new com.tencent.mm.plugin.fts.a.a.l();
        locall.mDx = "no_result​";
        paramj.mEy = new ArrayList();
        paramj.mEy.add(locall);
      }
      this.zIL.clearCache();
      this.zIL.notifyDataSetChanged();
      b.a(this.zIL).w(paramj.mAJ.query, paramj.mEy.size(), true);
      AppMethodBeat.o(35034);
      return;
      b.a(this.zIL, null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.b.1
 * JD-Core Version:    0.6.2
 */