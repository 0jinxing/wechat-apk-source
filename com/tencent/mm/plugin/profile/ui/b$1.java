package com.tencent.mm.plugin.profile.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.ui.contact.m.a;
import java.util.List;

final class b$1
  implements l
{
  b$1(b paramb)
  {
  }

  public final void b(j paramj)
  {
    AppMethodBeat.i(23334);
    if (paramj.bFZ == 0)
    {
      b.a(this.plg, paramj.mEy);
      if (b.a(this.plg) != null)
        b.c(this.plg).w(paramj.mAJ.query, b.b(this.plg).size(), true);
    }
    this.plg.clearCache();
    this.plg.notifyDataSetChanged();
    AppMethodBeat.o(23334);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.b.1
 * JD-Core Version:    0.6.2
 */