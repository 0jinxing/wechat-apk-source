package com.tencent.mm.plugin.websearch.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class e extends a<e.a>
{
  public List<e.a> mFf;

  public e(String paramString)
  {
    super(paramString);
    AppMethodBeat.i(91376);
    this.mFf = Collections.emptyList();
    AppMethodBeat.o(91376);
  }

  public final void dZ(List<l> paramList)
  {
    AppMethodBeat.i(91377);
    this.mFf = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      ad localad = ((j)g.K(j.class)).XM().aoO(locall.mDx);
      paramList = new e.a();
      paramList.userName = localad.field_username;
      paramList.ucj = locall.content;
      paramList.bCu = localad.field_nickname;
      paramList.hHV = localad.field_conRemark;
      paramList.dFl = localad.Hq();
      paramList.desc = localad.dul;
      this.mFf.add(paramList);
    }
    AppMethodBeat.o(91377);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.c.a.e
 * JD-Core Version:    0.6.2
 */